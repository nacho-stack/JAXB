//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Clase Java para InvestigacionType complex type.&lt;/p&gt;
 * 
 * &lt;p&gt;El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="InvestigacionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responsable" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="evidencias" type="{}EvidenciasType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="año" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigacionType", propOrder = {
    "responsable",
    "resultado",
    "evidencias"
})
public class InvestigacionType {

    @XmlElement(required = true)
    protected String responsable;
    @XmlElement(required = true)
    protected String resultado;
    protected EvidenciasType evidencias;
    @XmlAttribute(name = "a\u00f1o", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar año;

    /**
     * Obtiene el valor de la propiedad responsable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * Define el valor de la propiedad responsable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsable(String value) {
        this.responsable = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Obtiene el valor de la propiedad evidencias.
     * 
     * @return
     *     possible object is
     *     {@link EvidenciasType }
     *     
     */
    public EvidenciasType getEvidencias() {
        return evidencias;
    }

    /**
     * Define el valor de la propiedad evidencias.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidenciasType }
     *     
     */
    public void setEvidencias(EvidenciasType value) {
        this.evidencias = value;
    }

    /**
     * Obtiene el valor de la propiedad año.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAño() {
        return año;
    }

    /**
     * Define el valor de la propiedad año.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAño(XMLGregorianCalendar value) {
        this.año = value;
    }

}
