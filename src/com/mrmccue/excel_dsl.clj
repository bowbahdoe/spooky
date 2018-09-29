(ns com.mrmccue.excel-dsl
  (:import [org.apache.poi.xssf.usermodel XSSFWorkbook XSSFSheet XSSFRow]
           [org.apache.poi.ss.usermodel Cell Row]
           [java.io FileInputStream FileOutputStream File]))

(defn try-in-sequence
  "Tries the given list of procedures in order and
  if one throws an Exception, tries the next in series.

  If a procedure succeeds, that value is returned.

  If none of the procedures succeed, then the given
  default-value is returned."
  [expressions default-value]
  (if (empty? expressions)
    default-value
    (try
       ((first expressions))
       (catch Exception _#
         (try-in-sequence (rest expressions)
                          default-value)))))


(defn read-cell-value
  ([cell]
   (read-cell-value cell nil))
  ([cell default]
   (try-in-sequence [(fn [] (.getStringCellValue cell))
                     (fn [] (str (.getNumericCellValue cell)))]
                    default)))

(defn- load-column-indexes
  "Given a sheet, assumes that all the columns are defined in the
  first row and returns a map of the column label to the index of
  that column in the sheet."
  [sheet]
  (let [first-row (.getRow sheet 0)]
    (into {}
          (for [cell first-row]
            [(read-cell-value cell) (.getColumnIndex cell)]))))

(defn- read-column [sheet column-idx]
  (let [last-row (.getLastRowNum sheet)]
    (doall
      (for [i (range 1 last-row)]
        (try
          (read-cell-value
            (-> sheet
                (.getRow i)
                (.getCell column-idx)))
          (catch NullPointerException _ nil))))))

(defn- read-all-columns
  "Given a sheet where all the labels for columns are in the first
  row, will read all of the columns into a map"
  [sheet]
  (let [column-indexes (load-column-indexes sheet)
        columns (for [[col-name col-idx] column-indexes]
                  [col-name
                   (read-column sheet col-idx)])]
    (into {} columns)))

(defn read-excell [& {:keys [filepath columns sheet-num]
                      :or {sheet-num 0}}]
  (let [excell-workbook (-> ^String filepath
                            (FileInputStream.)
                            (XSSFWorkbook.))
        excell-sheet (.getSheetAt excell-workbook sheet-num)]
    (read-all-columns excell-sheet)))

(defn enumerate [seq]
  (map vector (range) seq))

(defn- write-workbook
  "Writes the given workbook to the specified out-file."
  [workbook output-filepath]
  (.write workbook (FileOutputStream. (doto
                                        (File. ^String output-filepath)
                                        (.createNewFile))
                                      false)))

(defn get-or-create-row
  "Gets the nth row in a sheet if one exists, otherwise
  creates said row."
  [sheet n]
  (let [row (.getRow sheet n)]
    (if (nil? row)
      (.createRow sheet n)
      row)))

(defn row-view
  "Takes a view of the columns of an excell spreadsheet
  in the format
  {:col-1 (... col data ...)
   :col-2 (... col data ...)}
   and returns it as a list of rows in the format
   ({:col-1 ... :col-2 ...}
    {:col-1 ... :col-2 ...}
    {:col-1 ... :col-2 ...})

    Assumes that the length of the lists of column data are the same"
  [col-view]
  (let [tiny-maps (for [[k v] col-view]
                    (map #(identity {k %}) v))]
    (for [i (range (count (first tiny-maps)))]
      (apply merge (map #(nth % i) tiny-maps)))))

(defn column-view
  "Opposite function to row-view: will convert a view of
  excell data in the format
  ({:col-1 ... :col-2 ...}
   {:col-1 ... :col-2 ...}
   {:col-1 ... :col-2 ...})
  into a view in the format
  {:col-1 (... col data ...)
   :col-2 (... col data ...)}"
  [row-view]
  (let [merge-into-set (fn [list-of-lists]
                         (into #{}
                               (apply concat list-of-lists)))
        seen-keys (merge-into-set
                    (for [row row-view]
                      (keys row)))]
    (into {}
          (for [key seen-keys]
            [key (for [row row-view]
                   (get row key))]))))

(defn column-formatted-data? [excell-view]
  (map? excell-view))

(defn row-formatted-data? [excell-view]
  (sequential? excell-view))

(defn dump-excell [excell-data outfile-name]
  (let [map (if (row-formatted-data? excell-data)
              (row-view excell-data)
              excell-data)
        workbook (XSSFWorkbook.)
        outsheet (.createSheet workbook)
        key-vals (->> (for [keyval map] keyval)
                      (sort-by #(get % 0))
                      (enumerate))
        
        _ (doseq [[col-idx [col-name _]] key-vals]
            (let [row (get-or-create-row outsheet 0)
                  cell (.createCell row col-idx)
                  _ (.setCellValue cell ^String col-name)]))

        _ (doseq [[col-idx [_ values]] key-vals]
            (doseq [[row-idx value] (enumerate values)]
                (when (not (nil? value))
                  (let [row (get-or-create-row outsheet
                                               (inc row-idx))
                        cell (.createCell row col-idx)
                        _ (.setCellValue cell (str value))]))))]
    (write-workbook workbook outfile-name)))
