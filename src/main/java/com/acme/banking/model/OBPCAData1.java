package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.CreditInterest1;
import com.acme.banking.model.OtherFeesCharges;
import com.acme.banking.model.Overdraft1;
import com.acme.banking.model.ProductDetails1;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBPCAData1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBPCAData1 {
  @JsonProperty("ProductDetails")
  private ProductDetails1 productDetails;

  @JsonProperty("CreditInterest")
  private CreditInterest1 creditInterest;

  @JsonProperty("Overdraft")
  private Overdraft1 overdraft;

  @JsonProperty("OtherFeesCharges")
  private OtherFeesCharges otherFeesCharges;

  public OBPCAData1 productDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * Get productDetails
   * 
   * @return productDetails
   */
  @ApiModelProperty(value = "")
  public ProductDetails1 getProductDetails() {
    return productDetails;
  }

  public void setProductDetails(ProductDetails1 productDetails) {
    this.productDetails = productDetails;
  }

  public OBPCAData1 creditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
    return this;
  }

  /**
   * Get creditInterest
   * 
   * @return creditInterest
   */
  @ApiModelProperty(value = "")
  public CreditInterest1 getCreditInterest() {
    return creditInterest;
  }

  public void setCreditInterest(CreditInterest1 creditInterest) {
    this.creditInterest = creditInterest;
  }

  public OBPCAData1 overdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
    return this;
  }

  /**
   * Get overdraft
   * 
   * @return overdraft
   */
  @ApiModelProperty(value = "")
  public Overdraft1 getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(Overdraft1 overdraft) {
    this.overdraft = overdraft;
  }

  public OBPCAData1 otherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
    return this;
  }

  /**
   * Get otherFeesCharges
   * 
   * @return otherFeesCharges
   */
  @ApiModelProperty(value = "")
  public OtherFeesCharges getOtherFeesCharges() {
    return otherFeesCharges;
  }

  public void setOtherFeesCharges(OtherFeesCharges otherFeesCharges) {
    this.otherFeesCharges = otherFeesCharges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBPCAData1 obPCAData1 = (OBPCAData1) o;
    return Objects.equals(this.productDetails, obPCAData1.productDetails)
        && Objects.equals(this.creditInterest, obPCAData1.creditInterest)
        && Objects.equals(this.overdraft, obPCAData1.overdraft)
        && Objects.equals(this.otherFeesCharges, obPCAData1.otherFeesCharges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productDetails, creditInterest, overdraft, otherFeesCharges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBPCAData1 {\n");

    sb.append("    productDetails: ").append(toIndentedString(productDetails)).append("\n");
    sb.append("    creditInterest: ").append(toIndentedString(creditInterest)).append("\n");
    sb.append("    overdraft: ").append(toIndentedString(overdraft)).append("\n");
    sb.append("    otherFeesCharges: ").append(toIndentedString(otherFeesCharges)).append("\n");
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
