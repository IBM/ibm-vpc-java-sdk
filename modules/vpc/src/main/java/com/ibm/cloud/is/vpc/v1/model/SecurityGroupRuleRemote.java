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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The IP addresses or security groups from which this rule allows traffic (or to which, for outbound rules). Can be
 * specified as an IP address, a CIDR block, or a security group. A CIDR block of `0.0.0.0/0` allows traffic from any
 * source (or to any source, for outbound rules).
 *
 * Classes which extend this class:
 * - SecurityGroupRuleRemoteIP
 * - SecurityGroupRuleRemoteCIDR
 * - SecurityGroupRuleRemoteSecurityGroupReference
 */
public class SecurityGroupRuleRemote extends GenericModel {

  protected String address;
  @SerializedName("cidr_block")
  protected String cidrBlock;
  protected String crn;
  protected SecurityGroupReferenceDeleted deleted;
  protected String href;
  protected String id;
  protected String name;

  protected SecurityGroupRuleRemote() {
  }

  /**
   * Gets the address.
   *
   * The IP address. This property may add support for IPv6 addresses in the future. When processing a value in this
   * property, verify that the address is in an expected format. If it is not, log an error. Optionally halt processing
   * and surface the error, or bypass the resource on which the unexpected IP address format was encountered.
   *
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * Gets the cidrBlock.
   *
   * The CIDR block. This property may add support for IPv6 CIDR blocks in the future. When processing a value in this
   * property, verify that the CIDR block is in an expected format. If it is not, log an error. Optionally halt
   * processing and surface the error, or bypass the resource on which the unexpected CIDR block format was encountered.
   *
   * @return the cidrBlock
   */
  public String getCidrBlock() {
    return cidrBlock;
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
   * Gets the deleted.
   *
   * If present, this property indicates the referenced resource has been deleted and provides
   * some supplementary information.
   *
   * @return the deleted
   */
  public SecurityGroupReferenceDeleted getDeleted() {
    return deleted;
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
   * Gets the name.
   *
   * The user-defined name for this security group. Names must be unique within the VPC the security group resides in.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

