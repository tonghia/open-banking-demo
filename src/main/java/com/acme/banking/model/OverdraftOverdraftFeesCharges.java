package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OverdraftOverdraftFeeChargeCap;
import com.acme.banking.model.OverdraftOverdraftFeeChargeDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OverdraftOverdraftFeesCharges {
  @JsonProperty("OverdraftFeeChargeCap")

  private List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap = null;

  @JsonProperty("OverdraftFeeChargeDetail")

  private List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail = new ArrayList<>();

  public OverdraftOverdraftFeesCharges overdraftFeeChargeCap(
      List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftOverdraftFeesCharges addOverdraftFeeChargeCapItem(
      OverdraftOverdraftFeeChargeCap overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

  /**
   * Details about any caps (maximum charges) that apply to a particular
   * fee/charge. Capping can either be based on an amount (in gbp), an amount (in
   * items) or a rate.
   * 
   * @return overdraftFeeChargeCap
   */
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.")
  public List<OverdraftOverdraftFeeChargeCap> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }

  public void setOverdraftFeeChargeCap(List<OverdraftOverdraftFeeChargeCap> overdraftFeeChargeCap) {
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }

  public OverdraftOverdraftFeesCharges overdraftFeeChargeDetail(
      List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftOverdraftFeesCharges addOverdraftFeeChargeDetailItem(
      OverdraftOverdraftFeeChargeDetail overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

  /**
   * Details about the fees/charges
   * 
   * @return overdraftFeeChargeDetail
   */
  @ApiModelProperty(required = true, value = "Details about the fees/charges")
  public List<OverdraftOverdraftFeeChargeDetail> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }

  public void setOverdraftFeeChargeDetail(List<OverdraftOverdraftFeeChargeDetail> overdraftFeeChargeDetail) {
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OverdraftOverdraftFeesCharges overdraftOverdraftFeesCharges = (OverdraftOverdraftFeesCharges) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftOverdraftFeesCharges.overdraftFeeChargeCap)
        && Objects.equals(this.overdraftFeeChargeDetail, overdraftOverdraftFeesCharges.overdraftFeeChargeDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftOverdraftFeesCharges {\n");

    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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
