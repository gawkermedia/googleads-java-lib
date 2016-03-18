
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents the actions that can be performed on product templates.
 *           
 * 
 * <p>Java class for ProductTemplateAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTemplateAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTemplateAction")
@XmlSeeAlso({
    ArchiveProductTemplates.class,
    ActivateProductTemplates.class,
    UnarchiveProductTemplates.class,
    DeactivateProductTemplates.class
})
public abstract class ProductTemplateAction {


}
