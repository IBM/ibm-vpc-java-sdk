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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * VPNGatewayConnectionPeerCIDRs.
 */
public class VPNGatewayConnectionPeerCIDRs extends GenericModel {

  @SerializedName("peer_cidrs")
  protected List<String> peerCidrs;

  /**
   * Gets the peerCidrs.
   *
   * A collection of peer CIDRs for this resource.
   *
   * @return the peerCidrs
   */
  public List<String> getPeerCidrs() {
    return peerCidrs;
  }
}

