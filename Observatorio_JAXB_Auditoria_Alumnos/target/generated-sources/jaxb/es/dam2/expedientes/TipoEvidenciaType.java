//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Clase Java para TipoEvidenciaType.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="TipoEvidenciaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="fotografia"/&gt;
 *     &lt;enumeration value="audio"/&gt;
 *     &lt;enumeration value="video"/&gt;
 *     &lt;enumeration value="sensor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "TipoEvidenciaType")
@XmlEnum
public enum TipoEvidenciaType {

    @XmlEnumValue("fotografia")
    FOTOGRAFIA("fotografia"),
    @XmlEnumValue("audio")
    AUDIO("audio"),
    @XmlEnumValue("video")
    VIDEO("video"),
    @XmlEnumValue("sensor")
    SENSOR("sensor");
    private final String value;

    TipoEvidenciaType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static TipoEvidenciaType fromValue(String v) {
        for (TipoEvidenciaType c: TipoEvidenciaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
