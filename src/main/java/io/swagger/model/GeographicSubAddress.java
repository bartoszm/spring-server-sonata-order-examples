package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SubUnit;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.
 */
@ApiModel(description = "It is used for addressing within a property in an urban area (country properties are often defined differently). It may refer to a building, a building cluster, or a floor of a multistory building.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class GeographicSubAddress   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("subUnit")
  @Valid
  private List<SubUnit> subUnit = null;

  @JsonProperty("levelType")
  private String levelType = null;

  @JsonProperty("levelNumber")
  private String levelNumber = null;

  @JsonProperty("buildingName")
  private String buildingName = null;

  @JsonProperty("privateStreetNumber")
  private String privateStreetNumber = null;

  @JsonProperty("privateStreetName")
  private String privateStreetName = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public GeographicSubAddress id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Identifier of the subAddress
   * @return id
  **/
  @ApiModelProperty(value = "Unique Identifier of the subAddress")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeographicSubAddress subUnit(List<SubUnit> subUnit) {
    this.subUnit = subUnit;
    return this;
  }

  public GeographicSubAddress addSubUnitItem(SubUnit subUnitItem) {
    if (this.subUnit == null) {
      this.subUnit = new ArrayList<SubUnit>();
    }
    this.subUnit.add(subUnitItem);
    return this;
  }

  /**
   * Get subUnit
   * @return subUnit
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<SubUnit> getSubUnit() {
    return subUnit;
  }

  public void setSubUnit(List<SubUnit> subUnit) {
    this.subUnit = subUnit;
  }

  public GeographicSubAddress levelType(String levelType) {
    this.levelType = levelType;
    return this;
  }

  /**
   * Describes level types within a building
   * @return levelType
  **/
  @ApiModelProperty(value = "Describes level types within a building")


  public String getLevelType() {
    return levelType;
  }

  public void setLevelType(String levelType) {
    this.levelType = levelType;
  }

  public GeographicSubAddress levelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
    return this;
  }

  /**
   * Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
   * @return levelNumber
  **/
  @ApiModelProperty(value = "Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2")


  public String getLevelNumber() {
    return levelNumber;
  }

  public void setLevelNumber(String levelNumber) {
    this.levelNumber = levelNumber;
  }

  public GeographicSubAddress buildingName(String buildingName) {
    this.buildingName = buildingName;
    return this;
  }

  /**
   * Allows for buildings that have well-known names
   * @return buildingName
  **/
  @ApiModelProperty(value = "Allows for buildings that have well-known names")


  public String getBuildingName() {
    return buildingName;
  }

  public void setBuildingName(String buildingName) {
    this.buildingName = buildingName;
  }

  public GeographicSubAddress privateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
    return this;
  }

  /**
   * Private streets numbers internal to a private street
   * @return privateStreetNumber
  **/
  @ApiModelProperty(value = "Private streets numbers internal to a private street")


  public String getPrivateStreetNumber() {
    return privateStreetNumber;
  }

  public void setPrivateStreetNumber(String privateStreetNumber) {
    this.privateStreetNumber = privateStreetNumber;
  }

  public GeographicSubAddress privateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
    return this;
  }

  /**
   * \"Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office
   * @return privateStreetName
  **/
  @ApiModelProperty(value = "\"Private streets internal to a property (e.g. a university) may have internal names that are not recorded by the land title office")


  public String getPrivateStreetName() {
    return privateStreetName;
  }

  public void setPrivateStreetName(String privateStreetName) {
    this.privateStreetName = privateStreetName;
  }

  public GeographicSubAddress type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Technical attribute to exend this class if needed
   * @return type
  **/
  @ApiModelProperty(value = "Technical attribute to exend this class if needed")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeographicSubAddress schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Technical attribute to exend this class if needed (JSON schema locator)
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Technical attribute to exend this class if needed (JSON schema locator)")


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
    GeographicSubAddress geographicSubAddress = (GeographicSubAddress) o;
    return Objects.equals(this.id, geographicSubAddress.id) &&
        Objects.equals(this.subUnit, geographicSubAddress.subUnit) &&
        Objects.equals(this.levelType, geographicSubAddress.levelType) &&
        Objects.equals(this.levelNumber, geographicSubAddress.levelNumber) &&
        Objects.equals(this.buildingName, geographicSubAddress.buildingName) &&
        Objects.equals(this.privateStreetNumber, geographicSubAddress.privateStreetNumber) &&
        Objects.equals(this.privateStreetName, geographicSubAddress.privateStreetName) &&
        Objects.equals(this.type, geographicSubAddress.type) &&
        Objects.equals(this.schemaLocation, geographicSubAddress.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subUnit, levelType, levelNumber, buildingName, privateStreetNumber, privateStreetName, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeographicSubAddress {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subUnit: ").append(toIndentedString(subUnit)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
    sb.append("    levelNumber: ").append(toIndentedString(levelNumber)).append("\n");
    sb.append("    buildingName: ").append(toIndentedString(buildingName)).append("\n");
    sb.append("    privateStreetNumber: ").append(toIndentedString(privateStreetNumber)).append("\n");
    sb.append("    privateStreetName: ").append(toIndentedString(privateStreetName)).append("\n");
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

