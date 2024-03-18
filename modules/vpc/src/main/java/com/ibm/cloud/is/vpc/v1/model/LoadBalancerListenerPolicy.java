/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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
 * LoadBalancerListenerPolicy.
 */
public class LoadBalancerListenerPolicy extends GenericModel {

  /**
   * The policy action.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   */
  public interface Action {
    /** forward. */
    String FORWARD = "forward";
    /** https_redirect. */
    String HTTPS_REDIRECT = "https_redirect";
    /** redirect. */
    String REDIRECT = "redirect";
    /** reject. */
    String REJECT = "reject";
  }

  /**
   * The provisioning status of this policy
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   */
  public interface ProvisioningStatus {
    /** active. */
    String ACTIVE = "active";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** failed. */
    String FAILED = "failed";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  protected String action;
  @SerializedName("created_at")
  protected Date createdAt;
  protected String href;
  protected String id;
  protected String name;
  protected Long priority;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;
  protected List<LoadBalancerListenerPolicyRuleReference> rules;
  protected LoadBalancerListenerPolicyTarget target;

  protected LoadBalancerListenerPolicy() { }

  /**
   * Gets the action.
   *
   * The policy action.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this policy was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the href.
   *
   * The listener policy's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the id.
   *
   * The policy's unique identifier.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the name.
   *
   * The name for this load balancer listener policy. The name is unique across all policies for the load balancer
   * listener.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the priority.
   *
   * Priority of the policy. Lower value indicates higher priority.
   *
   * @return the priority
   */
  public Long getPriority() {
    return priority;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this policy
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the policy on which the
   * unexpected property value was encountered.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }

  /**
   * Gets the rules.
   *
   * The rules for this policy.
   *
   * @return the rules
   */
  public List<LoadBalancerListenerPolicyRuleReference> getRules() {
    return rules;
  }

  /**
   * Gets the target.
   *
   * - If `action` is `forward`, the response is a `LoadBalancerPoolReference`
   * - If `action` is `redirect`, the response is a `LoadBalancerListenerPolicyRedirectURL`
   * - If `action` is `https_redirect`, the response is a `LoadBalancerListenerHTTPSRedirect`.
   *
   * @return the target
   */
  public LoadBalancerListenerPolicyTarget getTarget() {
    return target;
  }
}

