
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _CalculateTaxResponse_QNAME = new QName("http://example/", "calculateTaxResponse");
    private final static QName _CalculateTax_QNAME = new QName("http://example/", "calculateTax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateTaxResponse }
     * 
     */
    public CalculateTaxResponse createCalculateTaxResponse() {
        return new CalculateTaxResponse();
    }

    /**
     * Create an instance of {@link CalculateTax }
     * 
     */
    public CalculateTax createCalculateTax() {
        return new CalculateTax();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "calculateTaxResponse")
    public JAXBElement<CalculateTaxResponse> createCalculateTaxResponse(CalculateTaxResponse value) {
        return new JAXBElement<CalculateTaxResponse>(_CalculateTaxResponse_QNAME, CalculateTaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example/", name = "calculateTax")
    public JAXBElement<CalculateTax> createCalculateTax(CalculateTax value) {
        return new JAXBElement<CalculateTax>(_CalculateTax_QNAME, CalculateTax.class, null, value);
    }

}
