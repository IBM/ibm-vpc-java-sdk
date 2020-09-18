/*
 * (C) Copyright IBM Corp. 2020.
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
 * The updateVpnGateway options.
 */
public class UpdateVpnGatewayOptions extends GenericModel {

  protected String id;
  protected String name;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String name;

    private Builder(UpdateVpnGatewayOptions updateVpnGatewayOptions) {
      this.id = updateVpnGatewayOptions.id;
      this.name = updateVpnGatewayOptions.name;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateVpnGatewayOptions.
     *
     * @return the new UpdateVpnGatewayOptions instance
     */
    public UpdateVpnGatewayOptions build() {
      return new UpdateVpnGatewayOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateVpnGatewayOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateVpnGatewayOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }

  protected UpdateVpnGatewayOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    name = builder.name;
  }

  /**
   * New builder.
   *
   * @return a UpdateVpnGatewayOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The VPN gateway identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this VPN gateway.
   *
   * @return the name
   */
  public String name() {
    return name;
  }
}

