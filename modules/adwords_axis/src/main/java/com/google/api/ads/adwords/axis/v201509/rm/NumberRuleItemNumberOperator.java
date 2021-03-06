/**
 * NumberRuleItemNumberOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201509.rm;

public class NumberRuleItemNumberOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NumberRuleItemNumberOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _GREATER_THAN = "GREATER_THAN";
    public static final java.lang.String _GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL";
    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _NOT_EQUAL = "NOT_EQUAL";
    public static final java.lang.String _LESS_THAN = "LESS_THAN";
    public static final java.lang.String _LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL";
    public static final NumberRuleItemNumberOperator UNKNOWN = new NumberRuleItemNumberOperator(_UNKNOWN);
    public static final NumberRuleItemNumberOperator GREATER_THAN = new NumberRuleItemNumberOperator(_GREATER_THAN);
    public static final NumberRuleItemNumberOperator GREATER_THAN_OR_EQUAL = new NumberRuleItemNumberOperator(_GREATER_THAN_OR_EQUAL);
    public static final NumberRuleItemNumberOperator EQUALS = new NumberRuleItemNumberOperator(_EQUALS);
    public static final NumberRuleItemNumberOperator NOT_EQUAL = new NumberRuleItemNumberOperator(_NOT_EQUAL);
    public static final NumberRuleItemNumberOperator LESS_THAN = new NumberRuleItemNumberOperator(_LESS_THAN);
    public static final NumberRuleItemNumberOperator LESS_THAN_OR_EQUAL = new NumberRuleItemNumberOperator(_LESS_THAN_OR_EQUAL);
    public java.lang.String getValue() { return _value_;}
    public static NumberRuleItemNumberOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NumberRuleItemNumberOperator enumeration = (NumberRuleItemNumberOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NumberRuleItemNumberOperator fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberRuleItemNumberOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201509", "NumberRuleItem.NumberOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
