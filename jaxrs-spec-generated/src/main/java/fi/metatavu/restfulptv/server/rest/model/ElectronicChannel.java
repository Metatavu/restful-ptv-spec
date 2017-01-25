package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.Attachment;
import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import fi.metatavu.restfulptv.server.rest.model.ServiceHour;
import fi.metatavu.restfulptv.server.rest.model.Support;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ElectronicChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private Integer signatureQuantity = null;
  private Boolean requiresSignature = null;
  private List<Support> supportContacts = new ArrayList<Support>();
  private Boolean requiresAuthentication = null;
  private List<LanguageItem> urls = new ArrayList<LanguageItem>();
  private List<String> languages = new ArrayList<String>();
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public ElectronicChannel id(String id) {
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
  public ElectronicChannel type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public ElectronicChannel organizationId(String organizationId) {
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
  public ElectronicChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getNames() {
    return names;
  }
  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  /**
   **/
  public ElectronicChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   **/
  public ElectronicChannel signatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Integer getSignatureQuantity() {
    return signatureQuantity;
  }
  public void setSignatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  /**
   **/
  public ElectronicChannel requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }
  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  /**
   **/
  public ElectronicChannel supportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Support> getSupportContacts() {
    return supportContacts;
  }
  public void setSupportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
  }

  /**
   **/
  public ElectronicChannel requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }
  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  /**
   **/
  public ElectronicChannel urls(List<LanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getUrls() {
    return urls;
  }
  public void setUrls(List<LanguageItem> urls) {
    this.urls = urls;
  }

  /**
   **/
  public ElectronicChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   **/
  public ElectronicChannel attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   **/
  public ElectronicChannel webPages(List<WebPage> webPages) {
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

  /**
   **/
  public ElectronicChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }
  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  /**
   **/
  public ElectronicChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectronicChannel electronicChannel = (ElectronicChannel) o;
    return Objects.equals(id, electronicChannel.id) &&
        Objects.equals(type, electronicChannel.type) &&
        Objects.equals(organizationId, electronicChannel.organizationId) &&
        Objects.equals(names, electronicChannel.names) &&
        Objects.equals(descriptions, electronicChannel.descriptions) &&
        Objects.equals(signatureQuantity, electronicChannel.signatureQuantity) &&
        Objects.equals(requiresSignature, electronicChannel.requiresSignature) &&
        Objects.equals(supportContacts, electronicChannel.supportContacts) &&
        Objects.equals(requiresAuthentication, electronicChannel.requiresAuthentication) &&
        Objects.equals(urls, electronicChannel.urls) &&
        Objects.equals(languages, electronicChannel.languages) &&
        Objects.equals(attachments, electronicChannel.attachments) &&
        Objects.equals(webPages, electronicChannel.webPages) &&
        Objects.equals(serviceHours, electronicChannel.serviceHours) &&
        Objects.equals(publishingStatus, electronicChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, signatureQuantity, requiresSignature, supportContacts, requiresAuthentication, urls, languages, attachments, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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
