
package com.google.api.ads.adwords.jaxws.v201601.rm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Mutate members of user lists by either adding or removing their lists of members.
 *             
 *             <p>Note that operations cannot have same user list id but different operators.
 *             
 *             @param operations the mutate members operations to apply
 *             @return a list of UserList objects
 *             @throws ApiException when there are one or more errors with the request
 *           
 * 
 * <p>Java class for mutateMembers element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="mutateMembers">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="operations" type="{https://adwords.google.com/api/adwords/rm/v201601}MutateMembersOperation" maxOccurs="unbounded" minOccurs="0"/>
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
    "operations"
})
@XmlRootElement(name = "mutateMembers")
public class AdwordsUserListServiceInterfacemutateMembers {

    protected List<MutateMembersOperation> operations;

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MutateMembersOperation }
     * 
     * 
     */
    public List<MutateMembersOperation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<MutateMembersOperation>();
        }
        return this.operations;
    }

}
