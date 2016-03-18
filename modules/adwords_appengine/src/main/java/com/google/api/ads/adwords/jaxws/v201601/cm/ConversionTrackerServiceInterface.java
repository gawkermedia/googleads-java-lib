
package com.google.api.ads.adwords.jaxws.v201601.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Use this service to manage conversion trackers. A conversion tracker provides
 *       a snippet of code which records every time a user visits a page that contains
 *       it. The data this provides can be used to gauge the effectiveness of your ads
 *       and keywords.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConversionTrackerServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConversionTrackerServiceInterface {


    /**
     * 
     *         Returns a list of the conversion trackers that match the selector. The
     *         actual objects contained in the page's list of entries will be specific
     *         subclasses of the abstract {@link ConversionTracker} class.
     *         
     *         @param serviceSelector The selector specifying the
     *         {@link ConversionTracker}s to return.
     *         @return List of conversion trackers specified by the selector.
     *         @throws com.google.ads.api.services.common.error.ApiException if problems
     *         occurred while retrieving results.
     *       
     * 
     * @param serviceSelector
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "get", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfaceget")
    @ResponseWrapper(localName = "getResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfacegetResponse")
    public ConversionTrackerPage get(
        @WebParam(name = "serviceSelector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        Selector serviceSelector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Applies the list of mutate operations such as adding or updating conversion trackers.
     *         <p class="note"><b>Note:</b> {@link ConversionTrackerOperation} does not support the
     *         <code>REMOVE</code> operator. In order to 'disable' a conversion type, send a
     *         <code>SET</code> operation for the conversion tracker with the <code>status</code>
     *         property set to <code>DISABLED</code></p>
     *         
     *         <p>You can mutate any ConversionTracker that belongs to your account. You may not
     *         mutate a ConversionTracker that belongs to some other account. You may not directly
     *         mutate a system-defined ConversionTracker, but you can create a mutable copy of it
     *         in your account by sending a mutate request with an ADD operation specifying
     *         an originalConversionTypeId matching a system-defined conversion tracker's ID. That new
     *         ADDed ConversionTracker will inherit the statistics and properties
     *         of the system-defined type, but will be editable as usual.</p>
     *         
     *         @param operations A list of mutate operations to perform.
     *         @return The list of the conversion trackers as they appear after mutation,
     *         in the same order as they appeared in the list of operations.
     *         @throws com.google.ads.api.services.common.error.ApiException if problems
     *         occurred while updating the data.
     *       
     * 
     * @param operations
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerReturnValue
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "mutate", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfacemutate")
    @ResponseWrapper(localName = "mutateResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfacemutateResponse")
    public ConversionTrackerReturnValue mutate(
        @WebParam(name = "operations", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        List<ConversionTrackerOperation> operations)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of conversion trackers that match the query.
     *         
     *         @param query The SQL-like AWQL query string.
     *         @return A list of conversion trackers.
     *         @throws ApiException if problems occur while parsing the query or fetching conversion trackers.
     *       
     * 
     * @param query
     * @return
     *     returns com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
    @RequestWrapper(localName = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfacequery")
    @ResponseWrapper(localName = "queryResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601", className = "com.google.api.ads.adwords.jaxws.v201601.cm.ConversionTrackerServiceInterfacequeryResponse")
    public ConversionTrackerPage query(
        @WebParam(name = "query", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201601")
        String query)
        throws ApiException_Exception
    ;

}
