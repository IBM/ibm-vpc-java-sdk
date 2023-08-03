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

import com.ibm.cloud.is.vpc.v1.model.ListBareMetalServersOptions;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListBareMetalServersOptions model.
 */
public class ListBareMetalServersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListBareMetalServersOptions() throws Throwable {
    ListBareMetalServersOptions listBareMetalServersOptionsModel = new ListBareMetalServersOptions.Builder()
      .start("testString")
      .limit(Long.valueOf("1"))
      .resourceGroupId("testString")
      .name("testString")
      .vpcId("testString")
      .vpcCrn("crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b")
      .vpcName("my-vpc")
      .networkInterfacesSubnetId("testString")
      .networkInterfacesSubnetCrn("crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e")
      .networkInterfacesSubnetName("my-subnet")
      .build();
    assertEquals(listBareMetalServersOptionsModel.start(), "testString");
    assertEquals(listBareMetalServersOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listBareMetalServersOptionsModel.resourceGroupId(), "testString");
    assertEquals(listBareMetalServersOptionsModel.name(), "testString");
    assertEquals(listBareMetalServersOptionsModel.vpcId(), "testString");
    assertEquals(listBareMetalServersOptionsModel.vpcCrn(), "crn:v1:bluemix:public:is:us-south:a/123456::vpc:4727d842-f94f-4a2d-824a-9bc9b02c523b");
    assertEquals(listBareMetalServersOptionsModel.vpcName(), "my-vpc");
    assertEquals(listBareMetalServersOptionsModel.networkInterfacesSubnetId(), "testString");
    assertEquals(listBareMetalServersOptionsModel.networkInterfacesSubnetCrn(), "crn:v1:bluemix:public:is:us-south-1:a/123456::subnet:7ec86020-1c6e-4889-b3f0-a15f2e50f87e");
    assertEquals(listBareMetalServersOptionsModel.networkInterfacesSubnetName(), "my-subnet");
  }
}