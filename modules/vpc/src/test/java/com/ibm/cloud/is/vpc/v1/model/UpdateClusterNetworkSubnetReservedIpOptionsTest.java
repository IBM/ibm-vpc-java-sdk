/*
 * (C) Copyright IBM Corp. 2022, 2023, 2024.
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

import com.ibm.cloud.is.vpc.v1.model.UpdateClusterNetworkSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateClusterNetworkSubnetReservedIpOptions model.
 */
public class UpdateClusterNetworkSubnetReservedIpOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateClusterNetworkSubnetReservedIpOptions() throws Throwable {
    UpdateClusterNetworkSubnetReservedIpOptions updateClusterNetworkSubnetReservedIpOptionsModel = new UpdateClusterNetworkSubnetReservedIpOptions.Builder()
      .clusterNetworkId("testString")
      .clusterNetworkSubnetId("testString")
      .id("testString")
      .clusterNetworkSubnetReservedIpPatch(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .ifMatch("W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"")
      .build();
    assertEquals(updateClusterNetworkSubnetReservedIpOptionsModel.clusterNetworkId(), "testString");
    assertEquals(updateClusterNetworkSubnetReservedIpOptionsModel.clusterNetworkSubnetId(), "testString");
    assertEquals(updateClusterNetworkSubnetReservedIpOptionsModel.id(), "testString");
    assertEquals(updateClusterNetworkSubnetReservedIpOptionsModel.clusterNetworkSubnetReservedIpPatch(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updateClusterNetworkSubnetReservedIpOptionsModel.ifMatch(), "W/\"96d225c4-56bd-43d9-98fc-d7148e5c5028\"");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateClusterNetworkSubnetReservedIpOptionsError() throws Throwable {
    new UpdateClusterNetworkSubnetReservedIpOptions.Builder().build();
  }

}