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

import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref model.
 */
public class VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testVolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref() throws Throwable {
    VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModel = new VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref.Builder()
      .href("https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5")
      .build();
    assertEquals(volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModel.href(), "https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5");

    String json = TestUtilities.serialize(volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModel);

    VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModelNew = TestUtilities.deserialize(json, VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref.class);
    assertTrue(volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModelNew instanceof VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref);
    assertEquals(volumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefModelNew.href(), "https://us-south.iaas.cloud.ibm.com/v1/volumes/1a6b7274-678d-4dfb-8981-c71dd9d4daa5");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testVolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHrefError() throws Throwable {
    new VolumeAttachmentVolumePrototypeInstanceContextVolumeIdentityVolumeIdentityByHref.Builder().build();
  }

}