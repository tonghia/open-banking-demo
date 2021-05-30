package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBBCAData1;
import com.acme.banking.model.OBPCAData1;
import com.acme.banking.model.OBReadProduct2DataOtherProductType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Product details associated with the Account
 */
@ApiModel(description = "Product details associated with the Account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadProduct2DataProduct {
  @JsonProperty("ProductName")
  private String productName;

  @JsonProperty("ProductId")
  private String productId;

  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("SecondaryProductId")
  private String secondaryProductId;

  /**
   * Product type : Personal Current Account, Business Current Account
   */
  public enum ProductTypeEnum {
    BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),

    COMMERCIALCREDITCARD("CommercialCreditCard"),

    OTHER("Other"),

    PERSONALCURRENTACCOUNT("PersonalCurrentAccount"),

    SMELOAN("SMELoan");

    private String value;

    ProductTypeEnum(String value) {
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
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ProductType")
  private ProductTypeEnum productType;

  @JsonProperty("MarketingStateId")
  private String marketingStateId;

  @JsonProperty("OtherProductType")
  private OBReadProduct2DataOtherProductType otherProductType;

  @JsonProperty("BCA")
  private OBBCAData1 BCA;

  @JsonProperty("PCA")
  private OBPCAData1 PCA;

  public OBReadProduct2DataProduct productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * The name of the Product used for marketing purposes from a customer
   * perspective. I.e. what the customer would recognise.
   * 
   * @return productName
   */
  @ApiModelProperty(value = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OBReadProduct2DataProduct productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The unique ID that has been internally assigned by the financial institution
   * to each of the current account banking products they market to their retail
   * and/or small to medium enterprise (SME) customers.
   * 
   * @return productId
   */
  @ApiModelProperty(value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public OBReadProduct2DataProduct accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This
   * identifier has no meaning to the account owner.
   * 
   * @return accountId
   */
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBReadProduct2DataProduct secondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
    return this;
  }

  /**
   * Any secondary Identification which supports Product Identifier to uniquely
   * identify the current account banking products.
   * 
   * @return secondaryProductId
   */
  @ApiModelProperty(value = "Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.")
  public String getSecondaryProductId() {
    return secondaryProductId;
  }

  public void setSecondaryProductId(String secondaryProductId) {
    this.secondaryProductId = secondaryProductId;
  }

  public OBReadProduct2DataProduct productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Product type : Personal Current Account, Business Current Account
   * 
   * @return productType
   */
  @ApiModelProperty(required = true, value = "Product type : Personal Current Account, Business Current Account")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public OBReadProduct2DataProduct marketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
    return this;
  }

  /**
   * Unique and unambiguous identification of a Product Marketing State.
   * 
   * @return marketingStateId
   */
  @ApiModelProperty(value = "Unique and unambiguous identification of a  Product Marketing State.")
  public String getMarketingStateId() {
    return marketingStateId;
  }

  public void setMarketingStateId(String marketingStateId) {
    this.marketingStateId = marketingStateId;
  }

  public OBReadProduct2DataProduct otherProductType(OBReadProduct2DataOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
    return this;
  }

  /**
   * Get otherProductType
   * 
   * @return otherProductType
   */
  @ApiModelProperty(value = "")
  public OBReadProduct2DataOtherProductType getOtherProductType() {
    return otherProductType;
  }

  public void setOtherProductType(OBReadProduct2DataOtherProductType otherProductType) {
    this.otherProductType = otherProductType;
  }

  public OBReadProduct2DataProduct BCA(OBBCAData1 BCA) {
    this.BCA = BCA;
    return this;
  }

  /**
   * Get BCA
   * 
   * @return BCA
   */
  @ApiModelProperty(value = "")
  public OBBCAData1 getBCA() {
    return BCA;
  }

  public void setBCA(OBBCAData1 BCA) {
    this.BCA = BCA;
  }

  public OBReadProduct2DataProduct PCA(OBPCAData1 PCA) {
    this.PCA = PCA;
    return this;
  }

  /**
   * Get PCA
   * 
   * @return PCA
   */
  @ApiModelProperty(value = "")
  public OBPCAData1 getPCA() {
    return PCA;
  }

  public void setPCA(OBPCAData1 PCA) {
    this.PCA = PCA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadProduct2DataProduct obReadProduct2DataProduct = (OBReadProduct2DataProduct) o;
    return Objects.equals(this.productName, obReadProduct2DataProduct.productName)
        && Objects.equals(this.productId, obReadProduct2DataProduct.productId)
        && Objects.equals(this.accountId, obReadProduct2DataProduct.accountId)
        && Objects.equals(this.secondaryProductId, obReadProduct2DataProduct.secondaryProductId)
        && Objects.equals(this.productType, obReadProduct2DataProduct.productType)
        && Objects.equals(this.marketingStateId, obReadProduct2DataProduct.marketingStateId)
        && Objects.equals(this.otherProductType, obReadProduct2DataProduct.otherProductType)
        && Objects.equals(this.BCA, obReadProduct2DataProduct.BCA)
        && Objects.equals(this.PCA, obReadProduct2DataProduct.PCA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId,
        otherProductType, BCA, PCA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProduct {\n");

    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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
