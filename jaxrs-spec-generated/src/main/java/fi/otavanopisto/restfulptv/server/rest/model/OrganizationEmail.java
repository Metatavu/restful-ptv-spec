package fi.otavanopisto.restfulptv.server.rest.model;

import fi.otavanopisto.restfulptv.server.rest.model.LanguageItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class OrganizationEmail   {
  
  private String email = null;
  private List<LanguageItem> descriptions = new ArrayList<LanguageItem>();

  /**
   **/
  public OrganizationEmail email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public OrganizationEmail descriptions(List<LanguageItem> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getDescriptions() {
    return descriptions;
  }
  public void setDescriptions(List<LanguageItem> descriptions) {
    this.descriptions = descriptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationEmail organizationEmail = (OrganizationEmail) o;
    return Objects.equals(email, organizationEmail.email) &&
        Objects.equals(descriptions, organizationEmail.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, descriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationEmail {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
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
