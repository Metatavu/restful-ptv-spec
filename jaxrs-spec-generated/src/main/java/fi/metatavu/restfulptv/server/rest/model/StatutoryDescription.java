package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.FintoItem;
import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.Law;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class StatutoryDescription   {
  
  private String id = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private List<String> languages = new ArrayList<String>();
  private List<FintoItem> serviceClasses = new ArrayList<FintoItem>();
  private List<FintoItem> ontologyTerms = new ArrayList<FintoItem>();
  private List<FintoItem> targetGroups = new ArrayList<FintoItem>();
  private List<FintoItem> lifeEvents = new ArrayList<FintoItem>();
  private List<FintoItem> industrialClasses = new ArrayList<FintoItem>();
  private List<LanguageItem> requirements = new ArrayList<LanguageItem>();
  private String type = null;
  private String serviceChargeType = null;
  private List<Law> legislation = new ArrayList<Law>();

  /**
   * Entity Guid identifier.
   **/
  public StatutoryDescription id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Entity Guid identifier.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * List of localized names.
   **/
  public StatutoryDescription names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized names.")
  public List<LocalizedListItem> getNames() {
    return names;
  }
  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  /**
   * List of localized descriptions.
   **/
  public StatutoryDescription descriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized descriptions.")
  public List<LocalizedListItem> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LocalizedListItem> descriptions) {
    this.descriptions = descriptions;
  }

  /**
   * List of statutory service general description languages.
   **/
  public StatutoryDescription languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of statutory service general description languages.")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   * List of service classes.
   **/
  public StatutoryDescription serviceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of service classes.")
  public List<FintoItem> getServiceClasses() {
    return serviceClasses;
  }
  public void setServiceClasses(List<FintoItem> serviceClasses) {
    this.serviceClasses = serviceClasses;
  }

  /**
   * List of ontology terms.
   **/
  public StatutoryDescription ontologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of ontology terms.")
  public List<FintoItem> getOntologyTerms() {
    return ontologyTerms;
  }
  public void setOntologyTerms(List<FintoItem> ontologyTerms) {
    this.ontologyTerms = ontologyTerms;
  }

  /**
   * List of target groups.
   **/
  public StatutoryDescription targetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of target groups.")
  public List<FintoItem> getTargetGroups() {
    return targetGroups;
  }
  public void setTargetGroups(List<FintoItem> targetGroups) {
    this.targetGroups = targetGroups;
  }

  /**
   * List of life events.
   **/
  public StatutoryDescription lifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of life events.")
  public List<FintoItem> getLifeEvents() {
    return lifeEvents;
  }
  public void setLifeEvents(List<FintoItem> lifeEvents) {
    this.lifeEvents = lifeEvents;
  }

  /**
   * List of industrial classes.
   **/
  public StatutoryDescription industrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of industrial classes.")
  public List<FintoItem> getIndustrialClasses() {
    return industrialClasses;
  }
  public void setIndustrialClasses(List<FintoItem> industrialClasses) {
    this.industrialClasses = industrialClasses;
  }

  /**
   * Localized service usage requirements (description of requirement).
   **/
  public StatutoryDescription requirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized service usage requirements (description of requirement).")
  public List<LanguageItem> getRequirements() {
    return requirements;
  }
  public void setRequirements(List<LanguageItem> requirements) {
    this.requirements = requirements;
  }

  /**
   * Service type. Possible values are: Service, Notice, Registration or Permission.
   **/
  public StatutoryDescription type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service type. Possible values are: Service, Notice, Registration or Permission.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Service charge type. Possible values are: Charged, Free or Other
   **/
  public StatutoryDescription serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service charge type. Possible values are: Charged, Free or Other")
  public String getServiceChargeType() {
    return serviceChargeType;
  }
  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  /**
   * Laws that a general description is based on.
   **/
  public StatutoryDescription legislation(List<Law> legislation) {
    this.legislation = legislation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Laws that a general description is based on.")
  public List<Law> getLegislation() {
    return legislation;
  }
  public void setLegislation(List<Law> legislation) {
    this.legislation = legislation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatutoryDescription statutoryDescription = (StatutoryDescription) o;
    return Objects.equals(id, statutoryDescription.id) &&
        Objects.equals(names, statutoryDescription.names) &&
        Objects.equals(descriptions, statutoryDescription.descriptions) &&
        Objects.equals(languages, statutoryDescription.languages) &&
        Objects.equals(serviceClasses, statutoryDescription.serviceClasses) &&
        Objects.equals(ontologyTerms, statutoryDescription.ontologyTerms) &&
        Objects.equals(targetGroups, statutoryDescription.targetGroups) &&
        Objects.equals(lifeEvents, statutoryDescription.lifeEvents) &&
        Objects.equals(industrialClasses, statutoryDescription.industrialClasses) &&
        Objects.equals(requirements, statutoryDescription.requirements) &&
        Objects.equals(type, statutoryDescription.type) &&
        Objects.equals(serviceChargeType, statutoryDescription.serviceChargeType) &&
        Objects.equals(legislation, statutoryDescription.legislation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents, industrialClasses, requirements, type, serviceChargeType, legislation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatutoryDescription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    serviceClasses: ").append(toIndentedString(serviceClasses)).append("\n");
    sb.append("    ontologyTerms: ").append(toIndentedString(ontologyTerms)).append("\n");
    sb.append("    targetGroups: ").append(toIndentedString(targetGroups)).append("\n");
    sb.append("    lifeEvents: ").append(toIndentedString(lifeEvents)).append("\n");
    sb.append("    industrialClasses: ").append(toIndentedString(industrialClasses)).append("\n");
    sb.append("    requirements: ").append(toIndentedString(requirements)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    legislation: ").append(toIndentedString(legislation)).append("\n");
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
