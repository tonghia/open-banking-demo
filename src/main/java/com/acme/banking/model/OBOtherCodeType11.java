package com.acme.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Other application frequencies that are not available in the standard code
 * list
 */
@ApiModel(description = "Other application frequencies that are not available in the standard code list")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBOtherCodeType11 {
  @JsonProperty("Code")
  private String code;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  public OBOtherCodeType11 code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The four letter Mnemonic used within an XML file to identify a code
   * 
   * @return code
   */
  @ApiModelProperty(value = "The four letter Mnemonic used within an XML file to identify a code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OBOtherCodeType11 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Long name associated with the code
   * 
   * @return name
   */
  @ApiModelProperty(required = true, value = "Long name associated with the code")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OBOtherCodeType11 description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description to describe the purpose of the code
   * 
   * @return description
   */
  @ApiModelProperty(required = true, value = "Description to describe the purpose of the code")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBOtherCodeType11 obOtherCodeType11 = (OBOtherCodeType11) o;
    return Objects.equals(this.code, obOtherCodeType11.code) && Objects.equals(this.name, obOtherCodeType11.name)
        && Objects.equals(this.description, obOtherCodeType11.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBOtherCodeType11 {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
