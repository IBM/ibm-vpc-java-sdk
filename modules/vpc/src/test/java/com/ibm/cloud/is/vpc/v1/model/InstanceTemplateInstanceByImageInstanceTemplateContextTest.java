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

import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceAvailabilityPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceDefaultTrustedProfilePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceMetadataServicePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateInstanceByImageInstanceTemplateContext;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceIPPrototypeReservedIPPrototypeNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
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
 * Unit test class for the InstanceTemplateInstanceByImageInstanceTemplateContext model.
 */
public class InstanceTemplateInstanceByImageInstanceTemplateContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceTemplateInstanceByImageInstanceTemplateContext() throws Throwable {
    InstanceTemplateInstanceByImageInstanceTemplateContext instanceTemplateInstanceByImageInstanceTemplateContextModel = new InstanceTemplateInstanceByImageInstanceTemplateContext();
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getAvailabilityPolicy());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getCreatedAt());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getCrn());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getDefaultTrustedProfile());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getHref());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getId());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getKeys());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getMetadataService());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getName());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getPlacementTarget());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getProfile());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getResourceGroup());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getTotalVolumeBandwidth());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getUserData());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getVolumeAttachments());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getVpc());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getBootVolumeAttachment());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getImage());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getNetworkInterfaces());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getPrimaryNetworkInterface());
    assertNull(instanceTemplateInstanceByImageInstanceTemplateContextModel.getZone());
  }
}