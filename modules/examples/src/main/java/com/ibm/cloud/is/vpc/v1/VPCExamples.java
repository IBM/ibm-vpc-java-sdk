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

package com.ibm.cloud.is.vpc.v1;

import com.ibm.cloud.is.vpc.v1.model.AddEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.AddSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefix;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixCollection;
import com.ibm.cloud.is.vpc.v1.model.AddressPrefixPatch;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CheckVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.CloudObjectStorageBucketIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceConsoleAccessTokenOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.CreateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHost;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDisk;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroup;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupIdentityById;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPatch;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfile;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.DedicatedHostPrototypeDedicatedHostByGroup;
import com.ibm.cloud.is.vpc.v1.model.DefaultNetworkACL;
import com.ibm.cloud.is.vpc.v1.model.DefaultRoutingTable;
import com.ibm.cloud.is.vpc.v1.model.DefaultSecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteImageOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeletePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSecurityGroupTargetBindingOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.DeleteVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.EncryptionKeyIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.EndpointGateway;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN;
import com.ibm.cloud.is.vpc.v1.model.FloatingIP;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPCollection;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPatch;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPPrototypeFloatingIPByZone;
import com.ibm.cloud.is.vpc.v1.model.FloatingIPUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollector;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorCollection;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorPatch;
import com.ibm.cloud.is.vpc.v1.model.FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.GetDedicatedHostProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetImageOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceInitializationOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.GetInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.GetIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetLoadBalancerStatisticsOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetOperatingSystemOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetRegionZoneOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSecurityGroupTargetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.GetSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVolumeProfileOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcDefaultSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.GetVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicy;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IKEPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicy;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.IPsecPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.Image;
import com.ibm.cloud.is.vpc.v1.model.ImageCollection;
import com.ibm.cloud.is.vpc.v1.model.ImageFilePrototype;
import com.ibm.cloud.is.vpc.v1.model.ImageIdentityById;
import com.ibm.cloud.is.vpc.v1.model.ImagePatch;
import com.ibm.cloud.is.vpc.v1.model.ImagePrototypeImageByFile;
import com.ibm.cloud.is.vpc.v1.model.Instance;
import com.ibm.cloud.is.vpc.v1.model.InstanceAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceConsoleAccessToken;
import com.ibm.cloud.is.vpc.v1.model.InstanceDisk;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceDiskPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroup;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManager;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerAction;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionsCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicy;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerScheduledActionGroupPrototype;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembership;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupMembershipPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceInitialization;
import com.ibm.cloud.is.vpc.v1.model.InstancePatch;
import com.ibm.cloud.is.vpc.v1.model.InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfile;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstancePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplate;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateCollection;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplateIdentityById;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePatch;
import com.ibm.cloud.is.vpc.v1.model.InstanceTemplatePrototypeInstanceByImage;
import com.ibm.cloud.is.vpc.v1.model.Key;
import com.ibm.cloud.is.vpc.v1.model.KeyCollection;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentity;
import com.ibm.cloud.is.vpc.v1.model.KeyIdentityById;
import com.ibm.cloud.is.vpc.v1.model.KeyPatch;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListDedicatedHostsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListEndpointGatewayIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListEndpointGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListFlowLogCollectorsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIkePolicyConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListImagesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceDisksOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerActionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupManagersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupMembershipsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfaceFloatingIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceTemplatesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstanceVolumeAttachmentsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListInstancesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIpsecPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListIpsecPolicyConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListKeysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenerPoliciesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenerPolicyRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerListenersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerPoolsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancerProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListLoadBalancersOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListNetworkAclsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListOperatingSystemsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPlacementGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListPublicGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionZonesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListRegionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupNetworkInterfacesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupRulesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupTargetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSecurityGroupsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSnapshotsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetReservedIpsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListSubnetsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumeProfilesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVolumesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcAddressPrefixesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTableRoutesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcRoutingTablesOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpcsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionLocalCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionPeerCidrsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewayConnectionsOptions;
import com.ibm.cloud.is.vpc.v1.model.ListVpnGatewaysOptions;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancer;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListener;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicy;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRule;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerListenerPolicyRulePatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPool;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolHealthMonitorPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMember;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberPrototype;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerPoolPatch;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfile;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.LoadBalancerStatistics;
import com.ibm.cloud.is.vpc.v1.model.NetworkACL;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLIdentityById;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLPrototypeNetworkACLByRules;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRule;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkACLRulePrototypeNetworkACLRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterface;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceCollection;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePatch;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfacePrototype;
import com.ibm.cloud.is.vpc.v1.model.NetworkInterfaceUnpaginatedCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystem;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemCollection;
import com.ibm.cloud.is.vpc.v1.model.OperatingSystemIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroup;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.PlacementGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.PublicGateway;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayIdentityById;
import com.ibm.cloud.is.vpc.v1.model.PublicGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.Region;
import com.ibm.cloud.is.vpc.v1.model.RegionCollection;
import com.ibm.cloud.is.vpc.v1.model.RemoveEndpointGatewayIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveInstanceNetworkInterfaceFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveSecurityGroupNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionLocalCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.RemoveVpnGatewayConnectionPeerCidrOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceLoadBalancerPoolMembersOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.ReplaceSubnetRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.ReservedIP;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollection;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPCollectionEndpointGatewayContext;
import com.ibm.cloud.is.vpc.v1.model.ReservedIPPatch;
import com.ibm.cloud.is.vpc.v1.model.Route;
import com.ibm.cloud.is.vpc.v1.model.RouteCollection;
import com.ibm.cloud.is.vpc.v1.model.RoutePatch;
import com.ibm.cloud.is.vpc.v1.model.RouteNextHopPrototypeRouteNextHopIP;
import com.ibm.cloud.is.vpc.v1.model.RoutingTable;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableCollection;
import com.ibm.cloud.is.vpc.v1.model.RoutingTableIdentityById;
import com.ibm.cloud.is.vpc.v1.model.RoutingTablePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroup;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupPatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRule;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRuleCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePatch;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetCollection;
import com.ibm.cloud.is.vpc.v1.model.SecurityGroupTargetReference;
import com.ibm.cloud.is.vpc.v1.model.SetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.Snapshot;
import com.ibm.cloud.is.vpc.v1.model.SnapshotCollection;
import com.ibm.cloud.is.vpc.v1.model.SnapshotPatch;
import com.ibm.cloud.is.vpc.v1.model.Subnet;
import com.ibm.cloud.is.vpc.v1.model.SubnetCollection;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentity;
import com.ibm.cloud.is.vpc.v1.model.SubnetIdentityById;
import com.ibm.cloud.is.vpc.v1.model.SubnetPatch;
import com.ibm.cloud.is.vpc.v1.model.SubnetPrototypeSubnetByTotalCount;
import com.ibm.cloud.is.vpc.v1.model.UnsetSubnetPublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateDedicatedHostOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateEndpointGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFloatingIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateFlowLogCollectorOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIkePolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateImageOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceDiskOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerActionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupManagerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupMembershipOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceNetworkInterfaceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceTemplateOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateInstanceVolumeAttachmentOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateIpsecPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateKeyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerPolicyOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerListenerPolicyRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolMemberOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateLoadBalancerPoolOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateNetworkAclOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateNetworkAclRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePlacementGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdatePublicGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSecurityGroupRuleOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSnapshotOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateSubnetReservedIpOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVolumeOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcAddressPrefixOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpcRoutingTableRouteOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayConnectionOptions;
import com.ibm.cloud.is.vpc.v1.model.UpdateVpnGatewayOptions;
import com.ibm.cloud.is.vpc.v1.model.VPC;
import com.ibm.cloud.is.vpc.v1.model.VPCCollection;
import com.ibm.cloud.is.vpc.v1.model.VPCIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VPCPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGateway;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionCollection;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionLocalCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPeerCIDRs;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPatch;
import com.ibm.cloud.is.vpc.v1.model.VPNGatewayPrototypeVPNGatewayRouteModePrototype;
import com.ibm.cloud.is.vpc.v1.model.Volume;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachment;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeInstanceContext;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.VolumeCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeIdentityById;
import com.ibm.cloud.is.vpc.v1.model.VolumePatch;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfile;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileCollection;
import com.ibm.cloud.is.vpc.v1.model.VolumeProfileIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeInstanceByImageContext;
import com.ibm.cloud.is.vpc.v1.model.VolumePrototypeVolumeByCapacity;
import com.ibm.cloud.is.vpc.v1.model.Zone;
import com.ibm.cloud.is.vpc.v1.model.ZoneCollection;
import com.ibm.cloud.is.vpc.v1.model.ZoneIdentityByName;
import com.ibm.cloud.is.vpc.v1.model.InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the vpc service.
//
// The following configuration properties are assumed to be defined:
// VPC_URL=<service base url>
// VPC_AUTH_TYPE=iam
// VPC_APIKEY=<IAM apikey>
// VPC_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
public class VPCExamples {
  private static final Logger logger = LoggerFactory.getLogger(VPCExamples.class);
  static String dedicatedHostId;
  static String dedicatedHostDiskId;
  static String dedicatedHostGroupId;
  static String dedicatedHostProfileName;
  static String floatingIpId;
  static String vpcId;
  static String routingTableId;
  static String routingTableRouteId;
  static String subnetId;
  static String reservedIpId;
  static String operatingSystemName;
  static String keyId;
  static String addressPrefixId;
  static String imageId;
  static String volumeId;
  static String endpointGatewayId;
  static String endpointGatewayIpId;
  static String flowLogCollectorId;
  static String ikePolicyId;
  static String iPsecPolicyId;
  static String instanceId;
  static String instanceDiskId;
  static String instanceNicId;
  static String instanceVolAttId;
  static String instanceGroupId;
  static String instanceGroupManagerId;
  static String instanceGroupManagerPolicyId;
  static String instanceGroupManagerActionId;
  static String instanceGroupManagerMembershipId;
  static String instanceTemplateId;
  static String lbProfileName;
  static String lbListenerId;
  static String lbPoolId;
  static String lbPoolMemberId;
  static String lbListenerPolicyId;
  static String lbListenerPolicyRuleId;
  static String loadBalancerId;
  static String networkAclId;
  static String networkAclRuleId;
  static String placementGroupId;
  static String publicGatewayId;
  static String vpcRouteId;
  static String vpnGatewayId;
  static String vpnGatewayConnectionId;
  static String securityGroupId;
  static String securityGroupNicId;
  static String securityGroupRuleId;
  static String securityGroupTargetId;
  static String snapshotId;
  static String sourceVolume;
  static String targetId;

  protected VPCExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Vpc vpcService = Vpc.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Vpc.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("listVpcs() result:");
      // begin-list_vpcs
      ListVpcsOptions listVpcsOptions = new ListVpcsOptions.Builder()
        .classicAccess(true)
        .build();

      Response<VPCCollection> response = vpcService.listVpcs(listVpcsOptions).execute();
      VPCCollection vpcCollection = response.getResult();

      // end-list_vpcs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpc() result:");
      // begin-create_vpc
      CreateVpcOptions createVpcOptions = new CreateVpcOptions.Builder()
        .name("my-vpc")
        .build();

      Response<VPC> response = vpcService.createVpc(createVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-create_vpc
      vpcId = vpc.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpc() result:");
      // begin-get_vpc
      GetVpcOptions getVpcOptions = new GetVpcOptions.Builder()
        .id(vpcId)
        .build();

      Response<VPC> response = vpcService.getVpc(getVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-get_vpc
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpc() result:");
      // begin-update_vpc
      VPCPatch vpcPatchModel = new VPCPatch.Builder()
        .name("my-vpc-update")
        .build();
      Map<String, Object> vpcPatchModelAsPatch = vpcPatchModel.asPatch();
      UpdateVpcOptions updateVpcOptions = new UpdateVpcOptions.Builder()
        .id(vpcId)
        .vpcPatch(vpcPatchModelAsPatch)
        .build();

      Response<VPC> response = vpcService.updateVpc(updateVpcOptions).execute();
      VPC vpc = response.getResult();

      // end-update_vpc
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultNetworkAcl() result:");
      // begin-get_vpc_default_network_acl
      GetVpcDefaultNetworkAclOptions getVpcDefaultNetworkAclOptions = new GetVpcDefaultNetworkAclOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultNetworkACL> response = vpcService.getVpcDefaultNetworkAcl(getVpcDefaultNetworkAclOptions).execute();
      DefaultNetworkACL defaultNetworkAcl = response.getResult();

      // end-get_vpc_default_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultRoutingTable() result:");
      // begin-get_vpc_default_routing_table
      GetVpcDefaultRoutingTableOptions getVpcDefaultRoutingTableOptions = new GetVpcDefaultRoutingTableOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultRoutingTable> response = vpcService.getVpcDefaultRoutingTable(getVpcDefaultRoutingTableOptions).execute();
      DefaultRoutingTable defaultRoutingTable = response.getResult();

      // end-get_vpc_default_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcDefaultSecurityGroup() result:");
      // begin-get_vpc_default_security_group
      GetVpcDefaultSecurityGroupOptions getVpcDefaultSecurityGroupOptions = new GetVpcDefaultSecurityGroupOptions.Builder()
        .id(vpcId)
        .build();

      Response<DefaultSecurityGroup> response = vpcService.getVpcDefaultSecurityGroup(getVpcDefaultSecurityGroupOptions).execute();
      DefaultSecurityGroup defaultSecurityGroup = response.getResult();

      // end-get_vpc_default_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcAddressPrefixes() result:");
      // begin-list_vpc_address_prefixes
      ListVpcAddressPrefixesOptions listVpcAddressPrefixesOptions = new ListVpcAddressPrefixesOptions.Builder()
        .vpcId(vpcId)
        .build();

      Response<AddressPrefixCollection> response = vpcService.listVpcAddressPrefixes(listVpcAddressPrefixesOptions).execute();
      AddressPrefixCollection addressPrefixCollection = response.getResult();

      // end-list_vpc_address_prefixes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcAddressPrefix() result:");
      // begin-create_vpc_address_prefix
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      CreateVpcAddressPrefixOptions createVpcAddressPrefixOptions = new CreateVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .cidr("10.0.0.0/24")
        .zone(zoneIdentityModel)
        .build();

      Response<AddressPrefix> response = vpcService.createVpcAddressPrefix(createVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-create_vpc_address_prefix
      addressPrefixId = addressPrefix.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcAddressPrefix() result:");
      // begin-get_vpc_address_prefix
      GetVpcAddressPrefixOptions getVpcAddressPrefixOptions = new GetVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .build();

      Response<AddressPrefix> response = vpcService.getVpcAddressPrefix(getVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-get_vpc_address_prefix
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcAddressPrefix() result:");
      // begin-update_vpc_address_prefix
      AddressPrefixPatch addressPrefixPatchModel = new AddressPrefixPatch.Builder()
        .name("my-address-prefix-update")
        .build();
      Map<String, Object> addressPrefixPatchModelAsPatch = addressPrefixPatchModel.asPatch();
      UpdateVpcAddressPrefixOptions updateVpcAddressPrefixOptions = new UpdateVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .addressPrefixPatch(addressPrefixPatchModelAsPatch)
        .build();

      Response<AddressPrefix> response = vpcService.updateVpcAddressPrefix(updateVpcAddressPrefixOptions).execute();
      AddressPrefix addressPrefix = response.getResult();

      // end-update_vpc_address_prefix
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutes() result:");
      // begin-list_vpc_routes
      ListVpcRoutesOptions listVpcRoutesOptions = new ListVpcRoutesOptions.Builder()
        .vpcId(vpcId)
        .build();

      Response<RouteCollection> response = vpcService.listVpcRoutes(listVpcRoutesOptions).execute();
      RouteCollection routeCollection = response.getResult();

      // end-list_vpc_routes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoute() result:");
      // begin-create_vpc_route
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      RouteNextHopPrototypeRouteNextHopIP routeNextHopPrototypeRouteNextHopIP = new RouteNextHopPrototypeRouteNextHopIP.Builder()
        .address("192.168.3.4")
        .build();
      CreateVpcRouteOptions createVpcRouteOptions = new CreateVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-route")
        .action("delegate_vpc")
        .destination("192.168.3.0/24")
        .nextHop(routeNextHopPrototypeRouteNextHopIP)
        .zone(zoneIdentityModel)
        .build();
      Response<Route> response = vpcService.createVpcRoute(createVpcRouteOptions).execute();
      Route route = response.getResult();

      // end-create_vpc_route
      vpcRouteId = route.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoute() result:");
      // begin-get_vpc_route
      GetVpcRouteOptions getVpcRouteOptions = new GetVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .build();

      Response<Route> response = vpcService.getVpcRoute(getVpcRouteOptions).execute();
      Route route = response.getResult();

      // end-get_vpc_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoute() result:");
      // begin-update_vpc_route
      RoutePatch routePatchModel = new RoutePatch.Builder()
        .name("my-vpc-route-update")
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();
      UpdateVpcRouteOptions updateVpcRouteOptions = new UpdateVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .routePatch(routePatchModelAsPatch)
        .build();

      Response<Route> response = vpcService.updateVpcRoute(updateVpcRouteOptions).execute();
      Route route = response.getResult();

      // end-update_vpc_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutingTables() result:");
      // begin-list_vpc_routing_tables
      ListVpcRoutingTablesOptions listVpcRoutingTablesOptions = new ListVpcRoutingTablesOptions.Builder()
        .vpcId(vpcId)
        .build();

      Response<RoutingTableCollection> response = vpcService.listVpcRoutingTables(listVpcRoutingTablesOptions).execute();
      RoutingTableCollection routingTableCollection = response.getResult();

      // end-list_vpc_routing_tables
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoutingTable() result:");
      // begin-create_vpc_routing_table
      CreateVpcRoutingTableOptions createVpcRoutingTableOptions = new CreateVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-routing-table")
        .build();

      Response<RoutingTable> response = vpcService.createVpcRoutingTable(createVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-create_vpc_routing_table
      routingTableId = routingTable.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoutingTable() result:");
      // begin-get_vpc_routing_table
      GetVpcRoutingTableOptions getVpcRoutingTableOptions = new GetVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .build();

      Response<RoutingTable> response = vpcService.getVpcRoutingTable(getVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-get_vpc_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoutingTable() result:");
      // begin-update_vpc_routing_table
      RoutingTablePatch routingTablePatchModel = new RoutingTablePatch.Builder()
        .name("my-vpc-routingtable-update")
        .build();
      Map<String, Object> routingTablePatchModelAsPatch = routingTablePatchModel.asPatch();
      UpdateVpcRoutingTableOptions updateVpcRoutingTableOptions = new UpdateVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .routingTablePatch(routingTablePatchModelAsPatch)
        .build();

      Response<RoutingTable> response = vpcService.updateVpcRoutingTable(updateVpcRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-update_vpc_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpcRoutingTableRoutes() result:");
      // begin-list_vpc_routing_table_routes
      ListVpcRoutingTableRoutesOptions listVpcRoutingTableRoutesOptions = new ListVpcRoutingTableRoutesOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .build();

      Response<RouteCollection> response = vpcService.listVpcRoutingTableRoutes(listVpcRoutingTableRoutesOptions).execute();
      RouteCollection routeCollection = response.getResult();

      // end-list_vpc_routing_table_routes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpcRoutingTableRoute() result:");
      // begin-create_vpc_routing_table_route
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      CreateVpcRoutingTableRouteOptions createVpcRoutingTableRouteOptions = new CreateVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .name("my-vpc-rt-route")
        .routingTableId(routingTableId)
        .destination("192.168.3.0/24")
        .action("delegate_vpc")
        .zone(zoneIdentityModel)
        .build();

      Response<Route> response = vpcService.createVpcRoutingTableRoute(createVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-create_vpc_routing_table_route
      routingTableRouteId = route.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpcRoutingTableRoute() result:");
      // begin-get_vpc_routing_table_route
      GetVpcRoutingTableRouteOptions getVpcRoutingTableRouteOptions = new GetVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .build();

      Response<Route> response = vpcService.getVpcRoutingTableRoute(getVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-get_vpc_routing_table_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpcRoutingTableRoute() result:");
      // begin-update_vpc_routing_table_route
      RoutePatch routePatchModel = new RoutePatch.Builder()
        .name("my-routingtable-route-update")
        .build();
      Map<String, Object> routePatchModelAsPatch = routePatchModel.asPatch();
      UpdateVpcRoutingTableRouteOptions updateVpcRoutingTableRouteOptions = new UpdateVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .routePatch(routePatchModelAsPatch)
        .build();

      Response<Route> response = vpcService.updateVpcRoutingTableRoute(updateVpcRoutingTableRouteOptions).execute();
      Route route = response.getResult();

      // end-update_vpc_routing_table_route
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSubnets() result:");
      // begin-list_subnets
      ListSubnetsOptions listSubnetsOptions = new ListSubnetsOptions.Builder()
        .build();

      Response<SubnetCollection> response = vpcService.listSubnets(listSubnetsOptions).execute();
      SubnetCollection subnetCollection = response.getResult();

      // end-list_subnets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubnet() result:");
      // begin-create_subnet
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      SubnetPrototypeSubnetByTotalCount subnetPrototypeModel = new SubnetPrototypeSubnetByTotalCount.Builder()
        .vpc(vpcIdentityModel)
        .name("my-subnet")
        .totalIpv4AddressCount(Long.valueOf("256"))
        .zone(zoneIdentityModel)
        .build();
      CreateSubnetOptions createSubnetOptions = new CreateSubnetOptions.Builder()
        .subnetPrototype(subnetPrototypeModel)
        .build();

      Response<Subnet> response = vpcService.createSubnet(createSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-create_subnet
      subnetId = subnet.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnet() result:");
      // begin-get_subnet
      GetSubnetOptions getSubnetOptions = new GetSubnetOptions.Builder()
        .id(subnetId)
        .build();

      Response<Subnet> response = vpcService.getSubnet(getSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-get_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubnet() result:");
      // begin-update_subnet
      SubnetPatch subnetPatchModel = new SubnetPatch.Builder()
        .name("my-subnet-update")
        .build();
      Map<String, Object> subnetPatchModelAsPatch = subnetPatchModel.asPatch();
      UpdateSubnetOptions updateSubnetOptions = new UpdateSubnetOptions.Builder()
        .id(subnetId)
        .subnetPatch(subnetPatchModelAsPatch)
        .build();

      Response<Subnet> response = vpcService.updateSubnet(updateSubnetOptions).execute();
      Subnet subnet = response.getResult();

      // end-update_subnet
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetNetworkAcl() result:");
      // begin-get_subnet_network_acl
      GetSubnetNetworkAclOptions getSubnetNetworkAclOptions = new GetSubnetNetworkAclOptions.Builder()
        .id(subnetId)
        .build();

      Response<NetworkACL> response = vpcService.getSubnetNetworkAcl(getSubnetNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-get_subnet_network_acl
      networkAclId = networkAcl.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceSubnetNetworkAcl() result:");
      // begin-replace_subnet_network_acl
      NetworkACLIdentityById networkAclIdentityModel = new NetworkACLIdentityById.Builder()
        .id(networkAclId)
        .build();
      ReplaceSubnetNetworkAclOptions replaceSubnetNetworkAclOptions = new ReplaceSubnetNetworkAclOptions.Builder()
        .id(subnetId)
        .networkAclIdentity(networkAclIdentityModel)
        .build();

      Response<NetworkACL> response = vpcService.replaceSubnetNetworkAcl(replaceSubnetNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-replace_subnet_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPublicGateway() result:");
      // begin-create_public_gateway
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
              .id(vpcId)
              .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name("us-east-1")
              .build();
      CreatePublicGatewayOptions createPublicGatewayOptions = new CreatePublicGatewayOptions.Builder()
              .vpc(vpcIdentityModel)
              .zone(zoneIdentityModel)
              .build();

      Response<PublicGateway> response = vpcService.createPublicGateway(createPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-create_public_gateway
      publicGatewayId = publicGateway.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPublicGateway() result:");
      // begin-get_public_gateway
      GetPublicGatewayOptions getPublicGatewayOptions = new GetPublicGatewayOptions.Builder()
              .id(publicGatewayId)
              .build();

      Response<PublicGateway> response = vpcService.getPublicGateway(getPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-get_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePublicGateway() result:");
      // begin-update_public_gateway
      PublicGatewayPatch publicGatewayPatchModel = new PublicGatewayPatch.Builder()
              .name("my-publicgateway-update")
              .build();
      Map<String, Object> publicGatewayPatchModelAsPatch = publicGatewayPatchModel.asPatch();
      UpdatePublicGatewayOptions updatePublicGatewayOptions = new UpdatePublicGatewayOptions.Builder()
              .id(publicGatewayId)
              .publicGatewayPatch(publicGatewayPatchModelAsPatch)
              .build();

      Response<PublicGateway> response = vpcService.updatePublicGateway(updatePublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-update_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("setSubnetPublicGateway() result:");
      // begin-set_subnet_public_gateway
      PublicGatewayIdentityById publicGatewayIdentityModel = new PublicGatewayIdentityById.Builder()
        .id(publicGatewayId)
        .build();
      SetSubnetPublicGatewayOptions setSubnetPublicGatewayOptions = new SetSubnetPublicGatewayOptions.Builder()
        .id(subnetId)
        .publicGatewayIdentity(publicGatewayIdentityModel)
        .build();

      Response<PublicGateway> response = vpcService.setSubnetPublicGateway(setSubnetPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-set_subnet_public_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetPublicGateway() result:");
      // begin-get_subnet_public_gateway
      GetSubnetPublicGatewayOptions getSubnetPublicGatewayOptions = new GetSubnetPublicGatewayOptions.Builder()
              .id(subnetId)
              .build();

      Response<PublicGateway> response = vpcService.getSubnetPublicGateway(getSubnetPublicGatewayOptions).execute();
      PublicGateway publicGateway = response.getResult();

      // end-get_subnet_public_gateway
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetRoutingTable() result:");
      // begin-get_subnet_routing_table
      GetSubnetRoutingTableOptions getSubnetRoutingTableOptions = new GetSubnetRoutingTableOptions.Builder()
        .id(subnetId)
        .build();

      Response<RoutingTable> response = vpcService.getSubnetRoutingTable(getSubnetRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-get_subnet_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceSubnetRoutingTable() result:");
      // begin-replace_subnet_routing_table
      RoutingTableIdentityById routingTableIdentityModel = new RoutingTableIdentityById.Builder()
        .id(routingTableId)
        .build();
      ReplaceSubnetRoutingTableOptions replaceSubnetRoutingTableOptions = new ReplaceSubnetRoutingTableOptions.Builder()
        .id(subnetId)
        .routingTableIdentity(routingTableIdentityModel)
        .build();

      Response<RoutingTable> response = vpcService.replaceSubnetRoutingTable(replaceSubnetRoutingTableOptions).execute();
      RoutingTable routingTable = response.getResult();

      // end-replace_subnet_routing_table
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSubnetReservedIps() result:");
      // begin-list_subnet_reserved_ips
      ListSubnetReservedIpsOptions listSubnetReservedIpsOptions = new ListSubnetReservedIpsOptions.Builder()
        .subnetId(subnetId)
        .sort("name")
        .build();

      Response<ReservedIPCollection> response = vpcService.listSubnetReservedIps(listSubnetReservedIpsOptions).execute();
      ReservedIPCollection reservedIpCollection = response.getResult();

      // end-list_subnet_reserved_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSubnetReservedIp() result:");
      // begin-create_subnet_reserved_ip
      CreateSubnetReservedIpOptions createSubnetReservedIpOptions = new CreateSubnetReservedIpOptions.Builder()
        .subnetId(subnetId)
        .build();

      Response<ReservedIP> response = vpcService.createSubnetReservedIp(createSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-create_subnet_reserved_ip
      reservedIpId = reservedIp.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSubnetReservedIp() result:");
      // begin-get_subnet_reserved_ip
      GetSubnetReservedIpOptions getSubnetReservedIpOptions = new GetSubnetReservedIpOptions.Builder()
        .subnetId(subnetId)
        .id(reservedIpId)
        .build();

      Response<ReservedIP> response = vpcService.getSubnetReservedIp(getSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-get_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSubnetReservedIp() result:");
      // begin-update_subnet_reserved_ip
      ReservedIPPatch reservedIpPatchModel = new ReservedIPPatch.Builder()
        .name("my-reservedip-update")
        .build();
      Map<String, Object> reservedIpPatchModelAsPatch = reservedIpPatchModel.asPatch();
      UpdateSubnetReservedIpOptions updateSubnetReservedIpOptions = new UpdateSubnetReservedIpOptions.Builder()
        .subnetId(subnetId)
        .id(reservedIpId)
        .reservedIpPatch(reservedIpPatchModelAsPatch)
        .build();

      Response<ReservedIP> response = vpcService.updateSubnetReservedIp(updateSubnetReservedIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-update_subnet_reserved_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listImages() result:");
      // begin-list_images
      ListImagesOptions listImagesOptions = new ListImagesOptions.Builder()
        .build();

      Response<ImageCollection> response = vpcService.listImages(listImagesOptions).execute();
      ImageCollection imageCollection = response.getResult();

      // end-list_images
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createImage() result:");
      // begin-create_image
      ImageFilePrototype imageFilePrototypeModel = new ImageFilePrototype.Builder()
        .href("cos://us-south/my-bucket/my-image.qcow2")
        .build();
      OperatingSystemIdentityByName operatingSystemIdentityModel = new OperatingSystemIdentityByName.Builder()
        .name("debian-9-amd64")
        .build();
      ImagePrototypeImageByFile imagePrototypeModel = new ImagePrototypeImageByFile.Builder()
        .name("my-image")
        .file(imageFilePrototypeModel)
        .operatingSystem(operatingSystemIdentityModel)
        .build();
      CreateImageOptions createImageOptions = new CreateImageOptions.Builder()
        .imagePrototype(imagePrototypeModel)
        .build();

      Response<Image> response = vpcService.createImage(createImageOptions).execute();
      Image image = response.getResult();

      // end-create_image
      imageId = image.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getImage() result:");
      // begin-get_image
      GetImageOptions getImageOptions = new GetImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Image> response = vpcService.getImage(getImageOptions).execute();
      Image image = response.getResult();

      // end-get_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateImage() result:");
      // begin-update_image
      ImagePatch imagePatchModel = new ImagePatch.Builder()
        .name("my-image-update")
        .build();
      Map<String, Object> imagePatchModelAsPatch = imagePatchModel.asPatch();
      UpdateImageOptions updateImageOptions = new UpdateImageOptions.Builder()
        .id(imageId)
        .imagePatch(imagePatchModelAsPatch)
        .build();

      Response<Image> response = vpcService.updateImage(updateImageOptions).execute();
      Image image = response.getResult();

      // end-update_image
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listOperatingSystems() result:");
      // begin-list_operating_systems
      ListOperatingSystemsOptions listOperatingSystemsOptions = new ListOperatingSystemsOptions.Builder()
        .build();

      Response<OperatingSystemCollection> response = vpcService.listOperatingSystems(listOperatingSystemsOptions).execute();
      OperatingSystemCollection operatingSystemCollection = response.getResult();

      // end-list_operating_systems
      operatingSystemName = operatingSystemCollection.getOperatingSystems().get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getOperatingSystem() result:");
      // begin-get_operating_system
      GetOperatingSystemOptions getOperatingSystemOptions = new GetOperatingSystemOptions.Builder()
        .name(operatingSystemName)
        .build();

      Response<OperatingSystem> response = vpcService.getOperatingSystem(getOperatingSystemOptions).execute();
      OperatingSystem operatingSystem = response.getResult();

      // end-get_operating_system
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listKeys() result:");
      // begin-list_keys
      ListKeysOptions listKeysOptions = new ListKeysOptions.Builder()
        .build();

      Response<KeyCollection> response = vpcService.listKeys(listKeysOptions).execute();
      KeyCollection keyCollection = response.getResult();

      // end-list_keys
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createKey() result:");
      // begin-create_key
      CreateKeyOptions createKeyOptions = new CreateKeyOptions.Builder()
        .name("my-key")
        .publicKey("AAAAB3NzaC1yc2EAAAADAQABAAABAQDDGe50Bxa5T5NDddrrtbx2Y4/VGbiCgXqnBsYToIUKoFSHTQl5IX3PasGnneKanhcLwWz5M5MoCRvhxTp66NKzIfAz7r+FX9rxgR+ZgcM253YAqOVeIpOU408simDZKriTlN8kYsXL7P34tsWuAJf4MgZtJAQxous/2byetpdCv8ddnT4X3ltOg9w+LqSCPYfNivqH00Eh7S1Ldz7I8aw5WOp5a+sQFP/RbwfpwHp+ny7DfeIOokcuI42tJkoBn7UsLTVpCSmXr2EDRlSWe/1M/iHNRBzaT3CK0+SwZWd2AEjePxSnWKNGIEUJDlUYp7hKhiQcgT5ZAnWU121oc5En")
        .build();

      Response<Key> response = vpcService.createKey(createKeyOptions).execute();
      Key key = response.getResult();

      // end-create_key
      keyId = key.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getKey() result:");
      // begin-get_key
      GetKeyOptions getKeyOptions = new GetKeyOptions.Builder()
        .id(keyId)
        .build();

      Response<Key> response = vpcService.getKey(getKeyOptions).execute();
      Key key = response.getResult();

      // end-get_key
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateKey() result:");
      // begin-update_key
      KeyPatch keyPatchModel = new KeyPatch.Builder()
        .name("my-key-update")
        .build();
      Map<String, Object> keyPatchModelAsPatch = keyPatchModel.asPatch();
      UpdateKeyOptions updateKeyOptions = new UpdateKeyOptions.Builder()
        .id(keyId)
        .keyPatch(keyPatchModelAsPatch)
        .build();

      Response<Key> response = vpcService.updateKey(updateKeyOptions).execute();
      Key key = response.getResult();

      // end-update_key
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceProfiles() result:");
      // begin-list_instance_profiles
      ListInstanceProfilesOptions listInstanceProfilesOptions = new ListInstanceProfilesOptions();

      Response<InstanceProfileCollection> response = vpcService.listInstanceProfiles(listInstanceProfilesOptions).execute();
      InstanceProfileCollection instanceProfileCollection = response.getResult();

      // end-list_instance_profiles
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceProfile() result:");
      // begin-get_instance_profile
      GetInstanceProfileOptions getInstanceProfileOptions = new GetInstanceProfileOptions.Builder()
        .name("bx2-2x8")
        .build();

      Response<InstanceProfile> response = vpcService.getInstanceProfile(getInstanceProfileOptions).execute();
      InstanceProfile instanceProfile = response.getResult();

      // end-get_instance_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceTemplates() result:");
      // begin-list_instance_templates
      ListInstanceTemplatesOptions listInstanceTemplatesOptions = new ListInstanceTemplatesOptions();

      Response<InstanceTemplateCollection> response = vpcService.listInstanceTemplates(listInstanceTemplatesOptions).execute();
      InstanceTemplateCollection instanceTemplateCollection = response.getResult();

      // end-list_instance_templates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceTemplate() result:");
      // begin-create_instance_template
      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id(keyId)
        .build();
      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name("bx2-2x8")
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id(imageId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
        .subnet(subnetIdentityModel)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      InstanceTemplatePrototypeInstanceByImage instanceTemplatePrototypeModel = new InstanceTemplatePrototypeInstanceByImage.Builder()
        .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
        .name("my-instance-template")
        .profile(instanceProfileIdentityModel)
        .vpc(vpcIdentityModel)
        .image(imageIdentityModel)
        .primaryNetworkInterface(networkInterfacePrototypeModel)
        .zone(zoneIdentityModel)
        .build();
      CreateInstanceTemplateOptions createInstanceTemplateOptions = new CreateInstanceTemplateOptions.Builder()
        .instanceTemplatePrototype(instanceTemplatePrototypeModel)
        .build();

      Response<InstanceTemplate> response = vpcService.createInstanceTemplate(createInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-create_instance_template
      instanceTemplateId = instanceTemplate.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceTemplate() result:");
      // begin-get_instance_template
      GetInstanceTemplateOptions getInstanceTemplateOptions = new GetInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .build();

      Response<InstanceTemplate> response = vpcService.getInstanceTemplate(getInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-get_instance_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceTemplate() result:");
      // begin-update_instance_template
      InstanceTemplatePatch instanceTemplatePatchModel = new InstanceTemplatePatch.Builder()
        .name("my-template-update")
        .build();
      Map<String, Object> instanceTemplatePatchModelAsPatch = instanceTemplatePatchModel.asPatch();
      UpdateInstanceTemplateOptions updateInstanceTemplateOptions = new UpdateInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .instanceTemplatePatch(instanceTemplatePatchModelAsPatch)
        .build();

      Response<InstanceTemplate> response = vpcService.updateInstanceTemplate(updateInstanceTemplateOptions).execute();
      InstanceTemplate instanceTemplate = response.getResult();

      // end-update_instance_template
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHostGroups() result:");
      // begin-list_dedicated_host_groups
      ListDedicatedHostGroupsOptions listDedicatedHostGroupsOptions = new ListDedicatedHostGroupsOptions.Builder()
              .build();

      Response<DedicatedHostGroupCollection> response = vpcService.listDedicatedHostGroups(listDedicatedHostGroupsOptions).execute();
      DedicatedHostGroupCollection dedicatedHostGroupCollection = response.getResult();

      // end-list_dedicated_host_groups
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDedicatedHostGroup() result:");
      // begin-create_dedicated_host_group
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name("us-east-1")
              .build();
      CreateDedicatedHostGroupOptions createDedicatedHostGroupOptions = new CreateDedicatedHostGroupOptions.Builder()
              .xClass("mx2")
              .name("my-dh-group")
              .family("balanced")
              .zone(zoneIdentityModel)
              .build();

      Response<DedicatedHostGroup> response = vpcService.createDedicatedHostGroup(createDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-create_dedicated_host_group
      dedicatedHostGroupId = dedicatedHostGroup.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostGroup() result:");
      // begin-get_dedicated_host_group
      GetDedicatedHostGroupOptions getDedicatedHostGroupOptions = new GetDedicatedHostGroupOptions.Builder()
              .id(dedicatedHostGroupId)
              .build();

      Response<DedicatedHostGroup> response = vpcService.getDedicatedHostGroup(getDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-get_dedicated_host_group
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHostGroup() result:");
      // begin-update_dedicated_host_group
      DedicatedHostGroupPatch dedicatedHostGroupPatchModel = new DedicatedHostGroupPatch.Builder()
              .name("my-host-group-update")
              .build();
      Map<String, Object> dedicatedHostGroupPatchModelAsPatch = dedicatedHostGroupPatchModel.asPatch();
      UpdateDedicatedHostGroupOptions updateDedicatedHostGroupOptions = new UpdateDedicatedHostGroupOptions.Builder()
              .id(dedicatedHostGroupId)
              .dedicatedHostGroupPatch(dedicatedHostGroupPatchModelAsPatch)
              .build();

      Response<DedicatedHostGroup> response = vpcService.updateDedicatedHostGroup(updateDedicatedHostGroupOptions).execute();
      DedicatedHostGroup dedicatedHostGroup = response.getResult();

      // end-update_dedicated_host_group
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHostProfiles() result:");
      // begin-list_dedicated_host_profiles
      ListDedicatedHostProfilesOptions listDedicatedHostProfilesOptions = new ListDedicatedHostProfilesOptions.Builder()
              .build();

      Response<DedicatedHostProfileCollection> response = vpcService.listDedicatedHostProfiles(listDedicatedHostProfilesOptions).execute();
      DedicatedHostProfileCollection dedicatedHostProfileCollection = response.getResult();

      // end-list_dedicated_host_profiles
      dedicatedHostProfileName = dedicatedHostProfileCollection.getProfiles().get(0).getName();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostProfile() result:");
      // begin-get_dedicated_host_profile
      GetDedicatedHostProfileOptions getDedicatedHostProfileOptions = new GetDedicatedHostProfileOptions.Builder()
              .name(dedicatedHostProfileName)
              .build();

      Response<DedicatedHostProfile> response = vpcService.getDedicatedHostProfile(getDedicatedHostProfileOptions).execute();
      DedicatedHostProfile dedicatedHostProfile = response.getResult();

      // end-get_dedicated_host_profile
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHosts() result:");
      // begin-list_dedicated_hosts
      ListDedicatedHostsOptions listDedicatedHostsOptions = new ListDedicatedHostsOptions.Builder()
              .build();

      Response<DedicatedHostCollection> response = vpcService.listDedicatedHosts(listDedicatedHostsOptions).execute();
      DedicatedHostCollection dedicatedHostCollection = response.getResult();

      // end-list_dedicated_hosts
      for (DedicatedHost dedicatedHost : dedicatedHostCollection.getDedicatedHosts()) {
        if (dedicatedHost.getDisks().size() > 0) {
          dedicatedHostDiskId = dedicatedHost.getDisks().get(0).getId();
          dedicatedHostId = dedicatedHost.getId();
          break;
        }
      }
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDedicatedHost() result:");
      // begin-create_dedicated_host
      DedicatedHostProfileIdentityByName dedicatedHostProfileIdentityModel = new DedicatedHostProfileIdentityByName.Builder()
              .name(dedicatedHostProfileName)
              .build();
      DedicatedHostGroupIdentityById dedicatedHostGroupIdentityModel = new DedicatedHostGroupIdentityById.Builder()
              .id(dedicatedHostGroupId)
              .build();
      DedicatedHostPrototypeDedicatedHostByGroup dedicatedHostPrototypeModel = new DedicatedHostPrototypeDedicatedHostByGroup.Builder()
              .name("my-dedicated-host")
              .profile(dedicatedHostProfileIdentityModel)
              .group(dedicatedHostGroupIdentityModel)
              .build();
      CreateDedicatedHostOptions createDedicatedHostOptions = new CreateDedicatedHostOptions.Builder()
              .dedicatedHostPrototype(dedicatedHostPrototypeModel)
              .build();

      Response<DedicatedHost> response = vpcService.createDedicatedHost(createDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-create_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDedicatedHostDisks() result:");
      // begin-list_dedicated_host_disks
      ListDedicatedHostDisksOptions listDedicatedHostDisksOptions = new ListDedicatedHostDisksOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .build();

      Response<DedicatedHostDiskCollection> response = vpcService.listDedicatedHostDisks(listDedicatedHostDisksOptions).execute();
      DedicatedHostDiskCollection dedicatedHostDiskCollection = response.getResult();

      // end-list_dedicated_host_disks
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHostDisk() result:");
      // begin-get_dedicated_host_disk
      GetDedicatedHostDiskOptions getDedicatedHostDiskOptions = new GetDedicatedHostDiskOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .id(dedicatedHostDiskId)
              .build();

      Response<DedicatedHostDisk> response = vpcService.getDedicatedHostDisk(getDedicatedHostDiskOptions).execute();
      DedicatedHostDisk dedicatedHostDisk = response.getResult();

      // end-get_dedicated_host_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHostDisk() result:");
      // begin-update_dedicated_host_disk
      DedicatedHostDiskPatch dedicatedHostDiskPatchModel = new DedicatedHostDiskPatch.Builder()
              .name("my-host-disk-update")
              .build();
      Map<String, Object> dedicatedHostDiskPatchModelAsPatch = dedicatedHostDiskPatchModel.asPatch();
      UpdateDedicatedHostDiskOptions updateDedicatedHostDiskOptions = new UpdateDedicatedHostDiskOptions.Builder()
              .dedicatedHostId(dedicatedHostId)
              .id(dedicatedHostDiskId)
              .dedicatedHostDiskPatch(dedicatedHostDiskPatchModelAsPatch)
              .build();

      Response<DedicatedHostDisk> response = vpcService.updateDedicatedHostDisk(updateDedicatedHostDiskOptions).execute();
      DedicatedHostDisk dedicatedHostDisk = response.getResult();

      // end-update_dedicated_host_disk
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDedicatedHost() result:");
      // begin-get_dedicated_host
      GetDedicatedHostOptions getDedicatedHostOptions = new GetDedicatedHostOptions.Builder()
              .id(dedicatedHostId)
              .build();

      Response<DedicatedHost> response = vpcService.getDedicatedHost(getDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-get_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDedicatedHost() result:");
      // begin-update_dedicated_host
      DedicatedHostPatch dedicatedHostPatchModel = new DedicatedHostPatch.Builder()
              .name("my-dedicatedhost-update")
              .build();
      Map<String, Object> dedicatedHostPatchModelAsPatch = dedicatedHostPatchModel.asPatch();
      UpdateDedicatedHostOptions updateDedicatedHostOptions = new UpdateDedicatedHostOptions.Builder()
              .id(dedicatedHostId)
              .dedicatedHostPatch(dedicatedHostPatchModelAsPatch)
              .build();

      Response<DedicatedHost> response = vpcService.updateDedicatedHost(updateDedicatedHostOptions).execute();
      DedicatedHost dedicatedHost = response.getResult();

      // end-update_dedicated_host
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFloatingIps() result:");
      // begin-list_floating_ips
      ListFloatingIpsOptions listFloatingIpsOptions = new ListFloatingIpsOptions.Builder()
              .build();

      Response<FloatingIPCollection> response = vpcService.listFloatingIps(listFloatingIpsOptions).execute();
      FloatingIPCollection floatingIpCollection = response.getResult();

      // end-list_floating_ips
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createFloatingIp() result:");
      // begin-create_floating_ip
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name("us-east-1")
              .build();
      FloatingIPPrototypeFloatingIPByZone floatingIpPrototypeModel = new FloatingIPPrototypeFloatingIPByZone.Builder()
              .zone(zoneIdentityModel)
              .build();
      CreateFloatingIpOptions createFloatingIpOptions = new CreateFloatingIpOptions.Builder()
              .floatingIpPrototype(floatingIpPrototypeModel)
              .build();

      Response<FloatingIP> response = vpcService.createFloatingIp(createFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-create_floating_ip
      floatingIpId = floatingIp.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getFloatingIp() result:");
      // begin-get_floating_ip
      GetFloatingIpOptions getFloatingIpOptions = new GetFloatingIpOptions.Builder()
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.getFloatingIp(getFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-get_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateFloatingIp() result:");
      // begin-update_floating_ip
      FloatingIPPatch floatingIpPatchModel = new FloatingIPPatch.Builder()
              .name("my-floatingip-update")
              .build();
      Map<String, Object> floatingIpPatchModelAsPatch = floatingIpPatchModel.asPatch();
      UpdateFloatingIpOptions updateFloatingIpOptions = new UpdateFloatingIpOptions.Builder()
              .id(floatingIpId)
              .floatingIpPatch(floatingIpPatchModelAsPatch)
              .build();

      Response<FloatingIP> response = vpcService.updateFloatingIp(updateFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-update_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVolumeProfiles() result:");
      // begin-list_volume_profiles
      ListVolumeProfilesOptions listVolumeProfilesOptions = new ListVolumeProfilesOptions.Builder()
              .build();

      Response<VolumeProfileCollection> response = vpcService.listVolumeProfiles(listVolumeProfilesOptions).execute();
      VolumeProfileCollection volumeProfileCollection = response.getResult();

      // end-list_volume_profiles
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVolumeProfile() result:");
      // begin-get_volume_profile
      GetVolumeProfileOptions getVolumeProfileOptions = new GetVolumeProfileOptions.Builder()
              .name("5iops-tier")
              .build();

      Response<VolumeProfile> response = vpcService.getVolumeProfile(getVolumeProfileOptions).execute();
      VolumeProfile volumeProfile = response.getResult();

      // end-get_volume_profile
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVolumes() result:");
      // begin-list_volumes
      ListVolumesOptions listVolumesOptions = new ListVolumesOptions.Builder()
              .build();

      Response<VolumeCollection> response = vpcService.listVolumes(listVolumesOptions).execute();
      VolumeCollection volumeCollection = response.getResult();

      // end-list_volumes
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVolume() result:");
      // begin-create_volume
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
              .name("5iops-tier")
              .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
              .name("us-east-1")
              .build();
      VolumePrototypeVolumeByCapacity volumePrototypeModel = new VolumePrototypeVolumeByCapacity.Builder()
              .name("my-volume")
              .profile(volumeProfileIdentityModel)
              .zone(zoneIdentityModel)
              .capacity(Long.valueOf("100"))
              .build();
      CreateVolumeOptions createVolumeOptions = new CreateVolumeOptions.Builder()
              .volumePrototype(volumePrototypeModel)
              .build();

      Response<Volume> response = vpcService.createVolume(createVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-create_volume
      volumeId = volume.getId();
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVolume() result:");
      // begin-get_volume
      GetVolumeOptions getVolumeOptions = new GetVolumeOptions.Builder()
              .id(volumeId)
              .build();

      Response<Volume> response = vpcService.getVolume(getVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-get_volume
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVolume() result:");
      // begin-update_volume
      VolumePatch volumePatchModel = new VolumePatch.Builder()
              .name("my-volume-update")
              .build();
      Map<String, Object> volumePatchModelAsPatch = volumePatchModel.asPatch();
      UpdateVolumeOptions updateVolumeOptions = new UpdateVolumeOptions.Builder()
              .id(volumeId)
              .volumePatch(volumePatchModelAsPatch)
              .build();

      Response<Volume> response = vpcService.updateVolume(updateVolumeOptions).execute();
      Volume volume = response.getResult();

      // end-update_volume
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstances() result:");
      // begin-list_instances
      ListInstancesOptions listInstancesOptions = new ListInstancesOptions.Builder()
        .build();

      Response<InstanceCollection> response = vpcService.listInstances(listInstancesOptions).execute();
      InstanceCollection instanceCollection = response.getResult();

      // end-list_instances
      for (Instance instance : instanceCollection.getInstances()) {
        if (instance.getDisks().size() > 0) {
          instanceId = instance.getId();
          instanceDiskId = instance.getDisks().get(0).getId();
          break;
        }
      }
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstance() result:");
      // begin-create_instance
      KeyIdentityById keyIdentityModel = new KeyIdentityById.Builder()
        .id(keyId)
        .build();
      InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById instancePlacementTargetPrototypeModel = new InstancePlacementTargetPrototypeDedicatedHostIdentityDedicatedHostIdentityById.Builder()
        .id(dedicatedHostId)
        .build();
      InstanceProfileIdentityByName instanceProfileIdentityModel = new InstanceProfileIdentityByName.Builder()
        .name("bx2-2x8")
        .build();
      VolumeProfileIdentityByName volumeProfileIdentityModel = new VolumeProfileIdentityByName.Builder()
        .name("5iops-tier")
        .build();
      EncryptionKeyIdentityByCRN encryptionKeyIdentityModel = new EncryptionKeyIdentityByCRN.Builder()
        .crn("crn:[...]")
        .build();
      VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity volumeAttachmentVolumePrototypeInstanceContextModel = new VolumeAttachmentVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumePrototypeInstanceContextVolumeByCapacity.Builder()
        .name("my-data-volume")
        .profile(volumeProfileIdentityModel)
        .capacity(Long.valueOf("1000"))
        .encryptionKey(encryptionKeyIdentityModel)
        .build();
      VolumeAttachmentPrototypeInstanceContext volumeAttachmentPrototypeInstanceContextModel = new VolumeAttachmentPrototypeInstanceContext.Builder()
        .volume(volumeAttachmentVolumePrototypeInstanceContextModel)
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      VolumePrototypeInstanceByImageContext volumePrototypeInstanceByImageContextModel = new VolumePrototypeInstanceByImageContext.Builder()
        .encryptionKey(encryptionKeyIdentityModel)
        .name("my-boot-volume")
        .profile(volumeProfileIdentityModel)
        .build();
      VolumeAttachmentPrototypeInstanceByImageContext volumeAttachmentPrototypeInstanceByImageContextModel = new VolumeAttachmentPrototypeInstanceByImageContext.Builder()
        .volume(volumePrototypeInstanceByImageContextModel)
        .build();
      ImageIdentityById imageIdentityModel = new ImageIdentityById.Builder()
        .id(imageId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      NetworkInterfacePrototype networkInterfacePrototypeModel = new NetworkInterfacePrototype.Builder()
        .name("my-network-interface")
        .subnet(subnetIdentityModel)
        .build();
      ZoneIdentityByName zoneIdentityModel = new ZoneIdentityByName.Builder()
        .name("us-east-1")
        .build();
      InstancePrototypeInstanceByImage instancePrototypeModel = new InstancePrototypeInstanceByImage.Builder()
        .keys(new java.util.ArrayList<KeyIdentity>(java.util.Arrays.asList(keyIdentityModel)))
        .name("my-instance")
        .placementTarget(instancePlacementTargetPrototypeModel)
        .profile(instanceProfileIdentityModel)
        .volumeAttachments(new java.util.ArrayList<VolumeAttachmentPrototypeInstanceContext>(java.util.Arrays.asList(volumeAttachmentPrototypeInstanceContextModel)))
        .vpc(vpcIdentityModel)
        .bootVolumeAttachment(volumeAttachmentPrototypeInstanceByImageContextModel)
        .image(imageIdentityModel)
        .primaryNetworkInterface(networkInterfacePrototypeModel)
        .zone(zoneIdentityModel)
        .build();
      CreateInstanceOptions createInstanceOptions = new CreateInstanceOptions.Builder()
        .instancePrototype(instancePrototypeModel)
        .build();

      Response<Instance> response = vpcService.createInstance(createInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-create_instance
      sourceVolume = instance.getBootVolumeAttachment().getVolume().getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstance() result:");
      // begin-get_instance
      GetInstanceOptions getInstanceOptions = new GetInstanceOptions.Builder()
        .id(instanceId)
        .build();

      Response<Instance> response = vpcService.getInstance(getInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-get_instance
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstance() result:");
      // begin-update_instance
      InstancePatch instancePatchModel = new InstancePatch.Builder()
        .name("my-instance-update")
        .build();
      Map<String, Object> instancePatchModelAsPatch = instancePatchModel.asPatch();
      UpdateInstanceOptions updateInstanceOptions = new UpdateInstanceOptions.Builder()
        .id(instanceId)
        .instancePatch(instancePatchModelAsPatch)
        .build();

      Response<Instance> response = vpcService.updateInstance(updateInstanceOptions).execute();
      Instance instance = response.getResult();

      // end-update_instance
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceInitialization() result:");
      // begin-get_instance_initialization
      GetInstanceInitializationOptions getInstanceInitializationOptions = new GetInstanceInitializationOptions.Builder()
        .id(instanceId)
        .build();

      Response<InstanceInitialization> response = vpcService.getInstanceInitialization(getInstanceInitializationOptions).execute();
      InstanceInitialization instanceInitialization = response.getResult();

      // end-get_instance_initialization
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceAction() result:");
      // begin-create_instance_action
      CreateInstanceActionOptions createInstanceActionOptions = new CreateInstanceActionOptions.Builder()
        .instanceId(instanceId)
        .type("reboot")
        .build();

      Response<InstanceAction> response = vpcService.createInstanceAction(createInstanceActionOptions).execute();
      InstanceAction instanceAction = response.getResult();

      // end-create_instance_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceConsoleAccessToken() result:");
      // begin-create_instance_console_access_token
      CreateInstanceConsoleAccessTokenOptions createInstanceConsoleAccessTokenOptions = new CreateInstanceConsoleAccessTokenOptions.Builder()
        .instanceId(instanceId)
        .consoleType("serial")
        .build();

      Response<InstanceConsoleAccessToken> response = vpcService.createInstanceConsoleAccessToken(createInstanceConsoleAccessTokenOptions).execute();
      InstanceConsoleAccessToken instanceConsoleAccessToken = response.getResult();

      // end-create_instance_console_access_token
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceDisks() result:");
      // begin-list_instance_disks
      ListInstanceDisksOptions listInstanceDisksOptions = new ListInstanceDisksOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<InstanceDiskCollection> response = vpcService.listInstanceDisks(listInstanceDisksOptions).execute();
      InstanceDiskCollection instanceDiskCollection = response.getResult();

      // end-list_instance_disks
      instanceDiskId = instanceDiskCollection.getDisks().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceDisk() result:");
      // begin-get_instance_disk
      GetInstanceDiskOptions getInstanceDiskOptions = new GetInstanceDiskOptions.Builder()
        .instanceId(instanceId)
        .id(instanceDiskId)
        .build();

      Response<InstanceDisk> response = vpcService.getInstanceDisk(getInstanceDiskOptions).execute();
      InstanceDisk instanceDisk = response.getResult();

      // end-get_instance_disk
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceDisk() result:");
      // begin-update_instance_disk
      InstanceDiskPatch instanceDiskPatchModel = new InstanceDiskPatch.Builder()
        .name("my-disk-update")
        .build();
      Map<String, Object> instanceDiskPatchModelAsPatch = instanceDiskPatchModel.asPatch();
      UpdateInstanceDiskOptions updateInstanceDiskOptions = new UpdateInstanceDiskOptions.Builder()
        .instanceId(instanceId)
        .id(instanceDiskId)
        .instanceDiskPatch(instanceDiskPatchModelAsPatch)
        .build();

      Response<InstanceDisk> response = vpcService.updateInstanceDisk(updateInstanceDiskOptions).execute();
      InstanceDisk instanceDisk = response.getResult();

      // end-update_instance_disk
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceNetworkInterfaces() result:");
      // begin-list_instance_network_interfaces
      ListInstanceNetworkInterfacesOptions listInstanceNetworkInterfacesOptions = new ListInstanceNetworkInterfacesOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<NetworkInterfaceUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaces(listInstanceNetworkInterfacesOptions).execute();
      NetworkInterfaceUnpaginatedCollection networkInterfaceUnpaginatedCollection = response.getResult();

      // end-list_instance_network_interfaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceNetworkInterface() result:");
      // begin-create_instance_network_interface
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateInstanceNetworkInterfaceOptions createInstanceNetworkInterfaceOptions = new CreateInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .subnet(subnetIdentityModel)
        .build();

      Response<NetworkInterface> response = vpcService.createInstanceNetworkInterface(createInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-create_instance_network_interface
      instanceNicId = networkInterface.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceNetworkInterface() result:");
      // begin-get_instance_network_interface
      GetInstanceNetworkInterfaceOptions getInstanceNetworkInterfaceOptions = new GetInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNicId)
        .build();

      Response<NetworkInterface> response = vpcService.getInstanceNetworkInterface(getInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-get_instance_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceNetworkInterface() result:");
      // begin-update_instance_network_interface
      NetworkInterfacePatch networkInterfacePatchModel = new NetworkInterfacePatch.Builder()
        .name("my-network-interface-update")
        .build();
      Map<String, Object> networkInterfacePatchModelAsPatch = networkInterfacePatchModel.asPatch();
      UpdateInstanceNetworkInterfaceOptions updateInstanceNetworkInterfaceOptions = new UpdateInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNicId)
        .networkInterfacePatch(networkInterfacePatchModelAsPatch)
        .build();

      Response<NetworkInterface> response = vpcService.updateInstanceNetworkInterface(updateInstanceNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-update_instance_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceNetworkInterfaceFloatingIps() result:");
      // begin-list_instance_network_interface_floating_ips
      ListInstanceNetworkInterfaceFloatingIpsOptions listInstanceNetworkInterfaceFloatingIpsOptions = new ListInstanceNetworkInterfaceFloatingIpsOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNicId)
        .build();

      Response<FloatingIPUnpaginatedCollection> response = vpcService.listInstanceNetworkInterfaceFloatingIps(listInstanceNetworkInterfaceFloatingIpsOptions).execute();
      FloatingIPUnpaginatedCollection floatingIpUnpaginatedCollection = response.getResult();

      // end-list_instance_network_interface_floating_ips
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addInstanceNetworkInterfaceFloatingIp() result:");
      // begin-add_instance_network_interface_floating_ip
      AddInstanceNetworkInterfaceFloatingIpOptions addInstanceNetworkInterfaceFloatingIpOptions = new AddInstanceNetworkInterfaceFloatingIpOptions.Builder()
              .instanceId(instanceId)
              .networkInterfaceId(instanceNicId)
              .id(floatingIpId)
              .build();

      Response<FloatingIP> response = vpcService.addInstanceNetworkInterfaceFloatingIp(addInstanceNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-add_instance_network_interface_floating_ip
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceNetworkInterfaceFloatingIp() result:");
      // begin-get_instance_network_interface_floating_ip
      GetInstanceNetworkInterfaceFloatingIpOptions getInstanceNetworkInterfaceFloatingIpOptions = new GetInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNicId)
        .id(floatingIpId)
        .build();

      Response<FloatingIP> response = vpcService.getInstanceNetworkInterfaceFloatingIp(getInstanceNetworkInterfaceFloatingIpOptions).execute();
      FloatingIP floatingIp = response.getResult();

      // end-get_instance_network_interface_floating_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceVolumeAttachments() result:");
      // begin-list_instance_volume_attachments
      ListInstanceVolumeAttachmentsOptions listInstanceVolumeAttachmentsOptions = new ListInstanceVolumeAttachmentsOptions.Builder()
        .instanceId(instanceId)
        .build();

      Response<VolumeAttachmentCollection> response = vpcService.listInstanceVolumeAttachments(listInstanceVolumeAttachmentsOptions).execute();
      VolumeAttachmentCollection volumeAttachmentCollection = response.getResult();

      // end-list_instance_volume_attachments
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceVolumeAttachment() result:");
      // begin-create_instance_volume_attachment
      VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById volumeAttachmentPrototypeVolumeModel = new VolumeAttachmentPrototypeVolumeVolumeIdentityVolumeIdentityById.Builder()
        .id(volumeId)
        .build();
      CreateInstanceVolumeAttachmentOptions createInstanceVolumeAttachmentOptions = new CreateInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .volume(volumeAttachmentPrototypeVolumeModel)
        .build();

      Response<VolumeAttachment> response = vpcService.createInstanceVolumeAttachment(createInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-create_instance_volume_attachment
      instanceVolAttId = volumeAttachment.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceVolumeAttachment() result:");
      // begin-get_instance_volume_attachment
      GetInstanceVolumeAttachmentOptions getInstanceVolumeAttachmentOptions = new GetInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolAttId)
        .build();

      Response<VolumeAttachment> response = vpcService.getInstanceVolumeAttachment(getInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-get_instance_volume_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceVolumeAttachment() result:");
      // begin-update_instance_volume_attachment
      VolumeAttachmentPatch volumeAttachmentPatchModel = new VolumeAttachmentPatch.Builder()
        .name("my-volattachment-update")
        .build();
      Map<String, Object> volumeAttachmentPatchModelAsPatch = volumeAttachmentPatchModel.asPatch();
      UpdateInstanceVolumeAttachmentOptions updateInstanceVolumeAttachmentOptions = new UpdateInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolAttId)
        .volumeAttachmentPatch(volumeAttachmentPatchModelAsPatch)
        .build();

      Response<VolumeAttachment> response = vpcService.updateInstanceVolumeAttachment(updateInstanceVolumeAttachmentOptions).execute();
      VolumeAttachment volumeAttachment = response.getResult();

      // end-update_instance_volume_attachment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroups() result:");
      // begin-list_instance_groups
      ListInstanceGroupsOptions listInstanceGroupsOptions = new ListInstanceGroupsOptions.Builder()
        .build();

      Response<InstanceGroupCollection> response = vpcService.listInstanceGroups(listInstanceGroupsOptions).execute();
      InstanceGroupCollection instanceGroupCollection = response.getResult();

      // end-list_instance_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroup() result:");
      // begin-create_instance_group
      InstanceTemplateIdentityById instanceTemplateIdentityModel = new InstanceTemplateIdentityById.Builder()
        .id(instanceTemplateId)
        .build();
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateInstanceGroupOptions createInstanceGroupOptions = new CreateInstanceGroupOptions.Builder()
        .instanceTemplate(instanceTemplateIdentityModel)
        .name("my-instance-group")
        .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
        .build();

      Response<InstanceGroup> response = vpcService.createInstanceGroup(createInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-create_instance_group
      instanceGroupId = instanceGroup.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroup() result:");
      // begin-get_instance_group
      GetInstanceGroupOptions getInstanceGroupOptions = new GetInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .build();

      Response<InstanceGroup> response = vpcService.getInstanceGroup(getInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-get_instance_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroup() result:");
      // begin-update_instance_group
      InstanceGroupPatch instanceGroupPatchModel = new InstanceGroupPatch.Builder()
        .name("my-instancegroup-update")
        .build();
      Map<String, Object> instanceGroupPatchModelAsPatch = instanceGroupPatchModel.asPatch();
      UpdateInstanceGroupOptions updateInstanceGroupOptions = new UpdateInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .instanceGroupPatch(instanceGroupPatchModelAsPatch)
        .build();

      Response<InstanceGroup> response = vpcService.updateInstanceGroup(updateInstanceGroupOptions).execute();
      InstanceGroup instanceGroup = response.getResult();

      // end-update_instance_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagers() result:");
      // begin-list_instance_group_managers
      ListInstanceGroupManagersOptions listInstanceGroupManagersOptions = new ListInstanceGroupManagersOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<InstanceGroupManagerCollection> response = vpcService.listInstanceGroupManagers(listInstanceGroupManagersOptions).execute();
      InstanceGroupManagerCollection instanceGroupManagerCollection = response.getResult();

      // end-list_instance_group_managers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManager() result:");
      // begin-create_instance_group_manager
      InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype instanceGroupManagerPrototypeModel = new InstanceGroupManagerPrototypeInstanceGroupManagerAutoScalePrototype.Builder()
        .managerType("autoscale")
        .maxMembershipCount(Long.valueOf("10"))
        .build();
      CreateInstanceGroupManagerOptions createInstanceGroupManagerOptions = new CreateInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerPrototype(instanceGroupManagerPrototypeModel)
        .build();

      Response<InstanceGroupManager> response = vpcService.createInstanceGroupManager(createInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-create_instance_group_manager
      instanceGroupManagerId = instanceGroupManager.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManager() result:");
      // begin-get_instance_group_manager
      GetInstanceGroupManagerOptions getInstanceGroupManagerOptions = new GetInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .build();

      Response<InstanceGroupManager> response = vpcService.getInstanceGroupManager(getInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-get_instance_group_manager
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManager() result:");
      // begin-update_instance_group_manager
      InstanceGroupManagerPatch instanceGroupManagerPatchModel = new InstanceGroupManagerPatch.Builder()
        .name("my-instancegroupmanager-update")
        .build();
      Map<String, Object> instanceGroupManagerPatchModelAsPatch = instanceGroupManagerPatchModel.asPatch();
      UpdateInstanceGroupManagerOptions updateInstanceGroupManagerOptions = new UpdateInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .instanceGroupManagerPatch(instanceGroupManagerPatchModelAsPatch)
        .build();

      Response<InstanceGroupManager> response = vpcService.updateInstanceGroupManager(updateInstanceGroupManagerOptions).execute();
      InstanceGroupManager instanceGroupManager = response.getResult();

      // end-update_instance_group_manager
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagerActions() result:");
      // begin-list_instance_group_manager_actions
      ListInstanceGroupManagerActionsOptions listInstanceGroupManagerActionsOptions = new ListInstanceGroupManagerActionsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .build();

      Response<InstanceGroupManagerActionsCollection> response = vpcService.listInstanceGroupManagerActions(listInstanceGroupManagerActionsOptions).execute();
      InstanceGroupManagerActionsCollection instanceGroupManagerActionsCollection = response.getResult();

      // end-list_instance_group_manager_actions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManagerAction() result:");
      // begin-create_instance_group_manager_action
      InstanceGroupManagerScheduledActionGroupPrototype instanceGroupManagerScheduledActionGroupPrototypeModel = new InstanceGroupManagerScheduledActionGroupPrototype.Builder()
        .membershipCount(Long.valueOf("10"))
        .build();
      InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup instanceGroupManagerActionPrototypeModel = new InstanceGroupManagerActionPrototypeScheduledActionPrototypeByCronSpecByGroup.Builder()
        .group(instanceGroupManagerScheduledActionGroupPrototypeModel).cronSpec("*/5 1,2,3 * * *")
        .build();
      CreateInstanceGroupManagerActionOptions createInstanceGroupManagerActionOptions = new CreateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .instanceGroupManagerActionPrototype(instanceGroupManagerActionPrototypeModel)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.createInstanceGroupManagerAction(createInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-create_instance_group_manager_action
      instanceGroupManagerActionId = instanceGroupManagerAction.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManagerAction() result:");
      // begin-get_instance_group_manager_action
      GetInstanceGroupManagerActionOptions getInstanceGroupManagerActionOptions = new GetInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.getInstanceGroupManagerAction(getInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-get_instance_group_manager_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManagerAction() result:");
      // begin-update_instance_group_manager_action
      InstanceGroupManagerActionPatch instanceGroupManagerActionPatchModel = new InstanceGroupManagerActionPatch.Builder()
        .name("my-igmanageraction-update")
        .build();
      Map<String, Object> instanceGroupManagerActionPatchModelAsPatch = instanceGroupManagerActionPatchModel.asPatch();
      UpdateInstanceGroupManagerActionOptions updateInstanceGroupManagerActionOptions = new UpdateInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .instanceGroupManagerActionPatch(instanceGroupManagerActionPatchModelAsPatch)
        .build();

      Response<InstanceGroupManagerAction> response = vpcService.updateInstanceGroupManagerAction(updateInstanceGroupManagerActionOptions).execute();
      InstanceGroupManagerAction instanceGroupManagerAction = response.getResult();

      // end-update_instance_group_manager_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupManagerPolicies() result:");
      // begin-list_instance_group_manager_policies
      ListInstanceGroupManagerPoliciesOptions listInstanceGroupManagerPoliciesOptions = new ListInstanceGroupManagerPoliciesOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .build();

      Response<InstanceGroupManagerPolicyCollection> response = vpcService.listInstanceGroupManagerPolicies(listInstanceGroupManagerPoliciesOptions).execute();
      InstanceGroupManagerPolicyCollection instanceGroupManagerPolicyCollection = response.getResult();

      // end-list_instance_group_manager_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createInstanceGroupManagerPolicy() result:");
      // begin-create_instance_group_manager_policy
      InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype instanceGroupManagerPolicyPrototypeModel = new InstanceGroupManagerPolicyPrototypeInstanceGroupManagerTargetPolicyPrototype.Builder()
        .metricType("cpu")
        .metricValue(Long.valueOf("26"))
        .policyType("target")
        .build();
      CreateInstanceGroupManagerPolicyOptions createInstanceGroupManagerPolicyOptions = new CreateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .instanceGroupManagerPolicyPrototype(instanceGroupManagerPolicyPrototypeModel)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.createInstanceGroupManagerPolicy(createInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-create_instance_group_manager_policy
      instanceGroupManagerPolicyId = instanceGroupManagerPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupManagerPolicy() result:");
      // begin-get_instance_group_manager_policy
      GetInstanceGroupManagerPolicyOptions getInstanceGroupManagerPolicyOptions = new GetInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.getInstanceGroupManagerPolicy(getInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-get_instance_group_manager_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupManagerPolicy() result:");
      // begin-update_instance_group_manager_policy
      InstanceGroupManagerPolicyPatch instanceGroupManagerPolicyPatchModel = new InstanceGroupManagerPolicyPatch.Builder()
        .name("my-igmanagerpolicy-update")
        .build();
      Map<String, Object> instanceGroupManagerPolicyPatchModelAsPatch = instanceGroupManagerPolicyPatchModel.asPatch();
      UpdateInstanceGroupManagerPolicyOptions updateInstanceGroupManagerPolicyOptions = new UpdateInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .instanceGroupManagerPolicyPatch(instanceGroupManagerPolicyPatchModelAsPatch)
        .build();

      Response<InstanceGroupManagerPolicy> response = vpcService.updateInstanceGroupManagerPolicy(updateInstanceGroupManagerPolicyOptions).execute();
      InstanceGroupManagerPolicy instanceGroupManagerPolicy = response.getResult();

      // end-update_instance_group_manager_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listInstanceGroupMemberships() result:");
      // begin-list_instance_group_memberships
      ListInstanceGroupMembershipsOptions listInstanceGroupMembershipsOptions = new ListInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<InstanceGroupMembershipCollection> response = vpcService.listInstanceGroupMemberships(listInstanceGroupMembershipsOptions).execute();
      InstanceGroupMembershipCollection instanceGroupMembershipCollection = response.getResult();

      // end-list_instance_group_memberships
      instanceGroupManagerMembershipId = instanceGroupMembershipCollection.getMemberships().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getInstanceGroupMembership() result:");
      // begin-get_instance_group_membership
      GetInstanceGroupMembershipOptions getInstanceGroupMembershipOptions = new GetInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .build();

      Response<InstanceGroupMembership> response = vpcService.getInstanceGroupMembership(getInstanceGroupMembershipOptions).execute();
      InstanceGroupMembership instanceGroupMembership = response.getResult();

      // end-get_instance_group_membership
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateInstanceGroupMembership() result:");
      // begin-update_instance_group_membership
      InstanceGroupMembershipPatch instanceGroupMembershipPatchModel = new InstanceGroupMembershipPatch.Builder()
        .name("my-igmembership-update")
        .build();
      Map<String, Object> instanceGroupMembershipPatchModelAsPatch = instanceGroupMembershipPatchModel.asPatch();
      UpdateInstanceGroupMembershipOptions updateInstanceGroupMembershipOptions = new UpdateInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .instanceGroupMembershipPatch(instanceGroupMembershipPatchModelAsPatch)
        .build();

      Response<InstanceGroupMembership> response = vpcService.updateInstanceGroupMembership(updateInstanceGroupMembershipOptions).execute();
      InstanceGroupMembership instanceGroupMembership = response.getResult();

      // end-update_instance_group_membership
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPlacementGroups() result:");
      // begin-list_placement_groups
      ListPlacementGroupsOptions listPlacementGroupsOptions = new ListPlacementGroupsOptions.Builder()
        .build();

      Response<PlacementGroupCollection> response = vpcService.listPlacementGroups(listPlacementGroupsOptions).execute();
      PlacementGroupCollection placementGroupCollection = response.getResult();

      // end-list_placement_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createPlacementGroup() result:");
      // begin-create_placement_group
      CreatePlacementGroupOptions createPlacementGroupOptions = new CreatePlacementGroupOptions.Builder()
        .name("my-placement-group")
        .strategy("host_spread")
        .build();

      Response<PlacementGroup> response = vpcService.createPlacementGroup(createPlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-create_placement_group
      placementGroupId = placementGroup.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getPlacementGroup() result:");
      // begin-get_placement_group
      GetPlacementGroupOptions getPlacementGroupOptions = new GetPlacementGroupOptions.Builder()
        .id(placementGroupId)
        .build();

      Response<PlacementGroup> response = vpcService.getPlacementGroup(getPlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-get_placement_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updatePlacementGroup() result:");
      // begin-update_placement_group
      PlacementGroupPatch placementGroupPatchModel = new PlacementGroupPatch.Builder()
        .name("my-placement-group-update")
        .build();
      Map<String, Object> placementGroupPatchModelAsPatch = placementGroupPatchModel.asPatch();
      UpdatePlacementGroupOptions updatePlacementGroupOptions = new UpdatePlacementGroupOptions.Builder()
        .id(placementGroupId)
        .placementGroupPatch(placementGroupPatchModelAsPatch)
        .build();

      Response<PlacementGroup> response = vpcService.updatePlacementGroup(updatePlacementGroupOptions).execute();
      PlacementGroup placementGroup = response.getResult();

      // end-update_placement_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSnapshots() result:");
      // begin-list_snapshots
      ListSnapshotsOptions listSnapshotsOptions = new ListSnapshotsOptions.Builder()
        .sort("name")
        .build();

      Response<SnapshotCollection> response = vpcService.listSnapshots(listSnapshotsOptions).execute();
      SnapshotCollection snapshotCollection = response.getResult();

      // end-list_snapshots
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSnapshot() result:");
      VolumeIdentityById volumeIdentityModel1 = new VolumeIdentityById.Builder()
              .id(sourceVolume)
              .build();
      CreateSnapshotOptions createSnapshotOptions1 = new CreateSnapshotOptions.Builder()
              .name("my-snapshot-1")
              .sourceVolume(volumeIdentityModel1)
              .build();

      Response<Snapshot> response1 = vpcService.createSnapshot(createSnapshotOptions1).execute();
      Snapshot snapshot1 = response1.getResult();
      // begin-create_snapshot
      VolumeIdentityById volumeIdentityModel = new VolumeIdentityById.Builder()
        .id(sourceVolume)
        .build();
      CreateSnapshotOptions createSnapshotOptions = new CreateSnapshotOptions.Builder()
        .name("my-snapshot")
        .sourceVolume(volumeIdentityModel)
        .build();

      Response<Snapshot> response = vpcService.createSnapshot(createSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-create_snapshot
      snapshotId = snapshot.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSnapshot() result:");
      // begin-get_snapshot
      GetSnapshotOptions getSnapshotOptions = new GetSnapshotOptions.Builder()
        .id(snapshotId)
        .build();

      Response<Snapshot> response = vpcService.getSnapshot(getSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-get_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSnapshot() result:");
      // begin-update_snapshot
      SnapshotPatch snapshotPatchModel = new SnapshotPatch.Builder()
        .name("my-snapshot-update")
        .build();
      Map<String, Object> snapshotPatchModelAsPatch = snapshotPatchModel.asPatch();
      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
        .id(snapshotId)
        .snapshotPatch(snapshotPatchModelAsPatch)
        .build();

      Response<Snapshot> response = vpcService.updateSnapshot(updateSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      // end-update_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listRegions() result:");
      // begin-list_regions
      ListRegionsOptions listRegionsOptions = new ListRegionsOptions();

      Response<RegionCollection> response = vpcService.listRegions(listRegionsOptions).execute();
      RegionCollection regionCollection = response.getResult();

      // end-list_regions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getRegion() result:");
      // begin-get_region
      GetRegionOptions getRegionOptions = new GetRegionOptions.Builder()
        .name("us-south")
        .build();

      Response<Region> response = vpcService.getRegion(getRegionOptions).execute();
      Region region = response.getResult();

      // end-get_region
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listRegionZones() result:");
      // begin-list_region_zones
      ListRegionZonesOptions listRegionZonesOptions = new ListRegionZonesOptions.Builder()
        .regionName("us-south")
        .build();

      Response<ZoneCollection> response = vpcService.listRegionZones(listRegionZonesOptions).execute();
      ZoneCollection zoneCollection = response.getResult();

      // end-list_region_zones
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getRegionZone() result:");
      // begin-get_region_zone
      GetRegionZoneOptions getRegionZoneOptions = new GetRegionZoneOptions.Builder()
        .regionName("us-east")
        .name("us-east-1")
        .build();

      Response<Zone> response = vpcService.getRegionZone(getRegionZoneOptions).execute();
      Zone zone = response.getResult();

      // end-get_region_zone
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listPublicGateways() result:");
      // begin-list_public_gateways
      ListPublicGatewaysOptions listPublicGatewaysOptions = new ListPublicGatewaysOptions.Builder()
        .build();

      Response<PublicGatewayCollection> response = vpcService.listPublicGateways(listPublicGatewaysOptions).execute();
      PublicGatewayCollection publicGatewayCollection = response.getResult();

      // end-list_public_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listNetworkAcls() result:");
      // begin-list_network_acls
      ListNetworkAclsOptions listNetworkAclsOptions = new ListNetworkAclsOptions.Builder()
        .build();

      Response<NetworkACLCollection> response = vpcService.listNetworkAcls(listNetworkAclsOptions).execute();
      NetworkACLCollection networkAclCollection = response.getResult();

      // end-list_network_acls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createNetworkAcl() result:");
      // begin-create_network_acl
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      NetworkACLPrototypeNetworkACLByRules networkAclPrototypeModel = new NetworkACLPrototypeNetworkACLByRules.Builder()
        .name("my-network-acl")
        .vpc(vpcIdentityModel)
        .build();
      CreateNetworkAclOptions createNetworkAclOptions = new CreateNetworkAclOptions.Builder()
        .networkAclPrototype(networkAclPrototypeModel)
        .build();

      Response<NetworkACL> response = vpcService.createNetworkAcl(createNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-create_network_acl
      networkAclId = networkAcl.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getNetworkAcl() result:");
      // begin-get_network_acl
      GetNetworkAclOptions getNetworkAclOptions = new GetNetworkAclOptions.Builder()
        .id(networkAclId)
        .build();

      Response<NetworkACL> response = vpcService.getNetworkAcl(getNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-get_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateNetworkAcl() result:");
      // begin-update_network_acl
      NetworkACLPatch networkAclPatchModel = new NetworkACLPatch.Builder()
        .name("my-networkacl-update")
        .build();
      Map<String, Object> networkAclPatchModelAsPatch = networkAclPatchModel.asPatch();
      UpdateNetworkAclOptions updateNetworkAclOptions = new UpdateNetworkAclOptions.Builder()
        .id(networkAclId)
        .networkAclPatch(networkAclPatchModelAsPatch)
        .build();

      Response<NetworkACL> response = vpcService.updateNetworkAcl(updateNetworkAclOptions).execute();
      NetworkACL networkAcl = response.getResult();

      // end-update_network_acl
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listNetworkAclRules() result:");
      // begin-list_network_acl_rules
      ListNetworkAclRulesOptions listNetworkAclRulesOptions = new ListNetworkAclRulesOptions.Builder()
        .networkAclId(networkAclId)
        .build();

      Response<NetworkACLRuleCollection> response = vpcService.listNetworkAclRules(listNetworkAclRulesOptions).execute();
      NetworkACLRuleCollection networkAclRuleCollection = response.getResult();

      // end-list_network_acl_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createNetworkAclRule() result:");
      // begin-create_network_acl_rule
      NetworkACLRulePrototypeNetworkACLRuleProtocolICMP networkAclRulePrototypeModel = new NetworkACLRulePrototypeNetworkACLRuleProtocolICMP.Builder()
        .action("allow")
        .destination("192.168.3.2/32")
        .direction("inbound")
        .source("192.168.3.2/32")
        .protocol("icmp")
        .build();
      CreateNetworkAclRuleOptions createNetworkAclRuleOptions = new CreateNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .networkAclRulePrototype(networkAclRulePrototypeModel)
        .build();

      Response<NetworkACLRule> response = vpcService.createNetworkAclRule(createNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-create_network_acl_rule
      networkAclRuleId = networkAclRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getNetworkAclRule() result:");
      // begin-get_network_acl_rule
      GetNetworkAclRuleOptions getNetworkAclRuleOptions = new GetNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .build();

      Response<NetworkACLRule> response = vpcService.getNetworkAclRule(getNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-get_network_acl_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateNetworkAclRule() result:");
      // begin-update_network_acl_rule
      NetworkACLRulePatch networkAclRulePatchModel = new NetworkACLRulePatch.Builder()
        .name("my-networkaclrule-update")
        .build();
      Map<String, Object> networkAclRulePatchModelAsPatch = networkAclRulePatchModel.asPatch();
      UpdateNetworkAclRuleOptions updateNetworkAclRuleOptions = new UpdateNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .networkAclRulePatch(networkAclRulePatchModelAsPatch)
        .build();

      Response<NetworkACLRule> response = vpcService.updateNetworkAclRule(updateNetworkAclRuleOptions).execute();
      NetworkACLRule networkAclRule = response.getResult();

      // end-update_network_acl_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroups() result:");
      // begin-list_security_groups
      ListSecurityGroupsOptions listSecurityGroupsOptions = new ListSecurityGroupsOptions.Builder()
        .build();

      Response<SecurityGroupCollection> response = vpcService.listSecurityGroups(listSecurityGroupsOptions).execute();
      SecurityGroupCollection securityGroupCollection = response.getResult();

      // end-list_security_groups
      for (SecurityGroup sg : securityGroupCollection.getSecurityGroups()) {
        if (sg.getNetworkInterfaces() != null && sg.getNetworkInterfaces().size() > 0) {
          securityGroupId = sg.getId();
          securityGroupNicId = sg.getNetworkInterfaces().get(0).getId();
          break;
        }
      }
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroup() result:");
      // begin-create_security_group
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      CreateSecurityGroupOptions createSecurityGroupOptions = new CreateSecurityGroupOptions.Builder()
        .name("my-security-group")
        .vpc(vpcIdentityModel)
        .build();

      Response<SecurityGroup> response = vpcService.createSecurityGroup(createSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-create_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroup() result:");
      // begin-get_security_group
      GetSecurityGroupOptions getSecurityGroupOptions = new GetSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .build();

      Response<SecurityGroup> response = vpcService.getSecurityGroup(getSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-get_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSecurityGroup() result:");
      // begin-update_security_group
      SecurityGroupPatch securityGroupPatchModel = new SecurityGroupPatch.Builder()
        .name("my-securitygroup-update")
        .build();
      Map<String, Object> securityGroupPatchModelAsPatch = securityGroupPatchModel.asPatch();
      UpdateSecurityGroupOptions updateSecurityGroupOptions = new UpdateSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .securityGroupPatch(securityGroupPatchModelAsPatch)
        .build();

      Response<SecurityGroup> response = vpcService.updateSecurityGroup(updateSecurityGroupOptions).execute();
      SecurityGroup securityGroup = response.getResult();

      // end-update_security_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroupNetworkInterfaces() result:");
      // begin-list_security_group_network_interfaces
      ListSecurityGroupNetworkInterfacesOptions listSecurityGroupNetworkInterfacesOptions = new ListSecurityGroupNetworkInterfacesOptions.Builder()
        .securityGroupId(securityGroupId)
        .build();

      Response<NetworkInterfaceCollection> response = vpcService.listSecurityGroupNetworkInterfaces(listSecurityGroupNetworkInterfacesOptions).execute();
      NetworkInterfaceCollection networkInterfaceCollection = response.getResult();

      // end-list_security_group_network_interfaces

    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroupNetworkInterface() result:");
      // begin-get_security_group_network_interface
      GetSecurityGroupNetworkInterfaceOptions getSecurityGroupNetworkInterfaceOptions = new GetSecurityGroupNetworkInterfaceOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupNicId)
        .build();

      Response<NetworkInterface> response = vpcService.getSecurityGroupNetworkInterface(getSecurityGroupNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-get_security_group_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addSecurityGroupNetworkInterface() result:");
      // begin-add_security_group_network_interface
      AddSecurityGroupNetworkInterfaceOptions addSecurityGroupNetworkInterfaceOptions = new AddSecurityGroupNetworkInterfaceOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupNicId)
        .build();

      Response<NetworkInterface> response = vpcService.addSecurityGroupNetworkInterface(addSecurityGroupNetworkInterfaceOptions).execute();
      NetworkInterface networkInterface = response.getResult();

      // end-add_security_group_network_interface
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroupRules() result:");
      // begin-list_security_group_rules
      ListSecurityGroupRulesOptions listSecurityGroupRulesOptions = new ListSecurityGroupRulesOptions.Builder()
        .securityGroupId(securityGroupId)
        .build();

      Response<SecurityGroupRuleCollection> response = vpcService.listSecurityGroupRules(listSecurityGroupRulesOptions).execute();
      SecurityGroupRuleCollection securityGroupRuleCollection = response.getResult();

      // end-list_security_group_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroupRule() result:");
      // begin-create_security_group_rule
      SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP securityGroupRulePrototypeModel = new SecurityGroupRulePrototypeSecurityGroupRuleProtocolICMP.Builder()
        .direction("inbound")
        .protocol("icmp")
        .build();
      CreateSecurityGroupRuleOptions createSecurityGroupRuleOptions = new CreateSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .securityGroupRulePrototype(securityGroupRulePrototypeModel)
        .build();

      Response<SecurityGroupRule> response = vpcService.createSecurityGroupRule(createSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-create_security_group_rule
      securityGroupRuleId = securityGroupRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroupRule() result:");
      // begin-get_security_group_rule
      GetSecurityGroupRuleOptions getSecurityGroupRuleOptions = new GetSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .build();

      Response<SecurityGroupRule> response = vpcService.getSecurityGroupRule(getSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-get_security_group_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSecurityGroupRule() result:");
      // begin-update_security_group_rule
      SecurityGroupRulePatch securityGroupRulePatchModel = new SecurityGroupRulePatch.Builder()
        .code(Long.valueOf("81"))
        .build();
      Map<String, Object> securityGroupRulePatchModelAsPatch = securityGroupRulePatchModel.asPatch();
      UpdateSecurityGroupRuleOptions updateSecurityGroupRuleOptions = new UpdateSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .securityGroupRulePatch(securityGroupRulePatchModelAsPatch)
        .build();

      Response<SecurityGroupRule> response = vpcService.updateSecurityGroupRule(updateSecurityGroupRuleOptions).execute();
      SecurityGroupRule securityGroupRule = response.getResult();

      // end-update_security_group_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listSecurityGroupTargets() result:");
      // begin-list_security_group_targets
      ListSecurityGroupTargetsOptions listSecurityGroupTargetsOptions = new ListSecurityGroupTargetsOptions.Builder()
        .securityGroupId(securityGroupId)
        .build();

      Response<SecurityGroupTargetCollection> response = vpcService.listSecurityGroupTargets(listSecurityGroupTargetsOptions).execute();
      SecurityGroupTargetCollection securityGroupTargetCollection = response.getResult();

      // end-list_security_group_targets
      securityGroupTargetId = securityGroupTargetCollection.getTargets().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSecurityGroupTarget() result:");
      // begin-get_security_group_target
      GetSecurityGroupTargetOptions getSecurityGroupTargetOptions = new GetSecurityGroupTargetOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupTargetId)
        .build();

      Response<SecurityGroupTargetReference> response = vpcService.getSecurityGroupTarget(getSecurityGroupTargetOptions).execute();
      SecurityGroupTargetReference securityGroupTargetReference = response.getResult();

      // end-get_security_group_target
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSecurityGroupTargetBinding() result:");
      // begin-create_security_group_target_binding
      CreateSecurityGroupTargetBindingOptions createSecurityGroupTargetBindingOptions = new CreateSecurityGroupTargetBindingOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(instanceNicId)
        .build();

      Response<SecurityGroupTargetReference> response = vpcService.createSecurityGroupTargetBinding(createSecurityGroupTargetBindingOptions).execute();
      SecurityGroupTargetReference securityGroupTargetReference = response.getResult();
      targetId = securityGroupTargetReference.getId();

      // end-create_security_group_target_binding
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIkePolicies() result:");
      // begin-list_ike_policies
      ListIkePoliciesOptions listIkePoliciesOptions = new ListIkePoliciesOptions.Builder()
        .build();

      Response<IKEPolicyCollection> response = vpcService.listIkePolicies(listIkePoliciesOptions).execute();
      IKEPolicyCollection ikePolicyCollection = response.getResult();

      // end-list_ike_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createIkePolicy() result:");
      // begin-create_ike_policy
      CreateIkePolicyOptions createIkePolicyOptions = new CreateIkePolicyOptions.Builder()
        .authenticationAlgorithm("md5")
        .name("my-ike-policy")
        .dhGroup(Long.valueOf("2"))
        .encryptionAlgorithm("triple_des")
        .ikeVersion(Long.valueOf("1"))
        .build();

      Response<IKEPolicy> response = vpcService.createIkePolicy(createIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-create_ike_policy
      ikePolicyId = ikePolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getIkePolicy() result:");
      // begin-get_ike_policy
      GetIkePolicyOptions getIkePolicyOptions = new GetIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<IKEPolicy> response = vpcService.getIkePolicy(getIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-get_ike_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateIkePolicy() result:");
      // begin-update_ike_policy
      IKEPolicyPatch ikePolicyPatchModel = new IKEPolicyPatch.Builder()
        .name("my-ikepolicy-update")
        .build();
      Map<String, Object> ikePolicyPatchModelAsPatch = ikePolicyPatchModel.asPatch();
      UpdateIkePolicyOptions updateIkePolicyOptions = new UpdateIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .ikePolicyPatch(ikePolicyPatchModelAsPatch)
        .build();

      Response<IKEPolicy> response = vpcService.updateIkePolicy(updateIkePolicyOptions).execute();
      IKEPolicy ikePolicy = response.getResult();

      // end-update_ike_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIkePolicyConnections() result:");
      // begin-list_ike_policy_connections
      ListIkePolicyConnectionsOptions listIkePolicyConnectionsOptions = new ListIkePolicyConnectionsOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<VPNGatewayConnectionCollection> response = vpcService.listIkePolicyConnections(listIkePolicyConnectionsOptions).execute();
      VPNGatewayConnectionCollection vpnGatewayConnectionCollection = response.getResult();

      // end-list_ike_policy_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIpsecPolicies() result:");
      // begin-list_ipsec_policies
      ListIpsecPoliciesOptions listIpsecPoliciesOptions = new ListIpsecPoliciesOptions.Builder()
        .build();

      Response<IPsecPolicyCollection> response = vpcService.listIpsecPolicies(listIpsecPoliciesOptions).execute();
      IPsecPolicyCollection iPsecPolicyCollection = response.getResult();

      // end-list_ipsec_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createIpsecPolicy() result:");
      // begin-create_ipsec_policy
      CreateIpsecPolicyOptions createIpsecPolicyOptions = new CreateIpsecPolicyOptions.Builder()
        .name("my-ipsec-policy")
        .authenticationAlgorithm("md5")
        .encryptionAlgorithm("triple_des")
        .pfs("disabled")
        .build();

      Response<IPsecPolicy> response = vpcService.createIpsecPolicy(createIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-create_ipsec_policy
      iPsecPolicyId = iPsecPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getIpsecPolicy() result:");
      // begin-get_ipsec_policy
      GetIpsecPolicyOptions getIpsecPolicyOptions = new GetIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<IPsecPolicy> response = vpcService.getIpsecPolicy(getIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-get_ipsec_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateIpsecPolicy() result:");
      // begin-update_ipsec_policy
      IPsecPolicyPatch iPsecPolicyPatchModel = new IPsecPolicyPatch.Builder()
        .name("my-ipsecpolicy-update")
        .build();
      Map<String, Object> iPsecPolicyPatchModelAsPatch = iPsecPolicyPatchModel.asPatch();
      UpdateIpsecPolicyOptions updateIpsecPolicyOptions = new UpdateIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .iPsecPolicyPatch(iPsecPolicyPatchModelAsPatch)
        .build();

      Response<IPsecPolicy> response = vpcService.updateIpsecPolicy(updateIpsecPolicyOptions).execute();
      IPsecPolicy iPsecPolicy = response.getResult();

      // end-update_ipsec_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listIpsecPolicyConnections() result:");
      // begin-list_ipsec_policy_connections
      ListIpsecPolicyConnectionsOptions listIpsecPolicyConnectionsOptions = new ListIpsecPolicyConnectionsOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<VPNGatewayConnectionCollection> response = vpcService.listIpsecPolicyConnections(listIpsecPolicyConnectionsOptions).execute();
      VPNGatewayConnectionCollection vpnGatewayConnectionCollection = response.getResult();

      // end-list_ipsec_policy_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGateways() result:");
      // begin-list_vpn_gateways
      ListVpnGatewaysOptions listVpnGatewaysOptions = new ListVpnGatewaysOptions.Builder()
        .mode("route")
        .build();

      Response<VPNGatewayCollection> response = vpcService.listVpnGateways(listVpnGatewaysOptions).execute();
      VPNGatewayCollection vpnGatewayCollection = response.getResult();

      // end-list_vpn_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnGateway() result:");
      // begin-create_vpn_gateway
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      VPNGatewayPrototypeVPNGatewayRouteModePrototype vpnGatewayPrototypeModel = new VPNGatewayPrototypeVPNGatewayRouteModePrototype.Builder()
        .name("my-vpn-gateway")
        .subnet(subnetIdentityModel)
        .build();
      CreateVpnGatewayOptions createVpnGatewayOptions = new CreateVpnGatewayOptions.Builder()
        .vpnGatewayPrototype(vpnGatewayPrototypeModel)
        .build();

      Response<VPNGateway> response = vpcService.createVpnGateway(createVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-create_vpn_gateway
      vpnGatewayId = vpnGateway.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnGateway() result:");
      // begin-get_vpn_gateway
      GetVpnGatewayOptions getVpnGatewayOptions = new GetVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .build();

      Response<VPNGateway> response = vpcService.getVpnGateway(getVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-get_vpn_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnGateway() result:");
      // begin-update_vpn_gateway
      VPNGatewayPatch vpnGatewayPatchModel = new VPNGatewayPatch.Builder()
        .name("my-vpngateway-update")
        .build();
      Map<String, Object> vpnGatewayPatchModelAsPatch = vpnGatewayPatchModel.asPatch();
      UpdateVpnGatewayOptions updateVpnGatewayOptions = new UpdateVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .vpnGatewayPatch(vpnGatewayPatchModelAsPatch)
        .build();

      Response<VPNGateway> response = vpcService.updateVpnGateway(updateVpnGatewayOptions).execute();
      VPNGateway vpnGateway = response.getResult();

      // end-update_vpn_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnections() result:");
      // begin-list_vpn_gateway_connections
      ListVpnGatewayConnectionsOptions listVpnGatewayConnectionsOptions = new ListVpnGatewayConnectionsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .build();

      Response<VPNGatewayConnectionCollection> response = vpcService.listVpnGatewayConnections(listVpnGatewayConnectionsOptions).execute();
      VPNGatewayConnectionCollection vpnGatewayConnectionCollection = response.getResult();

      // end-list_vpn_gateway_connections
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createVpnGatewayConnection() result:");
      // begin-create_vpn_gateway_connection
      VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype vpnGatewayConnectionPrototypeModel = new VPNGatewayConnectionPrototypeVPNGatewayConnectionStaticRouteModePrototype.Builder()
        .name("my-vpn-gateway-connection")
        .peerAddress("169.21.50.5")
        .psk("lkj14b1oi0alcniejkso")
        .build();
      CreateVpnGatewayConnectionOptions createVpnGatewayConnectionOptions = new CreateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .vpnGatewayConnectionPrototype(vpnGatewayConnectionPrototypeModel)
        .build();

      Response<VPNGatewayConnection> response = vpcService.createVpnGatewayConnection(createVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-create_vpn_gateway_connection
      vpnGatewayConnectionId  = vpnGatewayConnection.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getVpnGatewayConnection() result:");
      // begin-get_vpn_gateway_connection
      GetVpnGatewayConnectionOptions getVpnGatewayConnectionOptions = new GetVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnection> response = vpcService.getVpnGatewayConnection(getVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-get_vpn_gateway_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateVpnGatewayConnection() result:");
      // begin-update_vpn_gateway_connection
      VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch vpnGatewayConnectionPatchModel = new VPNGatewayConnectionPatchVPNGatewayConnectionStaticRouteModePatch.Builder()
        .name("my-vpngetwayconnection-update")
        .build();
      Map<String, Object> vpnGatewayConnectionPatchModelAsPatch = vpnGatewayConnectionPatchModel.asPatch();
      UpdateVpnGatewayConnectionOptions updateVpnGatewayConnectionOptions = new UpdateVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .vpnGatewayConnectionPatch(vpnGatewayConnectionPatchModelAsPatch)
        .build();

      Response<VPNGatewayConnection> response = vpcService.updateVpnGatewayConnection(updateVpnGatewayConnectionOptions).execute();
      VPNGatewayConnection vpnGatewayConnection = response.getResult();

      // end-update_vpn_gateway_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnectionLocalCidrs() result:");
      // begin-list_vpn_gateway_connection_local_cidrs
      ListVpnGatewayConnectionLocalCidrsOptions listVpnGatewayConnectionLocalCidrsOptions = new ListVpnGatewayConnectionLocalCidrsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnectionLocalCIDRs> response = vpcService.listVpnGatewayConnectionLocalCidrs(listVpnGatewayConnectionLocalCidrsOptions).execute();
      VPNGatewayConnectionLocalCIDRs vpnGatewayConnectionLocalCidRs = response.getResult();

      // end-list_vpn_gateway_connection_local_cidrs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_vpn_gateway_connection_local_cidr
      AddVpnGatewayConnectionLocalCidrOptions addVpnGatewayConnectionLocalCidrOptions = new AddVpnGatewayConnectionLocalCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidrPrefix("192.134.0.0")
        .prefixLength("28")
        .build();

      Response<Void> response = vpcService.addVpnGatewayConnectionLocalCidr(addVpnGatewayConnectionLocalCidrOptions).execute();
      // end-add_vpn_gateway_connection_local_cidr
      System.out.printf("addVpnGatewayConnectionLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-check_vpn_gateway_connection_local_cidr
      CheckVpnGatewayConnectionLocalCidrOptions checkVpnGatewayConnectionLocalCidrOptions = new CheckVpnGatewayConnectionLocalCidrOptions.Builder()
              .vpnGatewayId(vpnGatewayId)
              .id(vpnGatewayConnectionId)
              .cidrPrefix("192.134.0.0")
              .prefixLength("28")
              .build();
      Response<Void> response = vpcService.checkVpnGatewayConnectionLocalCidr(checkVpnGatewayConnectionLocalCidrOptions).execute();
      // end-check_vpn_gateway_connection_local_cidr
      System.out.printf("checkVpnGatewayConnectionLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listVpnGatewayConnectionPeerCidrs() result:");
      // begin-list_vpn_gateway_connection_peer_cidrs
      ListVpnGatewayConnectionPeerCidrsOptions listVpnGatewayConnectionPeerCidrsOptions = new ListVpnGatewayConnectionPeerCidrsOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<VPNGatewayConnectionPeerCIDRs> response = vpcService.listVpnGatewayConnectionPeerCidrs(listVpnGatewayConnectionPeerCidrsOptions).execute();
      VPNGatewayConnectionPeerCIDRs vpnGatewayConnectionPeerCidRs = response.getResult();

      // end-list_vpn_gateway_connection_peer_cidrs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_vpn_gateway_connection_peer_cidr
      AddVpnGatewayConnectionPeerCidrOptions addVpnGatewayConnectionPeerCidrOptions = new AddVpnGatewayConnectionPeerCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidrPrefix("192.134.0.0")
        .prefixLength("28")
        .build();

      Response<Void> response = vpcService.addVpnGatewayConnectionPeerCidr(addVpnGatewayConnectionPeerCidrOptions).execute();
      // end-add_vpn_gateway_connection_peer_cidr
      System.out.printf("addVpnGatewayConnectionPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-check_vpn_gateway_connection_peer_cidr
      CheckVpnGatewayConnectionPeerCidrOptions checkVpnGatewayConnectionPeerCidrOptions = new CheckVpnGatewayConnectionPeerCidrOptions.Builder()
              .vpnGatewayId(vpnGatewayId)
              .id(vpnGatewayConnectionId)
              .cidrPrefix("192.134.0.0")
              .prefixLength("28")
              .build();
      Response<Void> response = vpcService.checkVpnGatewayConnectionPeerCidr(checkVpnGatewayConnectionPeerCidrOptions).execute();
      // end-check_vpn_gateway_connection_peer_cidr
      System.out.printf("checkVpnGatewayConnectionPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerProfiles() result:");
      // begin-list_load_balancer_profiles
      ListLoadBalancerProfilesOptions listLoadBalancerProfilesOptions = new ListLoadBalancerProfilesOptions.Builder()
        .build();

      Response<LoadBalancerProfileCollection> response = vpcService.listLoadBalancerProfiles(listLoadBalancerProfilesOptions).execute();
      LoadBalancerProfileCollection loadBalancerProfileCollection = response.getResult();

      // end-list_load_balancer_profiles
      lbProfileName = loadBalancerProfileCollection.getProfiles().get(0).getName();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerProfile() result:");
      // begin-get_load_balancer_profile
      GetLoadBalancerProfileOptions getLoadBalancerProfileOptions = new GetLoadBalancerProfileOptions.Builder()
        .name(lbProfileName)
        .build();

      Response<LoadBalancerProfile> response = vpcService.getLoadBalancerProfile(getLoadBalancerProfileOptions).execute();
      LoadBalancerProfile loadBalancerProfile = response.getResult();

      // end-get_load_balancer_profile
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancers() result:");
      // begin-list_load_balancers
      ListLoadBalancersOptions listLoadBalancersOptions = new ListLoadBalancersOptions.Builder()
        .build();

      Response<LoadBalancerCollection> response = vpcService.listLoadBalancers(listLoadBalancersOptions).execute();
      LoadBalancerCollection loadBalancerCollection = response.getResult();

      // end-list_load_balancers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancer() result:");
      // begin-create_load_balancer
      SubnetIdentityById subnetIdentityModel = new SubnetIdentityById.Builder()
        .id(subnetId)
        .build();
      CreateLoadBalancerOptions createLoadBalancerOptions = new CreateLoadBalancerOptions.Builder()
        .name("my-lb")
        .isPublic(true)
        .subnets(new java.util.ArrayList<SubnetIdentity>(java.util.Arrays.asList(subnetIdentityModel)))
        .build();

      Response<LoadBalancer> response = vpcService.createLoadBalancer(createLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-create_load_balancer
      loadBalancerId = loadBalancer.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancer() result:");
      // begin-get_load_balancer
      GetLoadBalancerOptions getLoadBalancerOptions = new GetLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<LoadBalancer> response = vpcService.getLoadBalancer(getLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-get_load_balancer
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancer() result:");
      // begin-update_load_balancer
      LoadBalancerPatch loadBalancerPatchModel = new LoadBalancerPatch.Builder()
        .name("my-lb-update")
        .build();
      Map<String, Object> loadBalancerPatchModelAsPatch = loadBalancerPatchModel.asPatch();
      UpdateLoadBalancerOptions updateLoadBalancerOptions = new UpdateLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .loadBalancerPatch(loadBalancerPatchModelAsPatch)
        .build();

      Response<LoadBalancer> response = vpcService.updateLoadBalancer(updateLoadBalancerOptions).execute();
      LoadBalancer loadBalancer = response.getResult();

      // end-update_load_balancer
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerStatistics() result:");
      // begin-get_load_balancer_statistics
      GetLoadBalancerStatisticsOptions getLoadBalancerStatisticsOptions = new GetLoadBalancerStatisticsOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<LoadBalancerStatistics> response = vpcService.getLoadBalancerStatistics(getLoadBalancerStatisticsOptions).execute();
      LoadBalancerStatistics loadBalancerStatistics = response.getResult();

      // end-get_load_balancer_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListeners() result:");
      // begin-list_load_balancer_listeners
      ListLoadBalancerListenersOptions listLoadBalancerListenersOptions = new ListLoadBalancerListenersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .build();

      Response<LoadBalancerListenerCollection> response = vpcService.listLoadBalancerListeners(listLoadBalancerListenersOptions).execute();
      LoadBalancerListenerCollection loadBalancerListenerCollection = response.getResult();

      // end-list_load_balancer_listeners
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListener() result:");
      // begin-create_load_balancer_listener
      CreateLoadBalancerListenerOptions createLoadBalancerListenerOptions = new CreateLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .port(Long.valueOf("443"))
        .protocol("http")
        .build();

      Response<LoadBalancerListener> response = vpcService.createLoadBalancerListener(createLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-create_load_balancer_listener
      lbListenerId = loadBalancerListener.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListener() result:");
      // begin-get_load_balancer_listener
      GetLoadBalancerListenerOptions getLoadBalancerListenerOptions = new GetLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbListenerId)
        .build();

      Response<LoadBalancerListener> response = vpcService.getLoadBalancerListener(getLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-get_load_balancer_listener
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListener() result:");
      // begin-update_load_balancer_listener
      LoadBalancerListenerPatch loadBalancerListenerPatchModel = new LoadBalancerListenerPatch.Builder()
        .port(Long.valueOf("81"))
        .build();
      Map<String, Object> loadBalancerListenerPatchModelAsPatch = loadBalancerListenerPatchModel.asPatch();
      UpdateLoadBalancerListenerOptions updateLoadBalancerListenerOptions = new UpdateLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbListenerId)
        .loadBalancerListenerPatch(loadBalancerListenerPatchModelAsPatch)
        .build();

      Response<LoadBalancerListener> response = vpcService.updateLoadBalancerListener(updateLoadBalancerListenerOptions).execute();
      LoadBalancerListener loadBalancerListener = response.getResult();

      // end-update_load_balancer_listener
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListenerPolicies() result:");
      // begin-list_load_balancer_listener_policies
      ListLoadBalancerListenerPoliciesOptions listLoadBalancerListenerPoliciesOptions = new ListLoadBalancerListenerPoliciesOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .build();

      Response<LoadBalancerListenerPolicyCollection> response = vpcService.listLoadBalancerListenerPolicies(listLoadBalancerListenerPoliciesOptions).execute();
      LoadBalancerListenerPolicyCollection loadBalancerListenerPolicyCollection = response.getResult();

      // end-list_load_balancer_listener_policies
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListenerPolicy() result:");
      // begin-create_load_balancer_listener_policy
      CreateLoadBalancerListenerPolicyOptions createLoadBalancerListenerPolicyOptions = new CreateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .action("forward")
        .priority(Long.valueOf("5"))
        .build();

      Response<LoadBalancerListenerPolicy> response = vpcService.createLoadBalancerListenerPolicy(createLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-create_load_balancer_listener_policy
      lbListenerPolicyId = loadBalancerListenerPolicy.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListenerPolicy() result:");
      // begin-get_load_balancer_listener_policy
      GetLoadBalancerListenerPolicyOptions getLoadBalancerListenerPolicyOptions = new GetLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .id(lbListenerPolicyId)
        .build();

      Response<LoadBalancerListenerPolicy> response = vpcService.getLoadBalancerListenerPolicy(getLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-get_load_balancer_listener_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListenerPolicy() result:");
      // begin-update_load_balancer_listener_policy
      LoadBalancerListenerPolicyPatch loadBalancerListenerPolicyPatchModel = new LoadBalancerListenerPolicyPatch.Builder()
        .name("my-lblistenerpolicy-update")
        .priority(5L)
        .build();
      Map<String, Object> loadBalancerListenerPolicyPatchModelAsPatch = loadBalancerListenerPolicyPatchModel.asPatch();
      UpdateLoadBalancerListenerPolicyOptions updateLoadBalancerListenerPolicyOptions = new UpdateLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .id(lbListenerPolicyId)
        .loadBalancerListenerPolicyPatch(loadBalancerListenerPolicyPatchModelAsPatch)
        .build();
      Response<LoadBalancerListenerPolicy> response = vpcService.updateLoadBalancerListenerPolicy(updateLoadBalancerListenerPolicyOptions).execute();
      LoadBalancerListenerPolicy loadBalancerListenerPolicy = response.getResult();

      // end-update_load_balancer_listener_policy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerListenerPolicyRules() result:");
      // begin-list_load_balancer_listener_policy_rules
      ListLoadBalancerListenerPolicyRulesOptions listLoadBalancerListenerPolicyRulesOptions = new ListLoadBalancerListenerPolicyRulesOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .policyId(lbListenerPolicyId)
        .build();

      Response<LoadBalancerListenerPolicyRuleCollection> response = vpcService.listLoadBalancerListenerPolicyRules(listLoadBalancerListenerPolicyRulesOptions).execute();
      LoadBalancerListenerPolicyRuleCollection loadBalancerListenerPolicyRuleCollection = response.getResult();

      // end-list_load_balancer_listener_policy_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerListenerPolicyRule() result:");
      // begin-create_load_balancer_listener_policy_rule
      CreateLoadBalancerListenerPolicyRuleOptions createLoadBalancerListenerPolicyRuleOptions = new CreateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .policyId(lbListenerPolicyId)
        .condition("contains")
        .type("header")
        .value("2")
        .field("MY-APP-HEADER")
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.createLoadBalancerListenerPolicyRule(createLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-create_load_balancer_listener_policy_rule
      lbListenerPolicyRuleId = loadBalancerListenerPolicyRule.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerListenerPolicyRule() result:");
      // begin-get_load_balancer_listener_policy_rule
      GetLoadBalancerListenerPolicyRuleOptions getLoadBalancerListenerPolicyRuleOptions = new GetLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .policyId(lbListenerPolicyId)
        .id(lbListenerPolicyRuleId)
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.getLoadBalancerListenerPolicyRule(getLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-get_load_balancer_listener_policy_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerListenerPolicyRule() result:");
      // begin-update_load_balancer_listener_policy_rule
      LoadBalancerListenerPolicyRulePatch loadBalancerListenerPolicyRulePatchModel = new LoadBalancerListenerPolicyRulePatch.Builder()
        .condition("contains")
        .type("header")
        .field("MY-APP-HEADER-UPDATE")
        .value("1")
        .build();
      Map<String, Object> loadBalancerListenerPolicyRulePatchModelAsPatch = loadBalancerListenerPolicyRulePatchModel.asPatch();
      UpdateLoadBalancerListenerPolicyRuleOptions updateLoadBalancerListenerPolicyRuleOptions = new UpdateLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .policyId(lbListenerPolicyId)
        .id(lbListenerPolicyRuleId)
        .loadBalancerListenerPolicyRulePatch(loadBalancerListenerPolicyRulePatchModelAsPatch)
        .build();

      Response<LoadBalancerListenerPolicyRule> response = vpcService.updateLoadBalancerListenerPolicyRule(updateLoadBalancerListenerPolicyRuleOptions).execute();
      LoadBalancerListenerPolicyRule loadBalancerListenerPolicyRule = response.getResult();

      // end-update_load_balancer_listener_policy_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerPools() result:");
      // begin-list_load_balancer_pools
      ListLoadBalancerPoolsOptions listLoadBalancerPoolsOptions = new ListLoadBalancerPoolsOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .build();

      Response<LoadBalancerPoolCollection> response = vpcService.listLoadBalancerPools(listLoadBalancerPoolsOptions).execute();
      LoadBalancerPoolCollection loadBalancerPoolCollection = response.getResult();

      // end-list_load_balancer_pools
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerPool() result:");
      // begin-create_load_balancer_pool
      LoadBalancerPoolHealthMonitorPrototype loadBalancerPoolHealthMonitorPrototypeModel = new LoadBalancerPoolHealthMonitorPrototype.Builder()
        .delay(Long.valueOf("5"))
        .maxRetries(Long.valueOf("2"))
        .timeout(Long.valueOf("2"))
        .type("http")
        .build();
      CreateLoadBalancerPoolOptions createLoadBalancerPoolOptions = new CreateLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .algorithm("least_connections")
        .healthMonitor(loadBalancerPoolHealthMonitorPrototypeModel)
        .protocol("http")
        .build();

      Response<LoadBalancerPool> response = vpcService.createLoadBalancerPool(createLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-create_load_balancer_pool
      lbPoolId = loadBalancerPool.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerPool() result:");
      // begin-get_load_balancer_pool
      GetLoadBalancerPoolOptions getLoadBalancerPoolOptions = new GetLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbPoolId)
        .build();

      Response<LoadBalancerPool> response = vpcService.getLoadBalancerPool(getLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-get_load_balancer_pool
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerPool() result:");
      // begin-update_load_balancer_pool
      LoadBalancerPoolPatch loadBalancerPoolPatchModel = new LoadBalancerPoolPatch.Builder()
        .name("my-lbpool-update")
        .build();
      Map<String, Object> loadBalancerPoolPatchModelAsPatch = loadBalancerPoolPatchModel.asPatch();
      UpdateLoadBalancerPoolOptions updateLoadBalancerPoolOptions = new UpdateLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbPoolId)
        .loadBalancerPoolPatch(loadBalancerPoolPatchModelAsPatch)
        .build();

      Response<LoadBalancerPool> response = vpcService.updateLoadBalancerPool(updateLoadBalancerPoolOptions).execute();
      LoadBalancerPool loadBalancerPool = response.getResult();

      // end-update_load_balancer_pool
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listLoadBalancerPoolMembers() result:");
      // begin-list_load_balancer_pool_members
      ListLoadBalancerPoolMembersOptions listLoadBalancerPoolMembersOptions = new ListLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .build();

      Response<LoadBalancerPoolMemberCollection> response = vpcService.listLoadBalancerPoolMembers(listLoadBalancerPoolMembersOptions).execute();
      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollection = response.getResult();

      // end-list_load_balancer_pool_members
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createLoadBalancerPoolMember() result:");
      // begin-create_load_balancer_pool_member
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id(instanceId)
        .build();
      CreateLoadBalancerPoolMemberOptions createLoadBalancerPoolMemberOptions = new CreateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.createLoadBalancerPoolMember(createLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-create_load_balancer_pool_member
      lbPoolMemberId = loadBalancerPoolMember.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceLoadBalancerPoolMembers() result:");
      // begin-replace_load_balancer_pool_members
      LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById loadBalancerPoolMemberTargetPrototypeModel = new LoadBalancerPoolMemberTargetPrototypeInstanceIdentityInstanceIdentityById.Builder()
        .id(instanceId)
        .build();
      LoadBalancerPoolMemberPrototype loadBalancerPoolMemberPrototypeModel = new LoadBalancerPoolMemberPrototype.Builder()
        .port(Long.valueOf("80"))
        .target(loadBalancerPoolMemberTargetPrototypeModel)
        .build();
      ReplaceLoadBalancerPoolMembersOptions replaceLoadBalancerPoolMembersOptions = new ReplaceLoadBalancerPoolMembersOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .members(new java.util.ArrayList<LoadBalancerPoolMemberPrototype>(java.util.Arrays.asList(loadBalancerPoolMemberPrototypeModel)))
        .build();

      Response<LoadBalancerPoolMemberCollection> response = vpcService.replaceLoadBalancerPoolMembers(replaceLoadBalancerPoolMembersOptions).execute();
      LoadBalancerPoolMemberCollection loadBalancerPoolMemberCollection = response.getResult();

      // end-replace_load_balancer_pool_members
      lbPoolMemberId = loadBalancerPoolMemberCollection.getMembers().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getLoadBalancerPoolMember() result:");
      // begin-get_load_balancer_pool_member
      GetLoadBalancerPoolMemberOptions getLoadBalancerPoolMemberOptions = new GetLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .id(lbPoolMemberId)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.getLoadBalancerPoolMember(getLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-get_load_balancer_pool_member
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateLoadBalancerPoolMember() result:");
      // begin-update_load_balancer_pool_member
      LoadBalancerPoolMemberPatch loadBalancerPoolMemberPatchModel = new LoadBalancerPoolMemberPatch.Builder()
        .port(Long.valueOf("81"))
        .build();
      Map<String, Object> loadBalancerPoolMemberPatchModelAsPatch = loadBalancerPoolMemberPatchModel.asPatch();
      UpdateLoadBalancerPoolMemberOptions updateLoadBalancerPoolMemberOptions = new UpdateLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .id(lbPoolMemberId)
        .loadBalancerPoolMemberPatch(loadBalancerPoolMemberPatchModelAsPatch)
        .build();

      Response<LoadBalancerPoolMember> response = vpcService.updateLoadBalancerPoolMember(updateLoadBalancerPoolMemberOptions).execute();
      LoadBalancerPoolMember loadBalancerPoolMember = response.getResult();

      // end-update_load_balancer_pool_member
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listEndpointGateways() result:");
      // begin-list_endpoint_gateways
      ListEndpointGatewaysOptions listEndpointGatewaysOptions = new ListEndpointGatewaysOptions.Builder()
        .build();

      Response<EndpointGatewayCollection> response = vpcService.listEndpointGateways(listEndpointGatewaysOptions).execute();
      EndpointGatewayCollection endpointGatewayCollection = response.getResult();

      // end-list_endpoint_gateways
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createEndpointGateway() result:");
      // begin-create_endpoint_gateway
      EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN endpointGatewayTargetPrototypeModel = new EndpointGatewayTargetPrototypeProviderCloudServiceIdentityProviderCloudServiceIdentityByCRN.Builder()
        .resourceType("provider_infrastructure_service")
        .crn("crn:v1:bluemix:public:cloudant:us-south:a/123456:3527280b-9327-4411-8020-591092e60353::")
        .build();
      VPCIdentityById vpcIdentityModel = new VPCIdentityById.Builder()
        .id(vpcId)
        .build();
      CreateEndpointGatewayOptions createEndpointGatewayOptions = new CreateEndpointGatewayOptions.Builder()
        .target(endpointGatewayTargetPrototypeModel)
        .vpc(vpcIdentityModel)
        .build();

      Response<EndpointGateway> response = vpcService.createEndpointGateway(createEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-create_endpoint_gateway
      endpointGatewayId = endpointGateway.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listEndpointGatewayIps() result:");
      // begin-list_endpoint_gateway_ips
      ListEndpointGatewayIpsOptions listEndpointGatewayIpsOptions = new ListEndpointGatewayIpsOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .sort("name")
        .build();

      Response<ReservedIPCollectionEndpointGatewayContext> response = vpcService.listEndpointGatewayIps(listEndpointGatewayIpsOptions).execute();
      ReservedIPCollectionEndpointGatewayContext reservedIpCollectionEndpointGatewayContext = response.getResult();

      // end-list_endpoint_gateway_ips
      endpointGatewayIpId = reservedIpCollectionEndpointGatewayContext.getIps().get(0).getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEndpointGatewayIp() result:");
      // begin-get_endpoint_gateway_ip
      GetEndpointGatewayIpOptions getEndpointGatewayIpOptions = new GetEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<ReservedIP> response = vpcService.getEndpointGatewayIp(getEndpointGatewayIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-get_endpoint_gateway_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addEndpointGatewayIp() result:");
      // begin-add_endpoint_gateway_ip
      AddEndpointGatewayIpOptions addEndpointGatewayIpOptions = new AddEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<ReservedIP> response = vpcService.addEndpointGatewayIp(addEndpointGatewayIpOptions).execute();
      ReservedIP reservedIp = response.getResult();

      // end-add_endpoint_gateway_ip
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEndpointGateway() result:");
      // begin-get_endpoint_gateway
      GetEndpointGatewayOptions getEndpointGatewayOptions = new GetEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .build();

      Response<EndpointGateway> response = vpcService.getEndpointGateway(getEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-get_endpoint_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateEndpointGateway() result:");
      // begin-update_endpoint_gateway
      EndpointGatewayPatch endpointGatewayPatchModel = new EndpointGatewayPatch.Builder()
        .name("my-endpointgateway-update")
        .build();
      Map<String, Object> endpointGatewayPatchModelAsPatch = endpointGatewayPatchModel.asPatch();
      UpdateEndpointGatewayOptions updateEndpointGatewayOptions = new UpdateEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .endpointGatewayPatch(endpointGatewayPatchModelAsPatch)
        .build();

      Response<EndpointGateway> response = vpcService.updateEndpointGateway(updateEndpointGatewayOptions).execute();
      EndpointGateway endpointGateway = response.getResult();

      // end-update_endpoint_gateway
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listFlowLogCollectors() result:");
      // begin-list_flow_log_collectors
      ListFlowLogCollectorsOptions listFlowLogCollectorsOptions = new ListFlowLogCollectorsOptions.Builder()
        .build();

      Response<FlowLogCollectorCollection> response = vpcService.listFlowLogCollectors(listFlowLogCollectorsOptions).execute();
      FlowLogCollectorCollection flowLogCollectorCollection = response.getResult();

      // end-list_flow_log_collectors
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createFlowLogCollector() result:");
      // begin-create_flow_log_collector
      CloudObjectStorageBucketIdentityByName cloudObjectStorageBucketIdentityModel = new CloudObjectStorageBucketIdentityByName.Builder()
        .name("bucket-27200-lwx4cfvcue")
        .build();
      FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById flowLogCollectorTargetPrototypeModel = new FlowLogCollectorTargetPrototypeNetworkInterfaceIdentityNetworkInterfaceIdentityNetworkInterfaceIdentityById.Builder()
        .id(instanceNicId)
        .build();
      CreateFlowLogCollectorOptions createFlowLogCollectorOptions = new CreateFlowLogCollectorOptions.Builder()
        .storageBucket(cloudObjectStorageBucketIdentityModel)
        .target(flowLogCollectorTargetPrototypeModel)
        .build();

      Response<FlowLogCollector> response = vpcService.createFlowLogCollector(createFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-create_flow_log_collector
      flowLogCollectorId = flowLogCollector.getId();
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getFlowLogCollector() result:");
      // begin-get_flow_log_collector
      GetFlowLogCollectorOptions getFlowLogCollectorOptions = new GetFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .build();

      Response<FlowLogCollector> response = vpcService.getFlowLogCollector(getFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-get_flow_log_collector
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateFlowLogCollector() result:");
      // begin-update_flow_log_collector
      FlowLogCollectorPatch flowLogCollectorPatchModel = new FlowLogCollectorPatch.Builder()
        .name("my-flowlogcollector-update")
        .build();
      Map<String, Object> flowLogCollectorPatchModelAsPatch = flowLogCollectorPatchModel.asPatch();
      UpdateFlowLogCollectorOptions updateFlowLogCollectorOptions = new UpdateFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .flowLogCollectorPatch(flowLogCollectorPatchModelAsPatch)
        .build();

      Response<FlowLogCollector> response = vpcService.updateFlowLogCollector(updateFlowLogCollectorOptions).execute();
      FlowLogCollector flowLogCollector = response.getResult();

      // end-update_flow_log_collector
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-unset_subnet_public_gateway
      UnsetSubnetPublicGatewayOptions unsetSubnetPublicGatewayOptions = new UnsetSubnetPublicGatewayOptions.Builder()
        .id(subnetId)
        .build();

      Response<Void> response = vpcService.unsetSubnetPublicGateway(unsetSubnetPublicGatewayOptions).execute();
      // end-unset_subnet_public_gateway
      System.out.printf("unsetSubnetPublicGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_vpn_gateway_connection_peer_cidr
      RemoveVpnGatewayConnectionPeerCidrOptions removeVpnGatewayConnectionPeerCidrOptions = new RemoveVpnGatewayConnectionPeerCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidrPrefix("192.134.0.0")
        .prefixLength("28")
        .build();

      Response<Void> response = vpcService.removeVpnGatewayConnectionPeerCidr(removeVpnGatewayConnectionPeerCidrOptions).execute();
      // end-remove_vpn_gateway_connection_peer_cidr
      System.out.printf("removeVpnGatewayConnectionPeerCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_vpn_gateway_connection_local_cidr
      RemoveVpnGatewayConnectionLocalCidrOptions removeVpnGatewayConnectionLocalCidrOptions = new RemoveVpnGatewayConnectionLocalCidrOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .cidrPrefix("192.134.0.0")
        .prefixLength("28")
        .build();

      Response<Void> response = vpcService.removeVpnGatewayConnectionLocalCidr(removeVpnGatewayConnectionLocalCidrOptions).execute();
      // end-remove_vpn_gateway_connection_local_cidr
      System.out.printf("removeVpnGatewayConnectionLocalCidr() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_security_group_network_interface
      RemoveSecurityGroupNetworkInterfaceOptions removeSecurityGroupNetworkInterfaceOptions = new RemoveSecurityGroupNetworkInterfaceOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupNicId)
        .build();

      Response<Void> response = vpcService.removeSecurityGroupNetworkInterface(removeSecurityGroupNetworkInterfaceOptions).execute();
      // end-remove_security_group_network_interface
      System.out.printf("removeSecurityGroupNetworkInterface() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_instance_network_interface_floating_ip
      RemoveInstanceNetworkInterfaceFloatingIpOptions removeInstanceNetworkInterfaceFloatingIpOptions = new RemoveInstanceNetworkInterfaceFloatingIpOptions.Builder()
        .instanceId(instanceId)
        .networkInterfaceId(instanceNicId)
        .id(floatingIpId)
        .build();

      Response<Void> response = vpcService.removeInstanceNetworkInterfaceFloatingIp(removeInstanceNetworkInterfaceFloatingIpOptions).execute();
      // end-remove_instance_network_interface_floating_ip
      System.out.printf("removeInstanceNetworkInterfaceFloatingIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group_target_binding
      DeleteSecurityGroupTargetBindingOptions deleteSecurityGroupTargetBindingOptions = new DeleteSecurityGroupTargetBindingOptions.Builder()
              .securityGroupId(securityGroupId)
              .id(targetId)
              .build();

      Response<Void> response = vpcService.deleteSecurityGroupTargetBinding(deleteSecurityGroupTargetBindingOptions).execute();
      // end-delete_security_group_target_binding
      System.out.printf("deleteSecurityGroupTargetBinding() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_endpoint_gateway_ip
      RemoveEndpointGatewayIpOptions removeEndpointGatewayIpOptions = new RemoveEndpointGatewayIpOptions.Builder()
        .endpointGatewayId(endpointGatewayId)
        .id(endpointGatewayIpId)
        .build();

      Response<Void> response = vpcService.removeEndpointGatewayIp(removeEndpointGatewayIpOptions).execute();
      // end-remove_endpoint_gateway_ip
      System.out.printf("removeEndpointGatewayIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_gateway_connection
      DeleteVpnGatewayConnectionOptions deleteVpnGatewayConnectionOptions = new DeleteVpnGatewayConnectionOptions.Builder()
        .vpnGatewayId(vpnGatewayId)
        .id(vpnGatewayConnectionId)
        .build();

      Response<Void> response = vpcService.deleteVpnGatewayConnection(deleteVpnGatewayConnectionOptions).execute();
      // end-delete_vpn_gateway_connection
      System.out.printf("deleteVpnGatewayConnection() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpn_gateway
      DeleteVpnGatewayOptions deleteVpnGatewayOptions = new DeleteVpnGatewayOptions.Builder()
        .id(vpnGatewayId)
        .build();

      Response<Void> response = vpcService.deleteVpnGateway(deleteVpnGatewayOptions).execute();
      // end-delete_vpn_gateway
      System.out.printf("deleteVpnGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }


    try {
      // begin-delete_subnet_reserved_ip
      DeleteSubnetReservedIpOptions deleteSubnetReservedIpOptions = new DeleteSubnetReservedIpOptions.Builder()
              .subnetId(subnetId)
              .id(reservedIpId)
              .build();

      Response<Void> response = vpcService.deleteSubnetReservedIp(deleteSubnetReservedIpOptions).execute();
      // end-delete_subnet_reserved_ip
      System.out.printf("deleteSubnetReservedIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_subnet
      DeleteSubnetOptions deleteSubnetOptions = new DeleteSubnetOptions.Builder()
              .id(subnetId)
              .build();

      Response<Void> response = vpcService.deleteSubnet(deleteSubnetOptions).execute();
      // end-delete_subnet
      System.out.printf("deleteSubnet() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_routing_table_route
      DeleteVpcRoutingTableRouteOptions deleteVpcRoutingTableRouteOptions = new DeleteVpcRoutingTableRouteOptions.Builder()
        .vpcId(vpcId)
        .routingTableId(routingTableId)
        .id(routingTableRouteId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoutingTableRoute(deleteVpcRoutingTableRouteOptions).execute();
      // end-delete_vpc_routing_table_route
      System.out.printf("deleteVpcRoutingTableRoute() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_routing_table
      DeleteVpcRoutingTableOptions deleteVpcRoutingTableOptions = new DeleteVpcRoutingTableOptions.Builder()
        .vpcId(vpcId)
        .id(routingTableId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoutingTable(deleteVpcRoutingTableOptions).execute();
      // end-delete_vpc_routing_table
      System.out.printf("deleteVpcRoutingTable() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_route
      DeleteVpcRouteOptions deleteVpcRouteOptions = new DeleteVpcRouteOptions.Builder()
        .vpcId(vpcId)
        .id(vpcRouteId)
        .build();

      Response<Void> response = vpcService.deleteVpcRoute(deleteVpcRouteOptions).execute();
      // end-delete_vpc_route
      System.out.printf("deleteVpcRoute() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc_address_prefix
      DeleteVpcAddressPrefixOptions deleteVpcAddressPrefixOptions = new DeleteVpcAddressPrefixOptions.Builder()
        .vpcId(vpcId)
        .id(addressPrefixId)
        .build();

      Response<Void> response = vpcService.deleteVpcAddressPrefix(deleteVpcAddressPrefixOptions).execute();
      // end-delete_vpc_address_prefix
      System.out.printf("deleteVpcAddressPrefix() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_vpc
      DeleteVpcOptions deleteVpcOptions = new DeleteVpcOptions.Builder()
        .id(vpcId)
        .build();

      Response<Void> response = vpcService.deleteVpc(deleteVpcOptions).execute();
      // end-delete_vpc
      System.out.printf("deleteVpc() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_snapshot
      DeleteSnapshotOptions deleteSnapshotOptions = new DeleteSnapshotOptions.Builder()
        .id(snapshotId)
        .build();

      Response<Void> response = vpcService.deleteSnapshot(deleteSnapshotOptions).execute();
      // end-delete_snapshot
      System.out.printf("deleteSnapshot() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_snapshots
      DeleteSnapshotsOptions deleteSnapshotsOptions = new DeleteSnapshotsOptions.Builder()
              .sourceVolumeId(sourceVolume)
              .build();

      Response<Void> response = vpcService.deleteSnapshots(deleteSnapshotsOptions).execute();
      // end-delete_snapshots
      System.out.printf("deleteSnapshots() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group_rule
      DeleteSecurityGroupRuleOptions deleteSecurityGroupRuleOptions = new DeleteSecurityGroupRuleOptions.Builder()
        .securityGroupId(securityGroupId)
        .id(securityGroupRuleId)
        .build();

      Response<Void> response = vpcService.deleteSecurityGroupRule(deleteSecurityGroupRuleOptions).execute();
      // end-delete_security_group_rule
      System.out.printf("deleteSecurityGroupRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_security_group
      DeleteSecurityGroupOptions deleteSecurityGroupOptions = new DeleteSecurityGroupOptions.Builder()
        .id(securityGroupId)
        .build();

      Response<Void> response = vpcService.deleteSecurityGroup(deleteSecurityGroupOptions).execute();
      // end-delete_security_group
      System.out.printf("deleteSecurityGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_public_gateway
      DeletePublicGatewayOptions deletePublicGatewayOptions = new DeletePublicGatewayOptions.Builder()
        .id(publicGatewayId)
        .build();

      Response<Void> response = vpcService.deletePublicGateway(deletePublicGatewayOptions).execute();
      // end-delete_public_gateway
      System.out.printf("deletePublicGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_placement_group
      DeletePlacementGroupOptions deletePlacementGroupOptions = new DeletePlacementGroupOptions.Builder()
        .id(placementGroupId)
        .build();

      Response<Void> response = vpcService.deletePlacementGroup(deletePlacementGroupOptions).execute();
      // end-delete_placement_group
      System.out.printf("deletePlacementGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_network_acl_rule
      DeleteNetworkAclRuleOptions deleteNetworkAclRuleOptions = new DeleteNetworkAclRuleOptions.Builder()
        .networkAclId(networkAclId)
        .id(networkAclRuleId)
        .build();

      Response<Void> response = vpcService.deleteNetworkAclRule(deleteNetworkAclRuleOptions).execute();
      // end-delete_network_acl_rule
      System.out.printf("deleteNetworkAclRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_network_acl
      DeleteNetworkAclOptions deleteNetworkAclOptions = new DeleteNetworkAclOptions.Builder()
        .id(networkAclId)
        .build();

      Response<Void> response = vpcService.deleteNetworkAcl(deleteNetworkAclOptions).execute();
      // end-delete_network_acl
      System.out.printf("deleteNetworkAcl() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_pool_member
      DeleteLoadBalancerPoolMemberOptions deleteLoadBalancerPoolMemberOptions = new DeleteLoadBalancerPoolMemberOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .poolId(lbPoolId)
        .id(lbPoolMemberId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerPoolMember(deleteLoadBalancerPoolMemberOptions).execute();
      // end-delete_load_balancer_pool_member
      System.out.printf("deleteLoadBalancerPoolMember() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_pool
      DeleteLoadBalancerPoolOptions deleteLoadBalancerPoolOptions = new DeleteLoadBalancerPoolOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbPoolId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerPool(deleteLoadBalancerPoolOptions).execute();
      // end-delete_load_balancer_pool
      System.out.printf("deleteLoadBalancerPool() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener_policy_rule
      DeleteLoadBalancerListenerPolicyRuleOptions deleteLoadBalancerListenerPolicyRuleOptions = new DeleteLoadBalancerListenerPolicyRuleOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .policyId(lbListenerPolicyId)
        .id(lbListenerPolicyRuleId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListenerPolicyRule(deleteLoadBalancerListenerPolicyRuleOptions).execute();
      // end-delete_load_balancer_listener_policy_rule
      System.out.printf("deleteLoadBalancerListenerPolicyRule() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener_policy
      DeleteLoadBalancerListenerPolicyOptions deleteLoadBalancerListenerPolicyOptions = new DeleteLoadBalancerListenerPolicyOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .listenerId(lbListenerId)
        .id(lbListenerPolicyId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListenerPolicy(deleteLoadBalancerListenerPolicyOptions).execute();
      // end-delete_load_balancer_listener_policy
      System.out.printf("deleteLoadBalancerListenerPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer_listener
      DeleteLoadBalancerListenerOptions deleteLoadBalancerListenerOptions = new DeleteLoadBalancerListenerOptions.Builder()
        .loadBalancerId(loadBalancerId)
        .id(lbListenerId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancerListener(deleteLoadBalancerListenerOptions).execute();
      // end-delete_load_balancer_listener
      System.out.printf("deleteLoadBalancerListener() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_load_balancer
      DeleteLoadBalancerOptions deleteLoadBalancerOptions = new DeleteLoadBalancerOptions.Builder()
        .id(loadBalancerId)
        .build();

      Response<Void> response = vpcService.deleteLoadBalancer(deleteLoadBalancerOptions).execute();
      // end-delete_load_balancer
      System.out.printf("deleteLoadBalancer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_key
      DeleteKeyOptions deleteKeyOptions = new DeleteKeyOptions.Builder()
        .id(keyId)
        .build();

      Response<Void> response = vpcService.deleteKey(deleteKeyOptions).execute();
      // end-delete_key
      System.out.printf("deleteKey() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_ipsec_policy
      DeleteIpsecPolicyOptions deleteIpsecPolicyOptions = new DeleteIpsecPolicyOptions.Builder()
        .id(iPsecPolicyId)
        .build();

      Response<Void> response = vpcService.deleteIpsecPolicy(deleteIpsecPolicyOptions).execute();
      // end-delete_ipsec_policy
      System.out.printf("deleteIpsecPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_volume_attachment
      DeleteInstanceVolumeAttachmentOptions deleteInstanceVolumeAttachmentOptions = new DeleteInstanceVolumeAttachmentOptions.Builder()
        .instanceId(instanceId)
        .id(instanceVolAttId)
        .build();

      Response<Void> response = vpcService.deleteInstanceVolumeAttachment(deleteInstanceVolumeAttachmentOptions).execute();
      // end-delete_instance_volume_attachment
      System.out.printf("deleteInstanceVolumeAttachment() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_volume
      DeleteVolumeOptions deleteVolumeOptions = new DeleteVolumeOptions.Builder()
              .id(volumeId)
              .build();

      Response<Void> response = vpcService.deleteVolume(deleteVolumeOptions).execute();
      // end-delete_volume
      System.out.printf("deleteVolume() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
      logger.error(String.format("Service returned status code %s: %s%nError details: %s",
              e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_template
      DeleteInstanceTemplateOptions deleteInstanceTemplateOptions = new DeleteInstanceTemplateOptions.Builder()
        .id(instanceTemplateId)
        .build();

      Response<Void> response = vpcService.deleteInstanceTemplate(deleteInstanceTemplateOptions).execute();
      // end-delete_instance_template
      System.out.printf("deleteInstanceTemplate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_network_interface
      DeleteInstanceNetworkInterfaceOptions deleteInstanceNetworkInterfaceOptions = new DeleteInstanceNetworkInterfaceOptions.Builder()
        .instanceId(instanceId)
        .id(instanceNicId)
        .build();

      Response<Void> response = vpcService.deleteInstanceNetworkInterface(deleteInstanceNetworkInterfaceOptions).execute();
      // end-delete_instance_network_interface
      System.out.printf("deleteInstanceNetworkInterface() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_memberships
      DeleteInstanceGroupMembershipsOptions deleteInstanceGroupMembershipsOptions = new DeleteInstanceGroupMembershipsOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupMemberships(deleteInstanceGroupMembershipsOptions).execute();
      // end-delete_instance_group_memberships
      System.out.printf("deleteInstanceGroupMemberships() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_membership
      DeleteInstanceGroupMembershipOptions deleteInstanceGroupMembershipOptions = new DeleteInstanceGroupMembershipOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerMembershipId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupMembership(deleteInstanceGroupMembershipOptions).execute();
      // end-delete_instance_group_membership
      System.out.printf("deleteInstanceGroupMembership() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager_policy
      DeleteInstanceGroupManagerPolicyOptions deleteInstanceGroupManagerPolicyOptions = new DeleteInstanceGroupManagerPolicyOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerPolicyId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManagerPolicy(deleteInstanceGroupManagerPolicyOptions).execute();
      // end-delete_instance_group_manager_policy
      System.out.printf("deleteInstanceGroupManagerPolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager_action
      DeleteInstanceGroupManagerActionOptions deleteInstanceGroupManagerActionOptions = new DeleteInstanceGroupManagerActionOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .instanceGroupManagerId(instanceGroupManagerId)
        .id(instanceGroupManagerActionId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManagerAction(deleteInstanceGroupManagerActionOptions).execute();
      // end-delete_instance_group_manager_action
      System.out.printf("deleteInstanceGroupManagerAction() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_manager
      DeleteInstanceGroupManagerOptions deleteInstanceGroupManagerOptions = new DeleteInstanceGroupManagerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .id(instanceGroupManagerId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupManager(deleteInstanceGroupManagerOptions).execute();
      // end-delete_instance_group_manager
      System.out.printf("deleteInstanceGroupManager() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group_load_balancer
      DeleteInstanceGroupLoadBalancerOptions deleteInstanceGroupLoadBalancerOptions = new DeleteInstanceGroupLoadBalancerOptions.Builder()
        .instanceGroupId(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroupLoadBalancer(deleteInstanceGroupLoadBalancerOptions).execute();
      // end-delete_instance_group_load_balancer
      System.out.printf("deleteInstanceGroupLoadBalancer() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance_group
      DeleteInstanceGroupOptions deleteInstanceGroupOptions = new DeleteInstanceGroupOptions.Builder()
        .id(instanceGroupId)
        .build();

      Response<Void> response = vpcService.deleteInstanceGroup(deleteInstanceGroupOptions).execute();
      // end-delete_instance_group
      System.out.printf("deleteInstanceGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_instance
      DeleteInstanceOptions deleteInstanceOptions = new DeleteInstanceOptions.Builder()
        .id(instanceId)
        .build();

      Response<Void> response = vpcService.deleteInstance(deleteInstanceOptions).execute();
      // end-delete_instance
      System.out.printf("deleteInstance() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_image
      DeleteImageOptions deleteImageOptions = new DeleteImageOptions.Builder()
        .id(imageId)
        .build();

      Response<Void> response = vpcService.deleteImage(deleteImageOptions).execute();
      // end-delete_image
      System.out.printf("deleteImage() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_ike_policy
      DeleteIkePolicyOptions deleteIkePolicyOptions = new DeleteIkePolicyOptions.Builder()
        .id(ikePolicyId)
        .build();

      Response<Void> response = vpcService.deleteIkePolicy(deleteIkePolicyOptions).execute();
      // end-delete_ike_policy
      System.out.printf("deleteIkePolicy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_flow_log_collector
      DeleteFlowLogCollectorOptions deleteFlowLogCollectorOptions = new DeleteFlowLogCollectorOptions.Builder()
        .id(flowLogCollectorId)
        .build();

      Response<Void> response = vpcService.deleteFlowLogCollector(deleteFlowLogCollectorOptions).execute();
      // end-delete_flow_log_collector
      System.out.printf("deleteFlowLogCollector() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_floating_ip
      DeleteFloatingIpOptions deleteFloatingIpOptions = new DeleteFloatingIpOptions.Builder()
        .id(floatingIpId)
        .build();

      Response<Void> response = vpcService.deleteFloatingIp(deleteFloatingIpOptions).execute();
      // end-delete_floating_ip
      System.out.printf("deleteFloatingIp() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_endpoint_gateway
      DeleteEndpointGatewayOptions deleteEndpointGatewayOptions = new DeleteEndpointGatewayOptions.Builder()
        .id(endpointGatewayId)
        .build();

      Response<Void> response = vpcService.deleteEndpointGateway(deleteEndpointGatewayOptions).execute();
      // end-delete_endpoint_gateway
      System.out.printf("deleteEndpointGateway() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_dedicated_host_group
      DeleteDedicatedHostGroupOptions deleteDedicatedHostGroupOptions = new DeleteDedicatedHostGroupOptions.Builder()
        .id(dedicatedHostGroupId)
        .build();

      Response<Void> response = vpcService.deleteDedicatedHostGroup(deleteDedicatedHostGroupOptions).execute();
      // end-delete_dedicated_host_group
      System.out.printf("deleteDedicatedHostGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_dedicated_host
      DeleteDedicatedHostOptions deleteDedicatedHostOptions = new DeleteDedicatedHostOptions.Builder()
        .id(dedicatedHostId)
        .build();

      Response<Void> response = vpcService.deleteDedicatedHost(deleteDedicatedHostOptions).execute();
      // end-delete_dedicated_host
      System.out.printf("deleteDedicatedHost() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
