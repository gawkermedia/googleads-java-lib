// Copyright 2016 Google Inc. All Rights Reserved.
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

package com.google.api.ads.adwords.jaxws.utils.v201601.batchjob;

import com.google.api.ads.adwords.jaxws.v201601.cm.ApiError;
import com.google.api.ads.adwords.jaxws.v201601.cm.BatchJob;
import com.google.api.ads.adwords.jaxws.v201601.cm.Operand;
import com.google.api.ads.adwords.jaxws.v201601.cm.Operation;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.utils.AdWordsInternals;
import com.google.api.ads.adwords.lib.utils.BatchJobException;
import com.google.api.ads.adwords.lib.utils.BatchJobHelperInterface;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadResponse;
import com.google.api.ads.adwords.lib.utils.BatchJobUploadStatus;
import com.google.api.ads.adwords.lib.utils.BatchJobUploader;
import com.google.api.ads.adwords.lib.utils.logging.BatchJobLogger;
import com.google.api.ads.common.lib.soap.jaxb.JaxBDeserializer;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

import javax.xml.transform.stream.StreamSource;

/**
 * Utility for uploading operations and downloading results for a {@link BatchJob}.
 */
public class BatchJobHelper implements BatchJobHelperInterface<Operation, Operand, ApiError,
    MutateResult, BatchJobMutateResponse> {
  private final BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse> uploader;
  private final BatchJobLogger batchJobLogger;

  public BatchJobHelper(AdWordsSession session) {
    uploader = new BatchJobUploader<Operand, ApiError, MutateResult, BatchJobMutateResponse>(
        session, true);
    batchJobLogger = AdWordsInternals.getInstance().getAdWordsServiceLoggers().getBatchJobLogger();
  }

  @Override
  public BatchJobUploadResponse uploadBatchJobOperations(
      Iterable<Operation> operations, String uploadUrl) throws BatchJobException {
    // Starting with v201601, all uploads must go through the incremental upload workflow.
    return uploadIncrementalBatchJobOperations(
        operations, true, new BatchJobUploadStatus(0, URI.create(uploadUrl)));
  }

  @Override
  public BatchJobMutateResponse downloadBatchJobMutateResponse(String downloadUrl)
      throws BatchJobException {
    JaxBDeserializer<BatchJobMutateResponse> deserializer =
        new JaxBDeserializer<BatchJobMutateResponse>(BatchJobMutateResponse.class);
    MutateResult[] mutateResults;
    try {
      mutateResults =
          deserializer.deserialize(new StreamSource(new URL(downloadUrl).openStream()))
              .getMutateResults();
    } catch (IOException e) {
      batchJobLogger.logDownload(downloadUrl, null, e);
      throw new BatchJobException(
          "Failed to download batch job mutate response from URL: " + downloadUrl, e);
    }

    BatchJobMutateResponse response = new BatchJobMutateResponse();
    response.setMutateResults(mutateResults);
    
    batchJobLogger.logDownload(downloadUrl, response, null);
    return response;
  }

  @Override
  public BatchJobUploadResponse uploadIncrementalBatchJobOperations(
      Iterable<? extends Operation> operations, boolean isLastRequest,
      BatchJobUploadStatus batchJobUploadStatus) throws BatchJobException {
    BatchJobMutateRequest request = new BatchJobMutateRequest();
    request.addOperations(operations);
    return uploader.uploadIncrementalBatchJobOperations(
        request, isLastRequest, batchJobUploadStatus);
  }
}
