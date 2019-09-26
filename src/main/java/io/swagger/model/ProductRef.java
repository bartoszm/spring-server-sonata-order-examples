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
 * Targeted existing product used in product relationship description.
 */
@ApiModel(description = "Targeted existing product used in product relationship description.")
@Validated
public class ProductRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("buyerProductId")
  private String buyerProductId = null;

  public ProductRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeted Seller product id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Targeted Seller product id")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to the product in the inventory
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink to the product in the inventory")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductRef buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

  /**
   * Targeted Buyer product id - Informative.
   * @return buyerProductId
  **/
  @ApiModelProperty(value = "Targeted Buyer product id - Informative.")


  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRef productRef = (ProductRef) o;
    return Objects.equals(this.id, productRef.id) &&
        Objects.equals(this.href, productRef.href) &&
        Objects.equals(this.buyerProductId, productRef.buyerProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, buyerProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
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

