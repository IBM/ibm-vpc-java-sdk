/*
 * (C) Copyright IBM Corp. 2021, 2022, 2023.
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
 * The listBareMetalServers options.
 */
public class ListBareMetalServersOptions extends GenericModel {

  protected String start;
  protected Long limit;
  protected String resourceGroupId;
  protected String name;
  protected String vpcId;
  protected String vpcCrn;
  protected String vpcName;
  protected String networkInterfacesSubnetId;
  protected String networkInterfacesSubnetCrn;
  protected String networkInterfacesSubnetName;

  /**
   * Builder.
   */
  public static class Builder {
    private String start;
    private Long limit;
    private String resourceGroupId;
    private String name;
    private String vpcId;
    private String vpcCrn;
    private String vpcName;
    private String networkInterfacesSubnetId;
    private String networkInterfacesSubnetCrn;
    private String networkInterfacesSubnetName;

    /**
     * Instantiates a new Builder from an existing ListBareMetalServersOptions instance.
     *
     * @param listBareMetalServersOptions the instance to initialize the Builder with
     */
    private Builder(ListBareMetalServersOptions listBareMetalServersOptions) {
      this.start = listBareMetalServersOptions.start;
      this.limit = listBareMetalServersOptions.limit;
      this.resourceGroupId = listBareMetalServersOptions.resourceGroupId;
      this.name = listBareMetalServersOptions.name;
      this.vpcId = listBareMetalServersOptions.vpcId;
      this.vpcCrn = listBareMetalServersOptions.vpcCrn;
      this.vpcName = listBareMetalServersOptions.vpcName;
      this.networkInterfacesSubnetId = listBareMetalServersOptions.networkInterfacesSubnetId;
      this.networkInterfacesSubnetCrn = listBareMetalServersOptions.networkInterfacesSubnetCrn;
      this.networkInterfacesSubnetName = listBareMetalServersOptions.networkInterfacesSubnetName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListBareMetalServersOptions.
     *
     * @return the new ListBareMetalServersOptions instance
     */
    public ListBareMetalServersOptions build() {
      return new ListBareMetalServersOptions(this);
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListBareMetalServersOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListBareMetalServersOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the ListBareMetalServersOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the ListBareMetalServersOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the vpcId.
     *
     * @param vpcId the vpcId
     * @return the ListBareMetalServersOptions builder
     */
    public Builder vpcId(String vpcId) {
      this.vpcId = vpcId;
      return this;
    }

    /**
     * Set the vpcCrn.
     *
     * @param vpcCrn the vpcCrn
     * @return the ListBareMetalServersOptions builder
     */
    public Builder vpcCrn(String vpcCrn) {
      this.vpcCrn = vpcCrn;
      return this;
    }

    /**
     * Set the vpcName.
     *
     * @param vpcName the vpcName
     * @return the ListBareMetalServersOptions builder
     */
    public Builder vpcName(String vpcName) {
      this.vpcName = vpcName;
      return this;
    }

    /**
     * Set the networkInterfacesSubnetId.
     *
     * @param networkInterfacesSubnetId the networkInterfacesSubnetId
     * @return the ListBareMetalServersOptions builder
     */
    public Builder networkInterfacesSubnetId(String networkInterfacesSubnetId) {
      this.networkInterfacesSubnetId = networkInterfacesSubnetId;
      return this;
    }

    /**
     * Set the networkInterfacesSubnetCrn.
     *
     * @param networkInterfacesSubnetCrn the networkInterfacesSubnetCrn
     * @return the ListBareMetalServersOptions builder
     */
    public Builder networkInterfacesSubnetCrn(String networkInterfacesSubnetCrn) {
      this.networkInterfacesSubnetCrn = networkInterfacesSubnetCrn;
      return this;
    }

    /**
     * Set the networkInterfacesSubnetName.
     *
     * @param networkInterfacesSubnetName the networkInterfacesSubnetName
     * @return the ListBareMetalServersOptions builder
     */
    public Builder networkInterfacesSubnetName(String networkInterfacesSubnetName) {
      this.networkInterfacesSubnetName = networkInterfacesSubnetName;
      return this;
    }
  }

  protected ListBareMetalServersOptions() { }

  protected ListBareMetalServersOptions(Builder builder) {
    start = builder.start;
    limit = builder.limit;
    resourceGroupId = builder.resourceGroupId;
    name = builder.name;
    vpcId = builder.vpcId;
    vpcCrn = builder.vpcCrn;
    vpcName = builder.vpcName;
    networkInterfacesSubnetId = builder.networkInterfacesSubnetId;
    networkInterfacesSubnetCrn = builder.networkInterfacesSubnetCrn;
    networkInterfacesSubnetName = builder.networkInterfacesSubnetName;
  }

  /**
   * New builder.
   *
   * @return a ListBareMetalServersOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the start.
   *
   * A server-provided token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Filters the collection to resources with a `resource_group.id` property matching the specified identifier.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the name.
   *
   * Filters the collection to resources with a `name` property matching the exact specified name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the vpcId.
   *
   * Filters the collection to resources with a `vpc.id` property matching the specified identifier.
   *
   * @return the vpcId
   */
  public String vpcId() {
    return vpcId;
  }

  /**
   * Gets the vpcCrn.
   *
   * Filters the collection to resources with a `vpc.crn` property matching the specified CRN.
   *
   * @return the vpcCrn
   */
  public String vpcCrn() {
    return vpcCrn;
  }

  /**
   * Gets the vpcName.
   *
   * Filters the collection to resources with a `vpc.name` property matching the exact specified name.
   *
   * @return the vpcName
   */
  public String vpcName() {
    return vpcName;
  }

  /**
   * Gets the networkInterfacesSubnetId.
   *
   * Filters the collection to bare metal servers with an item in the `network_interfaces` property with a `subnet.id`
   * property matching the specified identifier.
   *
   * @return the networkInterfacesSubnetId
   */
  public String networkInterfacesSubnetId() {
    return networkInterfacesSubnetId;
  }

  /**
   * Gets the networkInterfacesSubnetCrn.
   *
   * Filters the collection to bare metal servers with an item in the `network_interfaces` property with a `subnet.crn`
   * property matching the specified CRN.
   *
   * @return the networkInterfacesSubnetCrn
   */
  public String networkInterfacesSubnetCrn() {
    return networkInterfacesSubnetCrn;
  }

  /**
   * Gets the networkInterfacesSubnetName.
   *
   * Filters the collection to bare metal servers with an item in the `network_interfaces` property with a `subnet.name`
   * property matching the exact specified name.
   *
   * @return the networkInterfacesSubnetName
   */
  public String networkInterfacesSubnetName() {
    return networkInterfacesSubnetName;
  }
}

