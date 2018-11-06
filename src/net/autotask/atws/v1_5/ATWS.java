package net.autotask.atws.v1_5;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * Autotask Web Services Version 1.5
 *
 * This class was generated by Apache CXF 3.2.6
 * 2018-10-25T20:44:13.835-04:00
 * Generated source version: 3.2.6
 *
 */
@WebServiceClient(name = "ATWS",
                  wsdlLocation = "file:/C:/Users/Ethan/Development/spooky/resources/autotask/atws.wsdl",
                  targetNamespace = "http://autotask.net/ATWS/v1_5/")
public class ATWS extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://autotask.net/ATWS/v1_5/", "ATWS");
    public final static QName ATWSSoap = new QName("http://autotask.net/ATWS/v1_5/", "ATWSSoap");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Ethan/Development/spooky/resources/autotask/atws.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ATWS.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Ethan/Development/spooky/resources/autotask/atws.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ATWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ATWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ATWS() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ATWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ATWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ATWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ATWSSoap
     */
    @WebEndpoint(name = "ATWSSoap")
    public ATWSSoap getATWSSoap() {
        return super.getPort(ATWSSoap, ATWSSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ATWSSoap
     */
    @WebEndpoint(name = "ATWSSoap")
    public ATWSSoap getATWSSoap(WebServiceFeature... features) {
        return super.getPort(ATWSSoap, ATWSSoap.class, features);
    }

}
