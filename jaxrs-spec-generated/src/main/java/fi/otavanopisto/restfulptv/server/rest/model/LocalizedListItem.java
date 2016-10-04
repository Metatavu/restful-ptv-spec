package fi.otavanopisto.restfulptv.server.rest.model;




import io.swagger.annotations.*;
import java.util.Objects;


public class LocalizedListItem   {
  
  private String language = null;
  private String value = null;
  private String type = null;

  /**
   * Language code.
   **/
  public LocalizedListItem language(String language) {
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
  public LocalizedListItem value(String value) {
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
  public LocalizedListItem type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalizedListItem localizedListItem = (LocalizedListItem) o;
    return Objects.equals(language, localizedListItem.language) &&
        Objects.equals(value, localizedListItem.value) &&
        Objects.equals(type, localizedListItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, value, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalizedListItem {\n");
    
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
