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
import fi.metatavu.restfulptv.client.model.LanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * ServiceHour
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-09T18:15:52.391+02:00")
public class ServiceHour   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("exceptionHourType")
  private String exceptionHourType = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("monday")
  private Boolean monday = null;

  @JsonProperty("tuesday")
  private Boolean tuesday = null;

  @JsonProperty("wednesday")
  private Boolean wednesday = null;

  @JsonProperty("thursday")
  private Boolean thursday = null;

  @JsonProperty("friday")
  private Boolean friday = null;

  @JsonProperty("saturday")
  private Boolean saturday = null;

  @JsonProperty("sunday")
  private Boolean sunday = null;

  @JsonProperty("opens")
  private String opens = null;

  @JsonProperty("closes")
  private String closes = null;

  @JsonProperty("additionalInformation")
  private List<LanguageItem> additionalInformation = new ArrayList<LanguageItem>();

  public ServiceHour type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of service hour (Standard, Exception or Special).
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of service hour (Standard, Exception or Special).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServiceHour exceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
    return this;
  }

   /**
   * Type of service hour exception type. Valid values are: Open or Closed.
   * @return exceptionHourType
  **/
  @ApiModelProperty(example = "null", value = "Type of service hour exception type. Valid values are: Open or Closed.")
  public String getExceptionHourType() {
    return exceptionHourType;
  }

  public void setExceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
  }

  public ServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Date time where from this entry is valid.
   * @return validFrom
  **/
  @ApiModelProperty(example = "null", value = "Date time where from this entry is valid.")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public ServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Date time to this entry is valid.
   * @return validTo
  **/
  @ApiModelProperty(example = "null", value = "Date time to this entry is valid.")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public ServiceHour monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Is this service hour effective on monday.
   * @return monday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on monday.")
  public Boolean getMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public ServiceHour tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Is this service hour effective on tuesday.
   * @return tuesday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on tuesday.")
  public Boolean getTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public ServiceHour wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Is this service hour effective on wednesday.
   * @return wednesday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on wednesday.")
  public Boolean getWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public ServiceHour thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Is this service hour effective on thursday.
   * @return thursday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on thursday.")
  public Boolean getThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public ServiceHour friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Is this service hour effective on friday.
   * @return friday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on friday.")
  public Boolean getFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public ServiceHour saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Is this service hour effective on saturday.
   * @return saturday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on saturday.")
  public Boolean getSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public ServiceHour sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Is this service hour effective on sunday.
   * @return sunday
  **/
  @ApiModelProperty(example = "null", value = "Is this service hour effective on sunday.")
  public Boolean getSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public ServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

   /**
   * Opening time in format HH:mm for example 08:00.
   * @return opens
  **/
  @ApiModelProperty(example = "null", value = "Opening time in format HH:mm for example 08:00.")
  public String getOpens() {
    return opens;
  }

  public void setOpens(String opens) {
    this.opens = opens;
  }

  public ServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

   /**
   * Closing time in format HH:mm for example 19:00
   * @return closes
  **/
  @ApiModelProperty(example = "null", value = "Closing time in format HH:mm for example 19:00")
  public String getCloses() {
    return closes;
  }

  public void setCloses(String closes) {
    this.closes = closes;
  }

  public ServiceHour additionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public ServiceHour addAdditionalInformationItem(LanguageItem additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHour serviceHour = (ServiceHour) o;
    return Objects.equals(this.type, serviceHour.type) &&
        Objects.equals(this.exceptionHourType, serviceHour.exceptionHourType) &&
        Objects.equals(this.validFrom, serviceHour.validFrom) &&
        Objects.equals(this.validTo, serviceHour.validTo) &&
        Objects.equals(this.monday, serviceHour.monday) &&
        Objects.equals(this.tuesday, serviceHour.tuesday) &&
        Objects.equals(this.wednesday, serviceHour.wednesday) &&
        Objects.equals(this.thursday, serviceHour.thursday) &&
        Objects.equals(this.friday, serviceHour.friday) &&
        Objects.equals(this.saturday, serviceHour.saturday) &&
        Objects.equals(this.sunday, serviceHour.sunday) &&
        Objects.equals(this.opens, serviceHour.opens) &&
        Objects.equals(this.closes, serviceHour.closes) &&
        Objects.equals(this.additionalInformation, serviceHour.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, exceptionHourType, validFrom, validTo, monday, tuesday, wednesday, thursday, friday, saturday, sunday, opens, closes, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHour {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    exceptionHourType: ").append(toIndentedString(exceptionHourType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

