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

import java.util.Date;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * FloatingIP.
 */
public class FloatingIP extends GenericModel {

  /**
   * The status of the floating IP.
   */
  public interface Status {
    /** available. */
    String AVAILABLE = "available";
    /** deleting. */
    String DELETING = "deleting";
    /** failed. */
    String FAILED = "failed";
    /** pending. */
    String PENDING = "pending";
  }

  protected String id;
  protected String crn;
  protected String href;
  protected String address;
  protected String name;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String status;
  protected FloatingIPTarget target;
  protected ZoneReference zone;

  /**
   * Gets the id.
   *
   * The unique identifier for this floating IP.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this floating IP.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this floating IP.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the address.
   *
   * The globally unique IP address.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the name.
   *
   * The unique user-defined name for this floating IP.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this floating IP.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the floating IP was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the status.
   *
   * The status of the floating IP.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the target.
   *
   * The target of this floating IP.
   *
   * @return the target
   */
  public FloatingIPTarget getTarget() {
    return target;
  }

  /**
   * Gets the zone.
   *
   * The zone the floating IP resides in.
   *
   * @return the zone
   */
  public ZoneReference getZone() {
    return zone;
  }
}

