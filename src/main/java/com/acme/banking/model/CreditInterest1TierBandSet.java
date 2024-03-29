package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.CreditInterest1TierBand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class CreditInterest1TierBandSet {
  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded
   * Interest rates are banded. i.e. Increasing rate on whole balance as balance
   * increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each
   * tier as balance increases, but interest paid on tier fixed for that tier and
   * not on whole balance. 3. Whole The same interest rate is applied irrespective
   * of the PCA balance
   */
  public enum TierBandMethodEnum {
    TIERED("Tiered"),

    WHOLE("Whole");

    private String value;

    TierBandMethodEnum(String value) {
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
    public static TierBandMethodEnum fromValue(String value) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("TierBandMethod")
  private TierBandMethodEnum tierBandMethod;

  /**
   * Methods of calculating interest
   */
  public enum CalculationMethodEnum {
    COMPOUND("Compound"),

    SIMPLEINTEREST("SimpleInterest");

    private String value;

    CalculationMethodEnum(String value) {
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
    public static CalculationMethodEnum fromValue(String value) {
      for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("CalculationMethod")
  private CalculationMethodEnum calculationMethod;

  /**
   * Describes whether accrued interest is payable only to the PCA or to another
   * bank account
   */
  public enum DestinationEnum {
    PAYAWAY("PayAway"),

    SELFCREDIT("SelfCredit");

    private String value;

    DestinationEnum(String value) {
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
    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Destination")
  private DestinationEnum destination;

  @JsonProperty("Notes")

  private List<String> notes = null;

  @JsonProperty("TierBand")

  private List<CreditInterest1TierBand> tierBand = new ArrayList<>();

  public CreditInterest1TierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how credit interest is charged. It can be:- 1. Banded
   * Interest rates are banded. i.e. Increasing rate on whole balance as balance
   * increases. 2. Tiered Interest rates are tiered. i.e. increasing rate for each
   * tier as balance increases, but interest paid on tier fixed for that tier and
   * not on whole balance. 3. Whole The same interest rate is applied irrespective
   * of the PCA balance
   * 
   * @return tierBandMethod
   */
  @ApiModelProperty(required = true, value = "The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public CreditInterest1TierBandSet calculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
    return this;
  }

  /**
   * Methods of calculating interest
   * 
   * @return calculationMethod
   */
  @ApiModelProperty(value = "Methods of calculating interest")
  public CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }

  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    this.calculationMethod = calculationMethod;
  }

  public CreditInterest1TierBandSet destination(DestinationEnum destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Describes whether accrued interest is payable only to the PCA or to another
   * bank account
   * 
   * @return destination
   */
  @ApiModelProperty(value = "Describes whether accrued interest is payable only to the PCA or to another bank account")
  public DestinationEnum getDestination() {
    return destination;
  }

  public void setDestination(DestinationEnum destination) {
    this.destination = destination;
  }

  public CreditInterest1TierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public CreditInterest1TierBandSet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the Tier Band Set details
   * 
   * @return notes
   */
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public CreditInterest1TierBandSet tierBand(List<CreditInterest1TierBand> tierBand) {
    this.tierBand = tierBand;
    return this;
  }

  public CreditInterest1TierBandSet addTierBandItem(CreditInterest1TierBand tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

  /**
   * Tier Band Details
   * 
   * @return tierBand
   */
  @ApiModelProperty(required = true, value = "Tier Band Details")
  public List<CreditInterest1TierBand> getTierBand() {
    return tierBand;
  }

  public void setTierBand(List<CreditInterest1TierBand> tierBand) {
    this.tierBand = tierBand;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditInterest1TierBandSet creditInterest1TierBandSet = (CreditInterest1TierBandSet) o;
    return Objects.equals(this.tierBandMethod, creditInterest1TierBandSet.tierBandMethod)
        && Objects.equals(this.calculationMethod, creditInterest1TierBandSet.calculationMethod)
        && Objects.equals(this.destination, creditInterest1TierBandSet.destination)
        && Objects.equals(this.notes, creditInterest1TierBandSet.notes)
        && Objects.equals(this.tierBand, creditInterest1TierBandSet.tierBand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditInterest1TierBandSet {\n");

    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
