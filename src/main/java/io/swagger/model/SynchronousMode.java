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
 * 
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T11:12:00.321Z")

public class SynchronousMode   {
  @JsonProperty("linkMode")
  private Integer linkMode = null;

  @JsonProperty("syncModeEnabled")
  private Boolean syncModeEnabled = false;

  public SynchronousMode linkMode(Integer linkMode) {
    this.linkMode = linkMode;
    return this;
  }

  /**
   * 
   * @return linkMode
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getLinkMode() {
    return linkMode;
  }

  public void setLinkMode(Integer linkMode) {
    this.linkMode = linkMode;
  }

  public SynchronousMode syncModeEnabled(Boolean syncModeEnabled) {
    this.syncModeEnabled = syncModeEnabled;
    return this;
  }

  /**
   * 
   * @return syncModeEnabled
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean isSyncModeEnabled() {
    return syncModeEnabled;
  }

  public void setSyncModeEnabled(Boolean syncModeEnabled) {
    this.syncModeEnabled = syncModeEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SynchronousMode synchronousMode = (SynchronousMode) o;
    return Objects.equals(this.linkMode, synchronousMode.linkMode) &&
        Objects.equals(this.syncModeEnabled, synchronousMode.syncModeEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkMode, syncModeEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SynchronousMode {\n");
    
    sb.append("    linkMode: ").append(toIndentedString(linkMode)).append("\n");
    sb.append("    syncModeEnabled: ").append(toIndentedString(syncModeEnabled)).append("\n");
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

