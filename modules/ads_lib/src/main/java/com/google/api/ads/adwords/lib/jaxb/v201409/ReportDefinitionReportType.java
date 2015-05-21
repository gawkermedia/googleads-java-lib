//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.19 at 08:42:46 AM PDT 
//


package com.google.api.ads.adwords.lib.jaxb.v201409;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportDefinition.ReportType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportDefinition.ReportType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KEYWORDS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AD_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="URL_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="ADGROUP_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="ACCOUNT_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="GEO_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="SEARCH_QUERY_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AD_EXTENSIONS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DESTINATION_URL_REPORT"/>
 *     &lt;enumeration value="SHARED_SET_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_SHARED_SET_REPORT"/>
 *     &lt;enumeration value="SHARED_SET_CRITERIA_REPORT"/>
 *     &lt;enumeration value="CREATIVE_CONVERSION_REPORT"/>
 *     &lt;enumeration value="CALL_METRICS_CALL_DETAILS_REPORT"/>
 *     &lt;enumeration value="KEYWORDLESS_QUERY_REPORT"/>
 *     &lt;enumeration value="KEYWORDLESS_CATEGORY_REPORT"/>
 *     &lt;enumeration value="CRITERIA_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CLICK_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="BUDGET_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="BID_GOAL_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DISPLAY_KEYWORD_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="PLACEHOLDER_FEED_ITEM_REPORT"/>
 *     &lt;enumeration value="PLACEMENT_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_NEGATIVE_LOCATIONS_REPORT"/>
 *     &lt;enumeration value="GENDER_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="AGE_RANGE_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_LOCATION_TARGET_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_AD_SCHEDULE_TARGET_REPORT"/>
 *     &lt;enumeration value="CAMPAIGN_PLATFORM_TARGET_REPORT"/>
 *     &lt;enumeration value="PAID_ORGANIC_QUERY_REPORT"/>
 *     &lt;enumeration value="AUDIENCE_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="DISPLAY_TOPICS_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="SHOPPING_PERFORMANCE_REPORT"/>
 *     &lt;enumeration value="PRODUCT_PARTITION_REPORT"/>
 *     &lt;enumeration value="PLACEHOLDER_REPORT"/>
 *     &lt;enumeration value="AD_CUSTOMIZERS_FEED_ITEM_REPORT"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportDefinition.ReportType")
@XmlEnum
public enum ReportDefinitionReportType {

    KEYWORDS_PERFORMANCE_REPORT,
    AD_PERFORMANCE_REPORT,
    URL_PERFORMANCE_REPORT,
    ADGROUP_PERFORMANCE_REPORT,
    CAMPAIGN_PERFORMANCE_REPORT,
    ACCOUNT_PERFORMANCE_REPORT,
    GEO_PERFORMANCE_REPORT,
    SEARCH_QUERY_PERFORMANCE_REPORT,
    AUTOMATIC_PLACEMENTS_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_KEYWORDS_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_PLACEMENTS_PERFORMANCE_REPORT,
    AD_EXTENSIONS_PERFORMANCE_REPORT,
    DESTINATION_URL_REPORT,
    SHARED_SET_REPORT,
    CAMPAIGN_SHARED_SET_REPORT,
    SHARED_SET_CRITERIA_REPORT,
    CREATIVE_CONVERSION_REPORT,
    CALL_METRICS_CALL_DETAILS_REPORT,
    KEYWORDLESS_QUERY_REPORT,
    KEYWORDLESS_CATEGORY_REPORT,
    CRITERIA_PERFORMANCE_REPORT,
    CLICK_PERFORMANCE_REPORT,
    BUDGET_PERFORMANCE_REPORT,
    BID_GOAL_PERFORMANCE_REPORT,
    DISPLAY_KEYWORD_PERFORMANCE_REPORT,
    PLACEHOLDER_FEED_ITEM_REPORT,
    PLACEMENT_PERFORMANCE_REPORT,
    CAMPAIGN_NEGATIVE_LOCATIONS_REPORT,
    GENDER_PERFORMANCE_REPORT,
    AGE_RANGE_PERFORMANCE_REPORT,
    CAMPAIGN_LOCATION_TARGET_REPORT,
    CAMPAIGN_AD_SCHEDULE_TARGET_REPORT,
    CAMPAIGN_PLATFORM_TARGET_REPORT,
    PAID_ORGANIC_QUERY_REPORT,
    AUDIENCE_PERFORMANCE_REPORT,
    DISPLAY_TOPICS_PERFORMANCE_REPORT,
    SHOPPING_PERFORMANCE_REPORT,
    PRODUCT_PARTITION_REPORT,
    PLACEHOLDER_REPORT,
    AD_CUSTOMIZERS_FEED_ITEM_REPORT,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ReportDefinitionReportType fromValue(String v) {
        return valueOf(v);
    }

}
