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
 * The deleteLoadBalancerListener options.
 */
public class DeleteLoadBalancerListenerOptions extends GenericModel {

  protected String loadBalancerId;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String loadBalancerId;
    private String id;

    private Builder(DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions) {
      this.loadBalancerId = deleteLoadBalancerListenerOptions.loadBalancerId;
      this.id = deleteLoadBalancerListenerOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param loadBalancerId the loadBalancerId
     * @param id the id
     */
    public Builder(String loadBalancerId, String id) {
      this.loadBalancerId = loadBalancerId;
      this.id = id;
    }

    /**
     * Builds a DeleteLoadBalancerListenerOptions.
     *
     * @return the new DeleteLoadBalancerListenerOptions instance
     */
    public DeleteLoadBalancerListenerOptions build() {
      return new DeleteLoadBalancerListenerOptions(this);
    }

    /**
     * Set the loadBalancerId.
     *
     * @param loadBalancerId the loadBalancerId
     * @return the DeleteLoadBalancerListenerOptions builder
     */
    public Builder loadBalancerId(String loadBalancerId) {
      this.loadBalancerId = loadBalancerId;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteLoadBalancerListenerOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DeleteLoadBalancerListenerOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.loadBalancerId,
      "loadBalancerId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    loadBalancerId = builder.loadBalancerId;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DeleteLoadBalancerListenerOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the loadBalancerId.
   *
   * The load balancer identifier.
   *
   * @return the loadBalancerId
   */
  public String loadBalancerId() {
    return loadBalancerId;
  }

  /**
   * Gets the id.
   *
   * The listener identifier.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}
