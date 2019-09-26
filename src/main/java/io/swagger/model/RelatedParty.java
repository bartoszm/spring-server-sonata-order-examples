package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An entity or organization that is involved in the product order, such as the buyer, the seller, the order contact, etc.
 */
@ApiModel(description = "An entity or organization that is involved in the product order, such as the buyer, the seller, the order contact, etc.")
@Validated
public class RelatedParty   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("role")
  @Valid
  private List<String> role = new ArrayList<String>();

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("emailAddress")
  private String emailAddress = null;

  @JsonProperty("number")
  private String number = null;

  @JsonProperty("numberExtension")
  private String numberExtension = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public RelatedParty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * An identifier of the related party. For the \"buyer\" and \"seller\" id, this is a  Carrier ID number provided by local regulatory entity.  Unique in the local jurisdiction.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An identifier of the related party. For the \"buyer\" and \"seller\" id, this is a  Carrier ID number provided by local regulatory entity.  Unique in the local jurisdiction.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedParty role(List<String> role) {
    this.role = role;
    return this;
  }

  public RelatedParty addRoleItem(String roleItem) {
    this.role.add(roleItem);
    return this;
  }

  /**
   * Role payed by this party for this Order/OrderItem. It could be at : BuyerOrderContact (header), BuyerImplementationContact, BuyerTechnicalContact, UNISiteContact (item), AlternateSiteContact, Buyer (header), Seller(header), ENNISiteContact(item), ENNIAlternateSiteContact(item)
   * @return role
  **/
  @ApiModelProperty(required = true, value = "Role payed by this party for this Order/OrderItem. It could be at : BuyerOrderContact (header), BuyerImplementationContact, BuyerTechnicalContact, UNISiteContact (item), AlternateSiteContact, Buyer (header), Seller(header), ENNISiteContact(item), ENNIAlternateSiteContact(item)")
  @NotNull


  public List<String> getRole() {
    return role;
  }

  public void setRole(List<String> role) {
    this.role = role;
  }

  public RelatedParty name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the related party, e.g. \"Jean Pontus\".
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the related party, e.g. \"Jean Pontus\".")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelatedParty emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The email address of the related party.
   * @return emailAddress
  **/
  @ApiModelProperty(value = "The email address of the related party.")


  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public RelatedParty number(String number) {
    this.number = number;
    return this;
  }

  /**
   * The telephone number of the related party.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "The telephone number of the related party.")
  @NotNull


  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public RelatedParty numberExtension(String numberExtension) {
    this.numberExtension = numberExtension;
    return this;
  }

  /**
   * Phone number Extension
   * @return numberExtension
  **/
  @ApiModelProperty(value = "Phone number Extension")


  public String getNumberExtension() {
    return numberExtension;
  }

  public void setNumberExtension(String numberExtension) {
    this.numberExtension = numberExtension;
  }

  public RelatedParty referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * Technical attribute to extend the API
   * @return referredType
  **/
  @ApiModelProperty(value = "Technical attribute to extend the API")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedParty relatedParty = (RelatedParty) o;
    return Objects.equals(this.id, relatedParty.id) &&
        Objects.equals(this.role, relatedParty.role) &&
        Objects.equals(this.name, relatedParty.name) &&
        Objects.equals(this.emailAddress, relatedParty.emailAddress) &&
        Objects.equals(this.number, relatedParty.number) &&
        Objects.equals(this.numberExtension, relatedParty.numberExtension) &&
        Objects.equals(this.referredType, relatedParty.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, name, emailAddress, number, numberExtension, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedParty {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberExtension: ").append(toIndentedString(numberExtension)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

