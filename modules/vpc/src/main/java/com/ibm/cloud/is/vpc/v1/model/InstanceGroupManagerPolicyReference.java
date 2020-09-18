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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * InstanceGroupManagerPolicyReference.
 */
public class InstanceGroupManagerPolicyReference extends GenericModel {

  protected String id;
  protected String href;
  protected String name;

  /**
   * Gets the id.
   *
   * The unique identifier for this instance group manager policy.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The URL for this instance group manager policy.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the name.
   *
   * The user-defined name for this instance group manager policy. Names must be unique within the instance group
   * manager.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

