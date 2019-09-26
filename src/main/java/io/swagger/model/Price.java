package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Provides pre tax amount for a product
 */
@ApiModel(description = "Provides pre tax amount for a product")
@Validated
public class Price   {
  @JsonProperty("preTaxAmount")
  private Money preTaxAmount = null;

  @JsonProperty("@type")
  private String type = null;

  public Price preTaxAmount(Money preTaxAmount) {
    this.preTaxAmount = preTaxAmount;
    return this;
  }

  /**
   * Get preTaxAmount
   * @return preTaxAmount
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Money getPreTaxAmount() {
    return preTaxAmount;
  }

  public void setPreTaxAmount(Money preTaxAmount) {
    this.preTaxAmount = preTaxAmount;
  }

  public Price type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Technical attribute to extend the class.
   * @return type
  **/
  @ApiModelProperty(value = "Technical attribute to extend the class.")


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
    Price price = (Price) o;
    return Objects.equals(this.preTaxAmount, price.preTaxAmount) &&
        Objects.equals(this.type, price.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preTaxAmount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    
    sb.append("    preTaxAmount: ").append(toIndentedString(preTaxAmount)).append("\n");
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

