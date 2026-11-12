//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpedienteType", propOrder = {
    "titulo",
    "ubicacion",
    "investigaciones"
})
public class ExpedienteType {

    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected UbicacionType ubicacion;
    @XmlElement(required = true)
    protected InvestigacionesType investigaciones;
    @XmlAttribute(name = "codigo", required = true)
    protected String codigo;
    @XmlAttribute(name = "estado", required = true)
    protected EstadoType estado;

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link UbicacionType }
     *     
     */
    public UbicacionType getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link UbicacionType }
     *     
     */
    public void setUbicacion(UbicacionType value) {
        this.ubicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad investigaciones.
     * 
     * @return
     *     possible object is
     *     {@link InvestigacionesType }
     *     
     */
    public InvestigacionesType getInvestigaciones() {
        return investigaciones;
    }

    /**
     * Define el valor de la propiedad investigaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigacionesType }
     *     
     */
    public void setInvestigaciones(InvestigacionesType value) {
        this.investigaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link EstadoType }
     *     
     */
    public EstadoType getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoType }
     *     
     */
    public void setEstado(EstadoType value) {
        this.estado = value;
    }

}
