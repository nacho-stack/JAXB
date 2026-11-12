//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.dam2.expedientes package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _Archivo_QNAME = new QName("", "archivo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.dam2.expedientes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArchivoType }
     * 
     * @return
     *     the new instance of {@link ArchivoType }
     */
    public ArchivoType createArchivoType() {
        return new ArchivoType();
    }

    /**
     * Create an instance of {@link ExpedienteType }
     * 
     * @return
     *     the new instance of {@link ExpedienteType }
     */
    public ExpedienteType createExpedienteType() {
        return new ExpedienteType();
    }

    /**
     * Create an instance of {@link UbicacionType }
     * 
     * @return
     *     the new instance of {@link UbicacionType }
     */
    public UbicacionType createUbicacionType() {
        return new UbicacionType();
    }

    /**
     * Create an instance of {@link InvestigacionesType }
     * 
     * @return
     *     the new instance of {@link InvestigacionesType }
     */
    public InvestigacionesType createInvestigacionesType() {
        return new InvestigacionesType();
    }

    /**
     * Create an instance of {@link InvestigacionType }
     * 
     * @return
     *     the new instance of {@link InvestigacionType }
     */
    public InvestigacionType createInvestigacionType() {
        return new InvestigacionType();
    }

    /**
     * Create an instance of {@link EvidenciasType }
     * 
     * @return
     *     the new instance of {@link EvidenciasType }
     */
    public EvidenciasType createEvidenciasType() {
        return new EvidenciasType();
    }

    /**
     * Create an instance of {@link EvidenciaType }
     * 
     * @return
     *     the new instance of {@link EvidenciaType }
     */
    public EvidenciaType createEvidenciaType() {
        return new EvidenciaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArchivoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArchivoType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "archivo")
    public JAXBElement<ArchivoType> createArchivo(ArchivoType value) {
        return new JAXBElement<>(_Archivo_QNAME, ArchivoType.class, null, value);
    }

}
