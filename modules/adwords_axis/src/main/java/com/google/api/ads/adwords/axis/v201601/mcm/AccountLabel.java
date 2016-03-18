/**
 * AccountLabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.mcm;


/**
 * A label that can be attached to accounts.
 *             A manager may attach labels to accounts that s/he manages
 * (either directly or indirectly).
 *             
 *             <p>Note that these are not interchangeable with campaign
 * management labels, and are owned
 *             by manager customers.
 */
public class AccountLabel  implements java.io.Serializable {
    /* ID of the label.
     *                 <p>This field is selectable/filterable in AccountLabelService.
     * To select labels or filter by
     *                 label ID in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span> */
    private java.lang.Long id;

    /* Name of the label.
     *                 <p>This field is selectable in AccountLabelService.
     * To select labels in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelName".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span> */
    private java.lang.String name;

    public AccountLabel() {
    }

    public AccountLabel(
           java.lang.Long id,
           java.lang.String name) {
           this.id = id;
           this.name = name;
    }


    /**
     * Gets the id value for this AccountLabel.
     * 
     * @return id   * ID of the label.
     *                 <p>This field is selectable/filterable in AccountLabelService.
     * To select labels or filter by
     *                 label ID in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this AccountLabel.
     * 
     * @param id   * ID of the label.
     *                 <p>This field is selectable/filterable in AccountLabelService.
     * To select labels or filter by
     *                 label ID in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint ReadOnly">This field is read
     * only and will be ignored when sent to the API for the following {@link
     * Operator}s: ADD.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : SET, REMOVE.</span>
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this AccountLabel.
     * 
     * @return name   * Name of the label.
     *                 <p>This field is selectable in AccountLabelService.
     * To select labels in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelName".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this AccountLabel.
     * 
     * @param name   * Name of the label.
     *                 <p>This field is selectable in AccountLabelService.
     * To select labels in
     *                 {@link com.google.ads.api.services.mcm.customer.ManagedCustomerService#get
     * ManagedCustomerService},
     *                 use the {@code AccountLabels} field instead.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "LabelName".</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null} when it is contained within {@link
     * Operator}s : ADD.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountLabel)) return false;
        AccountLabel other = (AccountLabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountLabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "AccountLabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/mcm/v201601", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
