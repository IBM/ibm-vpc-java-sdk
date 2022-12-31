/*
 * (C) Copyright IBM Corp. 2020, 2021, 2022.
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

import com.ibm.cloud.is.vpc.v1.model.CatalogOfferingIdentityCatalogOfferingByCRN;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceCatalogOfferingPrototypeCatalogOfferingByOffering;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceByCatalogOffering;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.TrustedProfileIdentityTrustedProfileById;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototype;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceTemplatePrototypeInstanceByCatalogOffering model.
 */
public class InstanceTemplatePrototypeInstanceByCatalogOfferingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplatePrototypeInstanceByCatalogOffering() throws Throwable {
    InstanceAvailabilityPrototype instanceAvailabilityPrototypeModel = new InstanceAvailabilityPrototype.Builder()
      .hostFailure("restart")
      .build();
    assertEquals(instanceAvailabilityPrototypeModel.hostFailure(), "restart");

    TrustedProfileIdentityTrustedProfileById trustedProfileIdentityModel = new TrustedProfileIdentityTrustedProfileById.Builder()
      .id("Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5")
      .build();
    assertEquals(trustedProfileIdentityModel.id(), "Profile-9fd84246-7df4-4667-94e4-8ecde51d5ac5");

    InstanceDefaultTrustedProfilePrototype instanceDefaultTrustedProfilePrototypeModel = new InstanceDefaultTrustedProfilePrototype.Builder()
      .autoLink(false)
      .target(trustedProfileIdentityModel)
      .build();
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.autoLink(), Boolean.valueOf(false));
    assertEquals(instanceDefaultTrustedProfilePrototypeModel.target(), trustedProfileIdentityModel);

    KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(keyIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    InstanceMetadataServicePrototype instanceMetadataServicePrototypeModel = new InstanceMetadataServicePrototype.Builder()
      .enabled(false)
      .build();
    assertEquals(instanceMetadataServicePrototypeModel.enabled(), Boolean.valueOf(false));

    NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext networkInterfaceIpPrototypeModel = new NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext.Builder()
      .address("10.0.0.5")
      .autoDelete(false)
      .name("my-reserved-ip")
      .build();
    assertEquals(networkInterfaceIpPrototypeModel.address(), "10.0.0.5");
    assertEquals(networkInterfaceIpPrototypeModel.autoDelete(), Boolean.valueOf(false));
    assertEquals(networkInterfaceIpPrototypeModel.name(), "my-reserved-ip");

    SecurityGroupIdentityById securityGroupIdentityModel = new SecurityGroupIdentityById.Builder()
      .id("be5df5ca-12a0-494b-907e-aa6ec2bfa271")
      .build();
    assertEquals(securityGroupIdentityModel.id(), "be5df5ca-12a0-494b-907e-aa6ec2bfa271");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
      .allowIpSpoofing(true)
      .name("my-network-interface")
      .primaryIp(networkInterfaceIpPrototypeModel)
      .securityGroups(java.util.Arrays.asList(securityGroupIdentityModel))
      .subnet(subnetIdentityModel)
      .build();
    assertEquals(networkInterfacePrototypeModel.allowIpSpoofing(), Boolean.valueOf(true));
    assertEquals(networkInterfacePrototypeModel.name(), "my-network-interface");
    assertEquals(networkInterfacePrototypeModel.primaryIp(), networkInterfaceIpPrototypeModel);
    assertEquals(networkInterfacePrototypeModel.securityGroups(), java.util.Arrays.asList(securityGroupIdentityModel));
    assertEquals(networkInterfacePrototypeModel.subnet(), subnetIdentityModel);

    InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
      .id("1e09281b-f177-46fb-baf1-bc152b2e391a")
      .build();
    assertEquals(instancePlacementTargetPrototypeModel.id(), "1e09281b-f177-46fb-baf1-bc152b2e391a");

    InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
      .name("cx2-16x32")
      .build();
    assertEquals(instanceProfileIdentityModel.name(), "cx2-16x32");

    ResourceGroupIdentityById resourceGroupIdentityModel = new ResourceGroupIdentityById.Builder()
      .id("fee82deba12e4c0fb69c3b09d1f12345")
      .build();
    assertEquals(resourceGroupIdentityModel.id(), "fee82deba12e4c0fb69c3b09d1f12345");

    VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
      .id("1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentPrototypeVolumeModel.id(), "1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    VolumeAttachmentPrototype volumeAttachmentPrototypeModel = new VolumeAttachmentPrototype.Builder()
      .deleteVolumeOnInstanceDelete(false)
      .name("my-volume-attachment")
      .volume(volumeAttachmentPrototypeVolumeModel)
      .build();
    assertEquals(volumeAttachmentPrototypeModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(false));
    assertEquals(volumeAttachmentPrototypeModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeModel.volume(), volumeAttachmentPrototypeVolumeModel);

    VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
      .id("4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .build();
    assertEquals(vpcIdentityModel.id(), "4727d842-f94f-4a2d-824a-9bc9b02c523b");

    EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
      .crn("crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179")
      .build();
    assertEquals(encryptionKeyIdentityModel.crn(), "crn:v1:bluemix:public:kms:us-south:a/dffc98a0f1f0f95f6613b3b752286b87:e4a29d1a-2ef0-42a6-8fd2-350deb1c647e:key:5437653b-c4b1-447f-9646-b2a2a4cd6179");

    VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
      .name("general-purpose")
      .build();
    assertEquals(volumeProfileIdentityModel.name(), "general-purpose");

    VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
      .capacity(Long.valueOf("250"))
      .encryptionKey(encryptionKeyIdentityModel)
      .iops(Long.valueOf("10000"))
      .name("my-volume")
      .profile(volumeProfileIdentityModel)
      .userTags(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(volumePrototypeInstanceByImageContextModel.capacity(), Long.valueOf("250"));
    assertEquals(volumePrototypeInstanceByImageContextModel.encryptionKey(), encryptionKeyIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.iops(), Long.valueOf("10000"));
    assertEquals(volumePrototypeInstanceByImageContextModel.name(), "my-volume");
    assertEquals(volumePrototypeInstanceByImageContextModel.profile(), volumeProfileIdentityModel);
    assertEquals(volumePrototypeInstanceByImageContextModel.userTags(), java.util.Arrays.asList("testString"));

    VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
      .deleteVolumeOnInstanceDelete(true)
      .name("my-volume-attachment")
      .volume(volumePrototypeInstanceByImageContextModel)
      .build();
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.deleteVolumeOnInstanceDelete(), Boolean.valueOf(true));
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.name(), "my-volume-attachment");
    assertEquals(volumeAttachmentPrototypeInstanceByImageContextModel.volume(), volumePrototypeInstanceByImageContextModel);

    CatalogOfferingIdentityCatalogOfferingByCRN catalogOfferingIdentityModel = new CatalogOfferingIdentityCatalogOfferingByCRN.Builder()
      .crn("crn:v1:bluemix:public:globalcatalog-collection:global:a/123456:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:offering:00111601-0ec5-41ac-b142-96d1e64e6442")
      .build();
    assertEquals(catalogOfferingIdentityModel.crn(), "crn:v1:bluemix:public:globalcatalog-collection:global:a/123456:1082e7d2-5e2f-0a11-a3bc-f88a8e1931fc:offering:00111601-0ec5-41ac-b142-96d1e64e6442");

    InstanceCatalogOfferingPrototypeCatalogOfferingByOffering instanceCatalogOfferingPrototypeModel = new InstanceCatalogOfferingPrototypeCatalogOfferingByOffering.Builder()
      .offering(catalogOfferingIdentityModel)
      .build();
    assertEquals(instanceCatalogOfferingPrototypeModel.offering(), catalogOfferingIdentityModel);

    ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
      .name("us-south-1")
      .build();
    assertEquals(zoneIdentityModel.name(), "us-south-1");

    InstanceTemplatePrototypeInstanceByCatalogOffering instanceTemplatePrototypeInstanceByCatalogOfferingModel = new InstanceTemplatePrototypeInstanceByCatalogOffering.Builder()
      .availabilityPolicy(instanceAvailabilityPrototypeModel)
      .defaultTrustedProfile(instanceDefaultTrustedProfilePrototypeModel)
      .keys(java.util.Arrays.asList(keyIdentityModel))
      .metadataService(instanceMetadataServicePrototypeModel)
      .name("my-instance")
      .networkInterfaces(java.util.Arrays.asList(networkInterfacePrototypeModel))
      .placementTarget(instancePlacementTargetPrototypeModel)
      .profile(instanceProfileIdentityModel)
      .resourceGroup(resourceGroupIdentityModel)
      .totalVolumeBandwidth(Long.valueOf("500"))
      .userData("testString")
      .volumeAttachments(java.util.Arrays.asList(volumeAttachmentPrototypeModel))
      .vpc(vpcIdentityModel)
      .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
      .catalogOffering(instanceCatalogOfferingPrototypeModel)
      .primaryNetworkInterface(networkInterfacePrototypeModel)
      .zone(zoneIdentityModel)
      .build();
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.availabilityPolicy(), instanceAvailabilityPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.defaultTrustedProfile(), instanceDefaultTrustedProfilePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.keys(), java.util.Arrays.asList(keyIdentityModel));
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.metadataService(), instanceMetadataServicePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.networkInterfaces(), java.util.Arrays.asList(networkInterfacePrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.placementTarget(), instancePlacementTargetPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.profile(), instanceProfileIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.resourceGroup(), resourceGroupIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.volumeAttachments(), java.util.Arrays.asList(volumeAttachmentPrototypeModel));
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.vpc(), vpcIdentityModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.bootVolumeAttachment(), volumeAttachmentPrototypeInstanceByImageContextModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.catalogOffering(), instanceCatalogOfferingPrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.primaryNetworkInterface(), networkInterfacePrototypeModel);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModel.zone(), zoneIdentityModel);

    String json = TestUtilities.serialize(instanceTemplatePrototypeInstanceByCatalogOfferingModel);

    InstanceTemplatePrototypeInstanceByCatalogOffering instanceTemplatePrototypeInstanceByCatalogOfferingModelNew = TestUtilities.deserialize(json, InstanceTemplatePrototypeInstanceByCatalogOffering.class);
    assertTrue(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew instanceof InstanceTemplatePrototypeInstanceByCatalogOffering);
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.availabilityPolicy().toString(), instanceAvailabilityPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.defaultTrustedProfile().toString(), instanceDefaultTrustedProfilePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.metadataService().toString(), instanceMetadataServicePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.name(), "my-instance");
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.placementTarget().toString(), instancePlacementTargetPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.profile().toString(), instanceProfileIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.resourceGroup().toString(), resourceGroupIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.totalVolumeBandwidth(), Long.valueOf("500"));
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.userData(), "testString");
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.vpc().toString(), vpcIdentityModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.bootVolumeAttachment().toString(), volumeAttachmentPrototypeInstanceByImageContextModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.catalogOffering().toString(), instanceCatalogOfferingPrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.primaryNetworkInterface().toString(), networkInterfacePrototypeModel.toString());
    assertEquals(instanceTemplatePrototypeInstanceByCatalogOfferingModelNew.zone().toString(), zoneIdentityModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceTemplatePrototypeInstanceByCatalogOfferingError() throws Throwable {
    new InstanceTemplatePrototypeInstanceByCatalogOffering.Builder().build();
  }

}