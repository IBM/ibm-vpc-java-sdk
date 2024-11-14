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

import com.ibm.cloud.is.vpc.v1.model.ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions model.
 */
public class ListPrivatePathServiceGatewayEndpointGatewayBindingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListPrivatePathServiceGatewayEndpointGatewayBindingsOptions() throws Throwable {
    ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel = new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions.Builder()
      .privatePathServiceGatewayId("testString")
      .start("testString")
      .limit(Long.valueOf("50"))
      .status("abandoned")
      .accountId("bb1b52262f7441a586f49068482f1e60")
      .build();
    assertEquals(listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel.privatePathServiceGatewayId(), "testString");
    assertEquals(listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel.start(), "testString");
    assertEquals(listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel.status(), "abandoned");
    assertEquals(listPrivatePathServiceGatewayEndpointGatewayBindingsOptionsModel.accountId(), "bb1b52262f7441a586f49068482f1e60");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPrivatePathServiceGatewayEndpointGatewayBindingsOptionsError() throws Throwable {
    new ListPrivatePathServiceGatewayEndpointGatewayBindingsOptions.Builder().build();
  }

}