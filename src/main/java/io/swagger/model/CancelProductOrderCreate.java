package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductOrderRefCancel;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * 
 */
@ApiModel(description = "")
@Validated
public class CancelProductOrderCreate   {
  @JsonProperty("requestedCancellationDate")
  private OffsetDateTime requestedCancellationDate = null;

  @JsonProperty("cancellationReason")
  private String cancellationReason = null;

  @JsonProperty("productOrder")
  private ProductOrderRefCancel productOrder = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public CancelProductOrderCreate requestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
    return this;
  }

  /**
   * Identifies the date the Seller cancelled the Order.
   * @return requestedCancellationDate
  **/
  @ApiModelProperty(required = true, value = "Identifies the date the Seller cancelled the Order.")
  @NotNull

  @Valid

  public OffsetDateTime getRequestedCancellationDate() {
    return requestedCancellationDate;
  }

  public void setRequestedCancellationDate(OffsetDateTime requestedCancellationDate) {
    this.requestedCancellationDate = requestedCancellationDate;
  }

  public CancelProductOrderCreate cancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.
   * @return cancellationReason
  **/
  @ApiModelProperty(value = "An optional free-form text field for the Seller to provide additional information regarding the reason for the cancellation.")


  public String getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(String cancellationReason) {
    this.cancellationReason = cancellationReason;
  }

  public CancelProductOrderCreate productOrder(ProductOrderRefCancel productOrder) {
    this.productOrder = productOrder;
    return this;
  }

  /**
   * Get productOrder
   * @return productOrder
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductOrderRefCancel getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(ProductOrderRefCancel productOrder) {
    this.productOrder = productOrder;
  }

  public CancelProductOrderCreate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Technical attribute to extend this class.
   * @return type
  **/
  @ApiModelProperty(value = "Technical attribute to extend this class.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CancelProductOrderCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Technical attribute to extend this class.
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Technical attribute to extend this class.")


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
    CancelProductOrderCreate cancelProductOrderCreate = (CancelProductOrderCreate) o;
    return Objects.equals(this.requestedCancellationDate, cancelProductOrderCreate.requestedCancellationDate) &&
        Objects.equals(this.cancellationReason, cancelProductOrderCreate.cancellationReason) &&
        Objects.equals(this.productOrder, cancelProductOrderCreate.productOrder) &&
        Objects.equals(this.type, cancelProductOrderCreate.type) &&
        Objects.equals(this.schemaLocation, cancelProductOrderCreate.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestedCancellationDate, cancellationReason, productOrder, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelProductOrderCreate {\n");
    
    sb.append("    requestedCancellationDate: ").append(toIndentedString(requestedCancellationDate)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
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

