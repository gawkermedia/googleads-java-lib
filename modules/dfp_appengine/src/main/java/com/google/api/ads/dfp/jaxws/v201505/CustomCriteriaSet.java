
package com.google.api.ads.dfp.jaxws.v201505;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@link CustomCriteriaSet} comprises of a set of {@link CustomCriteriaNode}
 *             objects combined by the
 *             {@link CustomCriteriaSet.LogicalOperator#logicalOperator}. The custom
 *             criteria targeting tree is subject to the rules defined on
 *             {@link Targeting#customTargeting}.
 *           
 * 
 * <p>Java class for CustomCriteriaSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomCriteriaSet">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.google.com/apis/ads/publisher/v201505}CustomCriteriaNode">
 *       &lt;sequence>
 *         &lt;element name="logicalOperator" type="{https://www.google.com/apis/ads/publisher/v201505}CustomCriteriaSet.LogicalOperator" minOccurs="0"/>
 *         &lt;element name="children" type="{https://www.google.com/apis/ads/publisher/v201505}CustomCriteriaNode" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomCriteriaSet", propOrder = {
    "logicalOperator",
    "children"
})
public class CustomCriteriaSet
    extends CustomCriteriaNode
{

    protected CustomCriteriaSetLogicalOperator logicalOperator;
    protected List<CustomCriteriaNode> children;

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link CustomCriteriaSetLogicalOperator }
     *     
     */
    public CustomCriteriaSetLogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomCriteriaSetLogicalOperator }
     *     
     */
    public void setLogicalOperator(CustomCriteriaSetLogicalOperator value) {
        this.logicalOperator = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomCriteriaNode }
     * 
     * 
     */
    public List<CustomCriteriaNode> getChildren() {
        if (children == null) {
            children = new ArrayList<CustomCriteriaNode>();
        }
        return this.children;
    }

}
