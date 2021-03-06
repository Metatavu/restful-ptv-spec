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
import fi.metatavu.restfulptv.client.model.PhoneServiceChannel;
import fi.metatavu.restfulptv.client.model.PrintableFormServiceChannel;
import fi.metatavu.restfulptv.client.model.ServiceLocationServiceChannel;
import fi.metatavu.restfulptv.client.model.WebPageServiceChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T07:23:02.844+03:00")
public class ServiceChannelsApi {

  private ApiClient client;
  private String baseUrl;

  public ServiceChannelsApi(String baseUrl, ApiClient client) {
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
   * finds a phone service channel by id
   * finds a phone service channel by id
   * @param phoneServiceChannelId phone service channel id (required)
   */
  public ApiResponse<PhoneServiceChannel> findPhoneServiceChannel(String phoneServiceChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/phoneServiceChannels/{phoneServiceChannelId}"
      .replaceAll("\\{" + "phoneServiceChannelId" + "\\}", String.valueOf(phoneServiceChannelId)), baseUrl);
      
    ResultType<PhoneServiceChannel> resultType = new ResultType<PhoneServiceChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds a printable for service channel by id
   * finds a printable for service channel by id
   * @param printableFormServiceChannelId Printable form service channel id (required)
   */
  public ApiResponse<PrintableFormServiceChannel> findPrintableFormServiceChannel(String printableFormServiceChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/printableFormServiceChannels/{printableFormServiceChannelId}"
      .replaceAll("\\{" + "printableFormServiceChannelId" + "\\}", String.valueOf(printableFormServiceChannelId)), baseUrl);
      
    ResultType<PrintableFormServiceChannel> resultType = new ResultType<PrintableFormServiceChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Finds a service location service channel by id
   * Finds a service location service channel by id
   * @param serviceLocationServiceChannelId service location service channel id (required)
   */
  public ApiResponse<ServiceLocationServiceChannel> findServiceLocationServiceChannel(String serviceLocationServiceChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/serviceLocationServiceChannels/{serviceLocationServiceChannelId}"
      .replaceAll("\\{" + "serviceLocationServiceChannelId" + "\\}", String.valueOf(serviceLocationServiceChannelId)), baseUrl);
      
    ResultType<ServiceLocationServiceChannel> resultType = new ResultType<ServiceLocationServiceChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
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
  /**
   * Lists phone service channels
   * Lists phone service channels
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PhoneServiceChannel>> listPhoneServiceChannels(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/phoneServiceChannels", baseUrl);
      
    ResultType<List<PhoneServiceChannel>> resultType = new ResultType<List<PhoneServiceChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists printable form service channels
   * Lists printable form service channels
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PrintableFormServiceChannel>> listPrintableFormServiceChannels(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/printableFormServiceChannels", baseUrl);
      
    ResultType<List<PrintableFormServiceChannel>> resultType = new ResultType<List<PrintableFormServiceChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists service location service channels
   * Lists service location service channels
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<ServiceLocationServiceChannel>> listServiceLocationServiceChannels(Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/serviceLocationServiceChannels", baseUrl);
      
    ResultType<List<ServiceLocationServiceChannel>> resultType = new ResultType<List<ServiceLocationServiceChannel>>() {};
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
