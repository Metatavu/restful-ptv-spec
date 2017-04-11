package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.FintoItem;
import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.Law;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import fi.metatavu.restfulptv.server.rest.model.Municipality;
import fi.metatavu.restfulptv.server.rest.model.ServiceOrganization;
import fi.metatavu.restfulptv.server.rest.model.ServiceServiceChannel;
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
  private List<LanguageItem> keywords = new ArrayList<LanguageItem>();
  private List<Law> legislation = new ArrayList<Law>();
  private String coverageType = null;
  private List<Municipality> municipalities = new ArrayList<Municipality>();
  private List<LanguageItem> requirements = new ArrayList<LanguageItem>();
  private String publishingStatus = null;
  private String chargeType = null;
  private List<ServiceOrganization> organizations = new ArrayList<ServiceOrganization>();
  private List<ServiceServiceChannel> electronicServiceChannels = new ArrayList<ServiceServiceChannel>();
  private List<ServiceServiceChannel> phoneServiceChannels = new ArrayList<ServiceServiceChannel>();
  private List<ServiceServiceChannel> printableFormServiceChannels = new ArrayList<ServiceServiceChannel>();
  private List<ServiceServiceChannel> serviceLocationServiceChannels = new ArrayList<ServiceServiceChannel>();
  private List<ServiceServiceChannel> webPageServiceChannels = new ArrayList<ServiceServiceChannel>();

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
   * Service type. Possible values are: Service or PermissionAndObligation.  NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type when possible.  POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.
   **/
  public Service type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service type. Possible values are: Service or PermissionAndObligation.  NOTE! Current PTV database does not anymore support for types Notice, Registration or Permission - they are automatically mapped into PermissionAndObligation type when possible.  POST and PUT methods accepts old types but GET method only can return Service or PermissionAndObligation types.")
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
   * List of localized service keywords.
   **/
  public Service keywords(List<LanguageItem> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized service keywords.")
  public List<LanguageItem> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<LanguageItem> keywords) {
    this.keywords = keywords;
  }

  /**
   * List of laws related to the service.
   **/
  public Service legislation(List<Law> legislation) {
    this.legislation = legislation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of laws related to the service.")
  public List<Law> getLegislation() {
    return legislation;
  }
  public void setLegislation(List<Law> legislation) {
    this.legislation = legislation;
  }

  /**
   * Service coverage type. Valid values are: Local or Nationwide.
   **/
  public Service coverageType(String coverageType) {
    this.coverageType = coverageType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service coverage type. Valid values are: Local or Nationwide.")
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
   * Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.
   **/
  public Service publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Publishing status. Possible values are: Draft, Published, Deleted, Modified or OldPublished.")
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
  public Service organizations(List<ServiceOrganization> organizations) {
    this.organizations = organizations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceOrganization> getOrganizations() {
    return organizations;
  }
  public void setOrganizations(List<ServiceOrganization> organizations) {
    this.organizations = organizations;
  }

  /**
   **/
  public Service electronicServiceChannels(List<ServiceServiceChannel> electronicServiceChannels) {
    this.electronicServiceChannels = electronicServiceChannels;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceServiceChannel> getElectronicServiceChannels() {
    return electronicServiceChannels;
  }
  public void setElectronicServiceChannels(List<ServiceServiceChannel> electronicServiceChannels) {
    this.electronicServiceChannels = electronicServiceChannels;
  }

  /**
   **/
  public Service phoneServiceChannels(List<ServiceServiceChannel> phoneServiceChannels) {
    this.phoneServiceChannels = phoneServiceChannels;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceServiceChannel> getPhoneServiceChannels() {
    return phoneServiceChannels;
  }
  public void setPhoneServiceChannels(List<ServiceServiceChannel> phoneServiceChannels) {
    this.phoneServiceChannels = phoneServiceChannels;
  }

  /**
   **/
  public Service printableFormServiceChannels(List<ServiceServiceChannel> printableFormServiceChannels) {
    this.printableFormServiceChannels = printableFormServiceChannels;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceServiceChannel> getPrintableFormServiceChannels() {
    return printableFormServiceChannels;
  }
  public void setPrintableFormServiceChannels(List<ServiceServiceChannel> printableFormServiceChannels) {
    this.printableFormServiceChannels = printableFormServiceChannels;
  }

  /**
   **/
  public Service serviceLocationServiceChannels(List<ServiceServiceChannel> serviceLocationServiceChannels) {
    this.serviceLocationServiceChannels = serviceLocationServiceChannels;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceServiceChannel> getServiceLocationServiceChannels() {
    return serviceLocationServiceChannels;
  }
  public void setServiceLocationServiceChannels(List<ServiceServiceChannel> serviceLocationServiceChannels) {
    this.serviceLocationServiceChannels = serviceLocationServiceChannels;
  }

  /**
   **/
  public Service webPageServiceChannels(List<ServiceServiceChannel> webPageServiceChannels) {
    this.webPageServiceChannels = webPageServiceChannels;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceServiceChannel> getWebPageServiceChannels() {
    return webPageServiceChannels;
  }
  public void setWebPageServiceChannels(List<ServiceServiceChannel> webPageServiceChannels) {
    this.webPageServiceChannels = webPageServiceChannels;
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
        Objects.equals(legislation, service.legislation) &&
        Objects.equals(coverageType, service.coverageType) &&
        Objects.equals(municipalities, service.municipalities) &&
        Objects.equals(requirements, service.requirements) &&
        Objects.equals(publishingStatus, service.publishingStatus) &&
        Objects.equals(chargeType, service.chargeType) &&
        Objects.equals(organizations, service.organizations) &&
        Objects.equals(electronicServiceChannels, service.electronicServiceChannels) &&
        Objects.equals(phoneServiceChannels, service.phoneServiceChannels) &&
        Objects.equals(printableFormServiceChannels, service.printableFormServiceChannels) &&
        Objects.equals(serviceLocationServiceChannels, service.serviceLocationServiceChannels) &&
        Objects.equals(webPageServiceChannels, service.webPageServiceChannels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, statutoryDescriptionId, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, names, descriptions, languages, keywords, legislation, coverageType, municipalities, requirements, publishingStatus, chargeType, organizations, electronicServiceChannels, phoneServiceChannels, printableFormServiceChannels, serviceLocationServiceChannels, webPageServiceChannels);
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
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
    sb.append("    coverageType: ").append(toIndentedString(coverageType)).append("\n");
    sb.append("    municipalities: ").append(toIndentedString(municipalities)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    electronicServiceChannels: ").append(toIndentedString(electronicServiceChannels)).append("\n");
    sb.append("    phoneServiceChannels: ").append(toIndentedString(phoneServiceChannels)).append("\n");
    sb.append("    printableFormServiceChannels: ").append(toIndentedString(printableFormServiceChannels)).append("\n");
    sb.append("    serviceLocationServiceChannels: ").append(toIndentedString(serviceLocationServiceChannels)).append("\n");
    sb.append("    webPageServiceChannels: ").append(toIndentedString(webPageServiceChannels)).append("\n");
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
