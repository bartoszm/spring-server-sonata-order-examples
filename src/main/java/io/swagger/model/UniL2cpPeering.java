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


public class UniL2cpPeering   {
  @JsonProperty("destAddress")
  private String destAddress = null;

  @JsonProperty("protocolId")
  private String protocolId = null;

  @JsonProperty("linkId")
  private String linkId = null;

  public UniL2cpPeering destAddress(String destAddress) {
    this.destAddress = destAddress;
    return this;
  }

  /**
   * 
   * @return destAddress
  **/
  @ApiModelProperty(value = "")


  public String getDestAddress() {
    return destAddress;
  }

  public void setDestAddress(String destAddress) {
    this.destAddress = destAddress;
  }

  public UniL2cpPeering protocolId(String protocolId) {
    this.protocolId = protocolId;
    return this;
  }

  /**
   * 
   * @return protocolId
  **/
  @ApiModelProperty(value = "")


  public String getProtocolId() {
    return protocolId;
  }

  public void setProtocolId(String protocolId) {
    this.protocolId = protocolId;
  }

  public UniL2cpPeering linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

  /**
   * 
   * @return linkId
  **/
  @ApiModelProperty(value = "")


  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniL2cpPeering uniL2cpPeering = (UniL2cpPeering) o;
    return Objects.equals(this.destAddress, uniL2cpPeering.destAddress) &&
        Objects.equals(this.protocolId, uniL2cpPeering.protocolId) &&
        Objects.equals(this.linkId, uniL2cpPeering.linkId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destAddress, protocolId, linkId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniL2cpPeering {\n");
    
    sb.append("    destAddress: ").append(toIndentedString(destAddress)).append("\n");
    sb.append("    protocolId: ").append(toIndentedString(protocolId)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
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

