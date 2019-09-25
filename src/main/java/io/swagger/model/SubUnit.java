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

public class SubUnit   {
  @JsonProperty("subUnitType")
  private String subUnitType = null;

  @JsonProperty("subUnitIdentifier")
  private String subUnitIdentifier = null;

  public SubUnit subUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
    return this;
  }

  /**
   * The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
   * @return subUnitType
  **/
  @ApiModelProperty(required = true, value = "The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.")
  @NotNull


  public String getSubUnitType() {
    return subUnitType;
  }

  public void setSubUnitType(String subUnitType) {
    this.subUnitType = subUnitType;
  }

  public SubUnit subUnitIdentifier(String subUnitIdentifier) {
    this.subUnitIdentifier = subUnitIdentifier;
    return this;
  }

  /**
   * The discriminator used for the subunit, often just a simple number but may also be a range.
   * @return subUnitIdentifier
  **/
  @ApiModelProperty(required = true, value = "The discriminator used for the subunit, often just a simple number but may also be a range.")
  @NotNull


  public String getSubUnitIdentifier() {
    return subUnitIdentifier;
  }

  public void setSubUnitIdentifier(String subUnitIdentifier) {
    this.subUnitIdentifier = subUnitIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubUnit subUnit = (SubUnit) o;
    return Objects.equals(this.subUnitType, subUnit.subUnitType) &&
        Objects.equals(this.subUnitIdentifier, subUnit.subUnitIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subUnitType, subUnitIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubUnit {\n");
    
    sb.append("    subUnitType: ").append(toIndentedString(subUnitType)).append("\n");
    sb.append("    subUnitIdentifier: ").append(toIndentedString(subUnitIdentifier)).append("\n");
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

