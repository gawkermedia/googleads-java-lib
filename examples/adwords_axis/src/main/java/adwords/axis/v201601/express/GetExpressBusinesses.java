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

package adwords.axis.v201601.express;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.utils.v201601.SelectorBuilder;
import com.google.api.ads.adwords.axis.v201601.cm.Selector;
import com.google.api.ads.adwords.axis.v201601.express.ExpressBusiness;
import com.google.api.ads.adwords.axis.v201601.express.ExpressBusinessPage;
import com.google.api.ads.adwords.axis.v201601.express.ExpressBusinessServiceInterface;
import com.google.api.ads.adwords.axis.v201601.express.ExpressBusinessStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.selectorfields.v201601.cm.ExpressBusinessField;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * This example gets all express businesses. To add an express business, run
 * AddExpressBusinesses.java.
 *
 * <p>Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class GetExpressBusinesses {
  private static final int PAGE_SIZE = 100;

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session);
  }

  public static List<ExpressBusiness> runExample(AdWordsServices adWordsServices,
      AdWordsSession session) throws Exception {
    // Get the ExpressBusinessService.
    ExpressBusinessServiceInterface businessService =
        adWordsServices.get(session, ExpressBusinessServiceInterface.class);

    int offset = 0;

    // To get all express businesses owned by the current customer,
    // simply skip the call to SelectorBuilder.equals below
    Selector selector = new SelectorBuilder()
        .fields(
            ExpressBusinessField.Id,
            ExpressBusinessField.Name,
            ExpressBusinessField.Website,
            ExpressBusinessField.Status)
        .equals(ExpressBusinessField.Status, ExpressBusinessStatus.ENABLED.getValue())
        .offset(offset)
        .limit(PAGE_SIZE)
        .build();

    List<ExpressBusiness> businesses = Lists.newArrayList();
    ExpressBusinessPage page;
    do {
      // Get all businesses.
      page = businessService.get(selector);

      // Display businesses.
      if (page.getTotalNumEntries() > 0) {
        for (ExpressBusiness business : page.getEntries()) {
          System.out.printf("Express business found with name '%s' id %d website: %s.%n",
              business.getName(),
              business.getId(),
              business.getWebsite(),
              business.getStatus().getValue());
          businesses.add(business);
        }
      } else {
        System.out.println("No express businesses were found.");
      }

      offset += PAGE_SIZE;
      selector.getPaging().setStartIndex(offset);
    } while (offset < page.getTotalNumEntries());

    System.out.printf("Found %d express businesses in total%n", businesses.size());

    return businesses;
  }
}
