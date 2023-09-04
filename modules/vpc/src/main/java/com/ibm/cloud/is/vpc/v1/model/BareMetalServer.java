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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * BareMetalServer.
 */
public class BareMetalServer extends GenericModel {

  /**
   * The lifecycle state of the bare metal server.
   */
  public interface LifecycleState {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
    /** stable. */
    String STABLE = "stable";
    /** suspended. */
    String SUSPENDED = "suspended";
    /** updating. */
    String UPDATING = "updating";
    /** waiting. */
    String WAITING = "waiting";
  }

  /**
   * The resource type.
   */
  public interface ResourceType {
    /** bare_metal_server. */
    String BARE_METAL_SERVER = "bare_metal_server";
  }

  /**
   * The status of the bare metal server.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** maintenance. */
    String MAINTENANCE = "maintenance";
    /** pending. */
    String PENDING = "pending";
    /** restarting. */
    String RESTARTING = "restarting";
    /** running. */
    String RUNNING = "running";
    /** starting. */
    String STARTING = "starting";
    /** stopped. */
    String STOPPED = "stopped";
    /** stopping. */
    String STOPPING = "stopping";
  }

  protected Long bandwidth;
  @SerializedName("boot_target")
  protected BareMetalServerBootTarget bootTarget;
  protected BareMetalServerCPU cpu;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String crn;
  protected List<BareMetalServerDisk> disks;
  @SerializedName("enable_secure_boot")
  protected Boolean enableSecureBoot;
  protected String href;
  protected String id;
  @SerializedName("lifecycle_reasons")
  protected List<BareMetalServerLifecycleReason> lifecycleReasons;
  @SerializedName("lifecycle_state")
  protected String lifecycleState;
  protected Long memory;
  protected String name;
  @SerializedName("network_interfaces")
  protected List<NetworkInterfaceBareMetalServerContextReference> networkInterfaces;
  @SerializedName("primary_network_interface")
  protected NetworkInterfaceBareMetalServerContextReference primaryNetworkInterface;
  protected BareMetalServerProfileReference profile;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("resource_type")
  protected String resourceType;
  protected String status;
  @SerializedName("status_reasons")
  protected List<BareMetalServerStatusReason> statusReasons;
  @SerializedName("trusted_platform_module")
  protected BareMetalServerTrustedPlatformModule trustedPlatformModule;
  protected VPCReference vpc;
  protected ZoneReference zone;

  protected BareMetalServer() { }

  /**
   * Gets the bandwidth.
   *
   * The total bandwidth (in megabits per second) shared across the bare metal server network interfaces.
   *
   * @return the bandwidth
   */
  public Long getBandwidth() {
    return bandwidth;
  }

  /**
   * Gets the bootTarget.
   *
   * The possible resource types for this property are expected to expand in the future.
   *
   * @return the bootTarget
   */
  public BareMetalServerBootTarget getBootTarget() {
    return bootTarget;
  }

  /**
   * Gets the cpu.
   *
   * The bare metal server CPU configuration.
   *
   * @return the cpu
   */
  public BareMetalServerCPU getCpu() {
    return cpu;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the bare metal server was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this bare metal server.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the disks.
   *
   * The disks for this bare metal server, including any disks that are associated with the
   * `boot_target`.
   *
   * @return the disks
   */
  public List<BareMetalServerDisk> getDisks() {
    return disks;
  }

  /**
   * Gets the enableSecureBoot.
   *
   * Indicates whether secure boot is enabled. If enabled, the image must support secure boot or the server will fail to
   * boot.
   *
   * @return the enableSecureBoot
   */
  public Boolean isEnableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Gets the href.
   *
   * The URL for this bare metal server.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this bare metal server.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the lifecycleReasons.
   *
   * The reasons for the current `lifecycle_state` (if any).
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the lifecycleReasons
   */
  public List<BareMetalServerLifecycleReason> getLifecycleReasons() {
    return lifecycleReasons;
  }

  /**
   * Gets the lifecycleState.
   *
   * The lifecycle state of the bare metal server.
   *
   * @return the lifecycleState
   */
  public String getLifecycleState() {
    return lifecycleState;
  }

  /**
   * Gets the memory.
   *
   * The amount of memory, truncated to whole gibibytes.
   *
   * @return the memory
   */
  public Long getMemory() {
    return memory;
  }

  /**
   * Gets the name.
   *
   * The name for this bare metal server. The name is unique across all bare metal servers in the region.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the networkInterfaces.
   *
   * The bare metal server network interfaces, including the primary interface.
   *
   * @return the networkInterfaces
   */
  public List<NetworkInterfaceBareMetalServerContextReference> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * Gets the primaryNetworkInterface.
   *
   * The primary bare metal server network interface.
   *
   * @return the primaryNetworkInterface
   */
  public NetworkInterfaceBareMetalServerContextReference getPrimaryNetworkInterface() {
    return primaryNetworkInterface;
  }

  /**
   * Gets the profile.
   *
   * The [profile](https://cloud.ibm.com/docs/vpc?topic=vpc-bare-metal-servers-profile)
   * for this bare metal server.
   *
   * @return the profile
   */
  public BareMetalServerProfileReference getProfile() {
    return profile;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this bare metal server.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the resourceType.
   *
   * The resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the status.
   *
   * The status of the bare metal server.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the statusReasons.
   *
   * The reasons for the current status (if any).
   *
   * The enumerated reason code values for this property will expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the resource on which the
   * unexpected reason code was encountered.
   *
   * @return the statusReasons
   */
  public List<BareMetalServerStatusReason> getStatusReasons() {
    return statusReasons;
  }

  /**
   * Gets the trustedPlatformModule.
   *
   * @return the trustedPlatformModule
   */
  public BareMetalServerTrustedPlatformModule getTrustedPlatformModule() {
    return trustedPlatformModule;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this bare metal server resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }

  /**
   * Gets the zone.
   *
   * The zone this bare metal server resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

