/**
 * RESTful PTV
 * Restful way to use Palvelutietovaranto.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.metatavu.restfulptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Phone
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T07:23:02.844+03:00")
public class Phone   {
  @JsonProperty("additionalInformation")
  private String additionalInformation = null;

  @JsonProperty("serviceChargeType")
  private String serviceChargeType = null;

  @JsonProperty("chargeDescription")
  private String chargeDescription = null;

  @JsonProperty("prefixNumber")
  private String prefixNumber = null;

  @JsonProperty("isFinnishServiceNumber")
  private Boolean isFinnishServiceNumber = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("type")
  private String type = null;

  public Phone additionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(String additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public Phone serviceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
    return this;
  }

   /**
   * Get serviceChargeType
   * @return serviceChargeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChargeType() {
    return serviceChargeType;
  }

  public void setServiceChargeType(String serviceChargeType) {
    this.serviceChargeType = serviceChargeType;
  }

  public Phone chargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
    return this;
  }

   /**
   * Get chargeDescription
   * @return chargeDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChargeDescription() {
    return chargeDescription;
  }

  public void setChargeDescription(String chargeDescription) {
    this.chargeDescription = chargeDescription;
  }

  public Phone prefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
    return this;
  }

   /**
   * Get prefixNumber
   * @return prefixNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPrefixNumber() {
    return prefixNumber;
  }

  public void setPrefixNumber(String prefixNumber) {
    this.prefixNumber = prefixNumber;
  }

  public Phone isFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
    return this;
  }

   /**
   * Get isFinnishServiceNumber
   * @return isFinnishServiceNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIsFinnishServiceNumber() {
    return isFinnishServiceNumber;
  }

  public void setIsFinnishServiceNumber(Boolean isFinnishServiceNumber) {
    this.isFinnishServiceNumber = isFinnishServiceNumber;
  }

  public Phone number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Phone language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Phone type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Phone phone = (Phone) o;
    return Objects.equals(this.additionalInformation, phone.additionalInformation) &&
        Objects.equals(this.serviceChargeType, phone.serviceChargeType) &&
        Objects.equals(this.chargeDescription, phone.chargeDescription) &&
        Objects.equals(this.prefixNumber, phone.prefixNumber) &&
        Objects.equals(this.isFinnishServiceNumber, phone.isFinnishServiceNumber) &&
        Objects.equals(this.number, phone.number) &&
        Objects.equals(this.language, phone.language) &&
        Objects.equals(this.type, phone.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInformation, serviceChargeType, chargeDescription, prefixNumber, isFinnishServiceNumber, number, language, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Phone {\n");
    
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    serviceChargeType: ").append(toIndentedString(serviceChargeType)).append("\n");
    sb.append("    chargeDescription: ").append(toIndentedString(chargeDescription)).append("\n");
    sb.append("    prefixNumber: ").append(toIndentedString(prefixNumber)).append("\n");
    sb.append("    isFinnishServiceNumber: ").append(toIndentedString(isFinnishServiceNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

