
package com.google.api.ads.adwords.jaxws.v201506.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             An error caused by an invalid ad customizer feed in an AdCustomizerFeedService request.
 *           
 * 
 * <p>Java class for AdCustomizerFeedError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdCustomizerFeedError">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/cm/v201506}ApiError">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{https://adwords.google.com/api/adwords/cm/v201506}AdCustomizerFeedError.Reason" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdCustomizerFeedError", propOrder = {
    "reason"
})
public class AdCustomizerFeedError
    extends ApiError
{

    @XmlSchemaType(name = "string")
    protected AdCustomizerFeedErrorReason reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link AdCustomizerFeedErrorReason }
     *     
     */
    public AdCustomizerFeedErrorReason getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdCustomizerFeedErrorReason }
     *     
     */
    public void setReason(AdCustomizerFeedErrorReason value) {
        this.reason = value;
    }

}
