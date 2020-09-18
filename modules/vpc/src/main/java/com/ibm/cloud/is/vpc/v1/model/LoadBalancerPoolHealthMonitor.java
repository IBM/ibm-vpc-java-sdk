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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerPoolHealthMonitor.
 */
public class LoadBalancerPoolHealthMonitor extends GenericModel {

  /**
   * The protocol type of this load balancer pool health monitor.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the health monitor on which
   * the unexpected property value was encountered.
   */
  public interface Type {
    /** http. */
    String HTTP = "http";
    /** tcp. */
    String TCP = "tcp";
    /** https. */
    String HTTPS = "https";
  }

  protected Long delay;
  @SerializedName("max_retries")
  protected Long maxRetries;
  protected Long port;
  protected Long timeout;
  protected String type;
  @SerializedName("url_path")
  protected String urlPath;

  /**
   * Gets the delay.
   *
   * The health check interval in seconds. Interval must be greater than timeout value.
   *
   * @return the delay
   */
  public Long getDelay() {
    return delay;
  }

  /**
   * Gets the maxRetries.
   *
   * The health check max retries.
   *
   * @return the maxRetries
   */
  public Long getMaxRetries() {
    return maxRetries;
  }

  /**
   * Gets the port.
   *
   * The health check port number. If specified, this overrides the ports specified in the server member resources.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the timeout.
   *
   * The health check timeout in seconds.
   *
   * @return the timeout
   */
  public Long getTimeout() {
    return timeout;
  }

  /**
   * Gets the type.
   *
   * The protocol type of this load balancer pool health monitor.
   *
   * The enumerated values for this property are expected to expand in the future. When processing this property, check
   * for and log unknown values. Optionally halt processing and surface the error, or bypass the health monitor on which
   * the unexpected property value was encountered.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the urlPath.
   *
   * The health check URL. This is applicable only to `http` type of health monitor.
   *
   * @return the urlPath
   */
  public String getUrlPath() {
    return urlPath;
  }
}

