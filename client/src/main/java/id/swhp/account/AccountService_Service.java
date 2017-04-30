
package id.swhp.account;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AccountService", targetNamespace = "http://account.swhp.id", wsdlLocation = "http://localhost:8080/server/AccountService?wsdl")
public class AccountService_Service
    extends Service
{

    private final static URL ACCOUNTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ACCOUNTSERVICE_EXCEPTION;
    private final static QName ACCOUNTSERVICE_QNAME = new QName("http://account.swhp.id", "AccountService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/server/AccountService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACCOUNTSERVICE_WSDL_LOCATION = url;
        ACCOUNTSERVICE_EXCEPTION = e;
    }

    public AccountService_Service() {
        super(__getWsdlLocation(), ACCOUNTSERVICE_QNAME);
    }

    public AccountService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACCOUNTSERVICE_QNAME, features);
    }

    public AccountService_Service(URL wsdlLocation) {
        super(wsdlLocation, ACCOUNTSERVICE_QNAME);
    }

    public AccountService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACCOUNTSERVICE_QNAME, features);
    }

    public AccountService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AccountService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountServicePort")
    public AccountService getAccountServicePort() {
        return super.getPort(new QName("http://account.swhp.id", "AccountServicePort"), AccountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AccountService
     */
    @WebEndpoint(name = "AccountServicePort")
    public AccountService getAccountServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://account.swhp.id", "AccountServicePort"), AccountService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACCOUNTSERVICE_EXCEPTION!= null) {
            throw ACCOUNTSERVICE_EXCEPTION;
        }
        return ACCOUNTSERVICE_WSDL_LOCATION;
    }

}
