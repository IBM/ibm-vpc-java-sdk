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

import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateInstanceGroupManagerPolicyOptions model.
 */
public class UpdateInstanceGroupManagerPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateInstanceGroupManagerPolicyOptions() throws Throwable {
    UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptionsModel = new UpdateInstanceGroupManagerPolicyOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerId("testString")
      .id("testString")
      .name("my-instance-group-manager-policy")
      .metricType("cpu")
      .metricValue(Long.valueOf("26"))
      .build();
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.instanceGroupId(), "testString");
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.instanceGroupManagerId(), "testString");
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.id(), "testString");
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.name(), "my-instance-group-manager-policy");
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.metricType(), "cpu");
    assertEquals(updateInstanceGroupManagerPolicyOptionsModel.metricValue(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupManagerPolicyOptionsError() throws Throwable {
    new UpdateInstanceGroupManagerPolicyOptions.Builder().build();
  }

}