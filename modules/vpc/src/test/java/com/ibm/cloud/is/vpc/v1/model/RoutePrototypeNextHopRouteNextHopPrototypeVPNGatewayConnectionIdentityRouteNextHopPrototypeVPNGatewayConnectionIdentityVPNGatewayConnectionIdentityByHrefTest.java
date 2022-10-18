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

import com.ibm.cloud.is.vpc.v1.model.RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref model.
 */
public class RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref() throws Throwable {
    RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModel = new RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b")
      .build();
    assertEquals(routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b");

    String json = TestUtilities.serialize(routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModel);

    RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModelNew = TestUtilities.deserialize(json, RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref.class);
    assertTrue(routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModelNew instanceof RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref);
    assertEquals(routePrototypeNextHopRouteNextHopPrototypeVpnGatewayConnectionIdentityRouteNextHopPrototypeVpnGatewayConnectionIdentityVpnGatewayConnectionIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/vpn_gateways/ddf51bec-3424-11e8-b467-0ed5f89f718b/connections/93487806-7743-4c46-81d6-72869883ea0b");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHrefError() throws Throwable {
    new RoutePrototypeNextHopRouteNextHopPrototypeVPNGatewayConnectionIdentityRouteNextHopPrototypeVPNGatewayConnectionIdentityVPNGatewayConnectionIdentityByHref.Builder().build();
  }

}