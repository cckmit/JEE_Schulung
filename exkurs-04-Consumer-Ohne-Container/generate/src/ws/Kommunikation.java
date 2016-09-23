
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Kommunikation", targetNamespace = "http://ws/")
@XmlSeeAlso({ ObjectFactory.class })
public interface Kommunikation {

	/**
	 * 
	 * @param txt
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "ping", targetNamespace = "http://ws/", className = "ws.Ping")
	@ResponseWrapper(localName = "pingResponse", targetNamespace = "http://ws/", className = "ws.PingResponse")
	@Action(input = "http://ws/Kommunikation/pingRequest", output = "http://ws/Kommunikation/pingResponse")
	public String ping(@WebParam(name = "txt", targetNamespace = "") String txt);

}