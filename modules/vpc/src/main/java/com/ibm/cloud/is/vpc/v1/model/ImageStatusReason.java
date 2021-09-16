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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ImageStatusReason.
 */
public class ImageStatusReason extends GenericModel {

  /**
   * A snake case string succinctly identifying the status reason.
   */
  public interface Code {
    /** encryption_key_deleted. */
    String ENCRYPTION_KEY_DELETED = "encryption_key_deleted";
    /** encryption_key_disabled. */
    String ENCRYPTION_KEY_DISABLED = "encryption_key_disabled";
    /** image_request_queued. */
    String IMAGE_REQUEST_QUEUED = "image_request_queued";
    /** image_request_in_progress. */
    String IMAGE_REQUEST_IN_PROGRESS = "image_request_in_progress";
  }

  protected String code;
  protected String message;
  @SerializedName("more_info")
  protected String moreInfo;

  /**
   * Gets the code.
   *
   * A snake case string succinctly identifying the status reason.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Gets the message.
   *
   * An explanation of the status reason.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the moreInfo.
   *
   * Link to documentation about this status reason.
   *
   * @return the moreInfo
   */
  public String getMoreInfo() {
    return moreInfo;
  }
}

