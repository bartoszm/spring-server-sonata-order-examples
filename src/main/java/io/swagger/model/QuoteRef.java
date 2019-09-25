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
 * Quote used before this order to define pricing terms
 */
@ApiModel(description = "Quote used before this order to define pricing terms")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class QuoteRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("quoteItem")
  private String quoteItem = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public QuoteRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the Quote that is generated by the Seller when the Quote is initially accepted via an API.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QuoteRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the quote (using MEF quote API)
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink to access the quote (using MEF quote API)")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public QuoteRef quoteItem(String quoteItem) {
    this.quoteItem = quoteItem;
    return this;
  }

  /**
   * Identifier of the quote item
   * @return quoteItem
  **/
  @ApiModelProperty(value = "Identifier of the quote item")


  public String getQuoteItem() {
    return quoteItem;
  }

  public void setQuoteItem(String quoteItem) {
    this.quoteItem = quoteItem;
  }

  public QuoteRef referredType(String referredType) {
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
    QuoteRef quoteRef = (QuoteRef) o;
    return Objects.equals(this.id, quoteRef.id) &&
        Objects.equals(this.href, quoteRef.href) &&
        Objects.equals(this.quoteItem, quoteRef.quoteItem) &&
        Objects.equals(this.referredType, quoteRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, quoteItem, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuoteRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    quoteItem: ").append(toIndentedString(quoteItem)).append("\n");
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

