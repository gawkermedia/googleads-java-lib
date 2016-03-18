// Copyright 2014 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.client.reporting;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

/**
 * Additional AdWords report configuration options.
 */
@ThreadSafe
public class ReportingConfiguration {

  private final Boolean isSkipReportHeader;
  private final Boolean isSkipColumnHeader;
  private final Boolean isSkipReportSummary;
  private final Boolean isIncludeZeroImpressions;
  
  private ReportingConfiguration(
      Boolean isSkipReportHeader,
      Boolean isSkipColumnHeader,
      Boolean isSkipReportSummary,
      Boolean isIncludeZeroImpressions) {
    this.isSkipReportHeader = isSkipReportHeader;
    this.isSkipColumnHeader = isSkipColumnHeader;
    this.isSkipReportSummary = isSkipReportSummary;
    this.isIncludeZeroImpressions = isIncludeZeroImpressions;
  }


  /**
   * Copy constructor.
   */
  private ReportingConfiguration(ReportingConfiguration configToClone) {
    this(
        configToClone.isSkipReportHeader,
        configToClone.isSkipColumnHeader,
        configToClone.isSkipReportSummary,
        configToClone.isIncludeZeroImpressions);
  }
  
  /**
   * Return if report responses should skip the header row containing the
   * report name and date range.
   */
  @Nullable
  public Boolean isSkipReportHeader() {
    return isSkipReportHeader;
  }

  /**
   * Return if report responses should skip the header row containing the
   * column names.
   */
  @Nullable
  public Boolean isSkipColumnHeader() {
    return isSkipColumnHeader;
  }
  
  /**
   * Return if report responses should skip the summary row containing totals.
   */
  @Nullable
  public Boolean isSkipReportSummary() {
    return isSkipReportSummary;
  }
  
  /**
   * Return if report responses should include zero impression rows.
   */
  @Nullable
  public Boolean isIncludeZeroImpressions() {
    return isIncludeZeroImpressions;
  }
  
  /**
   * Validates this object for the specified version of the AdWords API.
   * @param version the version of the API to validate against, e.g., {@code v201509}.
   * 
   * @throws IllegalArgumentException if validation fails
   */
  public void validate(@Nullable String version) {
    // Currently there are no validations needed.
  }
  
  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("isSkipReportHeader", isSkipReportHeader)
        .append("isSkipColumnHeader", isSkipColumnHeader)
        .append("isSkipReportSummary", isSkipReportSummary)
        .append("isIncludeZeroImpressions", isIncludeZeroImpressions)
        .toString();
  }

  /**
   * Builder for {@link ReportingConfiguration} objects.
   * 
   */
  public static class Builder {
    
    private Boolean isSkipReportHeader;
    private Boolean isSkipColumnHeader;
    private Boolean isSkipReportSummary;
    private Boolean isIncludeZeroImpressions;

    /**
     * Sets if report responses should skip the header row containing the report name and date
     * range.
     */
    public Builder skipReportHeader(Boolean isSkipReportHeader) {
      this.isSkipReportHeader = isSkipReportHeader;
      return this;
    }

    /**
     * Sets if report responses should skip the header row containing the report column names.
     */
    public Builder skipColumnHeader(Boolean isSkipColumnHeader) {
      this.isSkipColumnHeader = isSkipColumnHeader;
      return this;
    }
    
    /**
     * Sets if report responses should skip the summary row containing totals.
     */
    public Builder skipReportSummary(Boolean isSkipReportSummary) {
      this.isSkipReportSummary = isSkipReportSummary;
      return this;
    }
    
    /**
     * Sets if report responses should include zero impression rows.
     */
    public Builder includeZeroImpressions(Boolean isIncludeZeroImpressions) {
      this.isIncludeZeroImpressions = isIncludeZeroImpressions;
      return this;
    }
    
    /**
     * Returns a new instance of {@link ReportingConfiguration} based on the attributes
     * of this builder.
     */
    public ReportingConfiguration build() {
      return new ReportingConfiguration(
          isSkipReportHeader, isSkipColumnHeader, isSkipReportSummary, isIncludeZeroImpressions);
    }
  }
}
