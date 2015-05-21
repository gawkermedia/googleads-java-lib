/**
 * LiveStreamEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;


/**
 * A {@code LiveStreamEvent} represents schedule, content and ad stitching
 * information of a live stream event.
 */
public class LiveStreamEvent  implements java.io.Serializable {
    /* The unique ID of the {@code LiveStreamEvent}. This value is
     * read-only and
     *                 is assigned by Google. */
    private java.lang.Long id;

    /* The name of the {@code LiveStreamEvent}. This value is required
     * to create
     *                 a live stream event and has a maximum length of 255
     * characters. */
    private java.lang.String name;

    /* Provides any additional notes that may annotate {@code LiveStreamEvent}.
     * This attribute is optional and has a maximum length of 65,535 characters. */
    private java.lang.String description;

    /* The status of this {@code LiveStreamEvent}. This attribute
     * is read-only
     *                 and is assigned by Google. Live stream events are
     * created in the
     *                 {@link LiveStreamEventStatus#PAUSED} state. */
    private com.google.api.ads.dfp.axis.v201502.LiveStreamEventStatus status;

    /* The date and time this {@code LiveStreamEvent} was created.
     * This attribute
     *                 is read-only. */
    private com.google.api.ads.dfp.axis.v201502.DateTime creationDateTime;

    /* The date and time this {@code LiveStreamEvent} was last modified.
     * This
     *                 attribute is read-only. */
    private com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime;

    /* The start date and time of this {@code LiveStreamEvent}. This
     * attribute
     *                 is required. */
    private com.google.api.ads.dfp.axis.v201502.DateTime startDateTime;

    /* The scheduled end date and time of this {@code LiveStreamEvent}.
     * This
     *                 attribute is required. */
    private com.google.api.ads.dfp.axis.v201502.DateTime endDateTime;

    /* The total number of concurrent users expected to watch this
     * event across
     *                 all regions. This attribute is optional and default
     * value is 0. */
    private java.lang.Long totalEstimatedConcurrentUsers;

    /* The list of URLs pointing to the live stream content in
     *                 Content Delivery Network. This attribute is required. */
    private java.lang.String[] contentUrls;

    /* The list of DFP ad tag URLs generated by DFP trafficking workflow
     * that are
     *                 associated with this live stream event. This attribute
     * is required. */
    private java.lang.String[] adTags;

    /* This code is used in constructing a live stream event master
     * playlist URL.
     *                 This attribute is read-only and is assigned by Google. */
    private java.lang.String liveStreamEventCode;

    public LiveStreamEvent() {
    }

    public LiveStreamEvent(
           java.lang.Long id,
           java.lang.String name,
           java.lang.String description,
           com.google.api.ads.dfp.axis.v201502.LiveStreamEventStatus status,
           com.google.api.ads.dfp.axis.v201502.DateTime creationDateTime,
           com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime,
           com.google.api.ads.dfp.axis.v201502.DateTime startDateTime,
           com.google.api.ads.dfp.axis.v201502.DateTime endDateTime,
           java.lang.Long totalEstimatedConcurrentUsers,
           java.lang.String[] contentUrls,
           java.lang.String[] adTags,
           java.lang.String liveStreamEventCode) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.status = status;
           this.creationDateTime = creationDateTime;
           this.lastModifiedDateTime = lastModifiedDateTime;
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.totalEstimatedConcurrentUsers = totalEstimatedConcurrentUsers;
           this.contentUrls = contentUrls;
           this.adTags = adTags;
           this.liveStreamEventCode = liveStreamEventCode;
    }


    /**
     * Gets the id value for this LiveStreamEvent.
     * 
     * @return id   * The unique ID of the {@code LiveStreamEvent}. This value is
     * read-only and
     *                 is assigned by Google.
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LiveStreamEvent.
     * 
     * @param id   * The unique ID of the {@code LiveStreamEvent}. This value is
     * read-only and
     *                 is assigned by Google.
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this LiveStreamEvent.
     * 
     * @return name   * The name of the {@code LiveStreamEvent}. This value is required
     * to create
     *                 a live stream event and has a maximum length of 255
     * characters.
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this LiveStreamEvent.
     * 
     * @param name   * The name of the {@code LiveStreamEvent}. This value is required
     * to create
     *                 a live stream event and has a maximum length of 255
     * characters.
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this LiveStreamEvent.
     * 
     * @return description   * Provides any additional notes that may annotate {@code LiveStreamEvent}.
     * This attribute is optional and has a maximum length of 65,535 characters.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this LiveStreamEvent.
     * 
     * @param description   * Provides any additional notes that may annotate {@code LiveStreamEvent}.
     * This attribute is optional and has a maximum length of 65,535 characters.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the status value for this LiveStreamEvent.
     * 
     * @return status   * The status of this {@code LiveStreamEvent}. This attribute
     * is read-only
     *                 and is assigned by Google. Live stream events are
     * created in the
     *                 {@link LiveStreamEventStatus#PAUSED} state.
     */
    public com.google.api.ads.dfp.axis.v201502.LiveStreamEventStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LiveStreamEvent.
     * 
     * @param status   * The status of this {@code LiveStreamEvent}. This attribute
     * is read-only
     *                 and is assigned by Google. Live stream events are
     * created in the
     *                 {@link LiveStreamEventStatus#PAUSED} state.
     */
    public void setStatus(com.google.api.ads.dfp.axis.v201502.LiveStreamEventStatus status) {
        this.status = status;
    }


    /**
     * Gets the creationDateTime value for this LiveStreamEvent.
     * 
     * @return creationDateTime   * The date and time this {@code LiveStreamEvent} was created.
     * This attribute
     *                 is read-only.
     */
    public com.google.api.ads.dfp.axis.v201502.DateTime getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this LiveStreamEvent.
     * 
     * @param creationDateTime   * The date and time this {@code LiveStreamEvent} was created.
     * This attribute
     *                 is read-only.
     */
    public void setCreationDateTime(com.google.api.ads.dfp.axis.v201502.DateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the lastModifiedDateTime value for this LiveStreamEvent.
     * 
     * @return lastModifiedDateTime   * The date and time this {@code LiveStreamEvent} was last modified.
     * This
     *                 attribute is read-only.
     */
    public com.google.api.ads.dfp.axis.v201502.DateTime getLastModifiedDateTime() {
        return lastModifiedDateTime;
    }


    /**
     * Sets the lastModifiedDateTime value for this LiveStreamEvent.
     * 
     * @param lastModifiedDateTime   * The date and time this {@code LiveStreamEvent} was last modified.
     * This
     *                 attribute is read-only.
     */
    public void setLastModifiedDateTime(com.google.api.ads.dfp.axis.v201502.DateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }


    /**
     * Gets the startDateTime value for this LiveStreamEvent.
     * 
     * @return startDateTime   * The start date and time of this {@code LiveStreamEvent}. This
     * attribute
     *                 is required.
     */
    public com.google.api.ads.dfp.axis.v201502.DateTime getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this LiveStreamEvent.
     * 
     * @param startDateTime   * The start date and time of this {@code LiveStreamEvent}. This
     * attribute
     *                 is required.
     */
    public void setStartDateTime(com.google.api.ads.dfp.axis.v201502.DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this LiveStreamEvent.
     * 
     * @return endDateTime   * The scheduled end date and time of this {@code LiveStreamEvent}.
     * This
     *                 attribute is required.
     */
    public com.google.api.ads.dfp.axis.v201502.DateTime getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this LiveStreamEvent.
     * 
     * @param endDateTime   * The scheduled end date and time of this {@code LiveStreamEvent}.
     * This
     *                 attribute is required.
     */
    public void setEndDateTime(com.google.api.ads.dfp.axis.v201502.DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the totalEstimatedConcurrentUsers value for this LiveStreamEvent.
     * 
     * @return totalEstimatedConcurrentUsers   * The total number of concurrent users expected to watch this
     * event across
     *                 all regions. This attribute is optional and default
     * value is 0.
     */
    public java.lang.Long getTotalEstimatedConcurrentUsers() {
        return totalEstimatedConcurrentUsers;
    }


    /**
     * Sets the totalEstimatedConcurrentUsers value for this LiveStreamEvent.
     * 
     * @param totalEstimatedConcurrentUsers   * The total number of concurrent users expected to watch this
     * event across
     *                 all regions. This attribute is optional and default
     * value is 0.
     */
    public void setTotalEstimatedConcurrentUsers(java.lang.Long totalEstimatedConcurrentUsers) {
        this.totalEstimatedConcurrentUsers = totalEstimatedConcurrentUsers;
    }


    /**
     * Gets the contentUrls value for this LiveStreamEvent.
     * 
     * @return contentUrls   * The list of URLs pointing to the live stream content in
     *                 Content Delivery Network. This attribute is required.
     */
    public java.lang.String[] getContentUrls() {
        return contentUrls;
    }


    /**
     * Sets the contentUrls value for this LiveStreamEvent.
     * 
     * @param contentUrls   * The list of URLs pointing to the live stream content in
     *                 Content Delivery Network. This attribute is required.
     */
    public void setContentUrls(java.lang.String[] contentUrls) {
        this.contentUrls = contentUrls;
    }

    public java.lang.String getContentUrls(int i) {
        return this.contentUrls[i];
    }

    public void setContentUrls(int i, java.lang.String _value) {
        this.contentUrls[i] = _value;
    }


    /**
     * Gets the adTags value for this LiveStreamEvent.
     * 
     * @return adTags   * The list of DFP ad tag URLs generated by DFP trafficking workflow
     * that are
     *                 associated with this live stream event. This attribute
     * is required.
     */
    public java.lang.String[] getAdTags() {
        return adTags;
    }


    /**
     * Sets the adTags value for this LiveStreamEvent.
     * 
     * @param adTags   * The list of DFP ad tag URLs generated by DFP trafficking workflow
     * that are
     *                 associated with this live stream event. This attribute
     * is required.
     */
    public void setAdTags(java.lang.String[] adTags) {
        this.adTags = adTags;
    }

    public java.lang.String getAdTags(int i) {
        return this.adTags[i];
    }

    public void setAdTags(int i, java.lang.String _value) {
        this.adTags[i] = _value;
    }


    /**
     * Gets the liveStreamEventCode value for this LiveStreamEvent.
     * 
     * @return liveStreamEventCode   * This code is used in constructing a live stream event master
     * playlist URL.
     *                 This attribute is read-only and is assigned by Google.
     */
    public java.lang.String getLiveStreamEventCode() {
        return liveStreamEventCode;
    }


    /**
     * Sets the liveStreamEventCode value for this LiveStreamEvent.
     * 
     * @param liveStreamEventCode   * This code is used in constructing a live stream event master
     * playlist URL.
     *                 This attribute is read-only and is assigned by Google.
     */
    public void setLiveStreamEventCode(java.lang.String liveStreamEventCode) {
        this.liveStreamEventCode = liveStreamEventCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LiveStreamEvent)) return false;
        LiveStreamEvent other = (LiveStreamEvent) obj;
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
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.lastModifiedDateTime==null && other.getLastModifiedDateTime()==null) || 
             (this.lastModifiedDateTime!=null &&
              this.lastModifiedDateTime.equals(other.getLastModifiedDateTime()))) &&
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.totalEstimatedConcurrentUsers==null && other.getTotalEstimatedConcurrentUsers()==null) || 
             (this.totalEstimatedConcurrentUsers!=null &&
              this.totalEstimatedConcurrentUsers.equals(other.getTotalEstimatedConcurrentUsers()))) &&
            ((this.contentUrls==null && other.getContentUrls()==null) || 
             (this.contentUrls!=null &&
              java.util.Arrays.equals(this.contentUrls, other.getContentUrls()))) &&
            ((this.adTags==null && other.getAdTags()==null) || 
             (this.adTags!=null &&
              java.util.Arrays.equals(this.adTags, other.getAdTags()))) &&
            ((this.liveStreamEventCode==null && other.getLiveStreamEventCode()==null) || 
             (this.liveStreamEventCode!=null &&
              this.liveStreamEventCode.equals(other.getLiveStreamEventCode())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getLastModifiedDateTime() != null) {
            _hashCode += getLastModifiedDateTime().hashCode();
        }
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getTotalEstimatedConcurrentUsers() != null) {
            _hashCode += getTotalEstimatedConcurrentUsers().hashCode();
        }
        if (getContentUrls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentUrls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentUrls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdTags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdTags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdTags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiveStreamEventCode() != null) {
            _hashCode += getLiveStreamEventCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LiveStreamEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "LiveStreamEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "LiveStreamEventStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "creationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "lastModifiedDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "startDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "endDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "DateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEstimatedConcurrentUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "totalEstimatedConcurrentUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentUrls");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "contentUrls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adTags");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "adTags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveStreamEventCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201502", "liveStreamEventCode"));
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
