
package com.google.api.ads.adwords.jaxws.v201506.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedCustomerServiceError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ManagedCustomerServiceError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NOT_AUTHORIZED"/>
 *     &lt;enumeration value="INVALID_SELECTOR"/>
 *     &lt;enumeration value="INVALID_TIMEZONE"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INVALID_DESCRIPTIVE_NAME"/>
 *     &lt;enumeration value="ADD_CUSTOMER_FAILURE"/>
 *     &lt;enumeration value="SAVE_CUSTOMERS_FAILURE"/>
 *     &lt;enumeration value="ALREADY_MANAGED_BY_THIS_MANAGER"/>
 *     &lt;enumeration value="ALREADY_INVITED_BY_THIS_MANAGER"/>
 *     &lt;enumeration value="NO_PENDING_INVITATION"/>
 *     &lt;enumeration value="TOO_MANY_ACCOUNTS"/>
 *     &lt;enumeration value="TOO_MANY_ACCOUNTS_AT_MANAGER"/>
 *     &lt;enumeration value="TEST_ACCOUNT_LINK_ERROR"/>
 *     &lt;enumeration value="INVALID_LABEL_ID"/>
 *     &lt;enumeration value="CANNOT_APPLY_INACTIVE_LABEL"/>
 *     &lt;enumeration value="APPLIED_LABEL_TO_TOO_MANY_ACCOUNTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ManagedCustomerServiceError.Reason")
@XmlEnum
public enum ManagedCustomerServiceErrorReason {


    /**
     * 
     *                 Unknown.
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 The user is not authorized to perform the action
     *               
     * 
     */
    NOT_AUTHORIZED,

    /**
     * 
     *                 Invalid selector
     *               
     * 
     */
    INVALID_SELECTOR,

    /**
     * 
     *                 Can't process the passed in timezone.
     *               
     * 
     */
    INVALID_TIMEZONE,

    /**
     * 
     *                 Can't process the passed in currency code.
     *               
     * 
     */
    INVALID_CURRENCY,

    /**
     * 
     *                 Can't process the passed in descriptive name.
     *               
     * 
     */
    INVALID_DESCRIPTIVE_NAME,

    /**
     * 
     *                 Generic error during add customer process.
     *               
     * 
     */
    ADD_CUSTOMER_FAILURE,

    /**
     * 
     *                 There was a problem saving the modified customers, and some of the customers may not
     *                 have been saved successfully.
     *               
     * 
     */
    SAVE_CUSTOMERS_FAILURE,

    /**
     * 
     *                 Attempt to establish a link with a client that is already managed by the manager.
     *               
     * 
     */
    ALREADY_MANAGED_BY_THIS_MANAGER,

    /**
     * 
     *                 Attempt to invite a client that has already been invited by the manager.
     *               
     * 
     */
    ALREADY_INVITED_BY_THIS_MANAGER,

    /**
     * 
     *                 Attempt to accept an invitation that doesn't exist.
     *               
     * 
     */
    NO_PENDING_INVITATION,

    /**
     * 
     *                 Manager account has the maximum number of linked accounts.
     *               
     * 
     */
    TOO_MANY_ACCOUNTS,

    /**
     * 
     *                 Your manager's account has the maximum number of linked accounts.
     *               
     * 
     */
    TOO_MANY_ACCOUNTS_AT_MANAGER,

    /**
     * 
     *                 Error involving test accounts (mixed types) or too many child accounts.
     *               
     * 
     */
    TEST_ACCOUNT_LINK_ERROR,

    /**
     * 
     *                 Label id was not found, or is not owned by the requesting customer.
     *               
     * 
     */
    INVALID_LABEL_ID,

    /**
     * 
     *                 Deleted labels cannot be applied to customers.
     *               
     * 
     */
    CANNOT_APPLY_INACTIVE_LABEL,

    /**
     * 
     *                 A label cannot be applied to more than 1000 customers.
     *               
     * 
     */
    APPLIED_LABEL_TO_TOO_MANY_ACCOUNTS;

    public String value() {
        return name();
    }

    public static ManagedCustomerServiceErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
