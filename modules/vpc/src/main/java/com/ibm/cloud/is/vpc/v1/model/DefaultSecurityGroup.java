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
 * Collection of rules in a default security group.
 */
public class DefaultSecurityGroup extends GenericModel {

  protected String id;
  protected String crn;
  protected String href;
  protected String name;
  protected List<SecurityGroupRule> rules;
  @SerializedName("resource_group")
  protected ResourceGroupReference resourceGroup;
  @SerializedName("created_at")
  protected Date createdAt;
  protected VPCReference vpc;

  /**
   * Gets the id.
   *
   * The unique identifier for this security group.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the crn.
   *
   * The security group's CRN.
   *
   * @return the crn
   */
  public String getCrn() {
    return crn;
  }

  /**
   * Gets the href.
   *
   * The security group's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The name of the default security group created for a VPC. The name will be a hyphenated list of randomly-selected
   * words at creation, but may be user-specified with a subsequent request.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the rules.
   *
   * Array of rules for the default security group for a VPC. Defaults to allowing all outbound traffic, and allowing
   * all inbound traffic from other interfaces in the VPC’s default security group. Rules in the default security group
   * may be changed, added or removed.
   *
   * @return the rules
   */
  public List<SecurityGroupRule> getRules() {
    return rules;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group for this security group.
   *
   * @return the resourceGroup
   */
  public ResourceGroupReference getResourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this security group was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the vpc.
   *
   * The VPC this security group is a part of.
   *
   * @return the vpc
   */
  public VPCReference getVpc() {
    return vpc;
  }
}
