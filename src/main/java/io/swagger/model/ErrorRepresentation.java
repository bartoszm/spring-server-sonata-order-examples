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
 * Class used to describe API response error
 */
@ApiModel(description = "Class used to describe API response error")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class ErrorRepresentation   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("referenceError")
  private String referenceError = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public ErrorRepresentation code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Application related code (as defined in the API or from a common list)
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Application related code (as defined in the API or from a common list)")
  @NotNull


  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ErrorRepresentation reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Text that explains the reason for error. This can be shown to a client user.
   * @return reason
  **/
  @ApiModelProperty(required = true, value = "Text that explains the reason for error. This can be shown to a client user.")
  @NotNull


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ErrorRepresentation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Text that provide more details and corrective actions related to the error. This can be shown to a client user.
   * @return message
  **/
  @ApiModelProperty(value = "Text that provide more details and corrective actions related to the error. This can be shown to a client user.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ErrorRepresentation status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * http error code extension like 400-2
   * @return status
  **/
  @ApiModelProperty(value = "http error code extension like 400-2")


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorRepresentation referenceError(String referenceError) {
    this.referenceError = referenceError;
    return this;
  }

  /**
   * url pointing to documentation describing the error
   * @return referenceError
  **/
  @ApiModelProperty(value = "url pointing to documentation describing the error")


  public String getReferenceError() {
    return referenceError;
  }

  public void setReferenceError(String referenceError) {
    this.referenceError = referenceError;
  }

  public ErrorRepresentation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The class type of a REST resource.
   * @return type
  **/
  @ApiModelProperty(value = "The class type of a REST resource.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ErrorRepresentation schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * it provides a link to the schema describing a REST resource.
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "it provides a link to the schema describing a REST resource.")


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
    ErrorRepresentation errorRepresentation = (ErrorRepresentation) o;
    return Objects.equals(this.code, errorRepresentation.code) &&
        Objects.equals(this.reason, errorRepresentation.reason) &&
        Objects.equals(this.message, errorRepresentation.message) &&
        Objects.equals(this.status, errorRepresentation.status) &&
        Objects.equals(this.referenceError, errorRepresentation.referenceError) &&
        Objects.equals(this.type, errorRepresentation.type) &&
        Objects.equals(this.schemaLocation, errorRepresentation.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message, status, referenceError, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorRepresentation {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    referenceError: ").append(toIndentedString(referenceError)).append("\n");
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

