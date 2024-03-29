package com.acme.banking.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * How frequently the fee/charge is calculated
 */
public enum OBFeeFrequency1Code3 {

  FEAC("FEAC"),

  FEAO("FEAO"),

  FECP("FECP"),

  FEDA("FEDA"),

  FEHO("FEHO"),

  FEI("FEI"),

  FEMO("FEMO"),

  FEOA("FEOA"),

  FEOT("FEOT"),

  FEPC("FEPC"),

  FEPH("FEPH"),

  FEPO("FEPO"),

  FEPS("FEPS"),

  FEPT("FEPT"),

  FEPTA("FEPTA"),

  FEPTP("FEPTP"),

  FEQU("FEQU"),

  FESM("FESM"),

  FEST("FEST"),

  FEWE("FEWE"),

  FEYE("FEYE");

  private String value;

  OBFeeFrequency1Code3(String value) {
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
  public static OBFeeFrequency1Code3 fromValue(String value) {
    for (OBFeeFrequency1Code3 b : OBFeeFrequency1Code3.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
