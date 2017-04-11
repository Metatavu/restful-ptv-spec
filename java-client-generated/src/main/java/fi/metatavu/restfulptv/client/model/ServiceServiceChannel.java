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


package fi.metatavu.restfulptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.metatavu.restfulptv.client.model.FintoItem;
import fi.metatavu.restfulptv.client.model.LocalizedListItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Service service channel
 */
@ApiModel(description = "Service service channel")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T07:17:18.637+03:00")
public class ServiceServiceChannel   {
  @JsonProperty("serviceChannelId")
  private String serviceChannelId = null;

  @JsonProperty("description")
  private List<LocalizedListItem> description = new ArrayList<LocalizedListItem>();

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("digitalAuthorizations")
  private List<FintoItem> digitalAuthorizations = new ArrayList<FintoItem>();

  public ServiceServiceChannel serviceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
    return this;
  }

   /**
   * PTV service channel identifier.
   * @return serviceChannelId
  **/
  @ApiModelProperty(example = "null", value = "PTV service channel identifier.")
  public String getServiceChannelId() {
    return serviceChannelId;
  }

  public void setServiceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
  }

  public ServiceServiceChannel description(List<LocalizedListItem> description) {
    this.description = description;
    return this;
  }

  public ServiceServiceChannel addDescriptionItem(LocalizedListItem descriptionItem) {
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * List of localized service channel relationship descriptions.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "List of localized service channel relationship descriptions.")
  public List<LocalizedListItem> getDescription() {
    return description;
  }

  public void setDescription(List<LocalizedListItem> description) {
    this.description = description;
  }

  public ServiceServiceChannel serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Service charge type. Possible values are: Charged, Free or Other
   * @return serviceChargeType
  **/
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public ServiceServiceChannel digitalAuthorizations(List<FintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
    return this;
  }

  public ServiceServiceChannel addDigitalAuthorizationsItem(FintoItem digitalAuthorizationsItem) {
    this.digitalAuthorizations.add(digitalAuthorizationsItem);
    return this;
  }

   /**
   * List of digital authorizations related to the service.
   * @return digitalAuthorizations
  **/
  @ApiModelProperty(example = "null", value = "List of digital authorizations related to the service.")
  public List<FintoItem> getDigitalAuthorizations() {
    return digitalAuthorizations;
  }

  public void setDigitalAuthorizations(List<FintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceServiceChannel serviceServiceChannel = (ServiceServiceChannel) o;
    return Objects.equals(this.serviceChannelId, serviceServiceChannel.serviceChannelId) &&
        Objects.equals(this.description, serviceServiceChannel.description) &&
        Objects.equals(this.serviceChargeType, serviceServiceChannel.serviceChargeType) &&
        Objects.equals(this.digitalAuthorizations, serviceServiceChannel.digitalAuthorizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceChannelId, description, serviceChargeType, digitalAuthorizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceServiceChannel {\n");
    
    sb.append("    serviceChannelId: ").append(toIndentedString(serviceChannelId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    digitalAuthorizations: ").append(toIndentedString(digitalAuthorizations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

