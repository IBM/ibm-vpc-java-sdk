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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The listSubnetReservedIps options.
 */
public class ListSubnetReservedIpsOptions extends GenericModel {

  /**
   * Sorts the returned collection by the specified field name in ascending order. A `-` may be prepended to the field
   * name to sort in descending order. For example, the value
   * `-created_at` sorts the collection by the `created_at` field in descending order, and the value `name` sorts it by
   * the `name` field in ascending order.
   */
  public interface Sort {
    /** created_at. */
    String CREATED_AT = "created_at";
    /** name. */
    String NAME = "name";
    /** address. */
    String ADDRESS = "address";
  }

  protected String subnetId;
  protected String start;
  protected Long limit;
  protected String sort;

  /**
   * Builder.
   */
  public static class Builder {
    private String subnetId;
    private String start;
    private Long limit;
    private String sort;

    private Builder(ListSubnetReservedIpsOptions listSubnetReservedIpsOptions) {
      this.subnetId = listSubnetReservedIpsOptions.subnetId;
      this.start = listSubnetReservedIpsOptions.start;
      this.limit = listSubnetReservedIpsOptions.limit;
      this.sort = listSubnetReservedIpsOptions.sort;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subnetId the subnetId
     */
    public Builder(String subnetId) {
      this.subnetId = subnetId;
    }

    /**
     * Builds a ListSubnetReservedIpsOptions.
     *
     * @return the new ListSubnetReservedIpsOptions instance
     */
    public ListSubnetReservedIpsOptions build() {
      return new ListSubnetReservedIpsOptions(this);
    }

    /**
     * Set the subnetId.
     *
     * @param subnetId the subnetId
     * @return the ListSubnetReservedIpsOptions builder
     */
    public Builder subnetId(String subnetId) {
      this.subnetId = subnetId;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the ListSubnetReservedIpsOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListSubnetReservedIpsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the sort.
     *
     * @param sort the sort
     * @return the ListSubnetReservedIpsOptions builder
     */
    public Builder sort(String sort) {
      this.sort = sort;
      return this;
    }
  }

  protected ListSubnetReservedIpsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subnetId,
      "subnetId cannot be empty");
    subnetId = builder.subnetId;
    start = builder.start;
    limit = builder.limit;
    sort = builder.sort;
  }

  /**
   * New builder.
   *
   * @return a ListSubnetReservedIpsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subnetId.
   *
   * The subnet identifier.
   *
   * @return the subnetId
   */
  public String subnetId() {
    return subnetId;
  }

  /**
   * Gets the start.
   *
   * A server-supplied token determining what resource to start the page on.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the limit.
   *
   * The number of resources to return on a page.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the sort.
   *
   * Sorts the returned collection by the specified field name in ascending order. A `-` may be prepended to the field
   * name to sort in descending order. For example, the value
   * `-created_at` sorts the collection by the `created_at` field in descending order, and the value `name` sorts it by
   * the `name` field in ascending order.
   *
   * @return the sort
   */
  public String sort() {
    return sort;
  }
}

