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
 * Polymorphic class to describe request product attribute
 */
@ApiModel(description = "Polymorphic class to describe request product attribute")
@Validated
public class Describing   {
  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public Describing type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the product
   * @return type
  **/
  @ApiModelProperty(value = "Type of the product")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Describing schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * URL targeting where product description is stored
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "URL targeting where product description is stored")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Describing describing = (Describing) o;
    return Objects.equals(this.type, describing.type) &&
        Objects.equals(this.schemaLocation, describing.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Describing {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

