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

import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePrototype;
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
 * Unit test class for the LoadBalancerListenerPolicyPrototype model.
 */
public class LoadBalancerListenerPolicyPrototypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testLoadBalancerListenerPolicyPrototype() throws Throwable {
    LoadBalancerListenerPolicyRulePrototype loadBalancerListenerPolicyRulePrototypeModel = new LoadBalancerListenerPolicyRulePrototype.Builder()
      .condition("contains")
      .field("MY-APP-HEADER")
      .type("header")
      .value("testString")
      .build();
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.condition(), "contains");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.field(), "MY-APP-HEADER");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.type(), "header");
    assertEquals(loadBalancerListenerPolicyRulePrototypeModel.value(), "testString");

    LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById loadBalancerListenerPolicyPrototypeTargetModel = new LoadBalancerListenerPolicyPrototypeTargetLoadBalancerPoolIdentityLoadBalancerPoolIdentityById.Builder()
      .id("70294e14-4e61-11e8-bcf4-0242ac110004")
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeTargetModel.id(), "70294e14-4e61-11e8-bcf4-0242ac110004");

    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModel = new LoadBalancerListenerPolicyPrototype.Builder()
      .name("my-policy")
      .priority(Long.valueOf("5"))
      .action("forward")
      .rules(new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)))
      .target(loadBalancerListenerPolicyPrototypeTargetModel)
      .build();
    assertEquals(loadBalancerListenerPolicyPrototypeModel.name(), "my-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.action(), "forward");
    assertEquals(loadBalancerListenerPolicyPrototypeModel.rules(), new java.util.ArrayList<LoadBalancerListenerPolicyRulePrototype>(java.util.Arrays.asList(loadBalancerListenerPolicyRulePrototypeModel)));
    assertEquals(loadBalancerListenerPolicyPrototypeModel.target(), loadBalancerListenerPolicyPrototypeTargetModel);

    String json = TestUtilities.serialize(loadBalancerListenerPolicyPrototypeModel);

    LoadBalancerListenerPolicyPrototype loadBalancerListenerPolicyPrototypeModelNew = TestUtilities.deserialize(json, LoadBalancerListenerPolicyPrototype.class);
    assertTrue(loadBalancerListenerPolicyPrototypeModelNew instanceof LoadBalancerListenerPolicyPrototype);
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.name(), "my-policy");
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.priority(), Long.valueOf("5"));
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.action(), "forward");
    assertEquals(loadBalancerListenerPolicyPrototypeModelNew.target().toString(), loadBalancerListenerPolicyPrototypeTargetModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testLoadBalancerListenerPolicyPrototypeError() throws Throwable {
    new LoadBalancerListenerPolicyPrototype.Builder().build();
  }

}