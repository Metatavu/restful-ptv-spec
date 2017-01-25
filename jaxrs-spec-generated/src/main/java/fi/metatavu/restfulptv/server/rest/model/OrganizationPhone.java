package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class OrganizationPhone   {
  
  private String prefixNumber = null;
  private String number = null;
  private String type = null;
  private String chargeType = null;
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();

  /**
   **/
  public OrganizationPhone prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPrefixNumber() {
    return prefixNumber;
  }
  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  /**
   **/
  public OrganizationPhone number(String number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   **/
  public OrganizationPhone type(String type) {
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

  /**
   **/
  public OrganizationPhone chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getChargeType() {
    return chargeType;
  }
  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  /**
   **/
  public OrganizationPhone descriptions(List<LocalizedListItem> descriptions) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPhone organizationPhone = (OrganizationPhone) o;
    return Objects.equals(prefixNumber, organizationPhone.prefixNumber) &&
        Objects.equals(number, organizationPhone.number) &&
        Objects.equals(type, organizationPhone.type) &&
        Objects.equals(chargeType, organizationPhone.chargeType) &&
        Objects.equals(descriptions, organizationPhone.descriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefixNumber, number, type, chargeType, descriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPhone {\n");
    
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
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
