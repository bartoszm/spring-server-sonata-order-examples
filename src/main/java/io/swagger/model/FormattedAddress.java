package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.RelatedPlaceReforValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions.
 */
@ApiModel(description = "A type of Address that has discrete fields for each type of boundary or identifier with the exception of street and more specific location details, which are combined into a maximum of two strings based on local postal addressing conventions.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class FormattedAddress extends RelatedPlaceReforValue  {
  @JsonProperty("addrLine1")
  private String addrLine1 = null;

  @JsonProperty("addrLine2")
  private String addrLine2 = null;

  @JsonProperty("locality")
  private String locality = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("stateOrProvince")
  private String stateOrProvince = null;

  @JsonProperty("postcode")
  private String postcode = null;

  @JsonProperty("postcodeExtension")
  private String postcodeExtension = null;

  @JsonProperty("country")
  private String country = null;

  public FormattedAddress addrLine1(String addrLine1) {
    this.addrLine1 = addrLine1;
    return this;
  }

  /**
   * The first address line in a formatted address
   * @return addrLine1
  **/
  @ApiModelProperty(required = true, value = "The first address line in a formatted address")
  @NotNull


  public String getAddrLine1() {
    return addrLine1;
  }

  public void setAddrLine1(String addrLine1) {
    this.addrLine1 = addrLine1;
  }

  public FormattedAddress addrLine2(String addrLine2) {
    this.addrLine2 = addrLine2;
    return this;
  }

  /**
   * The second address line in a formatted address
   * @return addrLine2
  **/
  @ApiModelProperty(value = "The second address line in a formatted address")


  public String getAddrLine2() {
    return addrLine2;
  }

  public void setAddrLine2(String addrLine2) {
    this.addrLine2 = addrLine2;
  }

  public FormattedAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature
   * @return locality
  **/
  @ApiModelProperty(value = "An area of defined or undefined boundaries within a local authority or other legislatively defined area, usually rural or semi rural in nature")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public FormattedAddress city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The city that the address is in
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city that the address is in")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public FormattedAddress stateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
    return this;
  }

  /**
   * The State or Province that the address is in
   * @return stateOrProvince
  **/
  @ApiModelProperty(required = true, value = "The State or Province that the address is in")
  @NotNull


  public String getStateOrProvince() {
    return stateOrProvince;
  }

  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }

  public FormattedAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as ZIP code)
   * @return postcode
  **/
  @ApiModelProperty(required = true, value = "Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as ZIP code)")
  @NotNull


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public FormattedAddress postcodeExtension(String postcodeExtension) {
    this.postcodeExtension = postcodeExtension;
    return this;
  }

  /**
   * An extension of a postal code. E.g. the part following the dash in an American urban property address
   * @return postcodeExtension
  **/
  @ApiModelProperty(value = "An extension of a postal code. E.g. the part following the dash in an American urban property address")


  public String getPostcodeExtension() {
    return postcodeExtension;
  }

  public void setPostcodeExtension(String postcodeExtension) {
    this.postcodeExtension = postcodeExtension;
  }

  public FormattedAddress country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country that the address is in
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country that the address is in")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormattedAddress formattedAddress = (FormattedAddress) o;
    return Objects.equals(this.addrLine1, formattedAddress.addrLine1) &&
        Objects.equals(this.addrLine2, formattedAddress.addrLine2) &&
        Objects.equals(this.locality, formattedAddress.locality) &&
        Objects.equals(this.city, formattedAddress.city) &&
        Objects.equals(this.stateOrProvince, formattedAddress.stateOrProvince) &&
        Objects.equals(this.postcode, formattedAddress.postcode) &&
        Objects.equals(this.postcodeExtension, formattedAddress.postcodeExtension) &&
        Objects.equals(this.country, formattedAddress.country) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrLine1, addrLine2, locality, city, stateOrProvince, postcode, postcodeExtension, country, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormattedAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    addrLine1: ").append(toIndentedString(addrLine1)).append("\n");
    sb.append("    addrLine2: ").append(toIndentedString(addrLine2)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    postcodeExtension: ").append(toIndentedString(postcodeExtension)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

