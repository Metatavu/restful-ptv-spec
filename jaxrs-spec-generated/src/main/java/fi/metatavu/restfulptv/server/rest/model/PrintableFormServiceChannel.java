package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.Address;
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


public class PrintableFormServiceChannel   {
  
  private String id = null;
  private String type = null;
  private String organizationId = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private List<LanguageItem> formIdentifier = new ArrayList<LanguageItem>();
  private List<LanguageItem> formReceiver = new ArrayList<LanguageItem>();
  private Address deliveryAddress = null;
  private List<LocalizedListItem> channelUrls = new ArrayList<LocalizedListItem>();
  private List<Attachment> attachments = new ArrayList<Attachment>();
  private List<Phone> supportPhones = new ArrayList<Phone>();
  private List<Email> supportEmails = new ArrayList<Email>();
  private List<String> languages = new ArrayList<String>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   * PTV identifier for the service channel.
   **/
  public PrintableFormServiceChannel id(String id) {
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
  public PrintableFormServiceChannel type(String type) {
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
  public PrintableFormServiceChannel organizationId(String organizationId) {
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
  public PrintableFormServiceChannel names(List<LocalizedListItem> names) {
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
  public PrintableFormServiceChannel descriptions(List<LocalizedListItem> descriptions) {
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
   * List of localized form identifier. One per language.
   **/
  public PrintableFormServiceChannel formIdentifier(List<LanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized form identifier. One per language.")
  public List<LanguageItem> getFormIdentifier() {
    return formIdentifier;
  }
  public void setFormIdentifier(List<LanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  /**
   * List of localized form receiver. One per language.
   **/
  public PrintableFormServiceChannel formReceiver(List<LanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized form receiver. One per language.")
  public List<LanguageItem> getFormReceiver() {
    return formReceiver;
  }
  public void setFormReceiver(List<LanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
  }

  /**
   * Form delivery address.
   **/
  public PrintableFormServiceChannel deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Form delivery address.")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  /**
   * List of localized channel urls.
   **/
  public PrintableFormServiceChannel channelUrls(List<LocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized channel urls.")
  public List<LocalizedListItem> getChannelUrls() {
    return channelUrls;
  }
  public void setChannelUrls(List<LocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
  }

  /**
   * List of attachments.
   **/
  public PrintableFormServiceChannel attachments(List<Attachment> attachments) {
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
   * List of support phone numbers for the service channel.
   **/
  public PrintableFormServiceChannel supportPhones(List<Phone> supportPhones) {
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
  public PrintableFormServiceChannel supportEmails(List<Email> supportEmails) {
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
   * List of languages the service channel is available in (two letter language code).
   **/
  public PrintableFormServiceChannel languages(List<String> languages) {
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
   * List of service channel web pages.
   **/
  public PrintableFormServiceChannel webPages(List<WebPage> webPages) {
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
  public PrintableFormServiceChannel serviceHours(List<ServiceHour> serviceHours) {
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
  public PrintableFormServiceChannel publishingStatus(String publishingStatus) {
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
    PrintableFormServiceChannel printableFormServiceChannel = (PrintableFormServiceChannel) o;
    return Objects.equals(id, printableFormServiceChannel.id) &&
        Objects.equals(type, printableFormServiceChannel.type) &&
        Objects.equals(organizationId, printableFormServiceChannel.organizationId) &&
        Objects.equals(names, printableFormServiceChannel.names) &&
        Objects.equals(descriptions, printableFormServiceChannel.descriptions) &&
        Objects.equals(formIdentifier, printableFormServiceChannel.formIdentifier) &&
        Objects.equals(formReceiver, printableFormServiceChannel.formReceiver) &&
        Objects.equals(deliveryAddress, printableFormServiceChannel.deliveryAddress) &&
        Objects.equals(channelUrls, printableFormServiceChannel.channelUrls) &&
        Objects.equals(attachments, printableFormServiceChannel.attachments) &&
        Objects.equals(supportPhones, printableFormServiceChannel.supportPhones) &&
        Objects.equals(supportEmails, printableFormServiceChannel.supportEmails) &&
        Objects.equals(languages, printableFormServiceChannel.languages) &&
        Objects.equals(webPages, printableFormServiceChannel.webPages) &&
        Objects.equals(serviceHours, printableFormServiceChannel.serviceHours) &&
        Objects.equals(publishingStatus, printableFormServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, formIdentifier, formReceiver, deliveryAddress, channelUrls, attachments, supportPhones, supportEmails, languages, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrintableFormServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    formIdentifier: ").append(toIndentedString(formIdentifier)).append("\n");
    sb.append("    formReceiver: ").append(toIndentedString(formReceiver)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("    channelUrls: ").append(toIndentedString(channelUrls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    supportPhones: ").append(toIndentedString(supportPhones)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
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
