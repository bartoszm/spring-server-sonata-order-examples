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
 * Using to refer a serviceability request previously done
 */
@ApiModel(description = "Using to refer a serviceability request previously done")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class QualificationRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("qualificationItem")
  private String qualificationItem = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public QualificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the qualification previously done for this item
   * @return id
  **/
  @ApiModelProperty(value = "id of the qualification previously done for this item")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QualificationRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to the qualification previously done for this item
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink to the qualification previously done for this item")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public QualificationRef qualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
    return this;
  }

  /**
   * item id of the qualification previously done for this item
   * @return qualificationItem
  **/
  @ApiModelProperty(value = "item id of the qualification previously done for this item")


  public String getQualificationItem() {
    return qualificationItem;
  }

  public void setQualificationItem(String qualificationItem) {
    this.qualificationItem = qualificationItem;
  }

  public QualificationRef referredType(String referredType) {
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
    QualificationRef qualificationRef = (QualificationRef) o;
    return Objects.equals(this.id, qualificationRef.id) &&
        Objects.equals(this.href, qualificationRef.href) &&
        Objects.equals(this.qualificationItem, qualificationRef.qualificationItem) &&
        Objects.equals(this.referredType, qualificationRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, qualificationItem, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    qualificationItem: ").append(toIndentedString(qualificationItem)).append("\n");
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

