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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createInstanceNetworkInterface options.
 */
public class CreateInstanceNetworkInterfaceOptions extends GenericModel {

  protected String instanceId;
  protected SubnetIdentity subnet;
  protected Boolean allowIpSpoofing;
  protected String name;
  protected String primaryIpv4Address;
  protected List<SecurityGroupIdentity> securityGroups;

  /**
   * Builder.
   */
  public static class Builder {
    private String instanceId;
    private SubnetIdentity subnet;
    private Boolean allowIpSpoofing;
    private String name;
    private String primaryIpv4Address;
    private List<SecurityGroupIdentity> securityGroups;

    private Builder(CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions) {
      this.instanceId = createInstanceNetworkInterfaceOptions.instanceId;
      this.subnet = createInstanceNetworkInterfaceOptions.subnet;
      this.allowIpSpoofing = createInstanceNetworkInterfaceOptions.allowIpSpoofing;
      this.name = createInstanceNetworkInterfaceOptions.name;
      this.primaryIpv4Address = createInstanceNetworkInterfaceOptions.primaryIpv4Address;
      this.securityGroups = createInstanceNetworkInterfaceOptions.securityGroups;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param instanceId the instanceId
     * @param subnet the subnet
     */
    public Builder(String instanceId, SubnetIdentity subnet) {
      this.instanceId = instanceId;
      this.subnet = subnet;
    }

    /**
     * Builds a CreateInstanceNetworkInterfaceOptions.
     *
     * @return the new CreateInstanceNetworkInterfaceOptions instance
     */
    public CreateInstanceNetworkInterfaceOptions build() {
      return new CreateInstanceNetworkInterfaceOptions(this);
    }

    /**
     * Adds an securityGroups to securityGroups.
     *
     * @param securityGroups the new securityGroups
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder addSecurityGroups(SecurityGroupIdentity securityGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(securityGroups,
        "securityGroups cannot be null");
      if (this.securityGroups == null) {
        this.securityGroups = new ArrayList<SecurityGroupIdentity>();
      }
      this.securityGroups.add(securityGroups);
      return this;
    }

    /**
     * Set the instanceId.
     *
     * @param instanceId the instanceId
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder instanceId(String instanceId) {
      this.instanceId = instanceId;
      return this;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder subnet(SubnetIdentity subnet) {
      this.subnet = subnet;
      return this;
    }

    /**
     * Set the allowIpSpoofing.
     *
     * @param allowIpSpoofing the allowIpSpoofing
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder allowIpSpoofing(Boolean allowIpSpoofing) {
      this.allowIpSpoofing = allowIpSpoofing;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the primaryIpv4Address.
     *
     * @param primaryIpv4Address the primaryIpv4Address
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder primaryIpv4Address(String primaryIpv4Address) {
      this.primaryIpv4Address = primaryIpv4Address;
      return this;
    }

    /**
     * Set the securityGroups.
     * Existing securityGroups will be replaced.
     *
     * @param securityGroups the securityGroups
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder securityGroups(List<SecurityGroupIdentity> securityGroups) {
      this.securityGroups = securityGroups;
      return this;
    }

    /**
     * Set the networkInterfacePrototype.
     *
     * @param networkInterfacePrototype the networkInterfacePrototype
     * @return the CreateInstanceNetworkInterfaceOptions builder
     */
    public Builder networkInterfacePrototype(NetworkInterfacePrototype networkInterfacePrototype) {
      this.subnet = networkInterfacePrototype.subnet();
      this.allowIpSpoofing = networkInterfacePrototype.allowIpSpoofing();
      this.name = networkInterfacePrototype.name();
      this.primaryIpv4Address = networkInterfacePrototype.primaryIpv4Address();
      this.securityGroups = networkInterfacePrototype.securityGroups();
      return this;
    }
  }

  protected CreateInstanceNetworkInterfaceOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.instanceId,
      "instanceId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subnet,
      "subnet cannot be null");
    instanceId = builder.instanceId;
    subnet = builder.subnet;
    allowIpSpoofing = builder.allowIpSpoofing;
    name = builder.name;
    primaryIpv4Address = builder.primaryIpv4Address;
    securityGroups = builder.securityGroups;
  }

  /**
   * New builder.
   *
   * @return a CreateInstanceNetworkInterfaceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the instanceId.
   *
   * The instance identifier.
   *
   * @return the instanceId
   */
  public String instanceId() {
    return instanceId;
  }

  /**
   * Gets the subnet.
   *
   * The associated subnet.
   *
   * @return the subnet
   */
  public SubnetIdentity subnet() {
    return subnet;
  }

  /**
   * Gets the allowIpSpoofing.
   *
   * Indicates whether source IP spoofing is allowed on this interface. If false, source IP spoofing is prevented on
   * this interface. If true, source IP spoofing is allowed on this interface.
   *
   * @return the allowIpSpoofing
   */
  public Boolean allowIpSpoofing() {
    return allowIpSpoofing;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this network interface. If unspecified, the name will be a hyphenated list of
   * randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the primaryIpv4Address.
   *
   * The primary IPv4 address. If specified, it must be an available address on the network interface's subnet. If
   * unspecified, an available address on the subnet will be automatically selected.
   *
   * @return the primaryIpv4Address
   */
  public String primaryIpv4Address() {
    return primaryIpv4Address;
  }

  /**
   * Gets the securityGroups.
   *
   * Collection of security groups.
   *
   * @return the securityGroups
   */
  public List<SecurityGroupIdentity> securityGroups() {
    return securityGroups;
  }
}

