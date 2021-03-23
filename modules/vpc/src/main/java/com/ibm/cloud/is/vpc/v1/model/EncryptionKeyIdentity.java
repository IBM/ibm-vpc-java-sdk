/*
 * (C) Copyright IBM Corp. 2021.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Identifies an encryption key by a unique property.
 *
 * Classes which extend this class:
 * - EncryptionKeyIdentityByCRN
 */
public class EncryptionKeyIdentity extends GenericModel {

  protected String crn;

  protected EncryptionKeyIdentity() {
  }

  /**
   * Gets the crn.
   *
   * The CRN of the [Key Protect Root
   * Key](https://cloud.ibm.com/docs/key-protect?topic=key-protect-getting-started-tutorial) or [Hyper Protect Crypto
   * Service Root Key](https://cloud.ibm.com/docs/hs-crypto?topic=hs-crypto-get-started) for this resource.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }
}

