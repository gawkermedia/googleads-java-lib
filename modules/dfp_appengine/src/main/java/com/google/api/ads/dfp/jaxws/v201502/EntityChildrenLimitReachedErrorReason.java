
package com.google.api.ads.dfp.jaxws.v201502;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityChildrenLimitReachedError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityChildrenLimitReachedError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LINE_ITEM_LIMIT_FOR_ORDER_REACHED"/>
 *     &lt;enumeration value="CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED"/>
 *     &lt;enumeration value="AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED"/>
 *     &lt;enumeration value="TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED"/>
 *     &lt;enumeration value="ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED"/>
 *     &lt;enumeration value="PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED"/>
 *     &lt;enumeration value="PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED"/>
 *     &lt;enumeration value="PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED"/>
 *     &lt;enumeration value="PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED"/>
 *     &lt;enumeration value="PREMIUM_LIMIT_FOR_RATE_CARD_REACHED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityChildrenLimitReachedError.Reason")
@XmlEnum
public enum EntityChildrenLimitReachedErrorReason {


    /**
     * 
     *                 The number of line items on the order exceeds the max number of line items allowed per order
     *                 in the network.
     *               
     * 
     */
    LINE_ITEM_LIMIT_FOR_ORDER_REACHED,

    /**
     * 
     *                 The number of creatives associated with the line item exceeds the max number of creatives
     *                 allowed to be associated with a line item in the network.
     *               
     * 
     */
    CREATIVE_ASSOCIATION_LIMIT_FOR_LINE_ITEM_REACHED,

    /**
     * 
     *                 The number of ad units on the placement exceeds the max number of ad units
     *                 allowed per placement in the network.
     *               
     * 
     */
    AD_UNIT_LIMIT_FOR_PLACEMENT_REACHED,

    /**
     * 
     *                 The number of targeting expressions on the line item exceeds the max number of targeting
     *                 expressions allowed per line item in the network.
     *               
     * 
     */
    TARGETING_EXPRESSION_LIMIT_FOR_LINE_ITEM_REACHED,

    /**
     * 
     *                 The number of attachments added to the proposal exceeds the max number
     *                 allowed per proposal in the network.
     *               
     * 
     */
    ATTACHMENT_LIMIT_FOR_PROPOSAL_REACHED,

    /**
     * 
     *                 The number of proposal line items on the proposal exceeds the max number
     *                 allowed per proposal in the network.
     *               
     * 
     */
    PROPOSAL_LINE_ITEM_LIMIT_FOR_PROPOSAL_REACHED,

    /**
     * 
     *                 The number of product package items on the product package exceeds the max number
     *                 allowed per product package in the network.
     *               
     * 
     */
    PRODUCT_LIMIT_FOR_PRODUCT_PACKAGE_REACHED,

    /**
     * 
     *                 The number of product template and product base rates on the rate card (including excluded
     *                 product base rates) exceeds the max number allowed per rate card in the network.
     *               
     * 
     */
    PRODUCT_TEMPLATE_AND_PRODUCT_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The number of product package item base rates on the rate card exceeds the max number
     *                 allowed per rate card in the network.
     *               
     * 
     */
    PRODUCT_PACKAGE_ITEM_BASE_RATE_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The number of premiums of the rate card exceeds the max number allowed per rate card
     *                 in the network.
     *               
     * 
     */
    PREMIUM_LIMIT_FOR_RATE_CARD_REACHED,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static EntityChildrenLimitReachedErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
