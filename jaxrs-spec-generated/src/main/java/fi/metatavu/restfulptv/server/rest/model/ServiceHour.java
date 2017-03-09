package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceHour   {
  
  private String type = null;
  private String exceptionHourType = null;
  private OffsetDateTime validFrom = null;
  private OffsetDateTime validTo = null;
  private Boolean monday = null;
  private Boolean tuesday = null;
  private Boolean wednesday = null;
  private Boolean thursday = null;
  private Boolean friday = null;
  private Boolean saturday = null;
  private Boolean sunday = null;
  private String opens = null;
  private String closes = null;
  private List<LanguageItem> additionalInformation = new ArrayList<LanguageItem>();

  /**
   * Type of service hour (Standard, Exception or Special).
   **/
  public ServiceHour type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of service hour (Standard, Exception or Special).")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Type of service hour exception type. Valid values are: Open or Closed.
   **/
  public ServiceHour exceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Type of service hour exception type. Valid values are: Open or Closed.")
  public String getExceptionHourType() {
    return exceptionHourType;
  }
  public void setExceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
  }

  /**
   * Date time where from this entry is valid.
   **/
  public ServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date time where from this entry is valid.")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }
  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  /**
   * Date time to this entry is valid.
   **/
  public ServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Date time to this entry is valid.")
  public OffsetDateTime getValidTo() {
    return validTo;
  }
  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  /**
   * Is this service hour effective on monday.
   **/
  public ServiceHour monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on monday.")
  public Boolean getMonday() {
    return monday;
  }
  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  /**
   * Is this service hour effective on tuesday.
   **/
  public ServiceHour tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on tuesday.")
  public Boolean getTuesday() {
    return tuesday;
  }
  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  /**
   * Is this service hour effective on wednesday.
   **/
  public ServiceHour wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on wednesday.")
  public Boolean getWednesday() {
    return wednesday;
  }
  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  /**
   * Is this service hour effective on thursday.
   **/
  public ServiceHour thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on thursday.")
  public Boolean getThursday() {
    return thursday;
  }
  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  /**
   * Is this service hour effective on friday.
   **/
  public ServiceHour friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on friday.")
  public Boolean getFriday() {
    return friday;
  }
  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  /**
   * Is this service hour effective on saturday.
   **/
  public ServiceHour saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on saturday.")
  public Boolean getSaturday() {
    return saturday;
  }
  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  /**
   * Is this service hour effective on sunday.
   **/
  public ServiceHour sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Is this service hour effective on sunday.")
  public Boolean getSunday() {
    return sunday;
  }
  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  /**
   * Opening time in format HH:mm for example 08:00.
   **/
  public ServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Opening time in format HH:mm for example 08:00.")
  public String getOpens() {
    return opens;
  }
  public void setOpens(String opens) {
    this.opens = opens;
  }

  /**
   * Closing time in format HH:mm for example 19:00
   **/
  public ServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Closing time in format HH:mm for example 19:00")
  public String getCloses() {
    return closes;
  }
  public void setCloses(String closes) {
    this.closes = closes;
  }

  /**
   **/
  public ServiceHour additionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }
  public void setAdditionalInformation(List<LanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHour serviceHour = (ServiceHour) o;
    return Objects.equals(type, serviceHour.type) &&
        Objects.equals(exceptionHourType, serviceHour.exceptionHourType) &&
        Objects.equals(validFrom, serviceHour.validFrom) &&
        Objects.equals(validTo, serviceHour.validTo) &&
        Objects.equals(monday, serviceHour.monday) &&
        Objects.equals(tuesday, serviceHour.tuesday) &&
        Objects.equals(wednesday, serviceHour.wednesday) &&
        Objects.equals(thursday, serviceHour.thursday) &&
        Objects.equals(friday, serviceHour.friday) &&
        Objects.equals(saturday, serviceHour.saturday) &&
        Objects.equals(sunday, serviceHour.sunday) &&
        Objects.equals(opens, serviceHour.opens) &&
        Objects.equals(closes, serviceHour.closes) &&
        Objects.equals(additionalInformation, serviceHour.additionalInformation);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
