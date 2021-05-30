package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details about the interest that may be payable to the SME Loan holders
 */
@ApiModel(description = "Details about the interest that may be payable to the SME Loan holders")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadProduct2DataOtherProductTypeLoanInterest {
  @JsonProperty("Notes")

  private List<String> notes = null;

  @JsonProperty("LoanInterestTierBandSet")

  private List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet = new ArrayList<>();

  public OBReadProduct2DataOtherProductTypeLoanInterest notes(List<String> notes) {
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

  /**
   * Get notes
   * 
   * @return notes
   */
  @ApiModelProperty(value = "")
  public List<String> getNotes() {
    return notes;
  }

  public void setNotes(List<String> notes) {
    this.notes = notes;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest loanInterestTierBandSet(
      List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(
      OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

  /**
   * Get loanInterestTierBandSet
   * 
   * @return loanInterestTierBandSet
   */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }

  public void setLoanInterestTierBandSet(
      List<OBReadProduct2DataOtherProductTypeLoanInterestLoanInterestTierBandSet> loanInterestTierBandSet) {
    this.loanInterestTierBandSet = loanInterestTierBandSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeLoanInterest obReadProduct2DataOtherProductTypeLoanInterest = (OBReadProduct2DataOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataOtherProductTypeLoanInterest.notes) && Objects
        .equals(this.loanInterestTierBandSet, obReadProduct2DataOtherProductTypeLoanInterest.loanInterestTierBandSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeLoanInterest {\n");

    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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
