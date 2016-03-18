/**
 * CustomerExtensionSettingServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;

public interface CustomerExtensionSettingServiceInterface extends java.rmi.Remote {

    /**
     * Returns a list of CustomerExtensionSettings that meet the selector
     * criteria.
     *         
     *         
     * @param selector Determines which CustomerExtensionSettings to return.
     * If empty, all
     *         CustomerExtensionSettings are returned.
     *         
     * @return The list of CustomerExtensionSettings specified by the selector.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.CustomerExtensionSettingPage get(com.google.api.ads.adwords.axis.v201509.cm.Selector selector) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Applies the list of mutate operations (add, remove, and set).
     * 
     *         <p> Beginning in v201509, add and set operations are treated
     * identically. Performing an add
     *         operation when there is an existing ExtensionSetting will
     * cause the operation to be
     *         treated like a set operation. Performing a set operation when
     * there is no existing
     *         ExtensionSetting will cause the operation to be treated like
     * an add operation.
     *         
     *         
     * @param operations The operations to apply. The same {@link CustomerExtensionSetting}
     * cannot be
     *         specified in more than one operation.
     *         
     * @return The changed {@link CustomerExtensionSetting}s.
     *         
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.CustomerExtensionSettingReturnValue mutate(com.google.api.ads.adwords.axis.v201509.cm.CustomerExtensionSettingOperation[] operations) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;

    /**
     * Returns a list of CustomerExtensionSettings that match the
     * query.
     *         
     *         
     * @param query The SQL-like AWQL query string.
     *         
     * @return The list of CustomerExtensionSettings specified by the query.
     * 
     * @throws ApiException Indicates a problem with the request.
     */
    public com.google.api.ads.adwords.axis.v201509.cm.CustomerExtensionSettingPage query(java.lang.String query) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201509.cm.ApiException;
}
