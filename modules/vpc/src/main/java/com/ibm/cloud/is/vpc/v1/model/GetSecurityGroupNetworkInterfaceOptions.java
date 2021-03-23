/*
 * (C) Copyright IBM Corp. 2021.
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
 * The getSecurityGroupNetworkInterface options.
 */
public class GetSecurityGroupNetworkInterfaceOptions extends GenericModel {

  protected String securityGroupId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String securityGroupId;
    private String id;

    private Builder(GetSecurityGroupNetworkInterfaceOptions getSecurityGroupNetworkInterfaceOptions) {
      this.securityGroupId = getSecurityGroupNetworkInterfaceOptions.securityGroupId;
      this.id = getSecurityGroupNetworkInterfaceOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param securityGroupId the securityGroupId
     * @param id the id
     */
    public Builder(String securityGroupId, String id) {
      this.securityGroupId = securityGroupId;
      this.id = id;
    }

    /**
     * Builds a GetSecurityGroupNetworkInterfaceOptions.
     *
     * @return the new GetSecurityGroupNetworkInterfaceOptions instance
     */
    public GetSecurityGroupNetworkInterfaceOptions build() {
      return new GetSecurityGroupNetworkInterfaceOptions(this);
    }

    /**
     * Set the securityGroupId.
     *
     * @param securityGroupId the securityGroupId
     * @return the GetSecurityGroupNetworkInterfaceOptions builder
     */
    public Builder securityGroupId(String securityGroupId) {
      this.securityGroupId = securityGroupId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetSecurityGroupNetworkInterfaceOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected GetSecurityGroupNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.securityGroupId,
      "securityGroupId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    securityGroupId = builder.securityGroupId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a GetSecurityGroupNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the securityGroupId.
   *
   * The security group identifier.
   *
   * @return the securityGroupId
   */
  public String securityGroupId() {
    return securityGroupId;
  }

  /**
   * Gets the id.
   *
   * The network interface identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

