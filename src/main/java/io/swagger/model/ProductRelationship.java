package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates a relationship between products.
 */
@ApiModel(description = "Indicates a relationship between products.")
@Validated
public class ProductRelationship   {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("product")
  private ProductRef product = null;

  public ProductRelationship type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates whether the product is \"bundled\", \"relies on\", or \"comesFrom\" another product.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates whether the product is \"bundled\", \"relies on\", or \"comesFrom\" another product.")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductRelationship product(ProductRef product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductRef getProduct() {
    return product;
  }

  public void setProduct(ProductRef product) {
    this.product = product;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRelationship productRelationship = (ProductRelationship) o;
    return Objects.equals(this.type, productRelationship.type) &&
        Objects.equals(this.product, productRelationship.product);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, product);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRelationship {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

