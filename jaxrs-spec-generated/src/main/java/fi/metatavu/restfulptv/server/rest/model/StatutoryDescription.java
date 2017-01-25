package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.FintoItem;
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

  /**
   **/
  public StatutoryDescription id(String id) {
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
  public StatutoryDescription names(List<LocalizedListItem> names) {
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
  public StatutoryDescription descriptions(List<LocalizedListItem> descriptions) {
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
  public StatutoryDescription languages(List<String> languages) {
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
  public StatutoryDescription serviceClasses(List<FintoItem> serviceClasses) {
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
  public StatutoryDescription ontologyTerms(List<FintoItem> ontologyTerms) {
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
  public StatutoryDescription targetGroups(List<FintoItem> targetGroups) {
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
  public StatutoryDescription lifeEvents(List<FintoItem> lifeEvents) {
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
        Objects.equals(lifeEvents, statutoryDescription.lifeEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, names, descriptions, languages, serviceClasses, ontologyTerms, targetGroups, lifeEvents);
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
