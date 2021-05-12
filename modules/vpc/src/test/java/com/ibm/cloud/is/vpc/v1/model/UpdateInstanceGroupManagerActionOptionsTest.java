/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateInstanceGroupManagerActionOptions model.
 */
public class UpdateInstanceGroupManagerActionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateInstanceGroupManagerActionOptions() throws Throwable {
    UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptionsModel = new UpdateInstanceGroupManagerActionOptions.Builder()
      .instanceGroupId("testString")
      .instanceGroupManagerId("testString")
      .id("testString")
      .instanceGroupManagerActionPatch(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(updateInstanceGroupManagerActionOptionsModel.instanceGroupId(), "testString");
    assertEquals(updateInstanceGroupManagerActionOptionsModel.instanceGroupManagerId(), "testString");
    assertEquals(updateInstanceGroupManagerActionOptionsModel.id(), "testString");
    assertEquals(updateInstanceGroupManagerActionOptionsModel.instanceGroupManagerActionPatch(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInstanceGroupManagerActionOptionsError() throws Throwable {
    new UpdateInstanceGroupManagerActionOptions.Builder().build();
  }

}