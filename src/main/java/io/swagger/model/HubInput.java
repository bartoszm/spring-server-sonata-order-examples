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
 * This class is used to request a HUB creation - Used in the POST operation
 */
@ApiModel(description = "This class is used to request a HUB creation - Used in the POST operation")
@Validated
public class HubInput   {
  @JsonProperty("query")
  private String query = null;

  @JsonProperty("callback")
  private String callback = null;

  public HubInput query(String query) {
    this.query = query;
    return this;
  }

  /**
   * This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOrderStateChangeNotification”}
   * @return query
  **/
  @ApiModelProperty(required = true, value = "This attribute is used to define notification type. Example: \",\"query\":”eventType = ProductOrderStateChangeNotification”}")
  @NotNull


  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public HubInput callback(String callback) {
    this.callback = callback;
    return this;
  }

  /**
   * This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event
   * @return callback
  **/
  @ApiModelProperty(required = true, value = "This attribute is the callback url where event will be sent when occurs, for instance an url http://yourdomain/listener/api/v1/event")
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
    HubInput hubInput = (HubInput) o;
    return Objects.equals(this.query, hubInput.query) &&
        Objects.equals(this.callback, hubInput.callback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, callback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HubInput {\n");
    
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

