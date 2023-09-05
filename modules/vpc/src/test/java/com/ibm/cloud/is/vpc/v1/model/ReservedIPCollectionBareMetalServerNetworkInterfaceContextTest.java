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

import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionBareMetalServerNetworkInterfaceContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionBareMetalServerNetworkInterfaceContextFirst;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionBareMetalServerNetworkInterfaceContextNext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPTargetEndpointGatewayReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReservedIPCollectionBareMetalServerNetworkInterfaceContext model.
 */
public class ReservedIPCollectionBareMetalServerNetworkInterfaceContextTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReservedIPCollectionBareMetalServerNetworkInterfaceContext() throws Throwable {
    ReservedIPCollectionBareMetalServerNetworkInterfaceContext reservedIpCollectionBareMetalServerNetworkInterfaceContextModel = new ReservedIPCollectionBareMetalServerNetworkInterfaceContext();
    assertNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextModel.getFirst());
    assertNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextModel.getIps());
    assertNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextModel.getLimit());
    assertNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextModel.getNext());
    assertNull(reservedIpCollectionBareMetalServerNetworkInterfaceContextModel.getTotalCount());
  }
}