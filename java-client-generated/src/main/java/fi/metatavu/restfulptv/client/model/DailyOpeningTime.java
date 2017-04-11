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
 * DailyOpeningTime
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-11T06:15:07.772+03:00")
public class DailyOpeningTime   {
  @JsonProperty("dayFrom")
  private String dayFrom = null;

  @JsonProperty("dayTo")
  private String dayTo = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("isExtra")
  private Boolean isExtra = null;

  public DailyOpeningTime dayFrom(String dayFrom) {
    this.dayFrom = dayFrom;
    return this;
  }

   /**
   * Starts from weekday (e.g. Monday).
   * @return dayFrom
  **/
  @ApiModelProperty(example = "null", value = "Starts from weekday (e.g. Monday).")
  public String getDayFrom() {
    return dayFrom;
  }

  public void setDayFrom(String dayFrom) {
    this.dayFrom = dayFrom;
  }

  public DailyOpeningTime dayTo(String dayTo) {
    this.dayTo = dayTo;
    return this;
  }

   /**
   * Ends to weekday (e.g. Monday).
   * @return dayTo
  **/
  @ApiModelProperty(example = "null", value = "Ends to weekday (e.g. Monday).")
  public String getDayTo() {
    return dayTo;
  }

  public void setDayTo(String dayTo) {
    this.dayTo = dayTo;
  }

  public DailyOpeningTime from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Start time for example 10:00.
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "Start time for example 10:00.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public DailyOpeningTime to(String to) {
    this.to = to;
    return this;
  }

   /**
   * End time for example 20:00.
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "End time for example 20:00.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public DailyOpeningTime isExtra(Boolean isExtra) {
    this.isExtra = isExtra;
    return this;
  }

   /**
   * Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.
   * @return isExtra
  **/
  @ApiModelProperty(example = "null", value = "Set to true to have extra time for a day. Enables to have open times like 10:00-14:00 and also on the same day 16:00-20:00. So the latter time is extra time.")
  public Boolean getIsExtra() {
    return isExtra;
  }

  public void setIsExtra(Boolean isExtra) {
    this.isExtra = isExtra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyOpeningTime dailyOpeningTime = (DailyOpeningTime) o;
    return Objects.equals(this.dayFrom, dailyOpeningTime.dayFrom) &&
        Objects.equals(this.dayTo, dailyOpeningTime.dayTo) &&
        Objects.equals(this.from, dailyOpeningTime.from) &&
        Objects.equals(this.to, dailyOpeningTime.to) &&
        Objects.equals(this.isExtra, dailyOpeningTime.isExtra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayFrom, dayTo, from, to, isExtra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyOpeningTime {\n");
    
    sb.append("    dayFrom: ").append(toIndentedString(dayFrom)).append("\n");
    sb.append("    dayTo: ").append(toIndentedString(dayTo)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    isExtra: ").append(toIndentedString(isExtra)).append("\n");
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

