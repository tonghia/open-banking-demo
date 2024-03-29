package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Range or amounts or rates for which the fee/charge applies
 */
@ApiModel(description = "Range or amounts or rates for which the fee/charge applies")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadProduct2DataOtherProductTypeFeeApplicableRange {
  @JsonProperty("MinimumAmount")
  private String minimumAmount;

  @JsonProperty("MaximumAmount")
  private String maximumAmount;

  @JsonProperty("MinimumRate")
  private String minimumRate;

  @JsonProperty("MaximumRate")
  private String maximumRate;

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
    return this;
  }

  /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an
   * amount)
   * 
   * @return minimumAmount
   */
  @ApiModelProperty(value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")
  public String getMinimumAmount() {
    return minimumAmount;
  }

  public void setMinimumAmount(String minimumAmount) {
    this.minimumAmount = minimumAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
    return this;
  }

  /**
   * Maximum Amount on which fee is applicable (where it is expressed as an
   * amount)
   * 
   * @return maximumAmount
   */
  @ApiModelProperty(value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")
  public String getMaximumAmount() {
    return maximumAmount;
  }

  public void setMaximumAmount(String maximumAmount) {
    this.maximumAmount = maximumAmount;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange minimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
    return this;
  }

  /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an
   * rate)
   * 
   * @return minimumRate
   */
  @ApiModelProperty(value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")
  public String getMinimumRate() {
    return minimumRate;
  }

  public void setMinimumRate(String minimumRate) {
    this.minimumRate = minimumRate;
  }

  public OBReadProduct2DataOtherProductTypeFeeApplicableRange maximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
    return this;
  }

  /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an
   * rate)
   * 
   * @return maximumRate
   */
  @ApiModelProperty(value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")
  public String getMaximumRate() {
    return maximumRate;
  }

  public void setMaximumRate(String maximumRate) {
    this.maximumRate = maximumRate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataOtherProductTypeFeeApplicableRange obReadProduct2DataOtherProductTypeFeeApplicableRange = (OBReadProduct2DataOtherProductTypeFeeApplicableRange) o;
    return Objects.equals(this.minimumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumAmount)
        && Objects.equals(this.maximumAmount, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumAmount)
        && Objects.equals(this.minimumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.minimumRate)
        && Objects.equals(this.maximumRate, obReadProduct2DataOtherProductTypeFeeApplicableRange.maximumRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataOtherProductTypeFeeApplicableRange {\n");

    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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
