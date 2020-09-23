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

/**
 * FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
 */
public class FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref extends FloatingIPPatchTargetNetworkInterfaceIdentity {


  /**
   * Builder.
   */
  public static class Builder {
    private String href;

    public Builder(FloatingIPPatchTargetNetworkInterfaceIdentity floatingIpPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref) {
      this.href = floatingIpPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.href;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param href the href
     */
    public Builder(String href) {
      this.href = href;
    }

    /**
     * Builds a FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref.
     *
     * @return the new FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref instance
     */
    public FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref build() {
      return new FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(this);
    }

    /**
     * Set the href.
     *
     * @param href the href
     * @return the FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
     */
    public Builder href(String href) {
      this.href = href;
      return this;
    }
  }

  protected FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.href,
      "href cannot be null");
    href = builder.href;
  }

  /**
   * New builder.
   *
   * @return a FloatingIPPatchTargetNetworkInterfaceIdentityNetworkInterfaceIdentityByHref builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
