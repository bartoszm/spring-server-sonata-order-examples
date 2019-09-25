package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Severity;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An optional array of messages associated with the Order
 */
@ApiModel(description = "An optional array of messages associated with the Order")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class OrderMessage   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("messageInformation")
  private String messageInformation = null;

  @JsonProperty("severity")
  private Severity severity = null;

  @JsonProperty("correctionRequired")
  private Boolean correctionRequired = false;

  public OrderMessage code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code associated with the Message
   * @return code
  **/
  @ApiModelProperty(value = "The code associated with the Message")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OrderMessage field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The field/attribute on the Order associated with message
   * @return field
  **/
  @ApiModelProperty(value = "The field/attribute on the Order associated with message")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public OrderMessage messageInformation(String messageInformation) {
    this.messageInformation = messageInformation;
    return this;
  }

  /**
   * A description of the error condition or information to be conveyed to the Buyer
   * @return messageInformation
  **/
  @ApiModelProperty(required = true, value = "A description of the error condition or information to be conveyed to the Buyer")
  @NotNull


  public String getMessageInformation() {
    return messageInformation;
  }

  public void setMessageInformation(String messageInformation) {
    this.messageInformation = messageInformation;
  }

  public OrderMessage severity(Severity severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Severity getSeverity() {
    return severity;
  }

  public void setSeverity(Severity severity) {
    this.severity = severity;
  }

  public OrderMessage correctionRequired(Boolean correctionRequired) {
    this.correctionRequired = correctionRequired;
    return this;
  }

  /**
   * Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.
   * @return correctionRequired
  **/
  @ApiModelProperty(value = "Indicates whether the Buyer must submit an updated Order to resolve the Error/Jeopardy condition.")


  public Boolean isCorrectionRequired() {
    return correctionRequired;
  }

  public void setCorrectionRequired(Boolean correctionRequired) {
    this.correctionRequired = correctionRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderMessage orderMessage = (OrderMessage) o;
    return Objects.equals(this.code, orderMessage.code) &&
        Objects.equals(this.field, orderMessage.field) &&
        Objects.equals(this.messageInformation, orderMessage.messageInformation) &&
        Objects.equals(this.severity, orderMessage.severity) &&
        Objects.equals(this.correctionRequired, orderMessage.correctionRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, messageInformation, severity, correctionRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderMessage {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    messageInformation: ").append(toIndentedString(messageInformation)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    correctionRequired: ").append(toIndentedString(correctionRequired)).append("\n");
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

