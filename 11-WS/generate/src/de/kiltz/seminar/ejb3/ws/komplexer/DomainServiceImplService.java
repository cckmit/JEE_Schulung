
package de.kiltz.seminar.ejb3.ws.komplexer;

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
@WebServiceClient(name = "DomainServiceImplService", targetNamespace = "http://komplexer.ws.ejb3.seminar.kiltz.de/", wsdlLocation = "file:/C:/java/workspace/11-WS/src/META-INF/wsdl/DomainServiceImpl.wsdl")
public class DomainServiceImplService
    extends Service
{

    private final static URL DOMAINSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException DOMAINSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName DOMAINSERVICEIMPLSERVICE_QNAME = new QName("http://komplexer.ws.ejb3.seminar.kiltz.de/", "DomainServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/java/workspace/11-WS/src/META-INF/wsdl/DomainServiceImpl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DOMAINSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        DOMAINSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public DomainServiceImplService() {
        super(__getWsdlLocation(), DOMAINSERVICEIMPLSERVICE_QNAME);
    }

    public DomainServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DOMAINSERVICEIMPLSERVICE_QNAME, features);
    }

    public DomainServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, DOMAINSERVICEIMPLSERVICE_QNAME);
    }

    public DomainServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DOMAINSERVICEIMPLSERVICE_QNAME, features);
    }

    public DomainServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DomainServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DomainService
     */
    @WebEndpoint(name = "DomainServiceImplPort")
    public DomainService getDomainServiceImplPort() {
        return super.getPort(new QName("http://komplexer.ws.ejb3.seminar.kiltz.de/", "DomainServiceImplPort"), DomainService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DomainService
     */
    @WebEndpoint(name = "DomainServiceImplPort")
    public DomainService getDomainServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://komplexer.ws.ejb3.seminar.kiltz.de/", "DomainServiceImplPort"), DomainService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DOMAINSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw DOMAINSERVICEIMPLSERVICE_EXCEPTION;
        }
        return DOMAINSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
