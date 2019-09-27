package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Characteristic;
import io.swagger.model.L2CP;
import io.swagger.model.PhysicalLayer;
import io.swagger.model.Resiliency;
import io.swagger.model.SynchronousMode;
import io.swagger.model.UniL2cpPeering;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Description of UNISpec for Ordering- source 57.1
 */
@ApiModel(description = "Description of UNISpec for Ordering- source 57.1")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-27T11:12:00.321Z")

public class UNISpec extends Characteristic  {
  @JsonProperty("physicalLayer")
  @Valid
  private List<PhysicalLayer> physicalLayer = new ArrayList<PhysicalLayer>();

  @JsonProperty("synchronousMode")
  @Valid
  private List<SynchronousMode> synchronousMode = null;

  @JsonProperty("numberOfLinks")
  private Integer numberOfLinks = null;

  @JsonProperty("tokenShareEnabled")
  private Boolean tokenShareEnabled = false;

  @JsonProperty("uniResiliency")
  private Resiliency uniResiliency = null;

  @JsonProperty("maxServiceFrameSize")
  private Integer maxServiceFrameSize = null;

  @JsonProperty("allToOneBundling")
  private Boolean allToOneBundling = false;

  @JsonProperty("linkOamEnabled")
  private Boolean linkOamEnabled = false;

  @JsonProperty("uniMegEnabled")
  private Boolean uniMegEnabled = false;

  @JsonProperty("uniEthernetLmiEnabled")
  private Boolean uniEthernetLmiEnabled = false;

  @JsonProperty("uniL2cpAddressSet")
  private L2CP uniL2cpAddressSet = null;

  @JsonProperty("uniL2cpPeering")
  @Valid
  private List<UniL2cpPeering> uniL2cpPeering = null;

  public UNISpec physicalLayer(List<PhysicalLayer> physicalLayer) {
    this.physicalLayer = physicalLayer;
    return this;
  }

  public UNISpec addPhysicalLayerItem(PhysicalLayer physicalLayerItem) {
    this.physicalLayer.add(physicalLayerItem);
    return this;
  }

  /**
   * This attribute is a list of physical layers, one for each physical link implementing the UNI
   * @return physicalLayer
  **/
  @ApiModelProperty(required = true, value = "This attribute is a list of physical layers, one for each physical link implementing the UNI")
  @NotNull

  @Valid

  public List<PhysicalLayer> getPhysicalLayer() {
    return physicalLayer;
  }

  public void setPhysicalLayer(List<PhysicalLayer> physicalLayer) {
    this.physicalLayer = physicalLayer;
  }

  public UNISpec synchronousMode(List<SynchronousMode> synchronousMode) {
    this.synchronousMode = synchronousMode;
    return this;
  }

  public UNISpec addSynchronousModeItem(SynchronousMode synchronousModeItem) {
    if (this.synchronousMode == null) {
      this.synchronousMode = new ArrayList<SynchronousMode>();
    }
    this.synchronousMode.add(synchronousModeItem);
    return this;
  }

  /**
   * The Synchronous Mode Service Attribute is a list with one item for each of the physical links implementing the UNI. When the value of an item is \"Enabled,\" the bits transmitted from the CEN to the CE on the physical link corresponding to the item can be used by the CE as a bit clock reference
   * @return synchronousMode
  **/
  @ApiModelProperty(value = "The Synchronous Mode Service Attribute is a list with one item for each of the physical links implementing the UNI. When the value of an item is \"Enabled,\" the bits transmitted from the CEN to the CE on the physical link corresponding to the item can be used by the CE as a bit clock reference")

  @Valid

  public List<SynchronousMode> getSynchronousMode() {
    return synchronousMode;
  }

  public void setSynchronousMode(List<SynchronousMode> synchronousMode) {
    this.synchronousMode = synchronousMode;
  }

  public UNISpec numberOfLinks(Integer numberOfLinks) {
    this.numberOfLinks = numberOfLinks;
    return this;
  }

  /**
   * A UNI can be implemented with one or more physical links. This attribute specifies the number of such links.
   * @return numberOfLinks
  **/
  @ApiModelProperty(value = "A UNI can be implemented with one or more physical links. This attribute specifies the number of such links.")


  public Integer getNumberOfLinks() {
    return numberOfLinks;
  }

  public void setNumberOfLinks(Integer numberOfLinks) {
    this.numberOfLinks = numberOfLinks;
  }

  public UNISpec tokenShareEnabled(Boolean tokenShareEnabled) {
    this.tokenShareEnabled = tokenShareEnabled;
    return this;
  }

  /**
   * Identifies whether a given UNI is capable of sharing tokens across Bandwidth Profile Flows in an Envelope.  The default is disabled (\"false\").
   * @return tokenShareEnabled
  **/
  @ApiModelProperty(value = "Identifies whether a given UNI is capable of sharing tokens across Bandwidth Profile Flows in an Envelope.  The default is disabled (\"false\").")


  public Boolean isTokenShareEnabled() {
    return tokenShareEnabled;
  }

  public void setTokenShareEnabled(Boolean tokenShareEnabled) {
    this.tokenShareEnabled = tokenShareEnabled;
  }

  public UNISpec uniResiliency(Resiliency uniResiliency) {
    this.uniResiliency = uniResiliency;
    return this;
  }

  /**
   * The UNI Resiliency Service Attribute value can be \"None,\" \"2-Link Aggregation,\" or \"Other.\"
   * @return uniResiliency
  **/
  @ApiModelProperty(value = "The UNI Resiliency Service Attribute value can be \"None,\" \"2-Link Aggregation,\" or \"Other.\"")

  @Valid

  public Resiliency getUniResiliency() {
    return uniResiliency;
  }

  public void setUniResiliency(Resiliency uniResiliency) {
    this.uniResiliency = uniResiliency;
  }

  public UNISpec maxServiceFrameSize(Integer maxServiceFrameSize) {
    this.maxServiceFrameSize = maxServiceFrameSize;
    return this;
  }

  /**
   * Indicates the maximum service frame size that can be reliably processed at the UNI level
   * minimum: 1522
   * @return maxServiceFrameSize
  **/
  @ApiModelProperty(value = "Indicates the maximum service frame size that can be reliably processed at the UNI level")

@Min(1522)
  public Integer getMaxServiceFrameSize() {
    return maxServiceFrameSize;
  }

  public void setMaxServiceFrameSize(Integer maxServiceFrameSize) {
    this.maxServiceFrameSize = maxServiceFrameSize;
  }

  public UNISpec allToOneBundling(Boolean allToOneBundling) {
    this.allToOneBundling = allToOneBundling;
    return this;
  }

  /**
   * All-to-One Bundling can be either Enabled or Disabled. A value of True would equate to Enabled
   * @return allToOneBundling
  **/
  @ApiModelProperty(value = "All-to-One Bundling can be either Enabled or Disabled. A value of True would equate to Enabled")


  public Boolean isAllToOneBundling() {
    return allToOneBundling;
  }

  public void setAllToOneBundling(Boolean allToOneBundling) {
    this.allToOneBundling = allToOneBundling;
  }

  public UNISpec linkOamEnabled(Boolean linkOamEnabled) {
    this.linkOamEnabled = linkOamEnabled;
    return this;
  }

  /**
   * Link OAM enables the operator to monitor and troubleshoot a single Ethernet link.
   * @return linkOamEnabled
  **/
  @ApiModelProperty(value = "Link OAM enables the operator to monitor and troubleshoot a single Ethernet link.")


  public Boolean isLinkOamEnabled() {
    return linkOamEnabled;
  }

  public void setLinkOamEnabled(Boolean linkOamEnabled) {
    this.linkOamEnabled = linkOamEnabled;
  }

  public UNISpec uniMegEnabled(Boolean uniMegEnabled) {
    this.uniMegEnabled = uniMegEnabled;
    return this;
  }

  /**
   * Request for monitoring of a UNI.
   * @return uniMegEnabled
  **/
  @ApiModelProperty(value = "Request for monitoring of a UNI.")


  public Boolean isUniMegEnabled() {
    return uniMegEnabled;
  }

  public void setUniMegEnabled(Boolean uniMegEnabled) {
    this.uniMegEnabled = uniMegEnabled;
  }

  public UNISpec uniEthernetLmiEnabled(Boolean uniEthernetLmiEnabled) {
    this.uniEthernetLmiEnabled = uniEthernetLmiEnabled;
    return this;
  }

  /**
   * Indicates the desire for management of the customer interface. For ordering, this is an optional parameter that may be requested
   * @return uniEthernetLmiEnabled
  **/
  @ApiModelProperty(value = "Indicates the desire for management of the customer interface. For ordering, this is an optional parameter that may be requested")


  public Boolean isUniEthernetLmiEnabled() {
    return uniEthernetLmiEnabled;
  }

  public void setUniEthernetLmiEnabled(Boolean uniEthernetLmiEnabled) {
    this.uniEthernetLmiEnabled = uniEthernetLmiEnabled;
  }

  public UNISpec uniL2cpAddressSet(L2CP uniL2cpAddressSet) {
    this.uniL2cpAddressSet = uniL2cpAddressSet;
    return this;
  }

  /**
   * Identifies the discard/pass action for all non-peered layer two control protocols.
   * @return uniL2cpAddressSet
  **/
  @ApiModelProperty(value = "Identifies the discard/pass action for all non-peered layer two control protocols.")

  @Valid

  public L2CP getUniL2cpAddressSet() {
    return uniL2cpAddressSet;
  }

  public void setUniL2cpAddressSet(L2CP uniL2cpAddressSet) {
    this.uniL2cpAddressSet = uniL2cpAddressSet;
  }

  public UNISpec uniL2cpPeering(List<UniL2cpPeering> uniL2cpPeering) {
    this.uniL2cpPeering = uniL2cpPeering;
    return this;
  }

  public UNISpec addUniL2cpPeeringItem(UniL2cpPeering uniL2cpPeeringItem) {
    if (this.uniL2cpPeering == null) {
      this.uniL2cpPeering = new ArrayList<UniL2cpPeering>();
    }
    this.uniL2cpPeering.add(uniL2cpPeeringItem);
    return this;
  }

  /**
   * Can be either an empty list, or a list of entries identifying protocols to be peered where each entry consists of {Destination Address, Protocol Identifier} or {Destination Address, Protocol Identifier, Link Identifier}.
   * @return uniL2cpPeering
  **/
  @ApiModelProperty(value = "Can be either an empty list, or a list of entries identifying protocols to be peered where each entry consists of {Destination Address, Protocol Identifier} or {Destination Address, Protocol Identifier, Link Identifier}.")

  @Valid

  public List<UniL2cpPeering> getUniL2cpPeering() {
    return uniL2cpPeering;
  }

  public void setUniL2cpPeering(List<UniL2cpPeering> uniL2cpPeering) {
    this.uniL2cpPeering = uniL2cpPeering;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UNISpec unISpec = (UNISpec) o;
    return Objects.equals(this.physicalLayer, unISpec.physicalLayer) &&
        Objects.equals(this.synchronousMode, unISpec.synchronousMode) &&
        Objects.equals(this.numberOfLinks, unISpec.numberOfLinks) &&
        Objects.equals(this.tokenShareEnabled, unISpec.tokenShareEnabled) &&
        Objects.equals(this.uniResiliency, unISpec.uniResiliency) &&
        Objects.equals(this.maxServiceFrameSize, unISpec.maxServiceFrameSize) &&
        Objects.equals(this.allToOneBundling, unISpec.allToOneBundling) &&
        Objects.equals(this.linkOamEnabled, unISpec.linkOamEnabled) &&
        Objects.equals(this.uniMegEnabled, unISpec.uniMegEnabled) &&
        Objects.equals(this.uniEthernetLmiEnabled, unISpec.uniEthernetLmiEnabled) &&
        Objects.equals(this.uniL2cpAddressSet, unISpec.uniL2cpAddressSet) &&
        Objects.equals(this.uniL2cpPeering, unISpec.uniL2cpPeering) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(physicalLayer, synchronousMode, numberOfLinks, tokenShareEnabled, uniResiliency, maxServiceFrameSize, allToOneBundling, linkOamEnabled, uniMegEnabled, uniEthernetLmiEnabled, uniL2cpAddressSet, uniL2cpPeering, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UNISpec {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    physicalLayer: ").append(toIndentedString(physicalLayer)).append("\n");
    sb.append("    synchronousMode: ").append(toIndentedString(synchronousMode)).append("\n");
    sb.append("    numberOfLinks: ").append(toIndentedString(numberOfLinks)).append("\n");
    sb.append("    tokenShareEnabled: ").append(toIndentedString(tokenShareEnabled)).append("\n");
    sb.append("    uniResiliency: ").append(toIndentedString(uniResiliency)).append("\n");
    sb.append("    maxServiceFrameSize: ").append(toIndentedString(maxServiceFrameSize)).append("\n");
    sb.append("    allToOneBundling: ").append(toIndentedString(allToOneBundling)).append("\n");
    sb.append("    linkOamEnabled: ").append(toIndentedString(linkOamEnabled)).append("\n");
    sb.append("    uniMegEnabled: ").append(toIndentedString(uniMegEnabled)).append("\n");
    sb.append("    uniEthernetLmiEnabled: ").append(toIndentedString(uniEthernetLmiEnabled)).append("\n");
    sb.append("    uniL2cpAddressSet: ").append(toIndentedString(uniL2cpAddressSet)).append("\n");
    sb.append("    uniL2cpPeering: ").append(toIndentedString(uniL2cpPeering)).append("\n");
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

