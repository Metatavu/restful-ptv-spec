package fi.otavanopisto.restfulptv.server.rest.model;

import fi.otavanopisto.restfulptv.server.rest.model.FintoItem;
import fi.otavanopisto.restfulptv.server.rest.model.LanguageItem;
import fi.otavanopisto.restfulptv.server.rest.model.LocalizedListItem;
import fi.otavanopisto.restfulptv.server.rest.model.WebPage;
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
  private List<LocalizedListItem> serviceNames = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> serviceDescriptions = new ArrayList<LocalizedListItem>();
  private List<String> languages = new ArrayList<String>();
  private List<String> keywords = new ArrayList<String>();
  private String serviceCoverageType = null;
  private List<String> municipalities = new ArrayList<String>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<LanguageItem> requirements = new ArrayList<LanguageItem>();
  private String publishingStatus = null;
  private String serviceChargeType = null;
  private List<LocalizedListItem> serviceAdditionalInformations = new ArrayList<LocalizedListItem>();

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
  public Service serviceNames(List<LocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceNames() {
    return serviceNames;
  }
  public void setServiceNames(List<LocalizedListItem> serviceNames) {
    this.serviceNames = serviceNames;
  }

  /**
   **/
  public Service serviceDescriptions(List<LocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceDescriptions() {
    return serviceDescriptions;
  }
  public void setServiceDescriptions(List<LocalizedListItem> serviceDescriptions) {
    this.serviceDescriptions = serviceDescriptions;
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
  public Service serviceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceCoverageType() {
    return serviceCoverageType;
  }
  public void setServiceCoverageType(String serviceCoverageType) {
    this.serviceCoverageType = serviceCoverageType;
  }

  /**
   **/
  public Service municipalities(List<String> municipalities) {
    this.municipalities = municipalities;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getMunicipalities() {
    return municipalities;
  }
  public void setMunicipalities(List<String> municipalities) {
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
  public Service serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChargeType() {
    return serviceChargeType;
  }
  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  /**
   **/
  public Service serviceAdditionalInformations(List<LocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceAdditionalInformations() {
    return serviceAdditionalInformations;
  }
  public void setServiceAdditionalInformations(List<LocalizedListItem> serviceAdditionalInformations) {
    this.serviceAdditionalInformations = serviceAdditionalInformations;
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
        Objects.equals(serviceNames, service.serviceNames) &&
        Objects.equals(serviceDescriptions, service.serviceDescriptions) &&
        Objects.equals(languages, service.languages) &&
        Objects.equals(keywords, service.keywords) &&
        Objects.equals(serviceCoverageType, service.serviceCoverageType) &&
        Objects.equals(municipalities, service.municipalities) &&
        Objects.equals(webPages, service.webPages) &&
        Objects.equals(requirements, service.requirements) &&
        Objects.equals(publishingStatus, service.publishingStatus) &&
        Objects.equals(serviceChargeType, service.serviceChargeType) &&
        Objects.equals(serviceAdditionalInformations, service.serviceAdditionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, serviceNames, serviceDescriptions, languages, keywords, serviceCoverageType, municipalities, webPages, requirements, publishingStatus, serviceChargeType, serviceAdditionalInformations);
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
    sb.append("    serviceNames: ").append(toIndentedString(serviceNames)).append("\n");
    sb.append("    serviceDescriptions: ").append(toIndentedString(serviceDescriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    serviceCoverageType: ").append(toIndentedString(serviceCoverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    serviceAdditionalInformations: ").append(toIndentedString(serviceAdditionalInformations)).append("\n");
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
