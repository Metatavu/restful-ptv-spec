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

package fi.metatavu.restfulptv.client;

import fi.metatavu.restfulptv.client.model.*;

import fi.metatavu.restfulptv.client.model.BadRequest;
import fi.metatavu.restfulptv.client.model.Forbidden;
import fi.metatavu.restfulptv.client.model.ElectronicServiceChannel;
import fi.metatavu.restfulptv.client.model.InternalServerError;
import fi.metatavu.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T18:16:31.735+03:00")
public class ElectronicServiceChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public ElectronicServiceChannelsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * finds an electronic service channel by id
   * finds an electronic service channel by id
   * @param electronicServiceChannelId electronic service channel id (required)
   */
  public ApiResponse<ElectronicServiceChannel> findElectronicServiceChannel(String electronicServiceChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/electronicServiceChannels/{electronicServiceChannelId}"
      .replaceAll("\\{" + "electronicServiceChannelId" + "\\}", String.valueOf(electronicServiceChannelId)), baseUrl);
      
    ResultType<ElectronicServiceChannel> resultType = new ResultType<ElectronicServiceChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists electronic service channels
   * Lists electronic service channels
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<ElectronicServiceChannel>> listElectronicServiceChannels(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/electronicServiceChannels", baseUrl);
      
    ResultType<List<ElectronicServiceChannel>> resultType = new ResultType<List<ElectronicServiceChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  
}
