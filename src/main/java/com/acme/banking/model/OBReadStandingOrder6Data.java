package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.OBStandingOrder6;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBReadStandingOrder6Data
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadStandingOrder6Data {
  @JsonProperty("StandingOrder")

  private List<OBStandingOrder6> standingOrder = null;

  public OBReadStandingOrder6Data standingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
    return this;
  }

  public OBReadStandingOrder6Data addStandingOrderItem(OBStandingOrder6 standingOrderItem) {
    if (this.standingOrder == null) {
      this.standingOrder = new ArrayList<>();
    }
    this.standingOrder.add(standingOrderItem);
    return this;
  }

  /**
   * Get standingOrder
   * 
   * @return standingOrder
   */
  @ApiModelProperty(value = "")
  public List<OBStandingOrder6> getStandingOrder() {
    return standingOrder;
  }

  public void setStandingOrder(List<OBStandingOrder6> standingOrder) {
    this.standingOrder = standingOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadStandingOrder6Data obReadStandingOrder6Data = (OBReadStandingOrder6Data) o;
    return Objects.equals(this.standingOrder, obReadStandingOrder6Data.standingOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standingOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadStandingOrder6Data {\n");

    sb.append("    standingOrder: ").append(toIndentedString(standingOrder)).append("\n");
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
