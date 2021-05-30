package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBPostalAddress6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Party that manages the account on behalf of the account owner, that is
 * manages the registration and booking of entries on the account, calculates
 * balances on the account and provides information about the account. This is
 * the servicer of the beneficiary account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBBranchAndFinancialInstitutionIdentification60 {
  @JsonProperty("SchemeName")
  private String schemeName;

  @JsonProperty("Identification")
  private String identification;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("PostalAddress")
  private OBPostalAddress6 postalAddress;

  public OBBranchAndFinancialInstitutionIdentification60 schemeName(String schemeName) {
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

  public OBBranchAndFinancialInstitutionIdentification60 identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Unique and unambiguous identification of the servicing institution.
   * 
   * @return identification
   */
  @ApiModelProperty(value = "Unique and unambiguous identification of the servicing institution.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public OBBranchAndFinancialInstitutionIdentification60 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name by which an agent is known and which is usually used to identify that
   * agent.
   * 
   * @return name
   */
  @ApiModelProperty(value = "Name by which an agent is known and which is usually used to identify that agent.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBBranchAndFinancialInstitutionIdentification60 postalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Get postalAddress
   * 
   * @return postalAddress
   */
  @ApiModelProperty(value = "")
  public OBPostalAddress6 getPostalAddress() {
    return postalAddress;
  }

  public void setPostalAddress(OBPostalAddress6 postalAddress) {
    this.postalAddress = postalAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBranchAndFinancialInstitutionIdentification60 obBranchAndFinancialInstitutionIdentification60 = (OBBranchAndFinancialInstitutionIdentification60) o;
    return Objects.equals(this.schemeName, obBranchAndFinancialInstitutionIdentification60.schemeName)
        && Objects.equals(this.identification, obBranchAndFinancialInstitutionIdentification60.identification)
        && Objects.equals(this.name, obBranchAndFinancialInstitutionIdentification60.name)
        && Objects.equals(this.postalAddress, obBranchAndFinancialInstitutionIdentification60.postalAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, postalAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBranchAndFinancialInstitutionIdentification60 {\n");

    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    postalAddress: ").append(toIndentedString(postalAddress)).append("\n");
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
