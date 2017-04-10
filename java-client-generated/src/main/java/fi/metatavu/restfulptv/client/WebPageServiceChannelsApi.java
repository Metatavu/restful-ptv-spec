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
import fi.metatavu.restfulptv.client.model.WebPageServiceChannel;
import fi.metatavu.restfulptv.client.model.Forbidden;
import fi.metatavu.restfulptv.client.model.InternalServerError;
import fi.metatavu.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T20:09:19.647+03:00")
public class WebPageServiceChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public WebPageServiceChannelsApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Finds a web page service channel by id
   * Finds a web page service channel by id
   * @param webPageServiceChannelId web page service channel id (required)
   */
  public ApiResponse<WebPageServiceChannel> findWebPageServiceChannel(String webPageServiceChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/webPageServiceChannels/{webPageServiceChannelId}"
      .replaceAll("\\{" + "webPageServiceChannelId" + "\\}", String.valueOf(webPageServiceChannelId)), baseUrl);
      
    ResultType<WebPageServiceChannel> resultType = new ResultType<WebPageServiceChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists web page service channels
   * Lists web page service channels
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<WebPageServiceChannel>> listWebPageServiceChannels(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/webPageServiceChannels", baseUrl);
      
    ResultType<List<WebPageServiceChannel>> resultType = new ResultType<List<WebPageServiceChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  
}
