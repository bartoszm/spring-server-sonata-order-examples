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
 * 
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class GeographicPoint   {
  @JsonProperty("latitude")
  private String latitude = null;

  @JsonProperty("longitude")
  private String longitude = null;

  public GeographicPoint latitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude expressed in decimal degrees format
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "The latitude expressed in decimal degrees format")
  @NotNull


  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  public GeographicPoint longitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude expressed in decimal degrees format
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "The longitude expressed in decimal degrees format")
  @NotNull


  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicPoint geographicPoint = (GeographicPoint) o;
    return Objects.equals(this.latitude, geographicPoint.latitude) &&
        Objects.equals(this.longitude, geographicPoint.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicPoint {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

