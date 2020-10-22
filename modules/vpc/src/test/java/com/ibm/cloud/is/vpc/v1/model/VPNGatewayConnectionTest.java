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

import com.ibm.cloud.is.vpc.v1.model.IKEPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyReference;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionDPD;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VPNGatewayConnection model.
 */
public class VPNGatewayConnectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVPNGatewayConnection() throws Throwable {
    VPNGatewayConnection vpnGatewayConnectionModel = new VPNGatewayConnection();
    assertNull(vpnGatewayConnectionModel.getId());
    assertNull(vpnGatewayConnectionModel.getHref());
    assertNull(vpnGatewayConnectionModel.getName());
    assertNull(vpnGatewayConnectionModel.getResourceType());
    assertNull(vpnGatewayConnectionModel.isAdminStateUp());
    assertNull(vpnGatewayConnectionModel.getPeerAddress());
    assertNull(vpnGatewayConnectionModel.getPsk());
    assertNull(vpnGatewayConnectionModel.getLocalCIDRs());
    assertNull(vpnGatewayConnectionModel.getPeerCIDRs());
    assertNull(vpnGatewayConnectionModel.getRouteMode());
    assertNull(vpnGatewayConnectionModel.getAuthenticationMode());
    assertNull(vpnGatewayConnectionModel.getStatus());
    assertNull(vpnGatewayConnectionModel.getCreatedAt());
    assertNull(vpnGatewayConnectionModel.getDeadPeerDetection());
    assertNull(vpnGatewayConnectionModel.getIkePolicy());
    assertNull(vpnGatewayConnectionModel.getIpsecPolicy());
  }
}