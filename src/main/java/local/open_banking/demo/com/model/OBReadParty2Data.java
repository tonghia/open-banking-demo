package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBParty2;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBReadParty2Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadParty2Data   {
  @JsonProperty("Party")
  private OBParty2 party;

  public OBReadParty2Data party(OBParty2 party) {
    this.party = party;
    return this;
  }

  /**
   * Get party
   * @return party
  */
  @ApiModelProperty(value = "")
  public OBParty2 getParty() {
    return party;
  }

  public void setParty(OBParty2 party) {
    this.party = party;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadParty2Data obReadParty2Data = (OBReadParty2Data) o;
    return Objects.equals(this.party, obReadParty2Data.party);
  }

  @Override
  public int hashCode() {
    return Objects.hash(party);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadParty2Data {\n");
    
    sb.append("    party: ").append(toIndentedString(party)).append("\n");
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

