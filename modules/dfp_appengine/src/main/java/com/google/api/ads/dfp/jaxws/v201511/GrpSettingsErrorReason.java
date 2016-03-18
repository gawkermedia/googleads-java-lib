
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrpSettingsError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GrpSettingsError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_AGE_RANGE"/>
 *     &lt;enumeration value="LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="LINE_ITEM_TYPE_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE"/>
 *     &lt;enumeration value="INVALID_MIN_AGE"/>
 *     &lt;enumeration value="INVALID_MAX_AGE"/>
 *     &lt;enumeration value="CANNOT_DISABLE_GRP_AFTER_ENABLING"/>
 *     &lt;enumeration value="CANNOT_CHANGE_GRP_PROVIDERS"/>
 *     &lt;enumeration value="CANNOT_CHANGE_TARGET_DEMOG_AFTER_ACTIVATION"/>
 *     &lt;enumeration value="DEMOG_GOAL_NOT_SUPPORTED"/>
 *     &lt;enumeration value="CANNOT_SET_DEMOG_GOAL"/>
 *     &lt;enumeration value="CANNOT_REMOVE_DEMOG_GOAL"/>
 *     &lt;enumeration value="UNSUPPORTED_GEO_TARGETING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GrpSettingsError.Reason")
@XmlEnum
public enum GrpSettingsErrorReason {


    /**
     * 
     *                 Age range for GRP audience is not valid. Please see
     *                 https://support.google.com/dfp_premium/answer/6337075 for more information.
     *               
     * 
     */
    INVALID_AGE_RANGE,

    /**
     * 
     *                 GRP settings are only supported for video line items.
     *               
     * 
     */
    LINE_ITEM_ENVIRONMENT_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 GRP settings are not supported for the given line item type.
     *               
     * 
     */
    LINE_ITEM_TYPE_NOT_SUPPORTED,

    /**
     * 
     *                 GRP audience gender cannot be specified for the selected age range.
     *               
     * 
     */
    CANNOT_SPECIFY_GENDER_FOR_GIVEN_AGE_RANGE,

    /**
     * 
     *                 Minimum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MIN_AGE,

    /**
     * 
     *                 Maximum age for GRP audience is not valid.
     *               
     * 
     */
    INVALID_MAX_AGE,

    /**
     * 
     *                 GRP settings cannot be disabled.
     *               
     * 
     */
    CANNOT_DISABLE_GRP_AFTER_ENABLING,

    /**
     * 
     *                 GRP provider cannot be updated.
     *               
     * 
     */
    CANNOT_CHANGE_GRP_PROVIDERS,

    /**
     * 
     *                 GRP settings cannot be updated once the line item has started serving.
     *               
     * 
     */
    CANNOT_CHANGE_TARGET_DEMOG_AFTER_ACTIVATION,

    /**
     * 
     *                 Impression goal based on GRP audience is not supported.
     *               
     * 
     */
    DEMOG_GOAL_NOT_SUPPORTED,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be set once the line item has started serving.
     *               
     * 
     */
    CANNOT_SET_DEMOG_GOAL,

    /**
     * 
     *                 Impression goal based on GRP audience cannot be removed once the line item has started
     *                 serving.
     *               
     * 
     */
    CANNOT_REMOVE_DEMOG_GOAL,

    /**
     * 
     *                 Unsupported geographic location targeted for line item with GRP audience goal.
     *               
     * 
     */
    UNSUPPORTED_GEO_TARGETING,

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

    public static GrpSettingsErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
