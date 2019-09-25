package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contact allow to capture contact information. It is used to capture billing account contact information
 */
@ApiModel(description = "Contact allow to capture contact information. It is used to capture billing account contact information")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class Contact   {
  @JsonProperty("contactName")
  private String contactName = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("phoneNumberExtension")
  private String phoneNumberExtension = null;

  @JsonProperty("emailAdress")
  private String emailAdress = null;

  @JsonProperty("streetAdress")
  private String streetAdress = null;

  public Contact contactName(String contactName) {
    this.contactName = contactName;
    return this;
  }

  /**
   * Identifies the name of the person or office to be contacted on billing matters.
   * @return contactName
  **/
  @ApiModelProperty(required = true, value = "Identifies the name of the person or office to be contacted on billing matters.")
  @NotNull


  public String getContactName() {
    return contactName;
  }

  public void setContactName(String contactName) {
    this.contactName = contactName;
  }

  public Contact referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * Technical attribut to extend API
   * @return referredType
  **/
  @ApiModelProperty(value = "Technical attribut to extend API")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }

  public Contact phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Identifies the telephone number (excluding extension) of the billing contact
   * @return phoneNumber
  **/
  @ApiModelProperty(required = true, value = "Identifies the telephone number (excluding extension) of the billing contact")
  @NotNull


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Contact phoneNumberExtension(String phoneNumberExtension) {
    this.phoneNumberExtension = phoneNumberExtension;
    return this;
  }

  /**
   * Identifies the telephone number extension of the billing contact
   * @return phoneNumberExtension
  **/
  @ApiModelProperty(value = "Identifies the telephone number extension of the billing contact")


  public String getPhoneNumberExtension() {
    return phoneNumberExtension;
  }

  public void setPhoneNumberExtension(String phoneNumberExtension) {
    this.phoneNumberExtension = phoneNumberExtension;
  }

  public Contact emailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
    return this;
  }

  /**
   * Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.
   * @return emailAdress
  **/
  @ApiModelProperty(required = true, value = "Identifies the electronic mail address of the Billing Contact when a Buyer profile does not already exist.")
  @NotNull


  public String getEmailAdress() {
    return emailAdress;
  }

  public void setEmailAdress(String emailAdress) {
    this.emailAdress = emailAdress;
  }

  public Contact streetAdress(String streetAdress) {
    this.streetAdress = streetAdress;
    return this;
  }

  /**
   * Identifies the address of the person or office to be contacted on billing matters.
   * @return streetAdress
  **/
  @ApiModelProperty(required = true, value = "Identifies the address of the person or office to be contacted on billing matters.")
  @NotNull


  public String getStreetAdress() {
    return streetAdress;
  }

  public void setStreetAdress(String streetAdress) {
    this.streetAdress = streetAdress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactName, contact.contactName) &&
        Objects.equals(this.referredType, contact.referredType) &&
        Objects.equals(this.phoneNumber, contact.phoneNumber) &&
        Objects.equals(this.phoneNumberExtension, contact.phoneNumberExtension) &&
        Objects.equals(this.emailAdress, contact.emailAdress) &&
        Objects.equals(this.streetAdress, contact.streetAdress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactName, referredType, phoneNumber, phoneNumberExtension, emailAdress, streetAdress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    phoneNumberExtension: ").append(toIndentedString(phoneNumberExtension)).append("\n");
    sb.append("    emailAdress: ").append(toIndentedString(emailAdress)).append("\n");
    sb.append("    streetAdress: ").append(toIndentedString(streetAdress)).append("\n");
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

