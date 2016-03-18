/**
 * AdGroupExtensionSetting.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.cm;


/**
 * An AdGroupExtensionSetting is used to add or modify extensions
 * being served for the specified
 *             ad group.
 */
public class AdGroupExtensionSetting  implements java.io.Serializable {
    /* The id of the ad group for the feed items being added or modified.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AdGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Long adGroupId;

    /* The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201509.cm.FeedType extensionType;

    /* The extension setting specifying which extensions to serve
     * for the specified ad group. If
     *                 extensionSetting is empty (i.e. has an empty list
     * of feed items and null platformRestrictions),
     *                 extensions are disabled for the specified extensionType.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, SET.</span> */
    private com.google.api.ads.adwords.axis.v201509.cm.ExtensionSetting extensionSetting;

    public AdGroupExtensionSetting() {
    }

    public AdGroupExtensionSetting(
           java.lang.Long adGroupId,
           com.google.api.ads.adwords.axis.v201509.cm.FeedType extensionType,
           com.google.api.ads.adwords.axis.v201509.cm.ExtensionSetting extensionSetting) {
           this.adGroupId = adGroupId;
           this.extensionType = extensionType;
           this.extensionSetting = extensionSetting;
    }


    /**
     * Gets the adGroupId value for this AdGroupExtensionSetting.
     * 
     * @return adGroupId   * The id of the ad group for the feed items being added or modified.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AdGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Long getAdGroupId() {
        return adGroupId;
    }


    /**
     * Sets the adGroupId value for this AdGroupExtensionSetting.
     * 
     * @param adGroupId   * The id of the ad group for the feed items being added or modified.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AdGroupId".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setAdGroupId(java.lang.Long adGroupId) {
        this.adGroupId = adGroupId;
    }


    /**
     * Gets the extensionType value for this AdGroupExtensionSetting.
     * 
     * @return extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201509.cm.FeedType getExtensionType() {
        return extensionType;
    }


    /**
     * Sets the extensionType value for this AdGroupExtensionSetting.
     * 
     * @param extensionType   * The extension type the extension setting applies to.
     *                 <span class="constraint Selectable">This field can
     * be selected using the value "ExtensionType".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setExtensionType(com.google.api.ads.adwords.axis.v201509.cm.FeedType extensionType) {
        this.extensionType = extensionType;
    }


    /**
     * Gets the extensionSetting value for this AdGroupExtensionSetting.
     * 
     * @return extensionSetting   * The extension setting specifying which extensions to serve
     * for the specified ad group. If
     *                 extensionSetting is empty (i.e. has an empty list
     * of feed items and null platformRestrictions),
     *                 extensions are disabled for the specified extensionType.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, SET.</span>
     */
    public com.google.api.ads.adwords.axis.v201509.cm.ExtensionSetting getExtensionSetting() {
        return extensionSetting;
    }


    /**
     * Sets the extensionSetting value for this AdGroupExtensionSetting.
     * 
     * @param extensionSetting   * The extension setting specifying which extensions to serve
     * for the specified ad group. If
     *                 extensionSetting is empty (i.e. has an empty list
     * of feed items and null platformRestrictions),
     *                 extensions are disabled for the specified extensionType.
     * <span class="constraint Required">This field is required and should
     * not be {@code null} when it is contained within {@link Operator}s
     * : ADD, SET.</span>
     */
    public void setExtensionSetting(com.google.api.ads.adwords.axis.v201509.cm.ExtensionSetting extensionSetting) {
        this.extensionSetting = extensionSetting;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdGroupExtensionSetting)) return false;
        AdGroupExtensionSetting other = (AdGroupExtensionSetting) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adGroupId==null && other.getAdGroupId()==null) || 
             (this.adGroupId!=null &&
              this.adGroupId.equals(other.getAdGroupId()))) &&
            ((this.extensionType==null && other.getExtensionType()==null) || 
             (this.extensionType!=null &&
              this.extensionType.equals(other.getExtensionType()))) &&
            ((this.extensionSetting==null && other.getExtensionSetting()==null) || 
             (this.extensionSetting!=null &&
              this.extensionSetting.equals(other.getExtensionSetting())));
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
        if (getAdGroupId() != null) {
            _hashCode += getAdGroupId().hashCode();
        }
        if (getExtensionType() != null) {
            _hashCode += getExtensionType().hashCode();
        }
        if (getExtensionSetting() != null) {
            _hashCode += getExtensionSetting().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdGroupExtensionSetting.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "AdGroupExtensionSetting"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "adGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "extensionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "Feed.Type"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extensionSetting");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "extensionSetting"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201509", "ExtensionSetting"));
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
