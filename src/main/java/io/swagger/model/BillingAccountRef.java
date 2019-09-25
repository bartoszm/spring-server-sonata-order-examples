package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Contact;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * References the billing  arrangement that a buyer has with a seller that provides products to the customer.
 */
@ApiModel(description = "References the billing  arrangement that a buyer has with a seller that provides products to the customer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class BillingAccountRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("billingContact")
  private Contact billingContact = null;

  public BillingAccountRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the buyer’s billing account to which the recurring and non-recurring charges for this order or order item will be billed. If the value ‘NEW’ is provided it means that buyer request a new BAN.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifies the buyer’s billing account to which the recurring and non-recurring charges for this order or order item will be billed. If the value ‘NEW’ is provided it means that buyer request a new BAN.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingAccountRef billingContact(Contact billingContact) {
    this.billingContact = billingContact;
    return this;
  }

  /**
   * Get billingContact
   * @return billingContact
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Contact getBillingContact() {
    return billingContact;
  }

  public void setBillingContact(Contact billingContact) {
    this.billingContact = billingContact;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingAccountRef billingAccountRef = (BillingAccountRef) o;
    return Objects.equals(this.id, billingAccountRef.id) &&
        Objects.equals(this.billingContact, billingAccountRef.billingContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, billingContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingAccountRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    billingContact: ").append(toIndentedString(billingContact)).append("\n");
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

