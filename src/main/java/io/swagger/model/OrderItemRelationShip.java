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
 * This class allows the ability to associate one order item to another order item.
 */
@ApiModel(description = "This class allows the ability to associate one order item to another order item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class OrderItemRelationShip   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("productOrderId")
  private String productOrderId = null;

  public OrderItemRelationShip type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of order item relationship
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of order item relationship")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItemRelationShip id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the targeted order item by the relationship
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the targeted order item by the relationship")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderItemRelationShip productOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
    return this;
  }

  /**
   * Id of another product order if this relationship is between two distinct orders.
   * @return productOrderId
  **/
  @ApiModelProperty(value = "Id of another product order if this relationship is between two distinct orders.")


  public String getProductOrderId() {
    return productOrderId;
  }

  public void setProductOrderId(String productOrderId) {
    this.productOrderId = productOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemRelationShip orderItemRelationShip = (OrderItemRelationShip) o;
    return Objects.equals(this.type, orderItemRelationShip.type) &&
        Objects.equals(this.id, orderItemRelationShip.id) &&
        Objects.equals(this.productOrderId, orderItemRelationShip.productOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, id, productOrderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemRelationShip {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productOrderId: ").append(toIndentedString(productOrderId)).append("\n");
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

