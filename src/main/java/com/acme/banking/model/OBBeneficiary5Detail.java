package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBBeneficiaryType1Code;
import com.acme.banking.model.OBBranchAndFinancialInstitutionIdentification60;
import com.acme.banking.model.OBCashAccount50;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBBeneficiary5Detail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBBeneficiary5Detail {
  @JsonProperty("AccountId")
  private String accountId;

  @JsonProperty("BeneficiaryId")
  private String beneficiaryId;

  @JsonProperty("BeneficiaryType")
  private OBBeneficiaryType1Code beneficiaryType;

  @JsonProperty("Reference")
  private String reference;

  @JsonProperty("SupplementaryData")
  private Object supplementaryData;

  @JsonProperty("CreditorAgent")
  private OBBranchAndFinancialInstitutionIdentification60 creditorAgent;

  @JsonProperty("CreditorAccount")
  private OBCashAccount50 creditorAccount;

  public OBBeneficiary5Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This
   * identifier has no meaning to the account owner.
   * 
   * @return accountId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBBeneficiary5Detail beneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the beneficiary resource.
   * This identifier has no meaning to the account owner.
   * 
   * @return beneficiaryId
   */
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")
  public String getBeneficiaryId() {
    return beneficiaryId;
  }

  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  public OBBeneficiary5Detail beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
    return this;
  }

  /**
   * Get beneficiaryType
   * 
   * @return beneficiaryType
   */
  @ApiModelProperty(value = "")
  public OBBeneficiaryType1Code getBeneficiaryType() {
    return beneficiaryType;
  }

  public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    this.beneficiaryType = beneficiaryType;
  }

  public OBBeneficiary5Detail reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the
   * payment transaction. Usage: If available, the initiating party should provide
   * this reference in the structured remittance information, to enable
   * reconciliation by the creditor upon receipt of the amount of money. If the
   * business context requires the use of a creditor reference or a payment remit
   * identification, and only one identifier can be passed through the end-to-end
   * chain, the creditor's reference or payment remittance identification should
   * be quoted in the end-to-end transaction identification.
   * 
   * @return reference
   */
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public OBBeneficiary5Detail supplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
    return this;
  }

  /**
   * Additional information that can not be captured in the structured fields
   * and/or any other specific block.
   * 
   * @return supplementaryData
   */
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")
  public Object getSupplementaryData() {
    return supplementaryData;
  }

  public void setSupplementaryData(Object supplementaryData) {
    this.supplementaryData = supplementaryData;
  }

  public OBBeneficiary5Detail creditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
    return this;
  }

  /**
   * Get creditorAgent
   * 
   * @return creditorAgent
   */
  @ApiModelProperty(value = "")
  public OBBranchAndFinancialInstitutionIdentification60 getCreditorAgent() {
    return creditorAgent;
  }

  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification60 creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  public OBBeneficiary5Detail creditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

  /**
   * Get creditorAccount
   * 
   * @return creditorAccount
   */
  @ApiModelProperty(required = true, value = "")
  public OBCashAccount50 getCreditorAccount() {
    return creditorAccount;
  }

  public void setCreditorAccount(OBCashAccount50 creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBBeneficiary5Detail obBeneficiary5Detail = (OBBeneficiary5Detail) o;
    return Objects.equals(this.accountId, obBeneficiary5Detail.accountId)
        && Objects.equals(this.beneficiaryId, obBeneficiary5Detail.beneficiaryId)
        && Objects.equals(this.beneficiaryType, obBeneficiary5Detail.beneficiaryType)
        && Objects.equals(this.reference, obBeneficiary5Detail.reference)
        && Objects.equals(this.supplementaryData, obBeneficiary5Detail.supplementaryData)
        && Objects.equals(this.creditorAgent, obBeneficiary5Detail.creditorAgent)
        && Objects.equals(this.creditorAccount, obBeneficiary5Detail.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData, creditorAgent,
        creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary5Detail {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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
