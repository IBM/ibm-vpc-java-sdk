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
 * The getSubnetReservedIp options.
 */
public class GetSubnetReservedIpOptions extends GenericModel {

  protected String subnetId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetId;
    private String id;

    /**
     * Instantiates a new Builder from an existing GetSubnetReservedIpOptions instance.
     *
     * @param getSubnetReservedIpOptions the instance to initialize the Builder with
     */
    private Builder(GetSubnetReservedIpOptions getSubnetReservedIpOptions) {
      this.subnetId = getSubnetReservedIpOptions.subnetId;
      this.id = getSubnetReservedIpOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetId the subnetId
     * @param id the id
     */
    public Builder(String subnetId, String id) {
      this.subnetId = subnetId;
      this.id = id;
    }

    /**
     * Builds a GetSubnetReservedIpOptions.
     *
     * @return the new GetSubnetReservedIpOptions instance
     */
    public GetSubnetReservedIpOptions build() {
      return new GetSubnetReservedIpOptions(this);
    }

    /**
     * Set the subnetId.
     *
     * @param subnetId the subnetId
     * @return the GetSubnetReservedIpOptions builder
     */
    public Builder subnetId(String subnetId) {
      this.subnetId = subnetId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetSubnetReservedIpOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetSubnetReservedIpOptions() { }

  protected GetSubnetReservedIpOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subnetId,
      "subnetId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    subnetId = builder.subnetId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetSubnetReservedIpOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetId.
   *
   * The subnet identifier.
   *
   * @return the subnetId
   */
  public String subnetId() {
    return subnetId;
  }

  /**
   * Gets the id.
   *
   * The reserved IP identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

