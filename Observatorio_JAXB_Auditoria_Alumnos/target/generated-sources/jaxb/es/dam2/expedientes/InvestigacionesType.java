//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.6 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package es.dam2.expedientes;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigacionesType", propOrder = {
    "investigacion"
})
public class InvestigacionesType {

    @XmlElement(required = true)
    protected List<InvestigacionType> investigacion;

    /**
     * Gets the value of the investigacion property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the investigacion property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getInvestigacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigacionType }
     * </p>
     * 
     * 
     * @return
     *     The value of the investigacion property.
     */
    public List<InvestigacionType> getInvestigacion() {
        if (investigacion == null) {
            investigacion = new ArrayList<>();
        }
        return this.investigacion;
    }

}
