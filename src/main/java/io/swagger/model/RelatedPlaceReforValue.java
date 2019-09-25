package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Place defines the places where the ordered products are sold or delivered. This is an abstract class that allow to define a role for a defined location structure: fielded address, formatted address, geocode, service site or references address.  This class features also site information attributes valued bu the buyer and used by the seller in the site resource.
 */
@ApiModel(description = "Place defines the places where the ordered products are sold or delivered. This is an abstract class that allow to define a role for a defined location structure: fielded address, formatted address, geocode, service site or references address.  This class features also site information attributes valued bu the buyer and used by the seller in the site resource.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = FieldedAddress.class, name = "FieldedAddress"),
  @JsonSubTypes.Type(value = ReferencedAddress.class, name = "ReferencedAddress"),
  @JsonSubTypes.Type(value = GeographicLocation.class, name = "GeographicLocation"),
  @JsonSubTypes.Type(value = FormattedAddress.class, name = "FormattedAddress"),
})

public class RelatedPlaceReforValue   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("siteName")
  private String siteName = null;

  @JsonProperty("siteCompanyName")
  private String siteCompanyName = null;

  @JsonProperty("siteCustomerName")
  private String siteCustomerName = null;

  @JsonProperty("additionalSiteInformation")
  private String additionalSiteInformation = null;

  @JsonProperty("siteDescription")
  private String siteDescription = null;

  public RelatedPlaceReforValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the place.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the place.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelatedPlaceReforValue href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference link to the place
   * @return href
  **/
  @ApiModelProperty(value = "Reference link to the place")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public RelatedPlaceReforValue role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The role that the place plays, e.g. \"UNI Site\", or \"ENNI Site\".
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role that the place plays, e.g. \"UNI Site\", or \"ENNI Site\".")
  @NotNull


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public RelatedPlaceReforValue type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type to which the place is referring. This may be \"Site\", \"FormattedAddress\", \"FieldedAddress\", \"ReferencedAddress\", or \"GeographicLocation
   * @return type
  **/
  @ApiModelProperty(value = "The type to which the place is referring. This may be \"Site\", \"FormattedAddress\", \"FieldedAddress\", \"ReferencedAddress\", or \"GeographicLocation")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelatedPlaceReforValue siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

  /**
   * A name commonly used by people to refer to this Service Site.
   * @return siteName
  **/
  @ApiModelProperty(value = "A name commonly used by people to refer to this Service Site.")


  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public RelatedPlaceReforValue siteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
    return this;
  }

  /**
   * The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner).
   * @return siteCompanyName
  **/
  @ApiModelProperty(value = "The name of the company that is the administrative authority (e.g. controls access) for this Service Site. (For example, the building owner).")


  public String getSiteCompanyName() {
    return siteCompanyName;
  }

  public void setSiteCompanyName(String siteCompanyName) {
    this.siteCompanyName = siteCompanyName;
  }

  public RelatedPlaceReforValue siteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
    return this;
  }

  /**
   * The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).
   * @return siteCustomerName
  **/
  @ApiModelProperty(value = "The name of the company that is the administrative authority for the space within this Service Site. (For example, the company leasing space in a multi-tenant building).")


  public String getSiteCustomerName() {
    return siteCustomerName;
  }

  public void setSiteCustomerName(String siteCustomerName) {
    this.siteCustomerName = siteCustomerName;
  }

  public RelatedPlaceReforValue additionalSiteInformation(String additionalSiteInformation) {
    this.additionalSiteInformation = additionalSiteInformation;
    return this;
  }

  /**
   * Additional information about the Site.
   * @return additionalSiteInformation
  **/
  @ApiModelProperty(value = "Additional information about the Site.")


  public String getAdditionalSiteInformation() {
    return additionalSiteInformation;
  }

  public void setAdditionalSiteInformation(String additionalSiteInformation) {
    this.additionalSiteInformation = additionalSiteInformation;
  }

  public RelatedPlaceReforValue siteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
    return this;
  }

  /**
   * A textual description of the Service Site.
   * @return siteDescription
  **/
  @ApiModelProperty(value = "A textual description of the Service Site.")


  public String getSiteDescription() {
    return siteDescription;
  }

  public void setSiteDescription(String siteDescription) {
    this.siteDescription = siteDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedPlaceReforValue relatedPlaceReforValue = (RelatedPlaceReforValue) o;
    return Objects.equals(this.id, relatedPlaceReforValue.id) &&
        Objects.equals(this.href, relatedPlaceReforValue.href) &&
        Objects.equals(this.role, relatedPlaceReforValue.role) &&
        Objects.equals(this.type, relatedPlaceReforValue.type) &&
        Objects.equals(this.siteName, relatedPlaceReforValue.siteName) &&
        Objects.equals(this.siteCompanyName, relatedPlaceReforValue.siteCompanyName) &&
        Objects.equals(this.siteCustomerName, relatedPlaceReforValue.siteCustomerName) &&
        Objects.equals(this.additionalSiteInformation, relatedPlaceReforValue.additionalSiteInformation) &&
        Objects.equals(this.siteDescription, relatedPlaceReforValue.siteDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, role, type, siteName, siteCompanyName, siteCustomerName, additionalSiteInformation, siteDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedPlaceReforValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    siteCompanyName: ").append(toIndentedString(siteCompanyName)).append("\n");
    sb.append("    siteCustomerName: ").append(toIndentedString(siteCustomerName)).append("\n");
    sb.append("    additionalSiteInformation: ").append(toIndentedString(additionalSiteInformation)).append("\n");
    sb.append("    siteDescription: ").append(toIndentedString(siteDescription)).append("\n");
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

