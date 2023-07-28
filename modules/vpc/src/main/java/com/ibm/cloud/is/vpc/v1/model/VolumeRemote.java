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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * If present, this property indicates that the resource associated with this reference is remote and therefore may not
 * be directly retrievable.
 */
public class VolumeRemote extends GenericModel {

  protected RegionReference region;

  protected VolumeRemote() { }

  /**
   * Gets the region.
   *
   * If present, this property indicates that the referenced resource is remote to this
   * region, and identifies the native region.
   *
   * @return the region
   */
  public RegionReference getRegion() {
    return region;
  }
}

