package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.FintoItem;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * Service service channel
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Service service channel")

public class ServiceServiceChannel   {
  
  private String serviceChannelId = null;
  private List<LocalizedListItem> description = new ArrayList<LocalizedListItem>();
  private String serviceChargeType = null;
  private List<FintoItem> digitalAuthorizations = new ArrayList<FintoItem>();

  /**
   * PTV service channel identifier.
   **/
  public ServiceServiceChannel serviceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "PTV service channel identifier.")
  public String getServiceChannelId() {
    return serviceChannelId;
  }
  public void setServiceChannelId(String serviceChannelId) {
    this.serviceChannelId = serviceChannelId;
  }

  /**
   * List of localized service channel relationship descriptions.
   **/
  public ServiceServiceChannel description(List<LocalizedListItem> description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service channel relationship descriptions.")
  public List<LocalizedListItem> getDescription() {
    return description;
  }
  public void setDescription(List<LocalizedListItem> description) {
    this.description = description;
  }

  /**
   * Service charge type. Possible values are: Charged, Free or Other
   **/
  public ServiceServiceChannel serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }
  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  /**
   * List of digital authorizations related to the service.
   **/
  public ServiceServiceChannel digitalAuthorizations(List<FintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of digital authorizations related to the service.")
  public List<FintoItem> getDigitalAuthorizations() {
    return digitalAuthorizations;
  }
  public void setDigitalAuthorizations(List<FintoItem> digitalAuthorizations) {
    this.digitalAuthorizations = digitalAuthorizations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceServiceChannel serviceServiceChannel = (ServiceServiceChannel) o;
    return Objects.equals(serviceChannelId, serviceServiceChannel.serviceChannelId) &&
        Objects.equals(description, serviceServiceChannel.description) &&
        Objects.equals(serviceChargeType, serviceServiceChannel.serviceChargeType) &&
        Objects.equals(digitalAuthorizations, serviceServiceChannel.digitalAuthorizations);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
