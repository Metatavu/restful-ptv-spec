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
import fi.metatavu.restfulptv.client.model.NotFound;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T07:17:18.637+03:00")
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
  
}
