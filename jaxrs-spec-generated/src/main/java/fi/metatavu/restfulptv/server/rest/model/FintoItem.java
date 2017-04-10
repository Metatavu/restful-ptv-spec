package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class FintoItem   {
  
  private List<LanguageItem> names = new ArrayList<LanguageItem>();
  private String code = null;
  private String ontologyType = null;
  private String uri = null;
  private String parentId = null;
  private String parentUri = null;

  /**
   **/
  public FintoItem names(List<LanguageItem> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getNames() {
    return names;
  }
  public void setNames(List<LanguageItem> names) {
    this.names = names;
  }

  /**
   **/
  public FintoItem code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public FintoItem ontologyType(String ontologyType) {
    this.ontologyType = ontologyType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOntologyType() {
    return ontologyType;
  }
  public void setOntologyType(String ontologyType) {
    this.ontologyType = ontologyType;
  }

  /**
   **/
  public FintoItem uri(String uri) {
    this.uri = uri;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  /**
   **/
  public FintoItem parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   **/
  public FintoItem parentUri(String parentUri) {
    this.parentUri = parentUri;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getParentUri() {
    return parentUri;
  }
  public void setParentUri(String parentUri) {
    this.parentUri = parentUri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FintoItem fintoItem = (FintoItem) o;
    return Objects.equals(names, fintoItem.names) &&
        Objects.equals(code, fintoItem.code) &&
        Objects.equals(ontologyType, fintoItem.ontologyType) &&
        Objects.equals(uri, fintoItem.uri) &&
        Objects.equals(parentId, fintoItem.parentId) &&
        Objects.equals(parentUri, fintoItem.parentUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, code, ontologyType, uri, parentId, parentUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FintoItem {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    ontologyType: ").append(toIndentedString(ontologyType)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentUri: ").append(toIndentedString(parentUri)).append("\n");
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
