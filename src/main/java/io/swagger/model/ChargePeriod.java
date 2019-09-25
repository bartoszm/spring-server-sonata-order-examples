package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Used to describe a charge period for recurring one
 */
public enum ChargePeriod {
  
  DAY("DAY"),
  
  WEEK("WEEK"),
  
  MONTH("MONTH"),
  
  YEAR("YEAR");

  private String value;

  ChargePeriod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ChargePeriod fromValue(String text) {
    for (ChargePeriod b : ChargePeriod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

