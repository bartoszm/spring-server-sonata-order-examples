package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.GeographicPoint;
import io.swagger.model.RelatedPlaceReforValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A set of coordinates (typically including latitude and longitude) that describes a particular loca-tion on earth.
 */
@ApiModel(description = "A set of coordinates (typically including latitude and longitude) that describes a particular loca-tion on earth.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class GeographicLocation extends RelatedPlaceReforValue  {
  @JsonProperty("spatialRef")
  private String spatialRef = null;

  @JsonProperty("geographicPoint")
  private GeographicPoint geographicPoint = null;

  public GeographicLocation spatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
    return this;
  }

  /**
   * The spatial reference system used to determine the coordinates
   * @return spatialRef
  **/
  @ApiModelProperty(required = true, value = "The spatial reference system used to determine the coordinates")
  @NotNull


  public String getSpatialRef() {
    return spatialRef;
  }

  public void setSpatialRef(String spatialRef) {
    this.spatialRef = spatialRef;
  }

  public GeographicLocation geographicPoint(GeographicPoint geographicPoint) {
    this.geographicPoint = geographicPoint;
    return this;
  }

  /**
   * Get geographicPoint
   * @return geographicPoint
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GeographicPoint getGeographicPoint() {
    return geographicPoint;
  }

  public void setGeographicPoint(GeographicPoint geographicPoint) {
    this.geographicPoint = geographicPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeographicLocation geographicLocation = (GeographicLocation) o;
    return Objects.equals(this.spatialRef, geographicLocation.spatialRef) &&
        Objects.equals(this.geographicPoint, geographicLocation.geographicPoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spatialRef, geographicPoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicLocation {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    spatialRef: ").append(toIndentedString(spatialRef)).append("\n");
    sb.append("    geographicPoint: ").append(toIndentedString(geographicPoint)).append("\n");
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

