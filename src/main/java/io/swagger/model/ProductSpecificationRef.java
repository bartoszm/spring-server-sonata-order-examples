package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Describing;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.
 */
@ApiModel(description = "A structured set of well-defined technical attributes and/or behaviors that are used to construct a Product Offering for sale to a market.")
@Validated
public class ProductSpecificationRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("describing")
  private Describing describing = null;

  public ProductSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.
   * @return id
  **/
  @ApiModelProperty(value = "A unique identifier for the product spec, within the product spec domain. It is assigned by the seller and communicated to the buyer at on-boarding time.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationRef describing(Describing describing) {
    this.describing = describing;
    return this;
  }

  /**
   * Get describing
   * @return describing
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Describing getDescribing() {
    return describing;
  }

  public void setDescribing(Describing describing) {
    this.describing = describing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
    return Objects.equals(this.id, productSpecificationRef.id) &&
        Objects.equals(this.describing, productSpecificationRef.describing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, describing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    describing: ").append(toIndentedString(describing)).append("\n");
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

