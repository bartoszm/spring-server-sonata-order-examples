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
public enum TaskStateType {
  
  ACKNOWLEDGED("ACKNOWLEDGED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  DONE("DONE"),
  
  TERMINATED_WITH_ERROR("TERMINATED_WITH_ERROR");

  private String value;

  TaskStateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TaskStateType fromValue(String text) {
    for (TaskStateType b : TaskStateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

