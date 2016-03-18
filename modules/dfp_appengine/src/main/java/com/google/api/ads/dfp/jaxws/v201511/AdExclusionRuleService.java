
package com.google.api.ads.dfp.jaxws.v201511;

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
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdExclusionRuleService", targetNamespace = "https://www.google.com/apis/ads/publisher/v201511", wsdlLocation = "https://ads.google.com/apis/ads/publisher/v201511/AdExclusionRuleService?wsdl")
public class AdExclusionRuleService
    extends Service
{

    private final static URL ADEXCLUSIONRULESERVICE_WSDL_LOCATION;
    private final static WebServiceException ADEXCLUSIONRULESERVICE_EXCEPTION;
    private final static QName ADEXCLUSIONRULESERVICE_QNAME = new QName("https://www.google.com/apis/ads/publisher/v201511", "AdExclusionRuleService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://ads.google.com/apis/ads/publisher/v201511/AdExclusionRuleService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADEXCLUSIONRULESERVICE_WSDL_LOCATION = url;
        ADEXCLUSIONRULESERVICE_EXCEPTION = e;
    }

    public AdExclusionRuleService() {
        super(__getWsdlLocation(), ADEXCLUSIONRULESERVICE_QNAME);
    }

    public AdExclusionRuleService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns AdExclusionRuleServiceInterface
     */
    @WebEndpoint(name = "AdExclusionRuleServiceInterfacePort")
    public AdExclusionRuleServiceInterface getAdExclusionRuleServiceInterfacePort() {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201511", "AdExclusionRuleServiceInterfacePort"), AdExclusionRuleServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdExclusionRuleServiceInterface
     */
    @WebEndpoint(name = "AdExclusionRuleServiceInterfacePort")
    public AdExclusionRuleServiceInterface getAdExclusionRuleServiceInterfacePort(WebServiceFeature... features) {
        return super.getPort(new QName("https://www.google.com/apis/ads/publisher/v201511", "AdExclusionRuleServiceInterfacePort"), AdExclusionRuleServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADEXCLUSIONRULESERVICE_EXCEPTION!= null) {
            throw ADEXCLUSIONRULESERVICE_EXCEPTION;
        }
        return ADEXCLUSIONRULESERVICE_WSDL_LOCATION;
    }

}
