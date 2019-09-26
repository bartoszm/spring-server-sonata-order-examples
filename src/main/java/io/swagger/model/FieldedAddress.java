package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GeographicSubAddress;
import io.swagger.model.RelatedPlaceReforValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail.  For example  “street number” is one field, “street name” is another field, etc.
 */
@ApiModel(description = "A type of Address that has a discrete field and value for each type of boundary or identifier down to the lowest level of detail.  For example  “street number” is one field, “street name” is another field, etc.")
@Validated
public class FieldedAddress extends RelatedPlaceReforValue  {
  @JsonProperty("streetNr")
  private String streetNr = null;

  @JsonProperty("streetNrSuffix")
  private String streetNrSuffix = null;

  @JsonProperty("streetNrLast")
  private String streetNrLast = null;

  @JsonProperty("streetNrLastSuffix")
  private String streetNrLastSuffix = null;

  @JsonProperty("streetName")
  private String streetName = null;

  @JsonProperty("streetType")
  private String streetType = null;

  @JsonProperty("streetSuffix")
  private String streetSuffix = null;

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

  @JsonProperty("GeographicSubAddress")
  private GeographicSubAddress geographicSubAddress = null;

  public FieldedAddress streetNr(String streetNr) {
    this.streetNr = streetNr;
    return this;
  }

  /**
   * Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses
   * @return streetNr
  **/
  @ApiModelProperty(value = "Number identifying a specific property on a public street. It may be combined with streetNrLast for ranged addresses")


  public String getStreetNr() {
    return streetNr;
  }

  public void setStreetNr(String streetNr) {
    this.streetNr = streetNr;
  }

  public FieldedAddress streetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
    return this;
  }

  /**
   * The first street number suffix
   * @return streetNrSuffix
  **/
  @ApiModelProperty(value = "The first street number suffix")


  public String getStreetNrSuffix() {
    return streetNrSuffix;
  }

  public void setStreetNrSuffix(String streetNrSuffix) {
    this.streetNrSuffix = streetNrSuffix;
  }

  public FieldedAddress streetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
    return this;
  }

  /**
   * Last number in a range of street numbers allocated to a property
   * @return streetNrLast
  **/
  @ApiModelProperty(value = "Last number in a range of street numbers allocated to a property")


  public String getStreetNrLast() {
    return streetNrLast;
  }

  public void setStreetNrLast(String streetNrLast) {
    this.streetNrLast = streetNrLast;
  }

  public FieldedAddress streetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
    return this;
  }

  /**
   * Last street number suffix for a ranged address
   * @return streetNrLastSuffix
  **/
  @ApiModelProperty(value = "Last street number suffix for a ranged address")


  public String getStreetNrLastSuffix() {
    return streetNrLastSuffix;
  }

  public void setStreetNrLastSuffix(String streetNrLastSuffix) {
    this.streetNrLastSuffix = streetNrLastSuffix;
  }

  public FieldedAddress streetName(String streetName) {
    this.streetName = streetName;
    return this;
  }

  /**
   * Name of the street or other street type
   * @return streetName
  **/
  @ApiModelProperty(value = "Name of the street or other street type")


  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public FieldedAddress streetType(String streetType) {
    this.streetType = streetType;
    return this;
  }

  /**
   * Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
   * @return streetType
  **/
  @ApiModelProperty(required = true, value = "Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf")
  @NotNull


  public String getStreetType() {
    return streetType;
  }

  public void setStreetType(String streetType) {
    this.streetType = streetType;
  }

  public FieldedAddress streetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
    return this;
  }

  /**
   * A modifier denoting a relative direction
   * @return streetSuffix
  **/
  @ApiModelProperty(value = "A modifier denoting a relative direction")


  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public FieldedAddress locality(String locality) {
    this.locality = locality;
    return this;
  }

  /**
   * The locality that the address is in
   * @return locality
  **/
  @ApiModelProperty(value = "The locality that the address is in")


  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  public FieldedAddress city(String city) {
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

  public FieldedAddress stateOrProvince(String stateOrProvince) {
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

  public FieldedAddress postcode(String postcode) {
    this.postcode = postcode;
    return this;
  }

  /**
   * Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
   * @return postcode
  **/
  @ApiModelProperty(required = true, value = "Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)")
  @NotNull


  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public FieldedAddress postcodeExtension(String postcodeExtension) {
    this.postcodeExtension = postcodeExtension;
    return this;
  }

  /**
   * An extension of a postal code. E.g. the part following the dash in an american urban property address
   * @return postcodeExtension
  **/
  @ApiModelProperty(value = "An extension of a postal code. E.g. the part following the dash in an american urban property address")


  public String getPostcodeExtension() {
    return postcodeExtension;
  }

  public void setPostcodeExtension(String postcodeExtension) {
    this.postcodeExtension = postcodeExtension;
  }

  public FieldedAddress country(String country) {
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

  public FieldedAddress geographicSubAddress(GeographicSubAddress geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
    return this;
  }

  /**
   * Get geographicSubAddress
   * @return geographicSubAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public GeographicSubAddress getGeographicSubAddress() {
    return geographicSubAddress;
  }

  public void setGeographicSubAddress(GeographicSubAddress geographicSubAddress) {
    this.geographicSubAddress = geographicSubAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldedAddress fieldedAddress = (FieldedAddress) o;
    return Objects.equals(this.streetNr, fieldedAddress.streetNr) &&
        Objects.equals(this.streetNrSuffix, fieldedAddress.streetNrSuffix) &&
        Objects.equals(this.streetNrLast, fieldedAddress.streetNrLast) &&
        Objects.equals(this.streetNrLastSuffix, fieldedAddress.streetNrLastSuffix) &&
        Objects.equals(this.streetName, fieldedAddress.streetName) &&
        Objects.equals(this.streetType, fieldedAddress.streetType) &&
        Objects.equals(this.streetSuffix, fieldedAddress.streetSuffix) &&
        Objects.equals(this.locality, fieldedAddress.locality) &&
        Objects.equals(this.city, fieldedAddress.city) &&
        Objects.equals(this.stateOrProvince, fieldedAddress.stateOrProvince) &&
        Objects.equals(this.postcode, fieldedAddress.postcode) &&
        Objects.equals(this.postcodeExtension, fieldedAddress.postcodeExtension) &&
        Objects.equals(this.country, fieldedAddress.country) &&
        Objects.equals(this.geographicSubAddress, fieldedAddress.geographicSubAddress) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetNr, streetNrSuffix, streetNrLast, streetNrLastSuffix, streetName, streetType, streetSuffix, locality, city, stateOrProvince, postcode, postcodeExtension, country, geographicSubAddress, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldedAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    streetNr: ").append(toIndentedString(streetNr)).append("\n");
    sb.append("    streetNrSuffix: ").append(toIndentedString(streetNrSuffix)).append("\n");
    sb.append("    streetNrLast: ").append(toIndentedString(streetNrLast)).append("\n");
    sb.append("    streetNrLastSuffix: ").append(toIndentedString(streetNrLastSuffix)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetType: ").append(toIndentedString(streetType)).append("\n");
    sb.append("    streetSuffix: ").append(toIndentedString(streetSuffix)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
    sb.append("    postcodeExtension: ").append(toIndentedString(postcodeExtension)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    geographicSubAddress: ").append(toIndentedString(geographicSubAddress)).append("\n");
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

