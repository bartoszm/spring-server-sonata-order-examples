package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * An enumeration of valid product actions
 */
public enum ProductActionType {
  
  INSTALL("INSTALL"),
  
  CHANGE("CHANGE"),
  
  DISCONNECT("DISCONNECT"),
  
  NO_CHANGE("NO_CHANGE");

  private String value;

  ProductActionType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductActionType fromValue(String text) {
    for (ProductActionType b : ProductActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

