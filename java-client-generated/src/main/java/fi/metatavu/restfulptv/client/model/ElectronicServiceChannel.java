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
 * ElectronicServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T06:15:07.772+03:00")
public class ElectronicServiceChannel   {
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

  @JsonProperty("signatureQuantity")
  private Integer signatureQuantity = null;

  @JsonProperty("requiresSignature")
  private Boolean requiresSignature = null;

  @JsonProperty("supportPhones")
  private List<Phone> supportPhones = new ArrayList<Phone>();

  @JsonProperty("supportEmails")
  private List<Email> supportEmails = new ArrayList<Email>();

  @JsonProperty("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @JsonProperty("urls")
  private List<LanguageItem> urls = new ArrayList<LanguageItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("attachments")
  private List<Attachment> attachments = new ArrayList<Attachment>();

  @JsonProperty("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @JsonProperty("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public ElectronicServiceChannel id(String id) {
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

  public ElectronicServiceChannel type(String type) {
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

  public ElectronicServiceChannel organizationId(String organizationId) {
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

  public ElectronicServiceChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public ElectronicServiceChannel addNamesItem(LocalizedListItem namesItem) {
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

  public ElectronicServiceChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public ElectronicServiceChannel addDescriptionsItem(LocalizedListItem descriptionsItem) {
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

  public ElectronicServiceChannel signatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * How many signatures are required.
   * @return signatureQuantity
  **/
  @ApiModelProperty(example = "null", value = "How many signatures are required.")
  public Integer getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public ElectronicServiceChannel requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Is signature required.
   * @return requiresSignature
  **/
  @ApiModelProperty(example = "null", value = "Is signature required.")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public ElectronicServiceChannel supportPhones(List<Phone> supportPhones) {
    this.supportPhones = supportPhones;
    return this;
  }

  public ElectronicServiceChannel addSupportPhonesItem(Phone supportPhonesItem) {
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

  public ElectronicServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public ElectronicServiceChannel addSupportEmailsItem(Email supportEmailsItem) {
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

  public ElectronicServiceChannel requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Does the electronic channel require authentication.
   * @return requiresAuthentication
  **/
  @ApiModelProperty(example = "null", value = "Does the electronic channel require authentication.")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public ElectronicServiceChannel urls(List<LanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public ElectronicServiceChannel addUrlsItem(LanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Localized list of channel urls.
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "Localized list of channel urls.")
  public List<LanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<LanguageItem> urls) {
    this.urls = urls;
  }

  public ElectronicServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public ElectronicServiceChannel addLanguagesItem(String languagesItem) {
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

  public ElectronicServiceChannel attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public ElectronicServiceChannel addAttachmentsItem(Attachment attachmentsItem) {
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

  public ElectronicServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public ElectronicServiceChannel addWebPagesItem(WebPage webPagesItem) {
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

  public ElectronicServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public ElectronicServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
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

  public ElectronicServiceChannel publishingStatus(String publishingStatus) {
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
    ElectronicServiceChannel electronicServiceChannel = (ElectronicServiceChannel) o;
    return Objects.equals(this.id, electronicServiceChannel.id) &&
        Objects.equals(this.type, electronicServiceChannel.type) &&
        Objects.equals(this.organizationId, electronicServiceChannel.organizationId) &&
        Objects.equals(this.names, electronicServiceChannel.names) &&
        Objects.equals(this.descriptions, electronicServiceChannel.descriptions) &&
        Objects.equals(this.signatureQuantity, electronicServiceChannel.signatureQuantity) &&
        Objects.equals(this.requiresSignature, electronicServiceChannel.requiresSignature) &&
        Objects.equals(this.supportPhones, electronicServiceChannel.supportPhones) &&
        Objects.equals(this.supportEmails, electronicServiceChannel.supportEmails) &&
        Objects.equals(this.requiresAuthentication, electronicServiceChannel.requiresAuthentication) &&
        Objects.equals(this.urls, electronicServiceChannel.urls) &&
        Objects.equals(this.languages, electronicServiceChannel.languages) &&
        Objects.equals(this.attachments, electronicServiceChannel.attachments) &&
        Objects.equals(this.webPages, electronicServiceChannel.webPages) &&
        Objects.equals(this.serviceHours, electronicServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, electronicServiceChannel.publishingStatus);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

