package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of order as defined by the business.
 */
public enum OrderActivity {
  
  INSTALL("INSTALL"),
  
  CHANGE("CHANGE"),
  
  DISCONNECT("DISCONNECT");

  private String value;

  OrderActivity(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderActivity fromValue(String text) {
    for (OrderActivity b : OrderActivity.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

