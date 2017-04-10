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
import fi.metatavu.restfulptv.client.model.Email;
import fi.metatavu.restfulptv.client.model.LanguageItem;
import fi.metatavu.restfulptv.client.model.LocalizedListItem;
import fi.metatavu.restfulptv.client.model.ServiceHour;
import fi.metatavu.restfulptv.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * PhoneServiceChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T20:24:26.046+03:00")
public class PhoneServiceChannel   {
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

  @JsonProperty("phoneType")
  private String phoneType = null;

  @JsonProperty("chargeTypes")
  private List<String> chargeTypes = new ArrayList<String>();

  @JsonProperty("supportEmails")
  private List<Email> supportEmails = new ArrayList<Email>();

  @JsonProperty("phoneNumbers")
  private List<LanguageItem> phoneNumbers = new ArrayList<LanguageItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("phoneChargeDescriptions")
  private List<LanguageItem> phoneChargeDescriptions = new ArrayList<LanguageItem>();

  @JsonProperty("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @JsonProperty("serviceHours")
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public PhoneServiceChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PhoneServiceChannel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PhoneServiceChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public PhoneServiceChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public PhoneServiceChannel addNamesItem(LocalizedListItem namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getNames() {
    return names;
  }

  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  public PhoneServiceChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PhoneServiceChannel addDescriptionsItem(LocalizedListItem descriptionsItem) {
    this.descriptions.add(descriptionsItem);
    return this;
  }

   /**
   * Get descriptions
   * @return descriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  public PhoneServiceChannel phoneType(String phoneType) {
    this.phoneType = phoneType;
    return this;
  }

   /**
   * Get phoneType
   * @return phoneType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(String phoneType) {
    this.phoneType = phoneType;
  }

  public PhoneServiceChannel chargeTypes(List<String> chargeTypes) {
    this.chargeTypes = chargeTypes;
    return this;
  }

  public PhoneServiceChannel addChargeTypesItem(String chargeTypesItem) {
    this.chargeTypes.add(chargeTypesItem);
    return this;
  }

   /**
   * Get chargeTypes
   * @return chargeTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getChargeTypes() {
    return chargeTypes;
  }

  public void setChargeTypes(List<String> chargeTypes) {
    this.chargeTypes = chargeTypes;
  }

  public PhoneServiceChannel supportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
    return this;
  }

  public PhoneServiceChannel addSupportEmailsItem(Email supportEmailsItem) {
    this.supportEmails.add(supportEmailsItem);
    return this;
  }

   /**
   * Get supportEmails
   * @return supportEmails
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Email> getSupportEmails() {
    return supportEmails;
  }

  public void setSupportEmails(List<Email> supportEmails) {
    this.supportEmails = supportEmails;
  }

  public PhoneServiceChannel phoneNumbers(List<LanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PhoneServiceChannel addPhoneNumbersItem(LanguageItem phoneNumbersItem) {
    this.phoneNumbers.add(phoneNumbersItem);
    return this;
  }

   /**
   * Get phoneNumbers
   * @return phoneNumbers
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<LanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public PhoneServiceChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public PhoneServiceChannel addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public PhoneServiceChannel phoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  public PhoneServiceChannel addPhoneChargeDescriptionsItem(LanguageItem phoneChargeDescriptionsItem) {
    this.phoneChargeDescriptions.add(phoneChargeDescriptionsItem);
    return this;
  }

   /**
   * Get phoneChargeDescriptions
   * @return phoneChargeDescriptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }

  public void setPhoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  public PhoneServiceChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public PhoneServiceChannel addWebPagesItem(WebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  public PhoneServiceChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public PhoneServiceChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public PhoneServiceChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", value = "")
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
    PhoneServiceChannel phoneServiceChannel = (PhoneServiceChannel) o;
    return Objects.equals(this.id, phoneServiceChannel.id) &&
        Objects.equals(this.type, phoneServiceChannel.type) &&
        Objects.equals(this.organizationId, phoneServiceChannel.organizationId) &&
        Objects.equals(this.names, phoneServiceChannel.names) &&
        Objects.equals(this.descriptions, phoneServiceChannel.descriptions) &&
        Objects.equals(this.phoneType, phoneServiceChannel.phoneType) &&
        Objects.equals(this.chargeTypes, phoneServiceChannel.chargeTypes) &&
        Objects.equals(this.supportEmails, phoneServiceChannel.supportEmails) &&
        Objects.equals(this.phoneNumbers, phoneServiceChannel.phoneNumbers) &&
        Objects.equals(this.languages, phoneServiceChannel.languages) &&
        Objects.equals(this.phoneChargeDescriptions, phoneServiceChannel.phoneChargeDescriptions) &&
        Objects.equals(this.webPages, phoneServiceChannel.webPages) &&
        Objects.equals(this.serviceHours, phoneServiceChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, phoneServiceChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, phoneType, chargeTypes, supportEmails, phoneNumbers, languages, phoneChargeDescriptions, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneServiceChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    chargeTypes: ").append(toIndentedString(chargeTypes)).append("\n");
    sb.append("    supportEmails: ").append(toIndentedString(supportEmails)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

