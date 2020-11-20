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

/**
 * NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.
 */
public class NetworkACLRulePrototypeNetworkACLRuleProtocolICMP extends NetworkACLRulePrototype {

  /**
   * Whether to allow or deny matching traffic.
   */
  public interface Action {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  /**
   * Whether the traffic to be matched is `inbound` or `outbound`.
   */
  public interface Direction {
    /** inbound. */
    String INBOUND = "inbound";
    /** outbound. */
    String OUTBOUND = "outbound";
  }

  /**
   * The protocol to enforce.
   */
  public interface Protocol {
    /** icmp. */
    String ICMP = "icmp";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String action;
    private NetworkACLRuleBeforePrototype before;
    private String destination;
    private String direction;
    private String name;
    private String source;
    private Long code;
    private String protocol;
    private Long type;

    public Builder(NetworkACLRulePrototype networkAclRulePrototypeNetworkAclRuleProtocolIcmp) {
      this.action = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.action;
      this.before = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.before;
      this.destination = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.destination;
      this.direction = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.direction;
      this.name = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.name;
      this.source = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.source;
      this.code = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.code;
      this.protocol = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.protocol;
      this.type = networkAclRulePrototypeNetworkAclRuleProtocolIcmp.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param action the action
     * @param destination the destination
     * @param direction the direction
     * @param source the source
     * @param protocol the protocol
     */
    public Builder(String action, String destination, String direction, String source, String protocol) {
      this.action = action;
      this.destination = destination;
      this.direction = direction;
      this.source = source;
      this.protocol = protocol;
    }

    /**
     * Builds a NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.
     *
     * @return the new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP instance
     */
    public NetworkACLRulePrototypeNetworkACLRuleProtocolICMP build() {
      return new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP(this);
    }

    /**
     * Set the action.
     *
     * @param action the action
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder action(String action) {
      this.action = action;
      return this;
    }

    /**
     * Set the before.
     *
     * @param before the before
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder before(NetworkACLRuleBeforePrototype before) {
      this.before = before;
      return this;
    }

    /**
     * Set the destination.
     *
     * @param destination the destination
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder destination(String destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Set the direction.
     *
     * @param direction the direction
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder direction(String direction) {
      this.direction = direction;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    /**
     * Set the code.
     *
     * @param code the code
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder code(long code) {
      this.code = code;
      return this;
    }

    /**
     * Set the protocol.
     *
     * @param protocol the protocol
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder protocol(String protocol) {
      this.protocol = protocol;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
     */
    public Builder type(long type) {
      this.type = type;
      return this;
    }
  }

  protected NetworkACLRulePrototypeNetworkACLRuleProtocolICMP(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.action,
      "action cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.destination,
      "destination cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.direction,
      "direction cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.source,
      "source cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.protocol,
      "protocol cannot be null");
    action = builder.action;
    before = builder.before;
    destination = builder.destination;
    direction = builder.direction;
    name = builder.name;
    source = builder.source;
    code = builder.code;
    protocol = builder.protocol;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a NetworkACLRulePrototypeNetworkACLRuleProtocolICMP builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

