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
 * FloatingIPReference.
 */
public class FloatingIPReference extends GenericModel {

  protected String address;
  protected String crn;
  protected FloatingIPReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;

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
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public FloatingIPReferenceDeleted getDeleted() {
    return deleted;
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
   * Gets the name.
   *
   * The unique user-defined name for this floating IP.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

