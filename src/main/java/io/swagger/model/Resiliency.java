package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum Resiliency {
  
  NONE("NONE"),
  
  _2_LINK_ACTIVE_STANDBY("2_LINK_ACTIVE_STANDBY"),
  
  ALL_ACTIVE("ALL_ACTIVE"),
  
  OTHER("OTHER");

  private String value;

  Resiliency(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Resiliency fromValue(String text) {
    for (Resiliency b : Resiliency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

