//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2015.06.03 a las 11:10:14 PM CEST 
//


package es.enbinario.webservices.employeeservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import es.enbinario.webservices.employee.Employee;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeDetails" type="{http://es/enbinario/webservices/employee}EmployeeModel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeDetails"
})
@XmlRootElement(name = "EmployeeDetailsResponse")
public class EmployeeDetailsResponse {

    @XmlElement(name = "EmployeeDetails", required = true)
    protected Employee employeeDetails;

    /**
     * Obtiene el valor de la propiedad employeeDetails.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeModel }
     *     
     */
    public Employee getEmployeeDetails() {
        return employeeDetails;
    }

    /**
     * Define el valor de la propiedad employeeDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeModel }
     *     
     */
    public void setEmployeeDetails(Employee value) {
        this.employeeDetails = value;
    }

}
