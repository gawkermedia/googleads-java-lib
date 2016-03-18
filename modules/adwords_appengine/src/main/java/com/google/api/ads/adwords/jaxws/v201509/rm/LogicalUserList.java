
package com.google.api.ads.adwords.jaxws.v201509.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a user list that is a custom combination of user lists and user
 *             interests.
 *           
 * 
 * <p>Java class for LogicalUserList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LogicalUserList">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/rm/v201509}UserList">
 *       &lt;sequence>
 *         &lt;element name="rules" type="{https://adwords.google.com/api/adwords/rm/v201509}UserListLogicalRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="logicalOptOutLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogicalUserList", propOrder = {
    "rules",
    "logicalOptOutLink"
})
public class LogicalUserList
    extends UserList
{

    protected List<UserListLogicalRule> rules;
    protected String logicalOptOutLink;

    /**
     * Gets the value of the rules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserListLogicalRule }
     * 
     * 
     */
    public List<UserListLogicalRule> getRules() {
        if (rules == null) {
            rules = new ArrayList<UserListLogicalRule>();
        }
        return this.rules;
    }

    /**
     * Gets the value of the logicalOptOutLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalOptOutLink() {
        return logicalOptOutLink;
    }

    /**
     * Sets the value of the logicalOptOutLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalOptOutLink(String value) {
        this.logicalOptOutLink = value;
    }

}
