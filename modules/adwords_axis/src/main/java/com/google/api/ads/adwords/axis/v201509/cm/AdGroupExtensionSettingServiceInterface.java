/**
 * AdGroupExtensionSettingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public interface AdGroupExtensionSettingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of AdGroupExtensionSettings that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which AdGroupExtensionSettings to return.
     * If empty, all
     *         AdGroupExtensionSettings are returned.
     *         
     * @return The list of AdGroupExtensionSettings specified by the selector.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupExtensionSettingPage get(com.google.api.ads.adwords.axis.v201509.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Applies the list of mutate operations (add, remove, and set).
     * 
     *         <p> Beginning in v201509, add and set operations are treated
     * identically. Performing an add
     *         operation on an ad group with an existing ExtensionSetting
     * will cause the operation to be
     *         treated like a set operation. Performing a set operation on
     * an ad group with no
     *         ExtensionSetting will cause the operation to be treated like
     * an add operation.
     *         
     *         
     * @param operations The operations to apply. The same {@link AdGroupExtensionSetting}
     * cannot be
     *         specified in more than one operation.
     *         
     * @return The changed {@link AdGroupExtensionSetting}s.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupExtensionSettingReturnValue mutate(com.google.api.ads.adwords.axis.v201509.cm.AdGroupExtensionSettingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Returns a list of AdGroupExtensionSettings that match the query.
     * 
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return The list of AdGroupExtensionSettings specified by the query.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.AdGroupExtensionSettingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
