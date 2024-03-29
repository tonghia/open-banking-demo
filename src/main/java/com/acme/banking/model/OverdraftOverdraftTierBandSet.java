package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OverdraftOverdraftFeesCharges1;
import com.acme.banking.model.OverdraftOverdraftTierBand;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Tier band set details
 */
@ApiModel(description = "Tier band set details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OverdraftOverdraftTierBandSet {
  /**
   * The methodology of how overdraft is charged. It can be: 'Whole' Where the
   * same charge/rate is applied to the entirety of the overdraft balance (where
   * charges are applicable). 'Tiered' Where different charges/rates are applied
   * dependent on overdraft maximum and minimum balance amount tiers defined by
   * the lending financial organisation 'Banded' Where different charges/rates are
   * applied dependent on overdraft maximum and minimum balance amount bands
   * defined by a government organisation.
   */
  public enum TierBandMethodEnum {
    BANDED("Banded"),

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
   * An overdraft can either be 'committed' which means that the facility cannot
   * be withdrawn without reasonable notification before it's agreed end date, or
   * 'on demand' which means that the financial institution can demand repayment
   * at any point in time.
   */
  public enum OverdraftTypeEnum {
    COMMITTED("Committed"),

    ONDEMAND("OnDemand");

    private String value;

    OverdraftTypeEnum(String value) {
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
    public static OverdraftTypeEnum fromValue(String value) {
      for (OverdraftTypeEnum b : OverdraftTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("OverdraftType")
  private OverdraftTypeEnum overdraftType;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("AuthorisedIndicator")
  private Boolean authorisedIndicator;

  @JsonProperty("BufferAmount")
  private String bufferAmount;

  @JsonProperty("Notes")

  private List<String> notes = null;

  @JsonProperty("OverdraftTierBand")

  private List<OverdraftOverdraftTierBand> overdraftTierBand = new ArrayList<>();

  @JsonProperty("OverdraftFeesCharges")

  private List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges = null;

  public OverdraftOverdraftTierBandSet tierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
    return this;
  }

  /**
   * The methodology of how overdraft is charged. It can be: 'Whole' Where the
   * same charge/rate is applied to the entirety of the overdraft balance (where
   * charges are applicable). 'Tiered' Where different charges/rates are applied
   * dependent on overdraft maximum and minimum balance amount tiers defined by
   * the lending financial organisation 'Banded' Where different charges/rates are
   * applied dependent on overdraft maximum and minimum balance amount bands
   * defined by a government organisation.
   * 
   * @return tierBandMethod
   */
  @ApiModelProperty(required = true, value = "The methodology of how overdraft is charged. It can be: 'Whole'  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  'Tiered' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation 'Banded' Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation.")
  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }

  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    this.tierBandMethod = tierBandMethod;
  }

  public OverdraftOverdraftTierBandSet overdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
    return this;
  }

  /**
   * An overdraft can either be 'committed' which means that the facility cannot
   * be withdrawn without reasonable notification before it's agreed end date, or
   * 'on demand' which means that the financial institution can demand repayment
   * at any point in time.
   * 
   * @return overdraftType
   */
  @ApiModelProperty(value = "An overdraft can either be 'committed' which means that the facility cannot be withdrawn without reasonable notification before it's agreed end date, or 'on demand' which means that the financial institution can demand repayment at any point in time.")
  public OverdraftTypeEnum getOverdraftType() {
    return overdraftType;
  }

  public void setOverdraftType(OverdraftTypeEnum overdraftType) {
    this.overdraftType = overdraftType;
  }

  public OverdraftOverdraftTierBandSet identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of a Tier Band for a overdraft product.
   * 
   * @return identification
   */
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Tier Band for a overdraft product.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OverdraftOverdraftTierBandSet authorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
    return this;
  }

  /**
   * Indicates if the Overdraft is authorised (Y) or unauthorised (N)
   * 
   * @return authorisedIndicator
   */
  @ApiModelProperty(value = "Indicates if the Overdraft is authorised (Y) or unauthorised (N)")
  public Boolean getAuthorisedIndicator() {
    return authorisedIndicator;
  }

  public void setAuthorisedIndicator(Boolean authorisedIndicator) {
    this.authorisedIndicator = authorisedIndicator;
  }

  public OverdraftOverdraftTierBandSet bufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
    return this;
  }

  /**
   * When a customer exceeds their credit limit, a financial institution will not
   * charge the customer unauthorised overdraft charges if they do not exceed by
   * more than the buffer amount. Note: Authorised overdraft charges may still
   * apply.
   * 
   * @return bufferAmount
   */
  @ApiModelProperty(value = "When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply.")
  public String getBufferAmount() {
    return bufferAmount;
  }

  public void setBufferAmount(String bufferAmount) {
    this.bufferAmount = bufferAmount;
  }

  public OverdraftOverdraftTierBandSet notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OverdraftOverdraftTierBandSet addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Optional additional notes to supplement the overdraft Tier Band Set details
   * 
   * @return notes
   */
  @ApiModelProperty(value = "Optional additional notes to supplement the overdraft Tier Band Set details")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OverdraftOverdraftTierBandSet overdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
    return this;
  }

  public OverdraftOverdraftTierBandSet addOverdraftTierBandItem(OverdraftOverdraftTierBand overdraftTierBandItem) {
    this.overdraftTierBand.add(overdraftTierBandItem);
    return this;
  }

  /**
   * Provides overdraft details for a specific tier or band
   * 
   * @return overdraftTierBand
   */
  @ApiModelProperty(required = true, value = "Provides overdraft details for a specific tier or band")
  public List<OverdraftOverdraftTierBand> getOverdraftTierBand() {
    return overdraftTierBand;
  }

  public void setOverdraftTierBand(List<OverdraftOverdraftTierBand> overdraftTierBand) {
    this.overdraftTierBand = overdraftTierBand;
  }

  public OverdraftOverdraftTierBandSet overdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftOverdraftTierBandSet addOverdraftFeesChargesItem(
      OverdraftOverdraftFeesCharges1 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

  /**
   * Overdraft fees and charges details
   * 
   * @return overdraftFeesCharges
   */
  @ApiModelProperty(value = "Overdraft fees and charges details")
  public List<OverdraftOverdraftFeesCharges1> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }

  public void setOverdraftFeesCharges(List<OverdraftOverdraftFeesCharges1> overdraftFeesCharges) {
    this.overdraftFeesCharges = overdraftFeesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftOverdraftTierBandSet overdraftOverdraftTierBandSet = (OverdraftOverdraftTierBandSet) o;
    return Objects.equals(this.tierBandMethod, overdraftOverdraftTierBandSet.tierBandMethod)
        && Objects.equals(this.overdraftType, overdraftOverdraftTierBandSet.overdraftType)
        && Objects.equals(this.identification, overdraftOverdraftTierBandSet.identification)
        && Objects.equals(this.authorisedIndicator, overdraftOverdraftTierBandSet.authorisedIndicator)
        && Objects.equals(this.bufferAmount, overdraftOverdraftTierBandSet.bufferAmount)
        && Objects.equals(this.notes, overdraftOverdraftTierBandSet.notes)
        && Objects.equals(this.overdraftTierBand, overdraftOverdraftTierBandSet.overdraftTierBand)
        && Objects.equals(this.overdraftFeesCharges, overdraftOverdraftTierBandSet.overdraftFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, overdraftType, identification, authorisedIndicator, bufferAmount, notes,
        overdraftTierBand, overdraftFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftTierBandSet {\n");

    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    overdraftType: ").append(toIndentedString(overdraftType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    authorisedIndicator: ").append(toIndentedString(authorisedIndicator)).append("\n");
    sb.append("    bufferAmount: ").append(toIndentedString(bufferAmount)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftTierBand: ").append(toIndentedString(overdraftTierBand)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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
