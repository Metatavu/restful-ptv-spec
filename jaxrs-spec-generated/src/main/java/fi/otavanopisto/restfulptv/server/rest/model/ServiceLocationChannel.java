package fi.otavanopisto.restfulptv.server.rest.model;

import fi.otavanopisto.restfulptv.server.rest.model.Address;
import fi.otavanopisto.restfulptv.server.rest.model.LanguageItem;
import fi.otavanopisto.restfulptv.server.rest.model.LocalizedListItem;
import fi.otavanopisto.restfulptv.server.rest.model.ServiceHour;
import fi.otavanopisto.restfulptv.server.rest.model.Support;
import fi.otavanopisto.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class ServiceLocationChannel   {
  
  private String id = null;
  private String serviceChannelType = null;
  private String organizationId = null;
  private List<LocalizedListItem> serviceChannelNames = new ArrayList<LocalizedListItem>();
  private List<LocalizedListItem> serviceChannelDescriptions = new ArrayList<LocalizedListItem>();
  private Boolean serviceAreaRestricted = null;
  private List<Support> supportContacts = new ArrayList<Support>();
  private String email = null;
  private String phone = null;
  private List<String> languages = new ArrayList<String>();
  private String fax = null;
  private String latitude = null;
  private String longitude = null;
  private String coordinateSystem = null;
  private Boolean coordinatesSetManually = null;
  private Boolean phoneServiceCharge = null;
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<String> serviceAreas = new ArrayList<String>();
  private List<LanguageItem> phoneChargeDescriptions = new ArrayList<LanguageItem>();
  private List<Address> addresses = new ArrayList<Address>();
  private List<String> serviceChargeTypes = new ArrayList<String>();
  private List<ServiceHour> serviceHours = new ArrayList<ServiceHour>();
  private String publishingStatus = null;

  /**
   **/
  public ServiceLocationChannel id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public ServiceLocationChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }
  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  /**
   **/
  public ServiceLocationChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  /**
   **/
  public ServiceLocationChannel serviceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }
  public void setServiceChannelNames(List<LocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  /**
   **/
  public ServiceLocationChannel serviceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }
  public void setServiceChannelDescriptions(List<LocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  /**
   **/
  public ServiceLocationChannel serviceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getServiceAreaRestricted() {
    return serviceAreaRestricted;
  }
  public void setServiceAreaRestricted(Boolean serviceAreaRestricted) {
    this.serviceAreaRestricted = serviceAreaRestricted;
  }

  /**
   **/
  public ServiceLocationChannel supportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Support> getSupportContacts() {
    return supportContacts;
  }
  public void setSupportContacts(List<Support> supportContacts) {
    this.supportContacts = supportContacts;
  }

  /**
   **/
  public ServiceLocationChannel email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   **/
  public ServiceLocationChannel phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  public ServiceLocationChannel languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getLanguages() {
    return languages;
  }
  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  /**
   **/
  public ServiceLocationChannel fax(String fax) {
    this.fax = fax;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }

  /**
   **/
  public ServiceLocationChannel latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  /**
   **/
  public ServiceLocationChannel longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  /**
   **/
  public ServiceLocationChannel coordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getCoordinateSystem() {
    return coordinateSystem;
  }
  public void setCoordinateSystem(String coordinateSystem) {
    this.coordinateSystem = coordinateSystem;
  }

  /**
   **/
  public ServiceLocationChannel coordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCoordinatesSetManually() {
    return coordinatesSetManually;
  }
  public void setCoordinatesSetManually(Boolean coordinatesSetManually) {
    this.coordinatesSetManually = coordinatesSetManually;
  }

  /**
   **/
  public ServiceLocationChannel phoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPhoneServiceCharge() {
    return phoneServiceCharge;
  }
  public void setPhoneServiceCharge(Boolean phoneServiceCharge) {
    this.phoneServiceCharge = phoneServiceCharge;
  }

  /**
   **/
  public ServiceLocationChannel webPages(List<WebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<WebPage> getWebPages() {
    return webPages;
  }
  public void setWebPages(List<WebPage> webPages) {
    this.webPages = webPages;
  }

  /**
   **/
  public ServiceLocationChannel serviceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceAreas() {
    return serviceAreas;
  }
  public void setServiceAreas(List<String> serviceAreas) {
    this.serviceAreas = serviceAreas;
  }

  /**
   **/
  public ServiceLocationChannel phoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LanguageItem> getPhoneChargeDescriptions() {
    return phoneChargeDescriptions;
  }
  public void setPhoneChargeDescriptions(List<LanguageItem> phoneChargeDescriptions) {
    this.phoneChargeDescriptions = phoneChargeDescriptions;
  }

  /**
   **/
  public ServiceLocationChannel addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<Address> getAddresses() {
    return addresses;
  }
  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  /**
   **/
  public ServiceLocationChannel serviceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<String> getServiceChargeTypes() {
    return serviceChargeTypes;
  }
  public void setServiceChargeTypes(List<String> serviceChargeTypes) {
    this.serviceChargeTypes = serviceChargeTypes;
  }

  /**
   **/
  public ServiceLocationChannel serviceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<ServiceHour> getServiceHours() {
    return serviceHours;
  }
  public void setServiceHours(List<ServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  /**
   **/
  public ServiceLocationChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }
  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceLocationChannel serviceLocationChannel = (ServiceLocationChannel) o;
    return Objects.equals(id, serviceLocationChannel.id) &&
        Objects.equals(serviceChannelType, serviceLocationChannel.serviceChannelType) &&
        Objects.equals(organizationId, serviceLocationChannel.organizationId) &&
        Objects.equals(serviceChannelNames, serviceLocationChannel.serviceChannelNames) &&
        Objects.equals(serviceChannelDescriptions, serviceLocationChannel.serviceChannelDescriptions) &&
        Objects.equals(serviceAreaRestricted, serviceLocationChannel.serviceAreaRestricted) &&
        Objects.equals(supportContacts, serviceLocationChannel.supportContacts) &&
        Objects.equals(email, serviceLocationChannel.email) &&
        Objects.equals(phone, serviceLocationChannel.phone) &&
        Objects.equals(languages, serviceLocationChannel.languages) &&
        Objects.equals(fax, serviceLocationChannel.fax) &&
        Objects.equals(latitude, serviceLocationChannel.latitude) &&
        Objects.equals(longitude, serviceLocationChannel.longitude) &&
        Objects.equals(coordinateSystem, serviceLocationChannel.coordinateSystem) &&
        Objects.equals(coordinatesSetManually, serviceLocationChannel.coordinatesSetManually) &&
        Objects.equals(phoneServiceCharge, serviceLocationChannel.phoneServiceCharge) &&
        Objects.equals(webPages, serviceLocationChannel.webPages) &&
        Objects.equals(serviceAreas, serviceLocationChannel.serviceAreas) &&
        Objects.equals(phoneChargeDescriptions, serviceLocationChannel.phoneChargeDescriptions) &&
        Objects.equals(addresses, serviceLocationChannel.addresses) &&
        Objects.equals(serviceChargeTypes, serviceLocationChannel.serviceChargeTypes) &&
        Objects.equals(serviceHours, serviceLocationChannel.serviceHours) &&
        Objects.equals(publishingStatus, serviceLocationChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, serviceAreaRestricted, supportContacts, email, phone, languages, fax, latitude, longitude, coordinateSystem, coordinatesSetManually, phoneServiceCharge, webPages, serviceAreas, phoneChargeDescriptions, addresses, serviceChargeTypes, serviceHours, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceLocationChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    serviceAreaRestricted: ").append(toIndentedString(serviceAreaRestricted)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    coordinateSystem: ").append(toIndentedString(coordinateSystem)).append("\n");
    sb.append("    coordinatesSetManually: ").append(toIndentedString(coordinatesSetManually)).append("\n");
    sb.append("    phoneServiceCharge: ").append(toIndentedString(phoneServiceCharge)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceAreas: ").append(toIndentedString(serviceAreas)).append("\n");
    sb.append("    phoneChargeDescriptions: ").append(toIndentedString(phoneChargeDescriptions)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    serviceChargeTypes: ").append(toIndentedString(serviceChargeTypes)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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
