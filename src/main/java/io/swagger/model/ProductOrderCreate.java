package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.DesiredOrderResponses;
import io.swagger.model.Note;
import io.swagger.model.OrderActivity;
import io.swagger.model.PricingMethod;
import io.swagger.model.ProductOrderItemCreate;
import io.swagger.model.RelatedParty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A CreateProductOrder object is provided as input to the product order create operation.
 */
@ApiModel(description = "A CreateProductOrder object is provided as input to the product order create operation.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class ProductOrderCreate   {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("buyerRequestDate")
  private OffsetDateTime buyerRequestDate = null;

  @JsonProperty("requestedCompletionDate")
  private OffsetDateTime requestedCompletionDate = null;

  @JsonProperty("requestedStartDate")
  private OffsetDateTime requestedStartDate = null;

  @JsonProperty("expeditePriority")
  private Boolean expeditePriority = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("orderActivity")
  private OrderActivity orderActivity = null;

  @JsonProperty("desiredResponse")
  private DesiredOrderResponses desiredResponse = null;

  @JsonProperty("orderVersion")
  private String orderVersion = null;

  @JsonProperty("projectId")
  private String projectId = null;

  @JsonProperty("tspRestorationPriority")
  private String tspRestorationPriority = null;

  @JsonProperty("relatedBuyerPON")
  private String relatedBuyerPON = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("pricingMethod")
  private PricingMethod pricingMethod = null;

  @JsonProperty("pricingReference")
  private String pricingReference = null;

  @JsonProperty("pricingTerm")
  private Integer pricingTerm = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  @JsonProperty("note")
  @Valid
  private List<Note> note = null;

  @JsonProperty("orderItem")
  @Valid
  private List<ProductOrderItemCreate> orderItem = new ArrayList<ProductOrderItemCreate>();

  public ProductOrderCreate externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer's enterprise
   * @return externalId
  **/
  @ApiModelProperty(required = true, value = "Buyer Purchase Order Number: A number that uniquely identifies an order within the Buyer's enterprise")
  @NotNull


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ProductOrderCreate buyerRequestDate(OffsetDateTime buyerRequestDate) {
    this.buyerRequestDate = buyerRequestDate;
    return this;
  }

  /**
   * Date when the order was submitted by the Buyer to the Seller
   * @return buyerRequestDate
  **/
  @ApiModelProperty(required = true, value = "Date when the order was submitted by the Buyer to the Seller")
  @NotNull

  @Valid

  public OffsetDateTime getBuyerRequestDate() {
    return buyerRequestDate;
  }

  public void setBuyerRequestDate(OffsetDateTime buyerRequestDate) {
    this.buyerRequestDate = buyerRequestDate;
  }

  public ProductOrderCreate requestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
    return this;
  }

  /**
   * Identifies the Buyer's desired due date (requested delivery date)
   * @return requestedCompletionDate
  **/
  @ApiModelProperty(required = true, value = "Identifies the Buyer's desired due date (requested delivery date)")
  @NotNull

  @Valid

  public OffsetDateTime getRequestedCompletionDate() {
    return requestedCompletionDate;
  }

  public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
    this.requestedCompletionDate = requestedCompletionDate;
  }

  public ProductOrderCreate requestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
    return this;
  }

  /**
   * If specified, identifies the Buyer's desired date for order processing to start
   * @return requestedStartDate
  **/
  @ApiModelProperty(value = "If specified, identifies the Buyer's desired date for order processing to start")

  @Valid

  public OffsetDateTime getRequestedStartDate() {
    return requestedStartDate;
  }

  public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
    this.requestedStartDate = requestedStartDate;
  }

  public ProductOrderCreate expeditePriority(Boolean expeditePriority) {
    this.expeditePriority = expeditePriority;
    return this;
  }

  /**
   * Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.
   * @return expeditePriority
  **/
  @ApiModelProperty(value = "Indicates that expedited treatment is requested and any charges generated in provisioning this request (e.g., additional engineering charges or labor charges if applicable) will be accepted by the buyer.")


  public Boolean isExpeditePriority() {
    return expeditePriority;
  }

  public void setExpeditePriority(Boolean expeditePriority) {
    this.expeditePriority = expeditePriority;
  }

  public ProductOrderCreate priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * An integer that specifies that expedited treatment is to be provided in a specific priority.
   * @return priority
  **/
  @ApiModelProperty(value = "An integer that specifies that expedited treatment is to be provided in a specific priority.")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public ProductOrderCreate orderActivity(OrderActivity orderActivity) {
    this.orderActivity = orderActivity;
    return this;
  }

  /**
   * Get orderActivity
   * @return orderActivity
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public OrderActivity getOrderActivity() {
    return orderActivity;
  }

  public void setOrderActivity(OrderActivity orderActivity) {
    this.orderActivity = orderActivity;
  }

  public ProductOrderCreate desiredResponse(DesiredOrderResponses desiredResponse) {
    this.desiredResponse = desiredResponse;
    return this;
  }

  /**
   * Get desiredResponse
   * @return desiredResponse
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DesiredOrderResponses getDesiredResponse() {
    return desiredResponse;
  }

  public void setDesiredResponse(DesiredOrderResponses desiredResponse) {
    this.desiredResponse = desiredResponse;
  }

  public ProductOrderCreate orderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
    return this;
  }

  /**
   * Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.
   * @return orderVersion
  **/
  @ApiModelProperty(required = true, value = "Buyer Order Version: The version number that the Buyer uses to refer to this particular version of the order.")
  @NotNull


  public String getOrderVersion() {
    return orderVersion;
  }

  public void setOrderVersion(String orderVersion) {
    this.orderVersion = orderVersion;
  }

  public ProductOrderCreate projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.
   * @return projectId
  **/
  @ApiModelProperty(value = "An identifier that is used to group Orders that is important to the Buyer. A ProjectId can be used to relate multiple Orders together.")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ProductOrderCreate tspRestorationPriority(String tspRestorationPriority) {
    this.tspRestorationPriority = tspRestorationPriority;
    return this;
  }

  /**
   * Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.
   * @return tspRestorationPriority
  **/
  @ApiModelProperty(value = "Within the United States, indicates the provisioning and restoration priority as defined under the TSP Service Vendor Handbook.")


  public String getTspRestorationPriority() {
    return tspRestorationPriority;
  }

  public void setTspRestorationPriority(String tspRestorationPriority) {
    this.tspRestorationPriority = tspRestorationPriority;
  }

  public ProductOrderCreate relatedBuyerPON(String relatedBuyerPON) {
    this.relatedBuyerPON = relatedBuyerPON;
    return this;
  }

  /**
   * Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.
   * @return relatedBuyerPON
  **/
  @ApiModelProperty(value = "Related Buyer Purchase Order Number (RPON) - Identifies the Buyer Purchase Order Number that is related to this order.")


  public String getRelatedBuyerPON() {
    return relatedBuyerPON;
  }

  public void setRelatedBuyerPON(String relatedBuyerPON) {
    this.relatedBuyerPON = relatedBuyerPON;
  }

  public ProductOrderCreate type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Technical attribute to extend API
   * @return type
  **/
  @ApiModelProperty(value = "Technical attribute to extend API")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductOrderCreate schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * Technical attribute to extend API
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "Technical attribute to extend API")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductOrderCreate baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * Technical attribute to extend API
   * @return baseType
  **/
  @ApiModelProperty(value = "Technical attribute to extend API")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductOrderCreate pricingMethod(PricingMethod pricingMethod) {
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

  public ProductOrderCreate pricingReference(String pricingReference) {
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

  public ProductOrderCreate pricingTerm(Integer pricingTerm) {
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

  public ProductOrderCreate billingAccount(BillingAccountRef billingAccount) {
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

  public ProductOrderCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductOrderCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductOrderCreate note(List<Note> note) {
    this.note = note;
    return this;
  }

  public ProductOrderCreate addNoteItem(Note noteItem) {
    if (this.note == null) {
      this.note = new ArrayList<Note>();
    }
    this.note.add(noteItem);
    return this;
  }

  /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Note> getNote() {
    return note;
  }

  public void setNote(List<Note> note) {
    this.note = note;
  }

  public ProductOrderCreate orderItem(List<ProductOrderItemCreate> orderItem) {
    this.orderItem = orderItem;
    return this;
  }

  public ProductOrderCreate addOrderItemItem(ProductOrderItemCreate orderItemItem) {
    this.orderItem.add(orderItemItem);
    return this;
  }

  /**
   * Get orderItem
   * @return orderItem
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<ProductOrderItemCreate> getOrderItem() {
    return orderItem;
  }

  public void setOrderItem(List<ProductOrderItemCreate> orderItem) {
    this.orderItem = orderItem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderCreate productOrderCreate = (ProductOrderCreate) o;
    return Objects.equals(this.externalId, productOrderCreate.externalId) &&
        Objects.equals(this.buyerRequestDate, productOrderCreate.buyerRequestDate) &&
        Objects.equals(this.requestedCompletionDate, productOrderCreate.requestedCompletionDate) &&
        Objects.equals(this.requestedStartDate, productOrderCreate.requestedStartDate) &&
        Objects.equals(this.expeditePriority, productOrderCreate.expeditePriority) &&
        Objects.equals(this.priority, productOrderCreate.priority) &&
        Objects.equals(this.orderActivity, productOrderCreate.orderActivity) &&
        Objects.equals(this.desiredResponse, productOrderCreate.desiredResponse) &&
        Objects.equals(this.orderVersion, productOrderCreate.orderVersion) &&
        Objects.equals(this.projectId, productOrderCreate.projectId) &&
        Objects.equals(this.tspRestorationPriority, productOrderCreate.tspRestorationPriority) &&
        Objects.equals(this.relatedBuyerPON, productOrderCreate.relatedBuyerPON) &&
        Objects.equals(this.type, productOrderCreate.type) &&
        Objects.equals(this.schemaLocation, productOrderCreate.schemaLocation) &&
        Objects.equals(this.baseType, productOrderCreate.baseType) &&
        Objects.equals(this.pricingMethod, productOrderCreate.pricingMethod) &&
        Objects.equals(this.pricingReference, productOrderCreate.pricingReference) &&
        Objects.equals(this.pricingTerm, productOrderCreate.pricingTerm) &&
        Objects.equals(this.billingAccount, productOrderCreate.billingAccount) &&
        Objects.equals(this.relatedParty, productOrderCreate.relatedParty) &&
        Objects.equals(this.note, productOrderCreate.note) &&
        Objects.equals(this.orderItem, productOrderCreate.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, buyerRequestDate, requestedCompletionDate, requestedStartDate, expeditePriority, priority, orderActivity, desiredResponse, orderVersion, projectId, tspRestorationPriority, relatedBuyerPON, type, schemaLocation, baseType, pricingMethod, pricingReference, pricingTerm, billingAccount, relatedParty, note, orderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderCreate {\n");
    
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    buyerRequestDate: ").append(toIndentedString(buyerRequestDate)).append("\n");
    sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
    sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
    sb.append("    expeditePriority: ").append(toIndentedString(expeditePriority)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    orderActivity: ").append(toIndentedString(orderActivity)).append("\n");
    sb.append("    desiredResponse: ").append(toIndentedString(desiredResponse)).append("\n");
    sb.append("    orderVersion: ").append(toIndentedString(orderVersion)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tspRestorationPriority: ").append(toIndentedString(tspRestorationPriority)).append("\n");
    sb.append("    relatedBuyerPON: ").append(toIndentedString(relatedBuyerPON)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    pricingMethod: ").append(toIndentedString(pricingMethod)).append("\n");
    sb.append("    pricingReference: ").append(toIndentedString(pricingReference)).append("\n");
    sb.append("    pricingTerm: ").append(toIndentedString(pricingTerm)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
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

