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

import com.ibm.cloud.is.vpc.v1.model.CreateShareOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ShareInitialOwner;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext;
import com.ibm.cloud.is.vpc.v1.model.ShareProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareBySize;
import com.ibm.cloud.is.vpc.v1.model.SharePrototypeShareContext;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateShareOptions model.
 */
public class CreateShareOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateShareOptions() throws Throwable {
    VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext virtualNetworkInterfacePrimaryIpPrototypeModel = new VirtualNetworkInterfacePrimaryIPPrototypeReservedIPPrototypeVirtualNetworkInterfacePrimaryIPContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(virtualNetworkInterfacePrimaryIpPrototypeModel.name(), "my-reserved-ip");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext shareMountTargetVirtualNetworkInterfacePrototypeModel = new ShareMountTargetVirtualNetworkInterfacePrototypeVirtualNetworkInterfacePrototypeShareMountTargetContext.Builder()
      .name("my-virtual-network-interface")
      .primaryIp(virtualNetworkInterfacePrimaryIpPrototypeModel)
      .resourceGroup(resourceGroupIdentityModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.name(), "my-virtual-network-interface");
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.primaryIp(), virtualNetworkInterfacePrimaryIpPrototypeModel);
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(shareMountTargetVirtualNetworkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup shareMountTargetPrototypeModel = new ShareMountTargetPrototypeShareMountTargetByAccessControlModeSecurityGroup.Builder()
      .name("my-share-mount-target")
      .transitEncryption("none")
      .virtualNetworkInterface(shareMountTargetVirtualNetworkInterfacePrototypeModel)
      .build();
    assertEquals(shareMountTargetPrototypeModel.name(), "my-share-mount-target");
    assertEquals(shareMountTargetPrototypeModel.transitEncryption(), "none");
    assertEquals(shareMountTargetPrototypeModel.virtualNetworkInterface(), shareMountTargetVirtualNetworkInterfacePrototypeModel);

    ShareProfileIdentityByName shareProfileIdentityModel = new ShareProfileIdentityByName.Builder()
      .name("tier-3iops")
      .build();
    assertEquals(shareProfileIdentityModel.name(), "tier-3iops");

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    SharePrototypeShareContext sharePrototypeShareContextModel = new SharePrototypeShareContext.Builder()
      .iops(Long.valueOf("100"))
      .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
      .name("my-share")
      .profile(shareProfileIdentityModel)
      .replicationCronSpec("0 */5 * * *")
      .resourceGroup(resourceGroupIdentityModel)
      .userTags(java.util.Arrays.asList())
      .zone(zoneIdentityModel)
      .build();
    assertEquals(sharePrototypeShareContextModel.iops(), Long.valueOf("100"));
    assertEquals(sharePrototypeShareContextModel.mountTargets(), java.util.Arrays.asList(shareMountTargetPrototypeModel));
    assertEquals(sharePrototypeShareContextModel.name(), "my-share");
    assertEquals(sharePrototypeShareContextModel.profile(), shareProfileIdentityModel);
    assertEquals(sharePrototypeShareContextModel.replicationCronSpec(), "0 */5 * * *");
    assertEquals(sharePrototypeShareContextModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(sharePrototypeShareContextModel.userTags(), java.util.Arrays.asList());
    assertEquals(sharePrototypeShareContextModel.zone(), zoneIdentityModel);

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/123456:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    ShareInitialOwner shareInitialOwnerModel = new ShareInitialOwner.Builder()
      .gid(Long.valueOf("50"))
      .uid(Long.valueOf("50"))
      .build();
    assertEquals(shareInitialOwnerModel.gid(), Long.valueOf("50"));
    assertEquals(shareInitialOwnerModel.uid(), Long.valueOf("50"));

    SharePrototypeShareBySize sharePrototypeModel = new SharePrototypeShareBySize.Builder()
      .iops(Long.valueOf("100"))
      .mountTargets(java.util.Arrays.asList(shareMountTargetPrototypeModel))
      .name("my-share")
      .profile(shareProfileIdentityModel)
      .replicaShare(sharePrototypeShareContextModel)
      .userTags(java.util.Arrays.asList())
      .zone(zoneIdentityModel)
      .accessControlMode("security_group")
      .encryptionKey(encryptionKeyIdentityModel)
      .initialOwner(shareInitialOwnerModel)
      .resourceGroup(resourceGroupIdentityModel)
      .size(Long.valueOf("200"))
      .build();
    assertEquals(sharePrototypeModel.iops(), Long.valueOf("100"));
    assertEquals(sharePrototypeModel.mountTargets(), java.util.Arrays.asList(shareMountTargetPrototypeModel));
    assertEquals(sharePrototypeModel.name(), "my-share");
    assertEquals(sharePrototypeModel.profile(), shareProfileIdentityModel);
    assertEquals(sharePrototypeModel.replicaShare(), sharePrototypeShareContextModel);
    assertEquals(sharePrototypeModel.userTags(), java.util.Arrays.asList());
    assertEquals(sharePrototypeModel.zone(), zoneIdentityModel);
    assertEquals(sharePrototypeModel.accessControlMode(), "security_group");
    assertEquals(sharePrototypeModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(sharePrototypeModel.initialOwner(), shareInitialOwnerModel);
    assertEquals(sharePrototypeModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(sharePrototypeModel.size(), Long.valueOf("200"));

    CreateShareOptions createShareOptionsModel = new CreateShareOptions.Builder()
      .sharePrototype(sharePrototypeModel)
      .build();
    assertEquals(createShareOptionsModel.sharePrototype(), sharePrototypeModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateShareOptionsError() throws Throwable {
    new CreateShareOptions.Builder().build();
  }

}