package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap;
import com.acme.banking.model.OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.
 */
@ApiModel(description = "Applicable fee/charges for repayment such as prepayment, full early repayment or non repayment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges   {
  @JsonProperty("RepaymentFeeChargeDetail")
  
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail = new ArrayList<>();

  @JsonProperty("RepaymentFeeChargeCap")
  
  private List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap = null;

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeDetailItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail repaymentFeeChargeDetailItem) {
    this.repaymentFeeChargeDetail.add(repaymentFeeChargeDetailItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeDetail
   * @return repaymentFeeChargeDetail
  */
  @ApiModelProperty(required = true, value = "")
  public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> getRepaymentFeeChargeDetail() {
    return repaymentFeeChargeDetail;
  }

  public void setRepaymentFeeChargeDetail(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetail> repaymentFeeChargeDetail) {
    this.repaymentFeeChargeDetail = repaymentFeeChargeDetail;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges repaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
    return this;
  }

  public OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges addRepaymentFeeChargeCapItem(OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap repaymentFeeChargeCapItem) {
    if (this.repaymentFeeChargeCap == null) {
      this.repaymentFeeChargeCap = new ArrayList<>();
    }
    this.repaymentFeeChargeCap.add(repaymentFeeChargeCapItem);
    return this;
  }

  /**
   * Get repaymentFeeChargeCap
   * @return repaymentFeeChargeCap
  */
  @ApiModelProperty(value = "")
  public List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> getRepaymentFeeChargeCap() {
    return repaymentFeeChargeCap;
  }

  public void setRepaymentFeeChargeCap(List<OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCap> repaymentFeeChargeCap) {
    this.repaymentFeeChargeCap = repaymentFeeChargeCap;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges = (OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges) o;
    return Objects.equals(this.repaymentFeeChargeDetail, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeDetail) &&
        Objects.equals(this.repaymentFeeChargeCap, obReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges.repaymentFeeChargeCap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentFeeChargeDetail, repaymentFeeChargeCap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeRepaymentRepaymentFeeCharges {\n");
    
    sb.append("    repaymentFeeChargeDetail: ").append(toIndentedString(repaymentFeeChargeDetail)).append("\n");
    sb.append("    repaymentFeeChargeCap: ").append(toIndentedString(repaymentFeeChargeCap)).append("\n");
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

