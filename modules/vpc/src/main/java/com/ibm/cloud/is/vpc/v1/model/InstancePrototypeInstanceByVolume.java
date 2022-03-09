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

import java.util.ArrayList;
import java.util.List;

/**
 * InstancePrototypeInstanceByVolume.
 */
public class InstancePrototypeInstanceByVolume extends InstancePrototype {


  /**
   * Builder.
   */
  public static class Builder {
    private List<KeyIdentity> keys;
    private String name;
    private List<NetworkInterfacePrototype> networkInterfaces;
    private InstancePlacementTargetPrototype placementTarget;
    private InstanceProfileIdentity profile;
    private ResourceGroupIdentity resourceGroup;
    private Long totalVolumeBandwidth;
    private String userData;
    private List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments;
    private VPCIdentity vpc;
    private VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment;
    private NetworkInterfacePrototype primaryNetworkInterface;
    private ZoneIdentity zone;

    public Builder(InstancePrototype instancePrototypeInstanceByVolume) {
      this.keys = instancePrototypeInstanceByVolume.keys;
      this.name = instancePrototypeInstanceByVolume.name;
      this.networkInterfaces = instancePrototypeInstanceByVolume.networkInterfaces;
      this.placementTarget = instancePrototypeInstanceByVolume.placementTarget;
      this.profile = instancePrototypeInstanceByVolume.profile;
      this.resourceGroup = instancePrototypeInstanceByVolume.resourceGroup;
      this.totalVolumeBandwidth = instancePrototypeInstanceByVolume.totalVolumeBandwidth;
      this.userData = instancePrototypeInstanceByVolume.userData;
      this.volumeAttachments = instancePrototypeInstanceByVolume.volumeAttachments;
      this.vpc = instancePrototypeInstanceByVolume.vpc;
      this.bootVolumeAttachment = (VolumeAttachmentPrototypeInstanceByVolumeContext) instancePrototypeInstanceByVolume.bootVolumeAttachment;
      this.primaryNetworkInterface = instancePrototypeInstanceByVolume.primaryNetworkInterface;
      this.zone = instancePrototypeInstanceByVolume.zone;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @param zone the zone
     */
    public Builder(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment, NetworkInterfacePrototype primaryNetworkInterface, ZoneIdentity zone) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      this.primaryNetworkInterface = primaryNetworkInterface;
      this.zone = zone;
    }

    /**
     * Builds a InstancePrototypeInstanceByVolume.
     *
     * @return the new InstancePrototypeInstanceByVolume instance
     */
    public InstancePrototypeInstanceByVolume build() {
      return new InstancePrototypeInstanceByVolume(this);
    }

    /**
     * Adds an keys to keys.
     *
     * @param keys the new keys
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder addKeys(KeyIdentity keys) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keys,
        "keys cannot be null");
      if (this.keys == null) {
        this.keys = new ArrayList<KeyIdentity>();
      }
      this.keys.add(keys);
      return this;
    }

    /**
     * Adds an networkInterfaces to networkInterfaces.
     *
     * @param networkInterfaces the new networkInterfaces
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder addNetworkInterfaces(NetworkInterfacePrototype networkInterfaces) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(networkInterfaces,
        "networkInterfaces cannot be null");
      if (this.networkInterfaces == null) {
        this.networkInterfaces = new ArrayList<NetworkInterfacePrototype>();
      }
      this.networkInterfaces.add(networkInterfaces);
      return this;
    }

    /**
     * Adds an volumeAttachments to volumeAttachments.
     *
     * @param volumeAttachments the new volumeAttachments
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder addVolumeAttachments(VolumeAttachmentPrototypeInstanceContext volumeAttachments) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(volumeAttachments,
        "volumeAttachments cannot be null");
      if (this.volumeAttachments == null) {
        this.volumeAttachments = new ArrayList<VolumeAttachmentPrototypeInstanceContext>();
      }
      this.volumeAttachments.add(volumeAttachments);
      return this;
    }

    /**
     * Set the keys.
     * Existing keys will be replaced.
     *
     * @param keys the keys
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder keys(List<KeyIdentity> keys) {
      this.keys = keys;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the networkInterfaces.
     * Existing networkInterfaces will be replaced.
     *
     * @param networkInterfaces the networkInterfaces
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder networkInterfaces(List<NetworkInterfacePrototype> networkInterfaces) {
      this.networkInterfaces = networkInterfaces;
      return this;
    }

    /**
     * Set the placementTarget.
     *
     * @param placementTarget the placementTarget
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder placementTarget(InstancePlacementTargetPrototype placementTarget) {
      this.placementTarget = placementTarget;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder profile(InstanceProfileIdentity profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the totalVolumeBandwidth.
     *
     * @param totalVolumeBandwidth the totalVolumeBandwidth
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder totalVolumeBandwidth(long totalVolumeBandwidth) {
      this.totalVolumeBandwidth = totalVolumeBandwidth;
      return this;
    }

    /**
     * Set the userData.
     *
     * @param userData the userData
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder userData(String userData) {
      this.userData = userData;
      return this;
    }

    /**
     * Set the volumeAttachments.
     * Existing volumeAttachments will be replaced.
     *
     * @param volumeAttachments the volumeAttachments
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder volumeAttachments(List<VolumeAttachmentPrototypeInstanceContext> volumeAttachments) {
      this.volumeAttachments = volumeAttachments;
      return this;
    }

    /**
     * Set the vpc.
     *
     * @param vpc the vpc
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder vpc(VPCIdentity vpc) {
      this.vpc = vpc;
      return this;
    }

    /**
     * Set the bootVolumeAttachment.
     *
     * @param bootVolumeAttachment the bootVolumeAttachment
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder bootVolumeAttachment(VolumeAttachmentPrototypeInstanceByVolumeContext bootVolumeAttachment) {
      this.bootVolumeAttachment = bootVolumeAttachment;
      return this;
    }

    /**
     * Set the primaryNetworkInterface.
     *
     * @param primaryNetworkInterface the primaryNetworkInterface
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder primaryNetworkInterface(NetworkInterfacePrototype primaryNetworkInterface) {
      this.primaryNetworkInterface = primaryNetworkInterface;
      return this;
    }

    /**
     * Set the zone.
     *
     * @param zone the zone
     * @return the InstancePrototypeInstanceByVolume builder
     */
    public Builder zone(ZoneIdentity zone) {
      this.zone = zone;
      return this;
    }
  }

  protected InstancePrototypeInstanceByVolume(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bootVolumeAttachment,
      "bootVolumeAttachment cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.primaryNetworkInterface,
      "primaryNetworkInterface cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.zone,
      "zone cannot be null");
    keys = builder.keys;
    name = builder.name;
    networkInterfaces = builder.networkInterfaces;
    placementTarget = builder.placementTarget;
    profile = builder.profile;
    resourceGroup = builder.resourceGroup;
    totalVolumeBandwidth = builder.totalVolumeBandwidth;
    userData = builder.userData;
    volumeAttachments = builder.volumeAttachments;
    vpc = builder.vpc;
    bootVolumeAttachment = builder.bootVolumeAttachment;
    primaryNetworkInterface = builder.primaryNetworkInterface;
    zone = builder.zone;
  }

  /**
   * New builder.
   *
   * @return a InstancePrototypeInstanceByVolume builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

