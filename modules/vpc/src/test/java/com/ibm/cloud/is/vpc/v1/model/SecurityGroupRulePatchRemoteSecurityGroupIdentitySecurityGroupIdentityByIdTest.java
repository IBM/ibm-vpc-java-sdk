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

import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById model.
 */
public class SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById() throws Throwable {
    SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModel = new SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    String json = TestUtilities.serialize(securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModel);

    SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModelNew = TestUtilities.deserialize(json, SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById.class);
    assertTrue(securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModelNew instanceof SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById);
    assertEquals(securityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdModelNew.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityByIdError() throws Throwable {
    new SecurityGroupRulePatchRemoteSecurityGroupIdentitySecurityGroupIdentityById.Builder().build();
  }

}