package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * An enumeration of valid order states
 */
public enum ProductOrderStateType {
  
  ACKNOWLEDGED("ACKNOWLEDGED"),
  
  REJECTED("REJECTED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  PENDING("PENDING"),
  
  HELD("HELD"),
  
  ASSESSING_CANCELLATION("ASSESSING_CANCELLATION"),
  
  PENDING_CANCELLATION("PENDING_CANCELLATION"),
  
  CANCELLED("CANCELLED"),
  
  CONFIGURED("CONFIGURED"),
  
  CONFIRMED("CONFIRMED"),
  
  JEOPARDY("JEOPARDY"),
  
  FAILED("FAILED"),
  
  PARTIAL("PARTIAL"),
  
  COMPLETED("COMPLETED");

  private String value;

  ProductOrderStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ProductOrderStateType fromValue(String text) {
    for (ProductOrderStateType b : ProductOrderStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

