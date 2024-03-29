package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * An enumeration of valid pricing methods for ordered items
 */
public enum PricingMethod {
  
  TARIFF("TARIFF"),
  
  CONTRACT("CONTRACT"),
  
  INDIVIDUAL_CASE_BASIS("INDIVIDUAL_CASE_BASIS"),
  
  OTHER("OTHER");

  private String value;

  PricingMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PricingMethod fromValue(String text) {
    for (PricingMethod b : PricingMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

