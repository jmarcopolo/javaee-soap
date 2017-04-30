
package id.swhp.account;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountService", targetNamespace = "http://account.swhp.id")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountService {


    /**
     * 
     * @param inqAccount
     * @return
     *     returns id.swhp.account.Message
     */
    @WebMethod(action = "tns:inqAccount")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "inqAccount", targetNamespace = "http://account.swhp.id", className = "id.swhp.account.InqAccount")
    @ResponseWrapper(localName = "inqAccountResponse", targetNamespace = "http://account.swhp.id", className = "id.swhp.account.InqAccountResponse")
    @Action(input = "tns:inqAccount", output = "http://account.swhp.id/AccountService/inqAccountResponse")
    public Message inqAccount(
        @WebParam(name = "inqAccount", targetNamespace = "")
        Account inqAccount);

}
