package com.acme.banking.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Statement type, in a coded form.
 */
public enum OBExternalStatementType1Code {

  ACCOUNTCLOSURE("AccountClosure"),

  ACCOUNTOPENING("AccountOpening"),

  ANNUAL("Annual"),

  INTERIM("Interim"),

  REGULARPERIODIC("RegularPeriodic");

  private String value;

  OBExternalStatementType1Code(String value) {
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
  public static OBExternalStatementType1Code fromValue(String value) {
    for (OBExternalStatementType1Code b : OBExternalStatementType1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
