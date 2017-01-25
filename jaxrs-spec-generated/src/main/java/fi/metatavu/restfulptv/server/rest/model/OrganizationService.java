package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class OrganizationService   {
  
  private String id = null;
  private String serviceId = null;
  private String organizationId = null;
  private String roleType = null;
  private String provisionType = null;
  private List<LanguageItem> additionalInformation = new ArrayList<LanguageItem>();
  private List<WebPage> webPages = new ArrayList<WebPage>();

  /**
   **/
  public OrganizationService id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public OrganizationService serviceId(String serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceId() {
    return serviceId;
  }
  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  /**
   **/
  public OrganizationService organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public OrganizationService roleType(String roleType) {
    this.roleType = roleType;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRoleType() {
    return roleType;
  }
  public void setRoleType(String roleType) {
    this.roleType = roleType;
  }

  /**
   **/
  public OrganizationService provisionType(String provisionType) {
    this.provisionType = provisionType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getProvisionType() {
    return provisionType;
  }
  public void setProvisionType(String provisionType) {
    this.provisionType = provisionType;
  }

  /**
   **/
  public OrganizationService additionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  /**
   **/
  public OrganizationService webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationService organizationService = (OrganizationService) o;
    return Objects.equals(id, organizationService.id) &&
        Objects.equals(serviceId, organizationService.serviceId) &&
        Objects.equals(organizationId, organizationService.organizationId) &&
        Objects.equals(roleType, organizationService.roleType) &&
        Objects.equals(provisionType, organizationService.provisionType) &&
        Objects.equals(additionalInformation, organizationService.additionalInformation) &&
        Objects.equals(webPages, organizationService.webPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceId, organizationId, roleType, provisionType, additionalInformation, webPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationService {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    provisionType: ").append(toIndentedString(provisionType)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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
