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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ImageCollection.
 */
public class ImageCollection extends GenericModel {

  protected ImageCollectionFirst first;
  protected List<Image> images;
  protected Long limit;
  protected ImageCollectionNext next;

  /**
   * Gets the first.
   *
   * A link to the first page of resources.
   *
   * @return the first
   */
  public ImageCollectionFirst getFirst() {
    return first;
  }

  /**
   * Gets the images.
   *
   * Collection of images.
   *
   * @return the images
   */
  public List<Image> getImages() {
    return images;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of resources that can be returned by the request.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the next.
   *
   * A link to the next page of resources. This property is present for all pages
   * except the last page.
   *
   * @return the next
   */
  public ImageCollectionNext getNext() {
    return next;
  }
}
