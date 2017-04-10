package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.FintoItem;
import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import fi.metatavu.restfulptv.server.rest.model.Municipality;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Service   {
  
  private String id = null;
  private String type = null;
  private String statutoryDescriptionId = null;
  private List<FintoItem> serviceClasses = new ArrayList<FintoItem>();
  private List<FintoItem> ontologyTerms = new ArrayList<FintoItem>();
  private List<FintoItem> targetGroups = new ArrayList<FintoItem>();
  private List<FintoItem> lifeEvents = new ArrayList<FintoItem>();
  private List<FintoItem> industrialClasses = new ArrayList<FintoItem>();
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private List<String> languages = new ArrayList<String>();
  private List<String> keywords = new ArrayList<String>();
  private String coverageType = null;
  private List<Municipality> municipalities = new ArrayList<Municipality>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<LanguageItem> requirements = new ArrayList<LanguageItem>();
  private String publishingStatus = null;
  private String chargeType = null;
  private List<LocalizedListItem> additionalInformations = new ArrayList<LocalizedListItem>();
  private List<String> organizationIds = new ArrayList<String>();
  private List<String> electronicServiceChannelIds = new ArrayList<String>();
  private List<String> phoneServiceChannelIds = new ArrayList<String>();
  private List<String> printableFormServiceChannelIds = new ArrayList<String>();
  private List<String> serviceLocationServiceChannelIds = new ArrayList<String>();
  private List<String> webPageServiceChannelIds = new ArrayList<String>();

  /**
   **/
  public Service id(String id) {
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
  public Service type(String type) {
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
  public Service statutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getStatutoryDescriptionId() {
    return statutoryDescriptionId;
  }
  public void setStatutoryDescriptionId(String statutoryDescriptionId) {
    this.statutoryDescriptionId = statutoryDescriptionId;
  }

  /**
   **/
  public Service serviceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getServiceClasses() {
    return serviceClasses;
  }
  public void setServiceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  /**
   **/
  public Service ontologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getOntologyTerms() {
    return ontologyTerms;
  }
  public void setOntologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  /**
   **/
  public Service targetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getTargetGroups() {
    return targetGroups;
  }
  public void setTargetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  /**
   **/
  public Service lifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getLifeEvents() {
    return lifeEvents;
  }
  public void setLifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  /**
   **/
  public Service industrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<FintoItem> getIndustrialClasses() {
    return industrialClasses;
  }
  public void setIndustrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  /**
   **/
  public Service names(List<LocalizedListItem> names) {
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
  public Service descriptions(List<LocalizedListItem> descriptions) {
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
  public Service languages(List<String> languages) {
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
  public Service keywords(List<String> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<String> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public Service coverageType(String coverageType) {
    this.coverageType = coverageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCoverageType() {
    return coverageType;
  }
  public void setCoverageType(String coverageType) {
    this.coverageType = coverageType;
  }

  /**
   **/
  public Service municipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Municipality> getMunicipalities() {
    return municipalities;
  }
  public void setMunicipalities(List<Municipality> municipalities) {
    this.municipalities = municipalities;
  }

  /**
   **/
  public Service webPages(List<WebPage> webPages) {
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
  public Service requirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getRequirements() {
    return requirements;
  }
  public void setRequirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
  }

  /**
   **/
  public Service publishingStatus(String publishingStatus) {
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

  /**
   **/
  public Service chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  /**
   **/
  public Service additionalInformations(List<LocalizedListItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<LocalizedListItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }

  /**
   **/
  public Service organizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getOrganizationIds() {
    return organizationIds;
  }
  public void setOrganizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
  }

  /**
   **/
  public Service electronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getElectronicServiceChannelIds() {
    return electronicServiceChannelIds;
  }
  public void setElectronicServiceChannelIds(List<String> electronicServiceChannelIds) {
    this.electronicServiceChannelIds = electronicServiceChannelIds;
  }

  /**
   **/
  public Service phoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPhoneServiceChannelIds() {
    return phoneServiceChannelIds;
  }
  public void setPhoneServiceChannelIds(List<String> phoneServiceChannelIds) {
    this.phoneServiceChannelIds = phoneServiceChannelIds;
  }

  /**
   **/
  public Service printableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getPrintableFormServiceChannelIds() {
    return printableFormServiceChannelIds;
  }
  public void setPrintableFormServiceChannelIds(List<String> printableFormServiceChannelIds) {
    this.printableFormServiceChannelIds = printableFormServiceChannelIds;
  }

  /**
   **/
  public Service serviceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceLocationServiceChannelIds() {
    return serviceLocationServiceChannelIds;
  }
  public void setServiceLocationServiceChannelIds(List<String> serviceLocationServiceChannelIds) {
    this.serviceLocationServiceChannelIds = serviceLocationServiceChannelIds;
  }

  /**
   **/
  public Service webPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getWebPageServiceChannelIds() {
    return webPageServiceChannelIds;
  }
  public void setWebPageServiceChannelIds(List<String> webPageServiceChannelIds) {
    this.webPageServiceChannelIds = webPageServiceChannelIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(id, service.id) &&
        Objects.equals(type, service.type) &&
        Objects.equals(statutoryDescriptionId, service.statutoryDescriptionId) &&
        Objects.equals(serviceClasses, service.serviceClasses) &&
        Objects.equals(ontologyTerms, service.ontologyTerms) &&
        Objects.equals(targetGroups, service.targetGroups) &&
        Objects.equals(lifeEvents, service.lifeEvents) &&
        Objects.equals(industrialClasses, service.industrialClasses) &&
        Objects.equals(names, service.names) &&
        Objects.equals(descriptions, service.descriptions) &&
        Objects.equals(languages, service.languages) &&
        Objects.equals(keywords, service.keywords) &&
        Objects.equals(coverageType, service.coverageType) &&
        Objects.equals(municipalities, service.municipalities) &&
        Objects.equals(webPages, service.webPages) &&
        Objects.equals(requirements, service.requirements) &&
        Objects.equals(publishingStatus, service.publishingStatus) &&
        Objects.equals(chargeType, service.chargeType) &&
        Objects.equals(additionalInformations, service.additionalInformations) &&
        Objects.equals(organizationIds, service.organizationIds) &&
        Objects.equals(electronicServiceChannelIds, service.electronicServiceChannelIds) &&
        Objects.equals(phoneServiceChannelIds, service.phoneServiceChannelIds) &&
        Objects.equals(printableFormServiceChannelIds, service.printableFormServiceChannelIds) &&
        Objects.equals(serviceLocationServiceChannelIds, service.serviceLocationServiceChannelIds) &&
        Objects.equals(webPageServiceChannelIds, service.webPageServiceChannelIds);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
