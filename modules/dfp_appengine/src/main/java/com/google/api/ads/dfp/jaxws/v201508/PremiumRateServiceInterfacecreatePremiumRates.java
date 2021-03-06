
package com.google.api.ads.dfp.jaxws.v201508;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Creates a list of new {@link PremiumRate} objects.
 *             
 *             @param premiumRates the premium rates to be created
 *             @return the premium rates with their IDs filled in
 *           
 * 
 * <p>Java class for createPremiumRates element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="createPremiumRates">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="premiumRates" type="{https://www.google.com/apis/ads/publisher/v201508}PremiumRate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "premiumRates"
})
@XmlRootElement(name = "createPremiumRates")
public class PremiumRateServiceInterfacecreatePremiumRates {

    protected List<PremiumRate> premiumRates;

    /**
     * Gets the value of the premiumRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premiumRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremiumRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PremiumRate }
     * 
     * 
     */
    public List<PremiumRate> getPremiumRates() {
        if (premiumRates == null) {
            premiumRates = new ArrayList<PremiumRate>();
        }
        return this.premiumRates;
    }

}
