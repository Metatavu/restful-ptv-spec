package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.Attachment;
import fi.metatavu.restfulptv.server.rest.model.Email;
import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import fi.metatavu.restfulptv.server.rest.model.Phone;
import fi.metatavu.restfulptv.server.rest.model.ServiceHour;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ElectronicServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private Integer signatureQuantity = null;
  private Boolean requiresSignature = null;
  private List<Phone> supportPhones = new ArrayList<Phone>();
  private List<Email> supportEmails = new ArrayList<Email>();
  private Boolean requiresAuthentication = null;
  private List<LanguageItem> urls = new ArrayList<LanguageItem>();
  private List<String> languages = new ArrayList<String>();
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   * PTV identifier for the service channel.
   **/
  public ElectronicServiceChannel id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "PTV identifier for the service channel.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.
   **/
  public ElectronicServiceChannel type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * PTV organization identifier responsible for the channel.
   **/
  public ElectronicServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "PTV organization identifier responsible for the channel.")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   * Localized list of service channel names.
   **/
  public ElectronicServiceChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of service channel names.")
  public List<LocalizedListItem> getNames() {
    return names;
  }
  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  /**
   * List of localized service channel descriptions.
   **/
  public ElectronicServiceChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service channel descriptions.")
  public List<LocalizedListItem> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * How many signatures are required.
   **/
  public ElectronicServiceChannel signatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "How many signatures are required.")
  public Integer getSignatureQuantity() {
    return signatureQuantity;
  }
  public void setSignatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  /**
   * Is signature required.
   **/
  public ElectronicServiceChannel requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is signature required.")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }
  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  /**
   * List of support phone numbers for the service channel.
   **/
  public ElectronicServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of support phone numbers for the service channel.")
  public List<Phone> getSupportPhones() {
    return supportPhones;
  }
  public void setSupportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  /**
   * List of support email addresses for the service channel.
   **/
  public ElectronicServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of support email addresses for the service channel.")
  public List<Email> getSupportEmails() {
    return supportEmails;
  }
  public void setSupportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
  }

  /**
   * Does the electronic channel require authentication.
   **/
  public ElectronicServiceChannel requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Does the electronic channel require authentication.")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }
  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  /**
   * Localized list of channel urls.
   **/
  public ElectronicServiceChannel urls(List<LanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of channel urls.")
  public List<LanguageItem> getUrls() {
    return urls;
  }
  public void setUrls(List<LanguageItem> urls) {
    this.urls = urls;
  }

  /**
   * List of languages the service channel is available in (two letter language code).
   **/
  public ElectronicServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   * List of attachments.
   **/
  public ElectronicServiceChannel attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of attachments.")
  public List<Attachment> getAttachments() {
    return attachments;
  }
  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  /**
   * List of service channel web pages.
   **/
  public ElectronicServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service channel web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  /**
   * List of service channel service hours.
   **/
  public ElectronicServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service channel service hours.")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }
  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   **/
  public ElectronicServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
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
    ElectronicServiceChannel electronicServiceChannel = (ElectronicServiceChannel) o;
    return Objects.equals(id, electronicServiceChannel.id) &&
        Objects.equals(type, electronicServiceChannel.type) &&
        Objects.equals(organizationId, electronicServiceChannel.organizationId) &&
        Objects.equals(names, electronicServiceChannel.names) &&
        Objects.equals(descriptions, electronicServiceChannel.descriptions) &&
        Objects.equals(signatureQuantity, electronicServiceChannel.signatureQuantity) &&
        Objects.equals(requiresSignature, electronicServiceChannel.requiresSignature) &&
        Objects.equals(supportPhones, electronicServiceChannel.supportPhones) &&
        Objects.equals(supportEmails, electronicServiceChannel.supportEmails) &&
        Objects.equals(requiresAuthentication, electronicServiceChannel.requiresAuthentication) &&
        Objects.equals(urls, electronicServiceChannel.urls) &&
        Objects.equals(languages, electronicServiceChannel.languages) &&
        Objects.equals(attachments, electronicServiceChannel.attachments) &&
        Objects.equals(webPages, electronicServiceChannel.webPages) &&
        Objects.equals(serviceHours, electronicServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, electronicServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, signatureQuantity, requiresSignature, supportPhones, supportEmails, requiresAuthentication, urls, languages, attachments, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
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
