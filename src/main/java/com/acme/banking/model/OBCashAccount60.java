package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Unambiguous identification of the account of the creditor, in the case of a
 * debit transaction.
 */
@ApiModel(description = "Unambiguous identification of the account of the creditor, in the case of a debit transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBCashAccount60 {
  @JsonProperty("SchemeName")
  private String schemeName;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("SecondaryIdentification")
  private String secondaryIdentification;

  public OBCashAccount60 schemeName(String schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Name of the identification scheme, in a coded form as published in an
   * external list.
   * 
   * @return schemeName
   */
  @ApiModelProperty(value = "Name of the identification scheme, in a coded form as published in an external list.")
  public String getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(String schemeName) {
    this.schemeName = schemeName;
  }

  public OBCashAccount60 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Identification assigned by an institution to identify an account. This
   * identification is known by the account owner.
   * 
   * @return identification
   */
  @ApiModelProperty(value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBCashAccount60 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The account name is the name or names of the account owner(s) represented at
   * an account level, as displayed by the ASPSP's online channels. Note, the
   * account name is not the product name or the nickname of the account.
   * 
   * @return name
   */
  @ApiModelProperty(value = "The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP's online channels. Note, the account name is not the product name or the nickname of the account.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBCashAccount60 secondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
    return this;
  }

  /**
   * This is secondary identification of the account, as assigned by the account
   * servicing institution. This can be used by building societies to additionally
   * identify accounts with a roll number (in addition to a sort code and account
   * number combination).
   * 
   * @return secondaryIdentification
   */
  @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }

  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBCashAccount60 obCashAccount60 = (OBCashAccount60) o;
    return Objects.equals(this.schemeName, obCashAccount60.schemeName)
        && Objects.equals(this.identification, obCashAccount60.identification)
        && Objects.equals(this.name, obCashAccount60.name)
        && Objects.equals(this.secondaryIdentification, obCashAccount60.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBCashAccount60 {\n");

    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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
