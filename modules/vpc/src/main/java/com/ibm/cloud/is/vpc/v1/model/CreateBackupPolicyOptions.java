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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createBackupPolicy options.
 */
public class CreateBackupPolicyOptions extends GenericModel {

  /**
   * The resource type.
   */
  public interface MatchResourceTypes {
    /** volume. */
    String VOLUME = "volume";
  }

  protected List<String> matchUserTags;
  protected List<String> matchResourceTypes;
  protected String name;
  protected List<BackupPolicyPlanPrototype> plans;
  protected ResourceGroupIdentity resourceGroup;
  protected BackupPolicyScopePrototype scope;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> matchUserTags;
    private List<String> matchResourceTypes;
    private String name;
    private List<BackupPolicyPlanPrototype> plans;
    private ResourceGroupIdentity resourceGroup;
    private BackupPolicyScopePrototype scope;

    /**
     * Instantiates a new Builder from an existing CreateBackupPolicyOptions instance.
     *
     * @param createBackupPolicyOptions the instance to initialize the Builder with
     */
    private Builder(CreateBackupPolicyOptions createBackupPolicyOptions) {
      this.matchUserTags = createBackupPolicyOptions.matchUserTags;
      this.matchResourceTypes = createBackupPolicyOptions.matchResourceTypes;
      this.name = createBackupPolicyOptions.name;
      this.plans = createBackupPolicyOptions.plans;
      this.resourceGroup = createBackupPolicyOptions.resourceGroup;
      this.scope = createBackupPolicyOptions.scope;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param matchUserTags the matchUserTags
     */
    public Builder(List<String> matchUserTags) {
      this.matchUserTags = matchUserTags;
    }

    /**
     * Builds a CreateBackupPolicyOptions.
     *
     * @return the new CreateBackupPolicyOptions instance
     */
    public CreateBackupPolicyOptions build() {
      return new CreateBackupPolicyOptions(this);
    }

    /**
     * Adds an matchUserTags to matchUserTags.
     *
     * @param matchUserTags the new matchUserTags
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder addMatchUserTags(String matchUserTags) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchUserTags,
        "matchUserTags cannot be null");
      if (this.matchUserTags == null) {
        this.matchUserTags = new ArrayList<String>();
      }
      this.matchUserTags.add(matchUserTags);
      return this;
    }

    /**
     * Adds an matchResourceTypes to matchResourceTypes.
     *
     * @param matchResourceTypes the new matchResourceTypes
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder addMatchResourceTypes(String matchResourceTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(matchResourceTypes,
        "matchResourceTypes cannot be null");
      if (this.matchResourceTypes == null) {
        this.matchResourceTypes = new ArrayList<String>();
      }
      this.matchResourceTypes.add(matchResourceTypes);
      return this;
    }

    /**
     * Adds an plans to plans.
     *
     * @param plans the new plans
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder addPlans(BackupPolicyPlanPrototype plans) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(plans,
        "plans cannot be null");
      if (this.plans == null) {
        this.plans = new ArrayList<BackupPolicyPlanPrototype>();
      }
      this.plans.add(plans);
      return this;
    }

    /**
     * Set the matchUserTags.
     * Existing matchUserTags will be replaced.
     *
     * @param matchUserTags the matchUserTags
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder matchUserTags(List<String> matchUserTags) {
      this.matchUserTags = matchUserTags;
      return this;
    }

    /**
     * Set the matchResourceTypes.
     * Existing matchResourceTypes will be replaced.
     *
     * @param matchResourceTypes the matchResourceTypes
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder matchResourceTypes(List<String> matchResourceTypes) {
      this.matchResourceTypes = matchResourceTypes;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the plans.
     * Existing plans will be replaced.
     *
     * @param plans the plans
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder plans(List<BackupPolicyPlanPrototype> plans) {
      this.plans = plans;
      return this;
    }

    /**
     * Set the resourceGroup.
     *
     * @param resourceGroup the resourceGroup
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder resourceGroup(ResourceGroupIdentity resourceGroup) {
      this.resourceGroup = resourceGroup;
      return this;
    }

    /**
     * Set the scope.
     *
     * @param scope the scope
     * @return the CreateBackupPolicyOptions builder
     */
    public Builder scope(BackupPolicyScopePrototype scope) {
      this.scope = scope;
      return this;
    }
  }

  protected CreateBackupPolicyOptions() { }

  protected CreateBackupPolicyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.matchUserTags,
      "matchUserTags cannot be null");
    matchUserTags = builder.matchUserTags;
    matchResourceTypes = builder.matchResourceTypes;
    name = builder.name;
    plans = builder.plans;
    resourceGroup = builder.resourceGroup;
    scope = builder.scope;
  }

  /**
   * New builder.
   *
   * @return a CreateBackupPolicyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the matchUserTags.
   *
   * The user tags this backup policy will apply to. Resources that have both a matching user tag and a matching type
   * will be subject to the backup policy.
   *
   * @return the matchUserTags
   */
  public List<String> matchUserTags() {
    return matchUserTags;
  }

  /**
   * Gets the matchResourceTypes.
   *
   * The resource types this backup policy will apply to. Resources that have both a matching type and a matching user
   * tag will be subject to the backup policy.
   *
   * @return the matchResourceTypes
   */
  public List<String> matchResourceTypes() {
    return matchResourceTypes;
  }

  /**
   * Gets the name.
   *
   * The name for this backup policy. The name must not be used by another backup policy in the region. If unspecified,
   * the name will be a hyphenated list of randomly-selected words.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the plans.
   *
   * The prototype objects for backup plans to be created for this backup policy.
   *
   * @return the plans
   */
  public List<BackupPolicyPlanPrototype> plans() {
    return plans;
  }

  /**
   * Gets the resourceGroup.
   *
   * The resource group to use. If unspecified, the account's [default resource
   * group](https://cloud.ibm.com/apidocs/resource-manager#introduction) will be used.
   *
   * @return the resourceGroup
   */
  public ResourceGroupIdentity resourceGroup() {
    return resourceGroup;
  }

  /**
   * Gets the scope.
   *
   * The scope to use for this backup policy.
   *
   * If unspecified, the policy will be scoped to the account.
   *
   * @return the scope
   */
  public BackupPolicyScopePrototype scope() {
    return scope;
  }
}

