package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChargePeriod;
import io.swagger.model.Price;
import io.swagger.model.PriceType;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Structure used to define a product price. An order item could have 0-* order item price.
 */
@ApiModel(description = "Structure used to define a product price. An order item could have 0-* order item price.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class OrderItemPrice   {
  @JsonProperty("priceType")
  private PriceType priceType = null;

  @JsonProperty("recurringChargePeriod")
  private ChargePeriod recurringChargePeriod = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("@type")
  private String type = null;

  public OrderItemPrice priceType(PriceType priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * Get priceType
   * @return priceType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceType priceType) {
    this.priceType = priceType;
  }

  public OrderItemPrice recurringChargePeriod(ChargePeriod recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * Get recurringChargePeriod
   * @return recurringChargePeriod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ChargePeriod getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(ChargePeriod recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public OrderItemPrice name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product price
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the product price")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrderItemPrice description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail the semantics of yhis order item price
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of yhis order item price")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrderItemPrice price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public OrderItemPrice type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Technical attribute to extend the class
   * @return type
  **/
  @ApiModelProperty(value = "Technical attribute to extend the class")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemPrice orderItemPrice = (OrderItemPrice) o;
    return Objects.equals(this.priceType, orderItemPrice.priceType) &&
        Objects.equals(this.recurringChargePeriod, orderItemPrice.recurringChargePeriod) &&
        Objects.equals(this.name, orderItemPrice.name) &&
        Objects.equals(this.description, orderItemPrice.description) &&
        Objects.equals(this.price, orderItemPrice.price) &&
        Objects.equals(this.type, orderItemPrice.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceType, recurringChargePeriod, name, description, price, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemPrice {\n");
    
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

