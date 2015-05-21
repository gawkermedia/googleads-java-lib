/**
 * ReportServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201502;

public interface ReportServiceInterface extends java.rmi.Remote {

    /**
     * Returns the URL at which the report file can be downloaded.
     * <p>
     *         The report will be generated as a gzip archive, containing
     * the report file itself.
     *         
     *         
     * @param reportJobId the ID of the {@link ReportJob}
     *         
     * @param exportFormat the {@link ExportFormat} for the report file
     *         
     * @return the URL for report file download
     */
    public java.lang.String getReportDownloadURL(java.lang.Long reportJobId, com.google.api.ads.dfp.axis.v201502.ExportFormat exportFormat) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Returns the URL at which the report file can be downloaded,
     * and allows for customization
     *         of the downloaded report.
     *         <p>
     *         By default, the report will be generated as a gzip archive,
     * containing the report file itself.
     *         This can be changed by setting {@link ReportDownloadOptions#useGzipCompression}
     * to false.
     *         
     *         
     * @param reportJobId the ID of the {@link ReportJob}
     *         
     * @param reportDownloadOptions the {@link ReportDownloadOptions} for
     * the request
     *         
     * @return the URL for report file download
     */
    public java.lang.String getReportDownloadUrlWithOptions(java.lang.Long reportJobId, com.google.api.ads.dfp.axis.v201502.ReportDownloadOptions reportDownloadOptions) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Returns the {@link ReportJob} uniquely identified by the given
     * ID with only the
     *         {@link ReportJob#reportJobStatus} and {@link ReportJob#id}
     * fields filled in.
     *         
     *         <p>Replaced with {@code ReportService.getReportJobStatus}
     * beginning in V201505.
     *         
     *         
     * @param reportJobId the Id of the report job which must already exist
     * 
     * @return the {@code ReportJob} uniquely identified by the given ID
     * with the ID and status
     *         fields filled in.
     */
    public com.google.api.ads.dfp.axis.v201502.ReportJob getReportJob(java.lang.Long reportJobId) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;

    /**
     * Initiates the execution of a {@link ReportQuery} on the server.
     * 
     *         <p>The following fields are required:
     *         <ul>
     *         <li>{@link ReportJob#reportQuery}</li>
     *         </ul>
     *         
     *         
     * @param reportJob the report job to run
     *         
     * @return the report job with its ID filled in
     */
    public com.google.api.ads.dfp.axis.v201502.ReportJob runReportJob(com.google.api.ads.dfp.axis.v201502.ReportJob reportJob) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201502.ApiException;
}
