
package de.kiltz.seminar.ejb3.ws.kunde;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "KundenWebService", targetNamespace = "http://kunde.ws.ejb3.seminar.kiltz.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface KundenWebService {


    /**
     * 
     * @param kunde
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "neuerKunde", targetNamespace = "http://kunde.ws.ejb3.seminar.kiltz.de/", className = "de.kiltz.seminar.ejb3.ws.kunde.NeuerKunde")
    @ResponseWrapper(localName = "neuerKundeResponse", targetNamespace = "http://kunde.ws.ejb3.seminar.kiltz.de/", className = "de.kiltz.seminar.ejb3.ws.kunde.NeuerKundeResponse")
    public void neuerKunde(
        @WebParam(name = "kunde", targetNamespace = "")
        KundeXSD kunde)
        throws Exception_Exception
    ;

}
