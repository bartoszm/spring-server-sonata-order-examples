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
public enum PhysicalLayer {
  
  _10BASE_T("10BASE-T"),
  
  _100BASE_TX("100BASE-TX"),
  
  _100BASE_FX("100BASE-FX"),
  
  _1000BASE_T("1000BASE-T"),
  
  _1000BASE_SX("1000BASE-SX"),
  
  _1000BASE_LX("1000BASE-LX"),
  
  _10GBASE_SR("10GBASE-SR"),
  
  _10GBASE_SW("10GBASE-SW"),
  
  _10GBASE_LR("10GBASE-LR"),
  
  _10GBASE_LX4("10GBASE-LX4"),
  
  _10GBASE_LW("10GBASE-LW"),
  
  _10GBASE_ER("10GBASE-ER"),
  
  _10GBASE_EW("10GBASE-EW");

  private String value;

  PhysicalLayer(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PhysicalLayer fromValue(String text) {
    for (PhysicalLayer b : PhysicalLayer.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

