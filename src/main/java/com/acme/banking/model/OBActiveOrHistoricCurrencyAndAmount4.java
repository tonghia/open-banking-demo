package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The amount of the final Standing Order
 */
@ApiModel(description = "The amount of the final Standing Order")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBActiveOrHistoricCurrencyAndAmount4   {
  @JsonProperty("Amount")
  private String amount;

  @JsonProperty("Currency")
  private String currency;

  public OBActiveOrHistoricCurrencyAndAmount4 amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.
   * @return amount
  */
  @ApiModelProperty(required = true, value = "A number of monetary units specified in an active currency where the unit of currency is explicit and compliant with ISO 4217.")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OBActiveOrHistoricCurrencyAndAmount4 currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".
   * @return currency
  */
  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 \"Codes for the representation of currencies and funds\".")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBActiveOrHistoricCurrencyAndAmount4 obActiveOrHistoricCurrencyAndAmount4 = (OBActiveOrHistoricCurrencyAndAmount4) o;
    return Objects.equals(this.amount, obActiveOrHistoricCurrencyAndAmount4.amount) &&
        Objects.equals(this.currency, obActiveOrHistoricCurrencyAndAmount4.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBActiveOrHistoricCurrencyAndAmount4 {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

