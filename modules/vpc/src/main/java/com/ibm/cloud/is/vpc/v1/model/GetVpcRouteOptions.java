/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.is.vpc.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getVpcRoute options.
 */
public class GetVpcRouteOptions extends GenericModel {

  protected String vpcId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String vpcId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetVpcRouteOptions instance.
     *
     * @param getVpcRouteOptions the instance to initialize the Builder with
     */
    private Builder(GetVpcRouteOptions getVpcRouteOptions) {
      this.vpcId = getVpcRouteOptions.vpcId;
      this.id = getVpcRouteOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vpcId the vpcId
     * @param id the id
     */
    public Builder(String vpcId, String id) {
      this.vpcId = vpcId;
      this.id = id;
    }

    /**
     * Builds a GetVpcRouteOptions.
     *
     * @return the new GetVpcRouteOptions instance
     */
    public GetVpcRouteOptions build() {
      return new GetVpcRouteOptions(this);
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the GetVpcRouteOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetVpcRouteOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetVpcRouteOptions() { }

  protected GetVpcRouteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.vpcId,
      "vpcId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    vpcId = builder.vpcId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetVpcRouteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the vpcId.
   *
   * The VPC identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the id.
   *
   * The route identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

