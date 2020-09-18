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
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroup.
 */
public class InstanceGroup extends GenericModel {

  /**
   * The status of the instance group
   * - `deleting`: Group is being deleted
   * - `healthy`: Group has `membership_count` instances
   * - `scaling`: Instances in the group are being created or deleted to reach
   *              `membership_count`
   * - `unhealthy`: Group is unable to reach `membership_count` instances.
   */
  public interface Status {
    /** deleting. */
    String DELETING = "deleting";
    /** healthy. */
    String HEALTHY = "healthy";
    /** scaling. */
    String SCALING = "scaling";
    /** unhealthy. */
    String UNHEALTHY = "unhealthy";
  }

  protected String id;
  protected String crn;
  protected String href;
  protected String name;
  @SerializedName("membership_count")
  protected Long membershipCount;
  @SerializedName("application_port")
  protected Long applicationPort;
  @SerializedName("load_balancer_pool")
  protected LoadBalancerPoolReference loadBalancerPool;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("instance_template")
  protected InstanceTemplateReference instanceTemplate;
  protected List<InstanceGroupManagerReference> managers;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  protected String status;
  protected List<SubnetReference> subnets;
  protected VPCReference vpc;

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The CRN for this instance group.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the membershipCount.
   *
   * The number of instances in the instance group.
   *
   * @return the membershipCount
   */
  public Long getMembershipCount() {
    return membershipCount;
  }

  /**
   * Gets the applicationPort.
   *
   * Required if specifying a load balancer pool only. Used by the instance group when scaling up instances to supply
   * the port for the load balancer pool member.
   *
   * @return the applicationPort
   */
  public Long getApplicationPort() {
    return applicationPort;
  }

  /**
   * Gets the loadBalancerPool.
   *
   * The load balancer pool managed by this group. Instances created
   * by this group will have a new load balancer pool member in that
   * pool created.
   *
   * @return the loadBalancerPool
   */
  public LoadBalancerPoolReference getLoadBalancerPool() {
    return loadBalancerPool;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that the instance group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the instanceTemplate.
   *
   * The template used to create new instances for this group.
   *
   * @return the instanceTemplate
   */
  public InstanceTemplateReference getInstanceTemplate() {
    return instanceTemplate;
  }

  /**
   * Gets the managers.
   *
   * Array of references to managers for the instance group.
   *
   * @return the managers
   */
  public List<InstanceGroupManagerReference> getManagers() {
    return managers;
  }

  /**
   * Gets the resourceGroup.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the status.
   *
   * The status of the instance group
   * - `deleting`: Group is being deleted
   * - `healthy`: Group has `membership_count` instances
   * - `scaling`: Instances in the group are being created or deleted to reach
   *              `membership_count`
   * - `unhealthy`: Group is unable to reach `membership_count` instances.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the subnets.
   *
   * Array of references to subnets to use when creating new instances.
   *
   * @return the subnets
   */
  public List<SubnetReference> getSubnets() {
    return subnets;
  }

  /**
   * Gets the vpc.
   *
   * The VPC the instance group resides in.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}

