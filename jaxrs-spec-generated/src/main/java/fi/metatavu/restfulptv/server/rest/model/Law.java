package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;


/**
 * a Law
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "a Law")

public class Law   {
  
  private List<LanguageItem> names = new ArrayList<LanguageItem>();
  private List<WebPage> webPages = new ArrayList<WebPage>();

  /**
   **/
  public Law names(List<LanguageItem> names) {
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
   * List of localized web page urls.
   **/
  public Law webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized web page urls.")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Law law = (Law) o;
    return Objects.equals(names, law.names) &&
        Objects.equals(webPages, law.webPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, webPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Law {\n");
    
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
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
