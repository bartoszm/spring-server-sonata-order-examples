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
 * This resource is used to manage notification subscription.
 */
@ApiModel(description = "This resource is used to manage notification subscription.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-25T18:12:48.389Z")

public class Hub   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("query")
  private String query = null;

  @JsonProperty("callback")
  private String callback = null;

  public Hub id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the Hub
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id of the Hub")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Hub query(String query) {
    this.query = query;
    return this;
  }

  /**
   * attribute selection & search criteria
   * @return query
  **/
  @ApiModelProperty(required = true, value = "attribute selection & search criteria")
  @NotNull


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public Hub callback(String callback) {
    this.callback = callback;
    return this;
  }

  /**
   * callback urn, for instance an url http://yourdomain/listener/api/v1/event
   * @return callback
  **/
  @ApiModelProperty(required = true, value = "callback urn, for instance an url http://yourdomain/listener/api/v1/event")
  @NotNull


  public String getCallback() {
    return callback;
  }

  public void setCallback(String callback) {
    this.callback = callback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hub hub = (Hub) o;
    return Objects.equals(this.id, hub.id) &&
        Objects.equals(this.query, hub.query) &&
        Objects.equals(this.callback, hub.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, query, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
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

