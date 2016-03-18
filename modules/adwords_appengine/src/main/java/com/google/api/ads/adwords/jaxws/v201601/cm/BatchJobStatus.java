
package com.google.api.ads.adwords.jaxws.v201601.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchJobStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchJobStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="AWAITING_FILE"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="CANCELING"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="DONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchJobStatus")
@XmlEnum
public enum BatchJobStatus {


    /**
     * 
     *                 <span class="constraint Rejected">Used for return value only. An enumeration could not be processed, typically due to incompatibility with your WSDL version.</span>
     *               
     * 
     */
    UNKNOWN,

    /**
     * 
     *                 Initial state of a BatchJob. While a job has this status, it is awaiting a file
     *                 upload to Google Cloud Storage.
     *               
     * 
     */
    AWAITING_FILE,

    /**
     * 
     *                 Indicates that a job has an associated file and is being executed.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 Indicates that a job is being canceled. It will remain in this status until any
     *                 partial results are written, and then will be marked CANCELED. This status is
     *                 not supported in SET operations.
     *               
     * 
     */
    CANCELING,

    /**
     * 
     *                 Indicates that a job has been canceled. It will be garbage-collected 30 days
     *                 after cancellation. This status is not currently supported in SET operations.
     *               
     * 
     */
    CANCELED,

    /**
     * 
     *                 Indicates that a job has completed. It will be garbage-collected 30 days after
     *                 completion.
     *               
     * 
     */
    DONE;

    public String value() {
        return name();
    }

    public static BatchJobStatus fromValue(String v) {
        return valueOf(v);
    }

}
