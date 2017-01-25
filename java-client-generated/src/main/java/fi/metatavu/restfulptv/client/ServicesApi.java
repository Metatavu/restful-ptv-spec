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
import fi.metatavu.restfulptv.client.model.Service;
import fi.metatavu.restfulptv.client.model.Forbidden;
import fi.metatavu.restfulptv.client.model.InternalServerError;
import fi.metatavu.restfulptv.client.model.ElectronicChannel;
import fi.metatavu.restfulptv.client.model.NotFound;
import fi.metatavu.restfulptv.client.model.PhoneChannel;
import fi.metatavu.restfulptv.client.model.PrintableFormChannel;
import fi.metatavu.restfulptv.client.model.ServiceLocationChannel;
import fi.metatavu.restfulptv.client.model.WebPageChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-25T15:32:20.254+02:00")
public class ServicesApi {

  private ApiClient client;
  private String baseUrl;

  public ServicesApi(String baseUrl, ApiClient client) {
    this.client = client;
    this.baseUrl = baseUrl;
  }
  
  /**
   * Create service
   * Creates new service
   * @param body Payload (required)
   */
  public ApiResponse<Service> createService(Service body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services", baseUrl);
      
    ResultType<Service> resultType = new ResultType<Service>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * creates ElectronicChannel
   * creates ElectronicChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ElectronicChannel> createServiceElectronicChannel(String serviceId, ElectronicChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/electronicChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<ElectronicChannel> resultType = new ResultType<ElectronicChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * creates PhoneChannel
   * creates PhoneChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PhoneChannel> createServicePhoneChannel(String serviceId, PhoneChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * creates PrintableFormChannel
   * creates PrintableFormChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PrintableFormChannel> createServicePrintableFormChannel(String serviceId, PrintableFormChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * creates ServiceLocationChannel
   * creates ServiceLocationChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ServiceLocationChannel> createServiceServiceLocationChannel(String serviceId, ServiceLocationChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * creates WebPageChannel
   * creates WebPageChannel
   * @param serviceId service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<WebPageChannel> createServiceWebPageChannel(String serviceId, WebPageChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/webPageChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<WebPageChannel> resultType = new ResultType<WebPageChannel>() {};
    return client.doPOSTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Finds a service by id
   * Finds service
   * @param serviceId Service id (required)
   */
  public ApiResponse<Service> findService(String serviceId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<Service> resultType = new ResultType<Service>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds ElectronicChannel by electronicChannelId
   * finds ElectronicChannels by electronicChannelId
   * @param serviceId Service id (required)
   * @param electronicChannelId electronicChannel id (required)
   */
  public ApiResponse<ElectronicChannel> findServiceElectronicChannel(String serviceId, String electronicChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/electronicChannels/{electronicChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "electronicChannelId" + "\\}", String.valueOf(electronicChannelId)), baseUrl);
      
    ResultType<ElectronicChannel> resultType = new ResultType<ElectronicChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds PhoneChannel by phoneChannelId
   * finds PhoneChannels by phoneChannelId
   * @param serviceId Service id (required)
   * @param phoneChannelId phoneChannel id (required)
   */
  public ApiResponse<PhoneChannel> findServicePhoneChannel(String serviceId, String phoneChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels/{phoneChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "phoneChannelId" + "\\}", String.valueOf(phoneChannelId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds PrintableFormChannel by printableFormChannelId
   * finds PrintableFormChannels by printableFormChannelId
   * @param serviceId Service id (required)
   * @param printableFormChannelId printableFormChannel id (required)
   */
  public ApiResponse<PrintableFormChannel> findServicePrintableFormChannel(String serviceId, String printableFormChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels/{printableFormChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "printableFormChannelId" + "\\}", String.valueOf(printableFormChannelId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds ServiceLocationChannel by serviceLocationChannelId
   * finds ServiceLocationChannels by serviceLocationChannelId
   * @param serviceId Service id (required)
   * @param serviceLocationChannelId serviceLocationChannel id (required)
   */
  public ApiResponse<ServiceLocationChannel> findServiceServiceLocationChannel(String serviceId, String serviceLocationChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "serviceLocationChannelId" + "\\}", String.valueOf(serviceLocationChannelId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * finds WebPageChannel by webPageChannelId
   * finds WebPageChannels by webPageChannelId
   * @param serviceId Service id (required)
   * @param webPageChannelId webPageChannel id (required)
   */
  public ApiResponse<WebPageChannel> findServiceWebPageChannel(String serviceId, String webPageChannelId) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/webPageChannels/{webPageChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "webPageChannelId" + "\\}", String.valueOf(webPageChannelId)), baseUrl);
      
    ResultType<WebPageChannel> resultType = new ResultType<WebPageChannel>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists ElectronicChannels by serviceId
   * Lists ElectronicChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<ElectronicChannel>> listServiceElectronicChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/electronicChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<ElectronicChannel>> resultType = new ResultType<List<ElectronicChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists PhoneChannels by serviceId
   * Lists PhoneChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PhoneChannel>> listServicePhoneChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/phoneChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<PhoneChannel>> resultType = new ResultType<List<PhoneChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists PrintableFormChannels by serviceId
   * Lists PrintableFormChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<PrintableFormChannel>> listServicePrintableFormChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<PrintableFormChannel>> resultType = new ResultType<List<PrintableFormChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists ServiceLocationChannels by serviceId
   * Lists ServiceLocationChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<ServiceLocationChannel>> listServiceServiceLocationChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<ServiceLocationChannel>> resultType = new ResultType<List<ServiceLocationChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Lists WebPageChannels by serviceId
   * Lists WebPageChannels by serviceId
   * @param serviceId Service id (required)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<WebPageChannel>> listServiceWebPageChannels(String serviceId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services/{serviceId}/webPageChannels"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<List<WebPageChannel>> resultType = new ResultType<List<WebPageChannel>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Service list
   * Lists services
   * @param organizationId Filter results by organizationId (optional)
   * @param firstResult First result (optional)
   * @param maxResults Max results (optional)
   */
  public ApiResponse<List<Service>> listServices(String organizationId, Long firstResult, Long maxResults) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
    if (organizationId != null)
    queryParams.put("organizationId", organizationId);
if (firstResult != null)
    queryParams.put("firstResult", firstResult);
if (maxResults != null)
    queryParams.put("maxResults", maxResults);
    
        
    String path = String.format("%s/services", baseUrl);
      
    ResultType<List<Service>> resultType = new ResultType<List<Service>>() {};
    return client.doGETRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates PhoneChannel
   * Updates PhoneChannel
   * @param serviceId service id (required)
   * @param phoneChannelId phoneChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PhoneChannel> updatePhoneChannel(String serviceId, String phoneChannelId, PhoneChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/phoneChannels/{phoneChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "phoneChannelId" + "\\}", String.valueOf(phoneChannelId)), baseUrl);
      
    ResultType<PhoneChannel> resultType = new ResultType<PhoneChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates PrintableFormChannel
   * Updates PrintableFormChannel
   * @param serviceId service id (required)
   * @param printableFormChannelId printableFormChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<PrintableFormChannel> updatePrintableFormChannel(String serviceId, String printableFormChannelId, PrintableFormChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/printableFormChannels/{printableFormChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "printableFormChannelId" + "\\}", String.valueOf(printableFormChannelId)), baseUrl);
      
    ResultType<PrintableFormChannel> resultType = new ResultType<PrintableFormChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates service
   * Updates service
   * @param serviceId Organization service id (required)
   * @param body Payload (required)
   */
  public ApiResponse<Service> updateService(String serviceId, Service body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId)), baseUrl);
      
    ResultType<Service> resultType = new ResultType<Service>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates ElectronicChannel
   * Updates ElectronicChannel
   * @param serviceId service id (required)
   * @param electronicChannelId electronicChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ElectronicChannel> updateServiceElectronicChannel(String serviceId, String electronicChannelId, ElectronicChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/electronicChannels/{electronicChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "electronicChannelId" + "\\}", String.valueOf(electronicChannelId)), baseUrl);
      
    ResultType<ElectronicChannel> resultType = new ResultType<ElectronicChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates ServiceLocationChannel
   * Updates ServiceLocationChannel
   * @param serviceId service id (required)
   * @param serviceLocationChannelId serviceLocationChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<ServiceLocationChannel> updateServiceLocationChannel(String serviceId, String serviceLocationChannelId, ServiceLocationChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/serviceLocationChannels/{serviceLocationChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "serviceLocationChannelId" + "\\}", String.valueOf(serviceLocationChannelId)), baseUrl);
      
    ResultType<ServiceLocationChannel> resultType = new ResultType<ServiceLocationChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  /**
   * Updates WebPageChannel
   * Updates WebPageChannel
   * @param serviceId service id (required)
   * @param webPageChannelId webPageChannel id (required)
   * @param body Payload (required)
   */
  public ApiResponse<WebPageChannel> updateWebPageChannel(String serviceId, String webPageChannelId, WebPageChannel body) {
    Map<String, Object> queryParams = new HashMap<>();
    Map<String, Object> formParams = new HashMap<>();
        
        
    String path = String.format("%s/services/{serviceId}/webPageChannels/{webPageChannelId}"
      .replaceAll("\\{" + "serviceId" + "\\}", String.valueOf(serviceId))
      .replaceAll("\\{" + "webPageChannelId" + "\\}", String.valueOf(webPageChannelId)), baseUrl);
      
    ResultType<WebPageChannel> resultType = new ResultType<WebPageChannel>() {};
    return client.doPUTRequest(path, resultType, queryParams, formParams);
  }
  
}
