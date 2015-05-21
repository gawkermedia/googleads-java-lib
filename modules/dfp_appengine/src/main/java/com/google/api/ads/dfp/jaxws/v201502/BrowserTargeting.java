
package com.google.api.ads.dfp.jaxws.v201502;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents browsers that are being targeted or excluded by the
 *             {@link LineItem}.
 *           
 * 
 * <p>Java class for BrowserTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrowserTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isTargeted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="browsers" type="{https://www.google.com/apis/ads/publisher/v201502}Technology" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrowserTargeting", propOrder = {
    "isTargeted",
    "browsers"
})
public class BrowserTargeting {

    protected Boolean isTargeted;
    protected List<Technology> browsers;

    /**
     * Gets the value of the isTargeted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTargeted() {
        return isTargeted;
    }

    /**
     * Sets the value of the isTargeted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTargeted(Boolean value) {
        this.isTargeted = value;
    }

    /**
     * Gets the value of the browsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the browsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrowsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Technology }
     * 
     * 
     */
    public List<Technology> getBrowsers() {
        if (browsers == null) {
            browsers = new ArrayList<Technology>();
        }
        return this.browsers;
    }

}
