/**
 * RESTful PTV
 * Restful way to use Palvelutietovaranto.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fi.otavanopisto.restfulptv.client;

import fi.otavanopisto.restfulptv.client.model.*;

import fi.otavanopisto.restfulptv.client.model.BadRequest;
import fi.otavanopisto.restfulptv.client.model.StatutoryDescription;
import fi.otavanopisto.restfulptv.client.model.Forbidden;
import fi.otavanopisto.restfulptv.client.model.InternalServerError;
import fi.otavanopisto.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-03T15:31:17.318+03:00")
public class StatutoryDescriptionsApi {

  private ApiClient client;
  private String baseUrl;

  public StatutoryDescriptionsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds a statutory description
   * Finds a statutory description by id
   * @param statutoryDescriptionId Statutory description id (required)
   */
  public ApiResponse<StatutoryDescription> findStatutoryDescription(String statutoryDescriptionId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/statutoryDescriptions/{statutoryDescriptionId}"
      .replaceAll("\\{" + "statutoryDescriptionId" + "\\}", String.valueOf(statutoryDescriptionId)), baseUrl);
      
    ResultType<StatutoryDescription> resultType = new ResultType<StatutoryDescription>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * List statutory descriptions
   * List statutory descriptions
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<StatutoryDescription>> listStatutoryDescriptions(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/statutoryDescriptions", baseUrl);
      
    ResultType<List<StatutoryDescription>> resultType = new ResultType<List<StatutoryDescription>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  
}
