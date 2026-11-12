//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchivoType", propOrder = {
    "expediente"
})
public class ArchivoType {

    protected List<ExpedienteType> expediente;
    @XmlAttribute(name = "nombre", required = true)
    protected String nombre;
    @XmlAttribute(name = "fundacion", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar fundacion;

    /**
     * Gets the value of the expediente property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the expediente property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getExpediente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpedienteType }
     * </p>
     * 
     * 
     * @return
     *     The value of the expediente property.
     */
    public List<ExpedienteType> getExpediente() {
        if (expediente == null) {
            expediente = new ArrayList<>();
        }
        return this.expediente;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad fundacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFundacion() {
        return fundacion;
    }

    /**
     * Define el valor de la propiedad fundacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFundacion(XMLGregorianCalendar value) {
        this.fundacion = value;
    }

}
