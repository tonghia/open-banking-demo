package com.acme.banking.model;

import java.util.Objects;
import com.acme.banking.model.Links;
import com.acme.banking.model.Meta;
import com.acme.banking.model.OBReadOffer1Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OBReadOffer1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-05-30T19:13:53.869644+07:00[Asia/Ho_Chi_Minh]")
public class OBReadOffer1   {
  @JsonProperty("Data")
  private OBReadOffer1Data data;

  @JsonProperty("Links")
  private Links links;

  @JsonProperty("Meta")
  private Meta meta;

  public OBReadOffer1 data(OBReadOffer1Data data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @ApiModelProperty(required = true, value = "")
  public OBReadOffer1Data getData() {
    return data;
  }

  public void setData(OBReadOffer1Data data) {
    this.data = data;
  }

  public OBReadOffer1 links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public OBReadOffer1 meta(Meta meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @ApiModelProperty(value = "")
  public Meta getMeta() {
    return meta;
  }

  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBReadOffer1 obReadOffer1 = (OBReadOffer1) o;
    return Objects.equals(this.data, obReadOffer1.data) &&
        Objects.equals(this.links, obReadOffer1.links) &&
        Objects.equals(this.meta, obReadOffer1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadOffer1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

