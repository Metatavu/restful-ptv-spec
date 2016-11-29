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


package fi.otavanopisto.restfulptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.restfulptv.client.model.LanguageItem;
import fi.otavanopisto.restfulptv.client.model.LocalizedListItem;
import fi.otavanopisto.restfulptv.client.model.ServiceHour;
import fi.otavanopisto.restfulptv.client.model.Support;
import fi.otavanopisto.restfulptv.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * PhoneChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-29T08:41:12.415+02:00")
public class PhoneChannel   {
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

  @JsonProperty("supportContacts")
  private List<Support> supportContacts = new ArrayList<Support>();

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

  public PhoneChannel id(String id) {
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

  public PhoneChannel type(String type) {
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

  public PhoneChannel organizationId(String organizationId) {
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

  public PhoneChannel names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public PhoneChannel addNamesItem(LocalizedListItem namesItem) {
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

  public PhoneChannel descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public PhoneChannel addDescriptionsItem(LocalizedListItem descriptionsItem) {
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

  public PhoneChannel phoneType(String phoneType) {
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

  public PhoneChannel chargeTypes(List<String> chargeTypes) {
    this.chargeTypes = chargeTypes;
    return this;
  }

  public PhoneChannel addChargeTypesItem(String chargeTypesItem) {
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

  public PhoneChannel supportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public PhoneChannel addSupportContactsItem(Support supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * Get supportContacts
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Support> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public PhoneChannel phoneNumbers(List<LanguageItem> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  public PhoneChannel addPhoneNumbersItem(LanguageItem phoneNumbersItem) {
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

  public PhoneChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public PhoneChannel addLanguagesItem(String languagesItem) {
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

  public PhoneChannel phoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  public PhoneChannel addPhoneChargeDescriptionsItem(LanguageItem phoneChargeDescriptionsItem) {
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

  public PhoneChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public PhoneChannel addWebPagesItem(WebPage webPagesItem) {
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

  public PhoneChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public PhoneChannel addServiceHoursItem(ServiceHour serviceHoursItem) {
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

  public PhoneChannel publishingStatus(String publishingStatus) {
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
    PhoneChannel phoneChannel = (PhoneChannel) o;
    return Objects.equals(this.id, phoneChannel.id) &&
        Objects.equals(this.type, phoneChannel.type) &&
        Objects.equals(this.organizationId, phoneChannel.organizationId) &&
        Objects.equals(this.names, phoneChannel.names) &&
        Objects.equals(this.descriptions, phoneChannel.descriptions) &&
        Objects.equals(this.phoneType, phoneChannel.phoneType) &&
        Objects.equals(this.chargeTypes, phoneChannel.chargeTypes) &&
        Objects.equals(this.supportContacts, phoneChannel.supportContacts) &&
        Objects.equals(this.phoneNumbers, phoneChannel.phoneNumbers) &&
        Objects.equals(this.languages, phoneChannel.languages) &&
        Objects.equals(this.phoneChargeDescriptions, phoneChannel.phoneChargeDescriptions) &&
        Objects.equals(this.webPages, phoneChannel.webPages) &&
        Objects.equals(this.serviceHours, phoneChannel.serviceHours) &&
        Objects.equals(this.publishingStatus, phoneChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, organizationId, names, descriptions, phoneType, chargeTypes, supportContacts, phoneNumbers, languages, phoneChargeDescriptions, webPages, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    phoneType: ").append(toIndentedString(phoneType)).append("\n");
    sb.append("    chargeTypes: ").append(toIndentedString(chargeTypes)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

