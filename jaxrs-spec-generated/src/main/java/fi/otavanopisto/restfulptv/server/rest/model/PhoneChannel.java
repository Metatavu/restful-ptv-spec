package fi.otavanopisto.restfulptv.server.rest.model;

import fi.otavanopisto.restfulptv.server.rest.model.LanguageItem;
import fi.otavanopisto.restfulptv.server.rest.model.LocalizedListItem;
import fi.otavanopisto.restfulptv.server.rest.model.ServiceHour;
import fi.otavanopisto.restfulptv.server.rest.model.Support;
import fi.otavanopisto.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class PhoneChannel   {
  
  private String id = null;
  private String serviceChannelType = null;
  private String organizationId = null;
  private List<LocalizedListItem> serviceChannelNames = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> serviceChannelDescriptions = new ArrayList<LocalizedListItem>();
  private String phoneType = null;
  private List<String> serviceChargeTypes = new ArrayList<String>();
  private List<Support> supportContacts = new ArrayList<Support>();
  private List<LanguageItem> phoneNumbers = new ArrayList<LanguageItem>();
  private List<String> languages = new ArrayList<String>();
  private List<LanguageItem> phoneChargeDescriptions = new ArrayList<LanguageItem>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public PhoneChannel id(String id) {
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
  public PhoneChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }
  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  /**
   **/
  public PhoneChannel organizationId(String organizationId) {
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
  public PhoneChannel serviceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }
  public void setServiceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  /**
   **/
  public PhoneChannel serviceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }
  public void setServiceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  /**
   **/
  public PhoneChannel phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneType() {
    return phoneType;
  }
  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  /**
   **/
  public PhoneChannel serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChargeTypes() {
    return serviceChargeTypes;
  }
  public void setServiceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
  }

  /**
   **/
  public PhoneChannel supportContacts(List<Support> supportContacts) {
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
  public PhoneChannel phoneNumbers(List<LanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<LanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   **/
  public PhoneChannel languages(List<String> languages) {
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
  public PhoneChannel phoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }
  public void setPhoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  /**
   **/
  public PhoneChannel webPages(List<WebPage> webPages) {
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
  public PhoneChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public PhoneChannel publishingStatus(String publishingStatus) {
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
    PhoneChannel phoneChannel = (PhoneChannel) o;
    return Objects.equals(id, phoneChannel.id) &&
        Objects.equals(serviceChannelType, phoneChannel.serviceChannelType) &&
        Objects.equals(organizationId, phoneChannel.organizationId) &&
        Objects.equals(serviceChannelNames, phoneChannel.serviceChannelNames) &&
        Objects.equals(serviceChannelDescriptions, phoneChannel.serviceChannelDescriptions) &&
        Objects.equals(phoneType, phoneChannel.phoneType) &&
        Objects.equals(serviceChargeTypes, phoneChannel.serviceChargeTypes) &&
        Objects.equals(supportContacts, phoneChannel.supportContacts) &&
        Objects.equals(phoneNumbers, phoneChannel.phoneNumbers) &&
        Objects.equals(languages, phoneChannel.languages) &&
        Objects.equals(phoneChargeDescriptions, phoneChannel.phoneChargeDescriptions) &&
        Objects.equals(webPages, phoneChannel.webPages) &&
        Objects.equals(serviceHours, phoneChannel.serviceHours) &&
        Objects.equals(publishingStatus, phoneChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, phoneType, serviceChargeTypes, supportContacts, phoneNumbers, languages, phoneChargeDescriptions, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
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
