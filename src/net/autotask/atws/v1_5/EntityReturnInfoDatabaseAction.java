
package net.autotask.atws.v1_5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityReturnInfoDatabaseAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityReturnInfoDatabaseAction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Created"/&gt;
 *     &lt;enumeration value="Updated"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityReturnInfoDatabaseAction")
@XmlEnum
public enum EntityReturnInfoDatabaseAction {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Updated")
    UPDATED("Updated");
    private final String value;

    EntityReturnInfoDatabaseAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityReturnInfoDatabaseAction fromValue(String v) {
        for (EntityReturnInfoDatabaseAction c: EntityReturnInfoDatabaseAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
