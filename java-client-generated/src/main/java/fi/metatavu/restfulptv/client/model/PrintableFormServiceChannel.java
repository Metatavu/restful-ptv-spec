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
import fi.metatavu.restfulptv.client.model.Address;
import fi.metatavu.restfulptv.client.model.Attachment;
import fi.metatavu.restfulptv.client.model.Email;
import fi.metatavu.restfulptv.client.model.LanguageItem;
import fi.metatavu.restfulptv.client.model.LocalizedListItem;
import fi.metatavu.restfulptv.client.model.Phone;
import fi.metatavu.restfulptv.client.model.ServiceHour;
import fi.metatavu.restfulptv.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * PrintableFormServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T07:23:02.844+03:00")
public class PrintableFormServiceChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("names")
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();

  @JsonProperty("descriptions")
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();

  @JsonProperty("formIdentifier")
  private List<LanguageItem> formIdentifier = new ArrayList<LanguageItem>();

  @JsonProperty("formReceiver")
  private List<LanguageItem> formReceiver = new ArrayList<LanguageItem>();

  @JsonProperty("deliveryAddress")
  private Address deliveryAddress = null;

  @JsonProperty("channelUrls")
  private List<LocalizedListItem> channelUrls = new ArrayList<LocalizedListItem>();

  @JsonProperty("attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  @JsonProperty("supportPhones")
  private List<Phone> supportPhones = new ArrayList<Phone>();

  @JsonProperty("supportEmails")
  private List<Email> supportEmails = new ArrayList<Email>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @JsonProperty("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public PrintableFormServiceChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * PTV identifier for the service channel.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "PTV identifier for the service channel.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PrintableFormServiceChannel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of the service channel. Channel types: EChannel, WebPage, PrintableForm, Phone or ServiceLocation.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PrintableFormServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * PTV organization identifier responsible for the channel.
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "PTV organization identifier responsible for the channel.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public PrintableFormServiceChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public PrintableFormServiceChannel addNamesItem(LocalizedListItem namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Localized list of service channel names.
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "Localized list of service channel names.")
  public List<LocalizedListItem> getNames() {
    return names;
  }

  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  public PrintableFormServiceChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PrintableFormServiceChannel addDescriptionsItem(LocalizedListItem descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * List of localized service channel descriptions.
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "List of localized service channel descriptions.")
  public List<LocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  public PrintableFormServiceChannel formIdentifier(List<LanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
    return this;
  }

  public PrintableFormServiceChannel addFormIdentifierItem(LanguageItem formIdentifierItem) {
    this.formIdentifier.add(formIdentifierItem);
    return this;
  }

   /**
   * List of localized form identifier. One per language.
   * @return formIdentifier
  **/
  @ApiModelProperty(example = "null", value = "List of localized form identifier. One per language.")
  public List<LanguageItem> getFormIdentifier() {
    return formIdentifier;
  }

  public void setFormIdentifier(List<LanguageItem> formIdentifier) {
    this.formIdentifier = formIdentifier;
  }

  public PrintableFormServiceChannel formReceiver(List<LanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
    return this;
  }

  public PrintableFormServiceChannel addFormReceiverItem(LanguageItem formReceiverItem) {
    this.formReceiver.add(formReceiverItem);
    return this;
  }

   /**
   * List of localized form receiver. One per language.
   * @return formReceiver
  **/
  @ApiModelProperty(example = "null", value = "List of localized form receiver. One per language.")
  public List<LanguageItem> getFormReceiver() {
    return formReceiver;
  }

  public void setFormReceiver(List<LanguageItem> formReceiver) {
    this.formReceiver = formReceiver;
  }

  public PrintableFormServiceChannel deliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Form delivery address.
   * @return deliveryAddress
  **/
  @ApiModelProperty(example = "null", value = "Form delivery address.")
  public Address getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(Address deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public PrintableFormServiceChannel channelUrls(List<LocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
    return this;
  }

  public PrintableFormServiceChannel addChannelUrlsItem(LocalizedListItem channelUrlsItem) {
    this.channelUrls.add(channelUrlsItem);
    return this;
  }

   /**
   * List of localized channel urls.
   * @return channelUrls
  **/
  @ApiModelProperty(example = "null", value = "List of localized channel urls.")
  public List<LocalizedListItem> getChannelUrls() {
    return channelUrls;
  }

  public void setChannelUrls(List<LocalizedListItem> channelUrls) {
    this.channelUrls = channelUrls;
  }

  public PrintableFormServiceChannel attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public PrintableFormServiceChannel addAttachmentsItem(Attachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of attachments.
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "List of attachments.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }

  public PrintableFormServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public PrintableFormServiceChannel addSupportPhonesItem(Phone supportPhonesItem) {
    this.supportPhones.add(supportPhonesItem);
    return this;
  }

   /**
   * List of support phone numbers for the service channel.
   * @return supportPhones
  **/
  @ApiModelProperty(example = "null", value = "List of support phone numbers for the service channel.")
  public List<Phone> getSupportPhones() {
    return supportPhones;
  }

  public void setSupportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
  }

  public PrintableFormServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public PrintableFormServiceChannel addSupportEmailsItem(Email supportEmailsItem) {
    this.supportEmails.add(supportEmailsItem);
    return this;
  }

   /**
   * List of support email addresses for the service channel.
   * @return supportEmails
  **/
  @ApiModelProperty(example = "null", value = "List of support email addresses for the service channel.")
  public List<Email> getSupportEmails() {
    return supportEmails;
  }

  public void setSupportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
  }

  public PrintableFormServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public PrintableFormServiceChannel addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * List of languages the service channel is available in (two letter language code).
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "List of languages the service channel is available in (two letter language code).")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public PrintableFormServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public PrintableFormServiceChannel addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * List of service channel web pages.
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "List of service channel web pages.")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public PrintableFormServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public PrintableFormServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * List of service channel service hours.
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "List of service channel service hours.")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public PrintableFormServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "Service channel publishing status. Values: Draft, Published, Deleted, Modified or OldPublished.")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrintableFormServiceChannel printableFormServiceChannel = (PrintableFormServiceChannel) o;
    return Objects.equals(this.id, printableFormServiceChannel.id) &&
        Objects.equals(this.type, printableFormServiceChannel.type) &&
        Objects.equals(this.organizationId, printableFormServiceChannel.organizationId) &&
        Objects.equals(this.names, printableFormServiceChannel.names) &&
        Objects.equals(this.descriptions, printableFormServiceChannel.descriptions) &&
        Objects.equals(this.formIdentifier, printableFormServiceChannel.formIdentifier) &&
        Objects.equals(this.formReceiver, printableFormServiceChannel.formReceiver) &&
        Objects.equals(this.deliveryAddress, printableFormServiceChannel.deliveryAddress) &&
        Objects.equals(this.channelUrls, printableFormServiceChannel.channelUrls) &&
        Objects.equals(this.attachments, printableFormServiceChannel.attachments) &&
        Objects.equals(this.supportPhones, printableFormServiceChannel.supportPhones) &&
        Objects.equals(this.supportEmails, printableFormServiceChannel.supportEmails) &&
        Objects.equals(this.languages, printableFormServiceChannel.languages) &&
        Objects.equals(this.webPages, printableFormServiceChannel.webPages) &&
        Objects.equals(this.serviceHours, printableFormServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, printableFormServiceChannel.publishingStatus);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

