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
 * A globally unique identifier controlled by a generally accepted independent administrative authority that specifies a fixed geographical location.
 */
@ApiModel(description = "A globally unique identifier controlled by a generally accepted independent administrative authority that specifies a fixed geographical location.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class ReferencedAddress extends RelatedPlaceReforValue  {
  @JsonProperty("referenceType")
  private String referenceType = null;

  @JsonProperty("referenceId")
  private String referenceId = null;

  public ReferencedAddress referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * The type of the reference. For North American providers this would normally be CLLI
   * @return referenceType
  **/
  @ApiModelProperty(required = true, value = "The type of the reference. For North American providers this would normally be CLLI")
  @NotNull


  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  public ReferencedAddress referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * A reference to an address by id; this would include such things as CLLI Codes, or Seller-assigned address identifiers
   * @return referenceId
  **/
  @ApiModelProperty(required = true, value = "A reference to an address by id; this would include such things as CLLI Codes, or Seller-assigned address identifiers")
  @NotNull


  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedAddress referencedAddress = (ReferencedAddress) o;
    return Objects.equals(this.referenceType, referencedAddress.referenceType) &&
        Objects.equals(this.referenceId, referencedAddress.referenceId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceType, referenceId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedAddress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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

