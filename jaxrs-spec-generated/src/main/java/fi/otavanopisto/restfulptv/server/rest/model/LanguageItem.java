package fi.otavanopisto.restfulptv.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class LanguageItem   {
  
  private String value = null;
  private String language = null;

  /**
   **/
  public LanguageItem value(String value) {
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

  /**
   **/
  public LanguageItem language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageItem languageItem = (LanguageItem) o;
    return Objects.equals(value, languageItem.value) &&
        Objects.equals(language, languageItem.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageItem {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
