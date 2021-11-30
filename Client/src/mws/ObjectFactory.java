
package mws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mws package. 
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

    private final static QName _Test_QNAME = new QName("http://mws/", "test");
    private final static QName _SendRequestResponse_QNAME = new QName("http://mws/", "sendRequestResponse");
    private final static QName _SendRequest_QNAME = new QName("http://mws/", "sendRequest");
    private final static QName _TestResponse_QNAME = new QName("http://mws/", "testResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendRequestResponse }
     * 
     */
    public SendRequestResponse createSendRequestResponse() {
        return new SendRequestResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link SendRequest }
     * 
     */
    public SendRequest createSendRequest() {
        return new SendRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mws/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mws/", name = "sendRequestResponse")
    public JAXBElement<SendRequestResponse> createSendRequestResponse(SendRequestResponse value) {
        return new JAXBElement<SendRequestResponse>(_SendRequestResponse_QNAME, SendRequestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mws/", name = "sendRequest")
    public JAXBElement<SendRequest> createSendRequest(SendRequest value) {
        return new JAXBElement<SendRequest>(_SendRequest_QNAME, SendRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mws/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

}
