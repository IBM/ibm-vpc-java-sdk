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

import com.ibm.cloud.is.vpc.v1.model.SnapshotConsistencyGroupPatch;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotConsistencyGroupPatch model.
 */
public class SnapshotConsistencyGroupPatchTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotConsistencyGroupPatch() throws Throwable {
    SnapshotConsistencyGroupPatch snapshotConsistencyGroupPatchModel = new SnapshotConsistencyGroupPatch.Builder()
      .deleteSnapshotsOnDelete(true)
      .name("my-snapshot-consistency-group")
      .build();
    assertEquals(snapshotConsistencyGroupPatchModel.deleteSnapshotsOnDelete(), Boolean.valueOf(true));
    assertEquals(snapshotConsistencyGroupPatchModel.name(), "my-snapshot-consistency-group");

    String json = TestUtilities.serialize(snapshotConsistencyGroupPatchModel);

    SnapshotConsistencyGroupPatch snapshotConsistencyGroupPatchModelNew = TestUtilities.deserialize(json, SnapshotConsistencyGroupPatch.class);
    assertTrue(snapshotConsistencyGroupPatchModelNew instanceof SnapshotConsistencyGroupPatch);
    assertEquals(snapshotConsistencyGroupPatchModelNew.deleteSnapshotsOnDelete(), Boolean.valueOf(true));
    assertEquals(snapshotConsistencyGroupPatchModelNew.name(), "my-snapshot-consistency-group");
  }
  @Test
  public void testSnapshotConsistencyGroupPatchAsPatch() throws Throwable {
    SnapshotConsistencyGroupPatch snapshotConsistencyGroupPatchModel = new SnapshotConsistencyGroupPatch.Builder()
      .deleteSnapshotsOnDelete(true)
      .name("my-snapshot-consistency-group")
      .build();

    Map<String, Object> mergePatch = snapshotConsistencyGroupPatchModel.asPatch();

    assertTrue(mergePatch.containsKey("delete_snapshots_on_delete"));
    assertEquals(mergePatch.get("name"), "my-snapshot-consistency-group");
  }

}