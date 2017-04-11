package fi.metatavu.restfulptv.server.rest.model;

import io.swagger.annotations.ApiModel;


/**
 * Open API web page model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;
@ApiModel(description = "Open API web page model.")

public class WebPage   {
  
  private String url = null;
  private String language = null;
  private String value = null;

  /**
   * Web page url.
   **/
  public WebPage url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Web page url.")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Language code.
   **/
  public WebPage language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "Language code.")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   **/
  public WebPage value(String value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebPage webPage = (WebPage) o;
    return Objects.equals(url, webPage.url) &&
        Objects.equals(language, webPage.language) &&
        Objects.equals(value, webPage.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, language, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
