package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.LanguageItem;
import fi.metatavu.restfulptv.server.rest.model.Municipality;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Address   {
  
  private String latitude = null;
  private String longitude = null;
  private String coordinateState = null;
  private String type = null;
  private String postOfficeBox = null;
  private String postalCode = null;
  private List<LanguageItem> postOffice = new ArrayList<LanguageItem>();
  private List<LanguageItem> streetAddress = new ArrayList<LanguageItem>();
  private String streetNumber = null;
  private Municipality municipality = null;
  private String country = null;
  private List<LanguageItem> additionalInformations = new ArrayList<LanguageItem>();

  /**
   * Service location latitude coordinate.
   **/
  public Address latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service location latitude coordinate.")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   * Service location longitude coordinate.
   **/
  public Address longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Service location longitude coordinate.")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  /**
   * State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived or WrongFormatReceived.
   **/
  public Address coordinateState(String coordinateState) {
    this.coordinateState = coordinateState;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "State of coordinates. Coordinates are fetched from a service provided by Maanmittauslaitos (WFS).  Possible values are: Loading, Ok, Failed, NotReceived, EmptyInputReceived, MultipleResultsReceived or WrongFormatReceived.")
  public String getCoordinateState() {
    return coordinateState;
  }
  public void setCoordinateState(String coordinateState) {
    this.coordinateState = coordinateState;
  }

  /**
   * Address type, Visiting or Postal.
   **/
  public Address type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Address type, Visiting or Postal.")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Post office box like PL 310
   **/
  public Address postOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Post office box like PL 310")
  public String getPostOfficeBox() {
    return postOfficeBox;
  }
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }

  /**
   * Postal code, for example 00010.
   **/
  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Postal code, for example 00010.")
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * List of localized Post offices, for example Helsinki, Helsingfors.
   **/
  public Address postOffice(List<LanguageItem> postOffice) {
    this.postOffice = postOffice;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized Post offices, for example Helsinki, Helsingfors.")
  public List<LanguageItem> getPostOffice() {
    return postOffice;
  }
  public void setPostOffice(List<LanguageItem> postOffice) {
    this.postOffice = postOffice;
  }

  /**
   * List of localized street addresses.
   **/
  public Address streetAddress(List<LanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "List of localized street addresses.")
  public List<LanguageItem> getStreetAddress() {
    return streetAddress;
  }
  public void setStreetAddress(List<LanguageItem> streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
   * Street number for street address.
   **/
  public Address streetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Street number for street address.")
  public String getStreetNumber() {
    return streetNumber;
  }
  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  /**
   **/
  public Address municipality(Municipality municipality) {
    this.municipality = municipality;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Municipality getMunicipality() {
    return municipality;
  }
  public void setMunicipality(Municipality municipality) {
    this.municipality = municipality;
  }

  /**
   * Country code (ISO 3166-1 alpha-2), for example FI.
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Country code (ISO 3166-1 alpha-2), for example FI.")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * Localized list of additional information about the address.
   **/
  public Address additionalInformations(List<LanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "Localized list of additional information about the address.")
  public List<LanguageItem> getAdditionalInformations() {
    return additionalInformations;
  }
  public void setAdditionalInformations(List<LanguageItem> additionalInformations) {
    this.additionalInformations = additionalInformations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(latitude, address.latitude) &&
        Objects.equals(longitude, address.longitude) &&
        Objects.equals(coordinateState, address.coordinateState) &&
        Objects.equals(type, address.type) &&
        Objects.equals(postOfficeBox, address.postOfficeBox) &&
        Objects.equals(postalCode, address.postalCode) &&
        Objects.equals(postOffice, address.postOffice) &&
        Objects.equals(streetAddress, address.streetAddress) &&
        Objects.equals(streetNumber, address.streetNumber) &&
        Objects.equals(municipality, address.municipality) &&
        Objects.equals(country, address.country) &&
        Objects.equals(additionalInformations, address.additionalInformations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, coordinateState, type, postOfficeBox, postalCode, postOffice, streetAddress, streetNumber, municipality, country, additionalInformations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateState: ").append(toIndentedString(coordinateState)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    postOfficeBox: ").append(toIndentedString(postOfficeBox)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    postOffice: ").append(toIndentedString(postOffice)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    additionalInformations: ").append(toIndentedString(additionalInformations)).append("\n");
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
