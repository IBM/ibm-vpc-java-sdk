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

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * LoadBalancerListener.
 */
public class LoadBalancerListener extends GenericModel {

  /**
   * The listener protocol. Load balancers in the `network` family support `tcp`. Load balancers in the `application`
   * family support `tcp`, `http`, and `https`. Each listener in the load balancer must have a unique `port` and
   * `protocol` combination.
   */
  public interface Protocol {
    /** http. */
    String HTTP = "http";
    /** https. */
    String HTTPS = "https";
    /** tcp. */
    String TCP = "tcp";
  }

  /**
   * The provisioning status of this listener.
   */
  public interface ProvisioningStatus {
    /** active. */
    String ACTIVE = "active";
    /** create_pending. */
    String CREATE_PENDING = "create_pending";
    /** delete_pending. */
    String DELETE_PENDING = "delete_pending";
    /** failed. */
    String FAILED = "failed";
    /** maintenance_pending. */
    String MAINTENANCE_PENDING = "maintenance_pending";
    /** update_pending. */
    String UPDATE_PENDING = "update_pending";
  }

  @SerializedName("accept_proxy_protocol")
  protected Boolean acceptProxyProtocol;
  @SerializedName("certificate_instance")
  protected CertificateInstanceReference certificateInstance;
  @SerializedName("connection_limit")
  protected Long connectionLimit;
  @SerializedName("created_at")
  protected Date createdAt;
  @SerializedName("default_pool")
  protected LoadBalancerPoolReference defaultPool;
  protected String href;
  @SerializedName("https_redirect")
  protected LoadBalancerListenerHTTPSRedirect httpsRedirect;
  protected String id;
  protected List<LoadBalancerListenerPolicyReference> policies;
  protected Long port;
  @SerializedName("port_max")
  protected Long portMax;
  @SerializedName("port_min")
  protected Long portMin;
  protected String protocol;
  @SerializedName("provisioning_status")
  protected String provisioningStatus;

  /**
   * Gets the acceptProxyProtocol.
   *
   * If set to `true`, this listener will accept and forward PROXY protocol information. Supported by load balancers in
   * the `application` family (otherwise always `false`). Additional restrictions:
   * - If this listener has `https_redirect` specified, its `accept_proxy_protocol` value must
   *   match the `accept_proxy_protocol` value of the `https_redirect` listener.
   * - If this listener is the target of another listener's `https_redirect`, its
   *   `accept_proxy_protocol` value must match that listener's `accept_proxy_protocol` value.
   *
   * @return the acceptProxyProtocol
   */
  public Boolean isAcceptProxyProtocol() {
    return acceptProxyProtocol;
  }

  /**
   * Gets the certificateInstance.
   *
   * The certificate instance used for SSL termination. It is applicable only to `https`
   * protocol.
   *
   * @return the certificateInstance
   */
  public CertificateInstanceReference getCertificateInstance() {
    return certificateInstance;
  }

  /**
   * Gets the connectionLimit.
   *
   * The connection limit of the listener.
   *
   * @return the connectionLimit
   */
  public Long getConnectionLimit() {
    return connectionLimit;
  }

  /**
   * Gets the createdAt.
   *
   * The date and time that this listener was created.
   *
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * Gets the defaultPool.
   *
   * The default pool associated with the listener.
   *
   * @return the defaultPool
   */
  public LoadBalancerPoolReference getDefaultPool() {
    return defaultPool;
  }

  /**
   * Gets the href.
   *
   * The listener's canonical URL.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the httpsRedirect.
   *
   * If provided, the target listener that requests are redirected to.
   *
   * @return the httpsRedirect
   */
  public LoadBalancerListenerHTTPSRedirect getHttpsRedirect() {
    return httpsRedirect;
  }

  /**
   * Gets the id.
   *
   * The unique identifier for this load balancer listener.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the policies.
   *
   * The policies for this listener.
   *
   * @return the policies
   */
  public List<LoadBalancerListenerPolicyReference> getPolicies() {
    return policies;
  }

  /**
   * Gets the port.
   *
   * The listener port number, or the inclusive lower bound of the port range. Each listener in the load balancer must
   * have a unique `port` and `protocol` combination.
   *
   * @return the port
   */
  public Long getPort() {
    return port;
  }

  /**
   * Gets the portMax.
   *
   * The inclusive upper bound of the range of ports used by this listener.
   *
   * Only load balancers in the `network` family support more than one port per listener.
   *
   * @return the portMax
   */
  public Long getPortMax() {
    return portMax;
  }

  /**
   * Gets the portMin.
   *
   * The inclusive lower bound of the range of ports used by this listener.
   *
   * Only load balancers in the `network` family support more than one port per listener.
   *
   * @return the portMin
   */
  public Long getPortMin() {
    return portMin;
  }

  /**
   * Gets the protocol.
   *
   * The listener protocol. Load balancers in the `network` family support `tcp`. Load balancers in the `application`
   * family support `tcp`, `http`, and `https`. Each listener in the load balancer must have a unique `port` and
   * `protocol` combination.
   *
   * @return the protocol
   */
  public String getProtocol() {
    return protocol;
  }

  /**
   * Gets the provisioningStatus.
   *
   * The provisioning status of this listener.
   *
   * @return the provisioningStatus
   */
  public String getProvisioningStatus() {
    return provisioningStatus;
  }
}

