package io.swagger.model;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductRelationship;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.RelatedPlaceReforValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.
 */
@ApiModel(description = "One or more services sold to a Buyer by a Seller.  A particular Product Offering defines the technical and commercial attributes and behav-iors of a Product.")
@Validated
public class Product   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("buyerProductId")
  private String buyerProductId = null;

  @JsonProperty("productSpecification")
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("place")
  @Valid
  private List<RelatedPlaceReforValue> place = null;

  @JsonProperty("productRelationship")
  @Valid
  private List<ProductRelationship> productRelationship = null;


  private Map<String, JsonNode> dynamic = new HashMap<>();

  @JsonAnySetter
  public void add(String key, JsonNode value) {
    this.dynamic.put(key, value);
  }

  public Product id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique (within the product domain) identifier for the product that is generated by the seller when the product is instantiated.
   * @return id
  **/
  @ApiModelProperty(value = "Unique (within the product domain) identifier for the product that is generated by the seller when the product is instantiated.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Product href(String href) {
    this.href = href;
    return this;
  }

  /**
   * 
   * @return href
  **/
  @ApiModelProperty(value = "")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Product buyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
    return this;
  }

  /**
   * Buyer product Id - informative information
   * @return buyerProductId
  **/
  @ApiModelProperty(value = "Buyer product Id - informative information")


  public String getBuyerProductId() {
    return buyerProductId;
  }

  public void setBuyerProductId(String buyerProductId) {
    this.buyerProductId = buyerProductId;
  }

  public Product productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * Get productSpecification
   * @return productSpecification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public Product place(List<RelatedPlaceReforValue> place) {
    this.place = place;
    return this;
  }

  public Product addPlaceItem(RelatedPlaceReforValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceReforValue>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedPlaceReforValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceReforValue> place) {
    this.place = place;
  }

  public Product productRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public Product addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<ProductRelationship>();
    }
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

  /**
   * Get productRelationship
   * @return productRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.href, product.href) &&
        Objects.equals(this.buyerProductId, product.buyerProductId) &&
        Objects.equals(this.productSpecification, product.productSpecification) &&
        Objects.equals(this.place, product.place) &&
        Objects.equals(this.productRelationship, product.productRelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, buyerProductId, productSpecification, place, productRelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    buyerProductId: ").append(toIndentedString(buyerProductId)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
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

