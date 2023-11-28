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

import com.ibm.cloud.is.vpc.v1.model.BackupPolicy;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyCollectionFirst;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyCollectionNext;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyHealthReason;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReference;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanReferenceDeleted;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyPlanRemote;
import com.ibm.cloud.is.vpc.v1.model.BackupPolicyScopeEnterpriseReference;
import com.ibm.cloud.is.vpc.v1.model.RegionReference;
import com.ibm.cloud.is.vpc.v1.model.ResourceGroupReference;
import com.ibm.cloud.is.vpc.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BackupPolicyCollection model.
 */
public class BackupPolicyCollectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBackupPolicyCollection() throws Throwable {
    BackupPolicyCollection backupPolicyCollectionModel = new BackupPolicyCollection();
    assertNull(backupPolicyCollectionModel.getBackupPolicies());
    assertNull(backupPolicyCollectionModel.getFirst());
    assertNull(backupPolicyCollectionModel.getLimit());
    assertNull(backupPolicyCollectionModel.getNext());
    assertNull(backupPolicyCollectionModel.getTotalCount());
  }
}