/**
 * MutateMembersErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201601.rm;

public class MutateMembersErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MutateMembersErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final java.lang.String _UNSUPPORTED_METHOD = "UNSUPPORTED_METHOD";
    public static final java.lang.String _INVALID_USER_LIST_ID = "INVALID_USER_LIST_ID";
    public static final java.lang.String _INVALID_USER_LIST_TYPE = "INVALID_USER_LIST_TYPE";
    public static final java.lang.String _INVALID_DATA_TYPE = "INVALID_DATA_TYPE";
    public static final java.lang.String _INVALID_SHA256_FORMAT = "INVALID_SHA256_FORMAT";
    public static final java.lang.String _OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID = "OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID";
    public static final MutateMembersErrorReason UNKNOWN = new MutateMembersErrorReason(_UNKNOWN);
    public static final MutateMembersErrorReason UNSUPPORTED_METHOD = new MutateMembersErrorReason(_UNSUPPORTED_METHOD);
    public static final MutateMembersErrorReason INVALID_USER_LIST_ID = new MutateMembersErrorReason(_INVALID_USER_LIST_ID);
    public static final MutateMembersErrorReason INVALID_USER_LIST_TYPE = new MutateMembersErrorReason(_INVALID_USER_LIST_TYPE);
    public static final MutateMembersErrorReason INVALID_DATA_TYPE = new MutateMembersErrorReason(_INVALID_DATA_TYPE);
    public static final MutateMembersErrorReason INVALID_SHA256_FORMAT = new MutateMembersErrorReason(_INVALID_SHA256_FORMAT);
    public static final MutateMembersErrorReason OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID = new MutateMembersErrorReason(_OPERATOR_CONFLICT_FOR_SAME_USER_LIST_ID);
    public java.lang.String getValue() { return _value_;}
    public static MutateMembersErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MutateMembersErrorReason enumeration = (MutateMembersErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MutateMembersErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MutateMembersErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/rm/v201601", "MutateMembersError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
