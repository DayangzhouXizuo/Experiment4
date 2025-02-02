
package client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonalIncomeTaxCalculator", targetNamespace = "http://example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonalIncomeTaxCalculator {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "calculateTax", targetNamespace = "http://example/", className = "client.CalculateTax")
    @ResponseWrapper(localName = "calculateTaxResponse", targetNamespace = "http://example/", className = "client.CalculateTaxResponse")
    @Action(input = "http://example/PersonalIncomeTaxCalculator/calculateTaxRequest", output = "http://example/PersonalIncomeTaxCalculator/calculateTaxResponse")
    public double calculateTax(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        double arg3);

}
