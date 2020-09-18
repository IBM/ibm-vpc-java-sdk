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

import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupOptions;
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
 * Unit test class for the UpdateInstanceGroupOptions model.
 */
public class UpdateInstanceGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateInstanceGroupOptions() throws Throwable {
    InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
      .id("a6b1a881-2ce8-41a3-80fc-36316a73f803")
      .build();
    assertEquals(instanceTemplateIdentityModel.id(), "a6b1a881-2ce8-41a3-80fc-36316a73f803");

    SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
      .id("7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .build();
    assertEquals(subnetIdentityModel.id(), "7ec86020-1c6e-4889-b3f0-a15f2e50f87e");

    LoadBalancerIdentityById loadBalancerIdentityModel = new LoadBalancerIdentityById.Builder()
      .id("dd754295-e9e0-4c9d-bf6c-58fbc59e5727")
      .build();
    assertEquals(loadBalancerIdentityModel.id(), "dd754295-e9e0-4c9d-bf6c-58fbc59e5727");

    LoadBalancerPoolIdentityById loadBalancerPoolIdentityModel = new LoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerPoolIdentityModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    UpdateInstanceGroupOptions updateInstanceGroupOptionsModel = new UpdateInstanceGroupOptions.Builder()
      .id("testString")
      .name("my-instance-group")
      .membershipCount(Long.valueOf("10"))
      .instanceTemplate(instanceTemplateIdentityModel)
      .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
      .applicationPort(Long.valueOf("22"))
      .loadBalancer(loadBalancerIdentityModel)
      .loadBalancerPool(loadBalancerPoolIdentityModel)
      .build();
    assertEquals(updateInstanceGroupOptionsModel.id(), "testString");
    assertEquals(updateInstanceGroupOptionsModel.name(), "my-instance-group");
    assertEquals(updateInstanceGroupOptionsModel.membershipCount(), Long.valueOf("10"));
    assertEquals(updateInstanceGroupOptionsModel.instanceTemplate(), instanceTemplateIdentityModel);
    assertEquals(updateInstanceGroupOptionsModel.subnets(), new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)));
    assertEquals(updateInstanceGroupOptionsModel.applicationPort(), Long.valueOf("22"));
    assertEquals(updateInstanceGroupOptionsModel.loadBalancer(), loadBalancerIdentityModel);
    assertEquals(updateInstanceGroupOptionsModel.loadBalancerPool(), loadBalancerPoolIdentityModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupOptionsError() throws Throwable {
    new UpdateInstanceGroupOptions.Builder().build();
  }

}