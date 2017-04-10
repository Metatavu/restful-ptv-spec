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
import fi.metatavu.restfulptv.client.model.FintoItem;
import fi.metatavu.restfulptv.client.model.LanguageItem;
import fi.metatavu.restfulptv.client.model.LocalizedListItem;
import fi.metatavu.restfulptv.client.model.Municipality;
import fi.metatavu.restfulptv.client.model.WebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Service
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-10T20:24:26.046+03:00")
public class Service   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("statutoryDescriptionId")
  private String statutoryDescriptionId = null;

  @JsonProperty("serviceClasses")
  private List<FintoItem> serviceClasses = new ArrayList<FintoItem>();

  @JsonProperty("ontologyTerms")
  private List<FintoItem> ontologyTerms = new ArrayList<FintoItem>();

  @JsonProperty("targetGroups")
  private List<FintoItem> targetGroups = new ArrayList<FintoItem>();

  @JsonProperty("lifeEvents")
  private List<FintoItem> lifeEvents = new ArrayList<FintoItem>();

  @JsonProperty("industrialClasses")
  private List<FintoItem> industrialClasses = new ArrayList<FintoItem>();

  @JsonProperty("names")
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();

  @JsonProperty("descriptions")
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("keywords")
  private List<String> keywords = new ArrayList<String>();

  @JsonProperty("coverageType")
  private String coverageType = null;

  @JsonProperty("municipalities")
  private List<Municipality> municipalities = new ArrayList<Municipality>();

  @JsonProperty("webPages")
  private List<WebPage> webPages = new ArrayList<WebPage>();

  @JsonProperty("requirements")
  private List<LanguageItem> requirements = new ArrayList<LanguageItem>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  @JsonProperty("chargeType")
  private String chargeType = null;

  @JsonProperty("additionalInformations")
  private List<LocalizedListItem> additionalInformations = new ArrayList<LocalizedListItem>();

  @JsonProperty("organizationIds")
  private List<String> organizationIds = new ArrayList<String>();

  @JsonProperty("electronicServiceChannelIds")
  private List<String> electronicServiceChannelIds = new ArrayList<String>();

  @JsonProperty("phoneServiceChannelIds")
  private List<String> phoneServiceChannelIds = new ArrayList<String>();

  @JsonProperty("printableFormServiceChannelIds")
  private List<String> printableFormServiceChannelIds = new ArrayList<String>();

  @JsonProperty("serviceLocationServiceChannelIds")
  private List<String> serviceLocationServiceChannelIds = new ArrayList<String>();

  @JsonProperty("webPageServiceChannelIds")
  private List<String> webPageServiceChannelIds = new ArrayList<String>();

  public Service id(String id) {
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

  public Service type(String type) {
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

  public Service statutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
    return this;
  }

   /**
   * Get statutoryDescriptionId
   * @return statutoryDescriptionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatutoryDescriptionId() {
    return statutoryDescriptionId;
  }

  public void setStatutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
  }

  public Service serviceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  public Service addServiceClassesItem(FintoItem serviceClassesItem) {
    this.serviceClasses.add(serviceClassesItem);
    return this;
  }

   /**
   * Get serviceClasses
   * @return serviceClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getServiceClasses() {
    return serviceClasses;
  }

  public void setServiceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  public Service ontologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  public Service addOntologyTermsItem(FintoItem ontologyTermsItem) {
    this.ontologyTerms.add(ontologyTermsItem);
    return this;
  }

   /**
   * Get ontologyTerms
   * @return ontologyTerms
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getOntologyTerms() {
    return ontologyTerms;
  }

  public void setOntologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  public Service targetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  public Service addTargetGroupsItem(FintoItem targetGroupsItem) {
    this.targetGroups.add(targetGroupsItem);
    return this;
  }

   /**
   * Get targetGroups
   * @return targetGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getTargetGroups() {
    return targetGroups;
  }

  public void setTargetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  public Service lifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  public Service addLifeEventsItem(FintoItem lifeEventsItem) {
    this.lifeEvents.add(lifeEventsItem);
    return this;
  }

   /**
   * Get lifeEvents
   * @return lifeEvents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getLifeEvents() {
    return lifeEvents;
  }

  public void setLifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  public Service industrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  public Service addIndustrialClassesItem(FintoItem industrialClassesItem) {
    this.industrialClasses.add(industrialClassesItem);
    return this;
  }

   /**
   * Get industrialClasses
   * @return industrialClasses
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getIndustrialClasses() {
    return industrialClasses;
  }

  public void setIndustrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  public Service names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  public Service addNamesItem(LocalizedListItem namesItem) {
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

  public Service descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public Service addDescriptionsItem(LocalizedListItem descriptionsItem) {
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

  public Service languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Service addLanguagesItem(String languagesItem) {
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

  public Service keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  public Service addKeywordsItem(String keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

   /**
   * Get keywords
   * @return keywords
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  public Service coverageType(String coverageType) {
    this.coverageType = coverageType;
    return this;
  }

   /**
   * Get coverageType
   * @return coverageType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoverageType() {
    return coverageType;
  }

  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }

  public Service municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  public Service addMunicipalitiesItem(Municipality municipalitiesItem) {
    this.municipalities.add(municipalitiesItem);
    return this;
  }

   /**
   * Get municipalities
   * @return municipalities
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }

  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }

  public Service webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public Service addWebPagesItem(WebPage webPagesItem) {
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

  public Service requirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  public Service addRequirementsItem(LanguageItem requirementsItem) {
    this.requirements.add(requirementsItem);
    return this;
  }

   /**
   * Get requirements
   * @return requirements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getRequirements() {
    return requirements;
  }

  public void setRequirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
  }

  public Service publishingStatus(String publishingStatus) {
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

  public Service chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

   /**
   * Get chargeType
   * @return chargeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public Service additionalInformations(List<LocalizedListItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  public Service addAdditionalInformationsItem(LocalizedListItem additionalInformationsItem) {
    this.additionalInformations.add(additionalInformationsItem);
    return this;
  }

   /**
   * Get additionalInformations
   * @return additionalInformations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getAdditionalInformations() {
    return additionalInformations;
  }

  public void setAdditionalInformations(List<LocalizedListItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  public Service organizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
    return this;
  }

  public Service addOrganizationIdsItem(String organizationIdsItem) {
    this.organizationIds.add(organizationIdsItem);
    return this;
  }

   /**
   * Get organizationIds
   * @return organizationIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getOrganizationIds() {
    return organizationIds;
  }

  public void setOrganizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
  }

  public Service electronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
    return this;
  }

  public Service addElectronicServiceChannelIdsItem(String electronicServiceChannelIdsItem) {
    this.electronicServiceChannelIds.add(electronicServiceChannelIdsItem);
    return this;
  }

   /**
   * Get electronicServiceChannelIds
   * @return electronicServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getElectronicServiceChannelIds() {
    return electronicServiceChannelIds;
  }

  public void setElectronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
  }

  public Service phoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
    return this;
  }

  public Service addPhoneServiceChannelIdsItem(String phoneServiceChannelIdsItem) {
    this.phoneServiceChannelIds.add(phoneServiceChannelIdsItem);
    return this;
  }

   /**
   * Get phoneServiceChannelIds
   * @return phoneServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPhoneServiceChannelIds() {
    return phoneServiceChannelIds;
  }

  public void setPhoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
  }

  public Service printableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
    return this;
  }

  public Service addPrintableFormServiceChannelIdsItem(String printableFormServiceChannelIdsItem) {
    this.printableFormServiceChannelIds.add(printableFormServiceChannelIdsItem);
    return this;
  }

   /**
   * Get printableFormServiceChannelIds
   * @return printableFormServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPrintableFormServiceChannelIds() {
    return printableFormServiceChannelIds;
  }

  public void setPrintableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
  }

  public Service serviceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
    return this;
  }

  public Service addServiceLocationServiceChannelIdsItem(String serviceLocationServiceChannelIdsItem) {
    this.serviceLocationServiceChannelIds.add(serviceLocationServiceChannelIdsItem);
    return this;
  }

   /**
   * Get serviceLocationServiceChannelIds
   * @return serviceLocationServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceLocationServiceChannelIds() {
    return serviceLocationServiceChannelIds;
  }

  public void setServiceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
  }

  public Service webPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
    return this;
  }

  public Service addWebPageServiceChannelIdsItem(String webPageServiceChannelIdsItem) {
    this.webPageServiceChannelIds.add(webPageServiceChannelIdsItem);
    return this;
  }

   /**
   * Get webPageServiceChannelIds
   * @return webPageServiceChannelIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getWebPageServiceChannelIds() {
    return webPageServiceChannelIds;
  }

  public void setWebPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.type, service.type) &&
        Objects.equals(this.statutoryDescriptionId, service.statutoryDescriptionId) &&
        Objects.equals(this.serviceClasses, service.serviceClasses) &&
        Objects.equals(this.ontologyTerms, service.ontologyTerms) &&
        Objects.equals(this.targetGroups, service.targetGroups) &&
        Objects.equals(this.lifeEvents, service.lifeEvents) &&
        Objects.equals(this.industrialClasses, service.industrialClasses) &&
        Objects.equals(this.names, service.names) &&
        Objects.equals(this.descriptions, service.descriptions) &&
        Objects.equals(this.languages, service.languages) &&
        Objects.equals(this.keywords, service.keywords) &&
        Objects.equals(this.coverageType, service.coverageType) &&
        Objects.equals(this.municipalities, service.municipalities) &&
        Objects.equals(this.webPages, service.webPages) &&
        Objects.equals(this.requirements, service.requirements) &&
        Objects.equals(this.publishingStatus, service.publishingStatus) &&
        Objects.equals(this.chargeType, service.chargeType) &&
        Objects.equals(this.additionalInformations, service.additionalInformations) &&
        Objects.equals(this.organizationIds, service.organizationIds) &&
        Objects.equals(this.electronicServiceChannelIds, service.electronicServiceChannelIds) &&
        Objects.equals(this.phoneServiceChannelIds, service.phoneServiceChannelIds) &&
        Objects.equals(this.printableFormServiceChannelIds, service.printableFormServiceChannelIds) &&
        Objects.equals(this.serviceLocationServiceChannelIds, service.serviceLocationServiceChannelIds) &&
        Objects.equals(this.webPageServiceChannelIds, service.webPageServiceChannelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, names, descriptions, languages, keywords, coverageType, municipalities, webPages, requirements, publishingStatus, chargeType, additionalInformations, organizationIds, electronicServiceChannelIds, phoneServiceChannelIds, printableFormServiceChannelIds, serviceLocationServiceChannelIds, webPageServiceChannelIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    statutoryDescriptionId: ").append(toIndentedString(statutoryDescriptionId)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    coverageType: ").append(toIndentedString(coverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
    sb.append("    organizationIds: ").append(toIndentedString(organizationIds)).append("\n");
    sb.append("    electronicServiceChannelIds: ").append(toIndentedString(electronicServiceChannelIds)).append("\n");
    sb.append("    phoneServiceChannelIds: ").append(toIndentedString(phoneServiceChannelIds)).append("\n");
    sb.append("    printableFormServiceChannelIds: ").append(toIndentedString(printableFormServiceChannelIds)).append("\n");
    sb.append("    serviceLocationServiceChannelIds: ").append(toIndentedString(serviceLocationServiceChannelIds)).append("\n");
    sb.append("    webPageServiceChannelIds: ").append(toIndentedString(webPageServiceChannelIds)).append("\n");
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

