package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The kind of responses that the buyer expects to receive from the seller.
 */
public enum DesiredOrderResponses {
  
  CONFIRMATION_AND_ENGINEERING_DESIGN("CONFIRMATION_AND_ENGINEERING_DESIGN"),
  
  CONFIRMATION_ONLY("CONFIRMATION_ONLY"),
  
  NONE("NONE");

  private String value;

  DesiredOrderResponses(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static DesiredOrderResponses fromValue(String text) {
    for (DesiredOrderResponses b : DesiredOrderResponses.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

