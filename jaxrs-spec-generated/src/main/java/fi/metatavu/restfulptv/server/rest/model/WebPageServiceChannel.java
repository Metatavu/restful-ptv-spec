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


public class WebPageServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private List<LanguageItem> urls = new ArrayList<LanguageItem>();
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<Support> supportContacts = new ArrayList<Support>();
  private List<String> languages = new ArrayList<String>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public WebPageServiceChannel id(String id) {
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
  public WebPageServiceChannel type(String type) {
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
  public WebPageServiceChannel organizationId(String organizationId) {
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
  public WebPageServiceChannel names(List<LocalizedListItem> names) {
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
  public WebPageServiceChannel descriptions(List<LocalizedListItem> descriptions) {
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
  public WebPageServiceChannel urls(List<LanguageItem> urls) {
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
  public WebPageServiceChannel attachments(List<Attachment> attachments) {
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
  public WebPageServiceChannel supportContacts(List<Support> supportContacts) {
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
  public WebPageServiceChannel languages(List<String> languages) {
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
  public WebPageServiceChannel webPages(List<WebPage> webPages) {
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
  public WebPageServiceChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public WebPageServiceChannel publishingStatus(String publishingStatus) {
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
    WebPageServiceChannel webPageServiceChannel = (WebPageServiceChannel) o;
    return Objects.equals(id, webPageServiceChannel.id) &&
        Objects.equals(type, webPageServiceChannel.type) &&
        Objects.equals(organizationId, webPageServiceChannel.organizationId) &&
        Objects.equals(names, webPageServiceChannel.names) &&
        Objects.equals(descriptions, webPageServiceChannel.descriptions) &&
        Objects.equals(urls, webPageServiceChannel.urls) &&
        Objects.equals(attachments, webPageServiceChannel.attachments) &&
        Objects.equals(supportContacts, webPageServiceChannel.supportContacts) &&
        Objects.equals(languages, webPageServiceChannel.languages) &&
        Objects.equals(webPages, webPageServiceChannel.webPages) &&
        Objects.equals(serviceHours, webPageServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, webPageServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, urls, attachments, supportContacts, languages, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPageServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
