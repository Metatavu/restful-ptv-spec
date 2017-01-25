package fi.metatavu.restfulptv.server.rest.model;

import fi.metatavu.restfulptv.server.rest.model.Address;
import fi.metatavu.restfulptv.server.rest.model.LocalizedListItem;
import fi.metatavu.restfulptv.server.rest.model.OrganizationEmail;
import fi.metatavu.restfulptv.server.rest.model.OrganizationPhone;
import fi.metatavu.restfulptv.server.rest.model.WebPage;
import java.util.ArrayList;
import java.util.List;



import io.swagger.annotations.*;
import java.util.Objects;


public class Organization   {
  
  private String id = null;
  private List<LocalizedListItem> descriptions = new ArrayList<LocalizedListItem>();
  private String parentOrganization = null;
  private List<OrganizationEmail> emailAddresses = new ArrayList<OrganizationEmail>();
  private List<OrganizationPhone> phoneNumbers = new ArrayList<OrganizationPhone>();
  private List<WebPage> webPages = new ArrayList<WebPage>();
  private List<Address> addresses = new ArrayList<Address>();
  private String municipality = null;
  private String type = null;
  private String businessCode = null;
  private String businessName = null;
  private List<LocalizedListItem> names = new ArrayList<LocalizedListItem>();
  private String publishingStatus = null;
  private String displayNameType = null;
  private String oid = null;
  private Boolean streetAddressAsPostalAddress = null;

  /**
   **/
  public Organization id(String id) {
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
  public Organization descriptions(List<LocalizedListItem> descriptions) {
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

  /**
   **/
  public Organization parentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getParentOrganization() {
    return parentOrganization;
  }
  public void setParentOrganization(String parentOrganization) {
    this.parentOrganization = parentOrganization;
  }

  /**
   **/
  public Organization emailAddresses(List<OrganizationEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OrganizationEmail> getEmailAddresses() {
    return emailAddresses;
  }
  public void setEmailAddresses(List<OrganizationEmail> emailAddresses) {
    this.emailAddresses = emailAddresses;
  }

  /**
   **/
  public Organization phoneNumbers(List<OrganizationPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<OrganizationPhone> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<OrganizationPhone> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  /**
   **/
  public Organization webPages(List<WebPage> webPages) {
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
  public Organization addresses(List<Address> addresses) {
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
  public Organization municipality(String municipality) {
    this.municipality = municipality;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getMunicipality() {
    return municipality;
  }
  public void setMunicipality(String municipality) {
    this.municipality = municipality;
  }

  /**
   **/
  public Organization type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Organization businessCode(String businessCode) {
    this.businessCode = businessCode;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBusinessCode() {
    return businessCode;
  }
  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  /**
   **/
  public Organization businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   **/
  public Organization names(List<LocalizedListItem> names) {
    this.names = names;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public List<LocalizedListItem> getNames() {
    return names;
  }
  public void setNames(List<LocalizedListItem> names) {
    this.names = names;
  }

  /**
   **/
  public Organization publishingStatus(String publishingStatus) {
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

  /**
   **/
  public Organization displayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayNameType() {
    return displayNameType;
  }
  public void setDisplayNameType(String displayNameType) {
    this.displayNameType = displayNameType;
  }

  /**
   **/
  public Organization oid(String oid) {
    this.oid = oid;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public String getOid() {
    return oid;
  }
  public void setOid(String oid) {
    this.oid = oid;
  }

  /**
   **/
  public Organization streetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
    return this;
  }

  
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStreetAddressAsPostalAddress() {
    return streetAddressAsPostalAddress;
  }
  public void setStreetAddressAsPostalAddress(Boolean streetAddressAsPostalAddress) {
    this.streetAddressAsPostalAddress = streetAddressAsPostalAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(id, organization.id) &&
        Objects.equals(descriptions, organization.descriptions) &&
        Objects.equals(parentOrganization, organization.parentOrganization) &&
        Objects.equals(emailAddresses, organization.emailAddresses) &&
        Objects.equals(phoneNumbers, organization.phoneNumbers) &&
        Objects.equals(webPages, organization.webPages) &&
        Objects.equals(addresses, organization.addresses) &&
        Objects.equals(municipality, organization.municipality) &&
        Objects.equals(type, organization.type) &&
        Objects.equals(businessCode, organization.businessCode) &&
        Objects.equals(businessName, organization.businessName) &&
        Objects.equals(names, organization.names) &&
        Objects.equals(publishingStatus, organization.publishingStatus) &&
        Objects.equals(displayNameType, organization.displayNameType) &&
        Objects.equals(oid, organization.oid) &&
        Objects.equals(streetAddressAsPostalAddress, organization.streetAddressAsPostalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, descriptions, parentOrganization, emailAddresses, phoneNumbers, webPages, addresses, municipality, type, businessCode, businessName, names, publishingStatus, displayNameType, oid, streetAddressAsPostalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    parentOrganization: ").append(toIndentedString(parentOrganization)).append("\n");
    sb.append("    emailAddresses: ").append(toIndentedString(emailAddresses)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    municipality: ").append(toIndentedString(municipality)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
    sb.append("    displayNameType: ").append(toIndentedString(displayNameType)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    streetAddressAsPostalAddress: ").append(toIndentedString(streetAddressAsPostalAddress)).append("\n");
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
