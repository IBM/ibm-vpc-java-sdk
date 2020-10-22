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

import com.ibm.cloud.is.vpc.v1.model.CreateNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateNetworkAclOptions model.
 */
public class CreateNetworkAclOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateNetworkAclOptions() throws Throwable {
    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("cf7cd5a-2f30-4336-a495-6addc820cd61")
      .build();
    assertEquals(vpcIdentityModel.id(), "cf7cd5a-2f30-4336-a495-6addc820cd61");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll networkAclRulePrototypeNetworkAclContextModel = new NetworkACLRulePrototypeNetworkACLContextNetworkACLRuleProtocolAll.Builder()
      .name("my-rule-2")
      .action("allow")
      .destination("192.168.3.2/32")
      .direction("inbound")
      .source("192.168.3.2/32")
      .protocol("all")
      .build();
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.name(), "my-rule-2");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.action(), "allow");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.destination(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.direction(), "inbound");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.source(), "192.168.3.2/32");
    assertEquals(networkAclRulePrototypeNetworkAclContextModel.protocol(), "all");

    NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
      .name("my-network-acl")
      .vpc(vpcIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .rules(new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)))
      .build();
    assertEquals(networkAclPrototypeModel.name(), "my-network-acl");
    assertEquals(networkAclPrototypeModel.vpc(), vpcIdentityModel);
    assertEquals(networkAclPrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(networkAclPrototypeModel.rules(), new java.util.ArrayList<NetworkACLRulePrototypeNetworkACLContext>(java.util.Arrays.asList(networkAclRulePrototypeNetworkAclContextModel)));

    CreateNetworkAclOptions createNetworkAclOptionsModel = new CreateNetworkAclOptions.Builder()
      .networkAclPrototype(networkAclPrototypeModel)
      .build();
    assertEquals(createNetworkAclOptionsModel.networkAclPrototype(), networkAclPrototypeModel);
  }
}