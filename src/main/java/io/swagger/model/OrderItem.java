package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.OrderItemPrice;
import io.swagger.model.OrderItemRelationShip;
import io.swagger.model.PricingMethod;
import io.swagger.model.Product;
import io.swagger.model.ProductActionType;
import io.swagger.model.ProductOfferingRef;
import io.swagger.model.ProductOrderItemStateType;
import io.swagger.model.QualificationRef;
import io.swagger.model.QuoteRef;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).
 */
@ApiModel(description = "An enumeration of the entities that are part of this order expressed in terms of a Product Offering or a Product (for a change order).")
@Validated
public class OrderItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("action")
  private ProductActionType action = null;

  @JsonProperty("state")
  private ProductOrderItemStateType state = null;

  @JsonProperty("pricingMethod")
  private PricingMethod pricingMethod = null;

  @JsonProperty("pricingReference")
  private String pricingReference = null;

  @JsonProperty("pricingTerm")
  private Integer pricingTerm = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("orderItemPrice")
  @Valid
  private List<OrderItemPrice> orderItemPrice = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("product")
  private Product product = null;

  @JsonProperty("orderItemRelationship")
  @Valid
  private List<OrderItemRelationShip> orderItemRelationship = null;

  @JsonProperty("qualification")
  private QualificationRef qualification = null;

  @JsonProperty("quote")
  private QuoteRef quote = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public OrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderItem action(ProductActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductActionType getAction() {
    return action;
  }

  public void setAction(ProductActionType action) {
    this.action = action;
  }

  public OrderItem state(ProductOrderItemStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductOrderItemStateType getState() {
    return state;
  }

  public void setState(ProductOrderItemStateType state) {
    this.state = state;
  }

  public OrderItem pricingMethod(PricingMethod pricingMethod) {
    this.pricingMethod = pricingMethod;
    return this;
  }

  /**
   * Get pricingMethod
   * @return pricingMethod
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PricingMethod getPricingMethod() {
    return pricingMethod;
  }

  public void setPricingMethod(PricingMethod pricingMethod) {
    this.pricingMethod = pricingMethod;
  }

  public OrderItem pricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
    return this;
  }

  /**
   * The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.
   * @return pricingReference
  **/
  @ApiModelProperty(value = "The identifier references the previously agreed upon pricing terms, as applicable, based on the pricingMethod (e.g. a contract id or tariff id.")


  public String getPricingReference() {
    return pricingReference;
  }

  public void setPricingReference(String pricingReference) {
    this.pricingReference = pricingReference;
  }

  public OrderItem pricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
    return this;
  }

  /**
   * The length of the contract in months
   * @return pricingTerm
  **/
  @ApiModelProperty(value = "The length of the contract in months")


  public Integer getPricingTerm() {
    return pricingTerm;
  }

  public void setPricingTerm(Integer pricingTerm) {
    this.pricingTerm = pricingTerm;
  }

  public OrderItem billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public OrderItem orderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
    return this;
  }

  public OrderItem addOrderItemPriceItem(OrderItemPrice orderItemPriceItem) {
    if (this.orderItemPrice == null) {
      this.orderItemPrice = new ArrayList<OrderItemPrice>();
    }
    this.orderItemPrice.add(orderItemPriceItem);
    return this;
  }

  /**
   * Get orderItemPrice
   * @return orderItemPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemPrice> getOrderItemPrice() {
    return orderItemPrice;
  }

  public void setOrderItemPrice(List<OrderItemPrice> orderItemPrice) {
    this.orderItemPrice = orderItemPrice;
  }

  public OrderItem productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * Get productOffering
   * @return productOffering
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public OrderItem relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public OrderItem addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public OrderItem product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public OrderItem orderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
    return this;
  }

  public OrderItem addOrderItemRelationshipItem(OrderItemRelationShip orderItemRelationshipItem) {
    if (this.orderItemRelationship == null) {
      this.orderItemRelationship = new ArrayList<OrderItemRelationShip>();
    }
    this.orderItemRelationship.add(orderItemRelationshipItem);
    return this;
  }

  /**
   * Get orderItemRelationship
   * @return orderItemRelationship
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderItemRelationShip> getOrderItemRelationship() {
    return orderItemRelationship;
  }

  public void setOrderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
  }

  public OrderItem qualification(QualificationRef qualification) {
    this.qualification = qualification;
    return this;
  }

  /**
   * Get qualification
   * @return qualification
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QualificationRef getQualification() {
    return qualification;
  }

  public void setQualification(QualificationRef qualification) {
    this.qualification = qualification;
  }

  public OrderItem quote(QuoteRef quote) {
    this.quote = quote;
    return this;
  }

  /**
   * Get quote
   * @return quote
  **/
  @ApiModelProperty(value = "")

  @Valid

  public QuoteRef getQuote() {
    return quote;
  }

  public void setQuote(QuoteRef quote) {
    this.quote = quote;
  }

  public OrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of productOrder
   * @return type
  **/
  @ApiModelProperty(value = "Type of productOrder")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Target a description file of productOrder extension
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Target a description file of productOrder extension")


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
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.action, orderItem.action) &&
        Objects.equals(this.state, orderItem.state) &&
        Objects.equals(this.pricingMethod, orderItem.pricingMethod) &&
        Objects.equals(this.pricingReference, orderItem.pricingReference) &&
        Objects.equals(this.pricingTerm, orderItem.pricingTerm) &&
        Objects.equals(this.billingAccount, orderItem.billingAccount) &&
        Objects.equals(this.orderItemPrice, orderItem.orderItemPrice) &&
        Objects.equals(this.productOffering, orderItem.productOffering) &&
        Objects.equals(this.relatedParty, orderItem.relatedParty) &&
        Objects.equals(this.product, orderItem.product) &&
        Objects.equals(this.orderItemRelationship, orderItem.orderItemRelationship) &&
        Objects.equals(this.qualification, orderItem.qualification) &&
        Objects.equals(this.quote, orderItem.quote) &&
        Objects.equals(this.type, orderItem.type) &&
        Objects.equals(this.schemaLocation, orderItem.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, state, pricingMethod, pricingReference, pricingTerm, billingAccount, orderItemPrice, productOffering, relatedParty, product, orderItemRelationship, qualification, quote, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    pricingMethod: ").append(toIndentedString(pricingMethod)).append("\n");
    sb.append("    pricingReference: ").append(toIndentedString(pricingReference)).append("\n");
    sb.append("    pricingTerm: ").append(toIndentedString(pricingTerm)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    orderItemPrice: ").append(toIndentedString(orderItemPrice)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    orderItemRelationship: ").append(toIndentedString(orderItemRelationship)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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

