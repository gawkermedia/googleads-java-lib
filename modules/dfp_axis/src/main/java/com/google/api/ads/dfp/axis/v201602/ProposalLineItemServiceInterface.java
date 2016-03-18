/**
 * ProposalLineItemServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201602;

public interface ProposalLineItemServiceInterface extends java.rmi.Remote {

    /**
     * Creates new {@link ProposalLineItem} objects.
     *         
     *         For each proposal line item, the following fields are required:
     * <ul>
     *         <li>{@link ProposalLineItem#proposalId}</li>
     *         <li>{@link ProposalLineItem#rateCardId}</li>
     *         <li>{@link ProposalLineItem#productId}</li>
     *         <li>{@link ProposalLineItem#name}</li>
     *         <li>{@link ProposalLineItem#startDateTime}</li>
     *         <li>{@link ProposalLineItem#endDateTime}</li>
     *         </ul>
     *         
     *         
     * @param proposalLineItems the proposal line items to create
     *         
     * @return the created proposal line items with their IDs filled in
     */
    public com.google.api.ads.dfp.axis.v201602.ProposalLineItem[] createProposalLineItems(com.google.api.ads.dfp.axis.v201602.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Gets a {@link ProposalLineItemPage} of {@link ProposalLineItem}
     * objects
     *         that satisfy the given {@link Statement#query}.  The following
     * fields are supported for
     *         filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link ProposalLineItem#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link ProposalLineItem#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code proposalId}</td>
     *         <td>{@link ProposalLineItem#proposalId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code startDateTime}</td>
     *         <td>{@link ProposalLineItem#startDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code endDateTime}</td>
     *         <td>{@link ProposalLineItem#endDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code isArchived}</td>
     *         <td>{@link ProposalLineItem#isArchived}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code lastModifiedDateTime}</td>
     *         <td>{@link ProposalLineItem#lastModifiedDateTime}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code useThirdPartyAdServerFromProposal}</td>
     *         <td>{@link ProposalLineItem#useThirdPartyAdServerFromProposal}</td>
     * </tr>
     *         <tr>
     *         <td>{@code thirdPartyAdServerId}</td>
     *         <td>{@link ProposalLineItem#thirdPartyAdServerId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customThirdPartyAdServerName}</td>
     *         <td>{@link ProposalLineItem#customThirdPartyAdServerName}</td>
     * </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of proposal line items
     *         
     * @return the proposal line items that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201602.ProposalLineItemPage getProposalLineItemsByStatement(com.google.api.ads.dfp.axis.v201602.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Performs actions on {@link ProposalLineItem} objects that match
     * the given {@link Statement#query}.
     *         
     *         
     * @param proposalLineItemAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter a set of
     *         proposal line items
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201602.UpdateResult performProposalLineItemAction(com.google.api.ads.dfp.axis.v201602.ProposalLineItemAction proposalLineItemAction, com.google.api.ads.dfp.axis.v201602.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;

    /**
     * Updates the specified {@link ProposalLineItem} objects. If
     * free editing mode is enabled,
     *         this will trigger inventory reservation and cause the proposal
     * to be pushed to DFP again.
     *         
     *         
     * @param proposalLineItems the proposal line items to update
     *         
     * @return the updated proposal line items
     */
    public com.google.api.ads.dfp.axis.v201602.ProposalLineItem[] updateProposalLineItems(com.google.api.ads.dfp.axis.v201602.ProposalLineItem[] proposalLineItems) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201602.ApiException;
}
