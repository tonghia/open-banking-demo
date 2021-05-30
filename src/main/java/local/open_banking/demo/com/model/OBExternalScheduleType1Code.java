package com.acme.banking.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Specifies the scheduled payment date type requested
 */
public enum OBExternalScheduleType1Code {
  
  ARRIVAL("Arrival"),
  
  EXECUTION("Execution");

  private String value;

  OBExternalScheduleType1Code(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OBExternalScheduleType1Code fromValue(String value) {
    for (OBExternalScheduleType1Code b : OBExternalScheduleType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

