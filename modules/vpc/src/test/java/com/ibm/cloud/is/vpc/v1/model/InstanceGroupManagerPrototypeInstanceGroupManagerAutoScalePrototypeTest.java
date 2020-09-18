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

import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype model.
 */
public class InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype() throws Throwable {
    InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
      .name("my-instance-group-manager")
      .managementEnabled(true)
      .aggregationWindow(Long.valueOf("120"))
      .cooldown(Long.valueOf("210"))
      .maxMembershipCount(Long.valueOf("10"))
      .minMembershipCount(Long.valueOf("10"))
      .managerType("autoscale")
      .build();
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.name(), "my-instance-group-manager");
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.managementEnabled(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.aggregationWindow(), Long.valueOf("120"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.cooldown(), Long.valueOf("210"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel.managerType(), "autoscale");

    String json = TestUtilities.serialize(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModel);

    InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew = TestUtilities.deserialize(json, InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.class);
    assertTrue(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew instanceof InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype);
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.name(), "my-instance-group-manager");
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.managementEnabled(), Boolean.valueOf(true));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.aggregationWindow(), Long.valueOf("120"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.cooldown(), Long.valueOf("210"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.maxMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.minMembershipCount(), Long.valueOf("10"));
    assertEquals(instanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeModelNew.managerType(), "autoscale");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototypeError() throws Throwable {
    new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder().build();
  }

}