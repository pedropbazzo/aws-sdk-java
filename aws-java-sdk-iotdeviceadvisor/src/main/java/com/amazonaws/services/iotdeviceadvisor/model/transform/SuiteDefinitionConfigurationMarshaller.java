/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotdeviceadvisor.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotdeviceadvisor.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SuiteDefinitionConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SuiteDefinitionConfigurationMarshaller {

    private static final MarshallingInfo<String> SUITEDEFINITIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("suiteDefinitionName").build();
    private static final MarshallingInfo<List> DEVICES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("devices").build();
    private static final MarshallingInfo<Boolean> INTENDEDFORQUALIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("intendedForQualification").build();
    private static final MarshallingInfo<String> ROOTGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("rootGroup").build();
    private static final MarshallingInfo<String> DEVICEPERMISSIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("devicePermissionRoleArn").build();

    private static final SuiteDefinitionConfigurationMarshaller instance = new SuiteDefinitionConfigurationMarshaller();

    public static SuiteDefinitionConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SuiteDefinitionConfiguration suiteDefinitionConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (suiteDefinitionConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(suiteDefinitionConfiguration.getSuiteDefinitionName(), SUITEDEFINITIONNAME_BINDING);
            protocolMarshaller.marshall(suiteDefinitionConfiguration.getDevices(), DEVICES_BINDING);
            protocolMarshaller.marshall(suiteDefinitionConfiguration.getIntendedForQualification(), INTENDEDFORQUALIFICATION_BINDING);
            protocolMarshaller.marshall(suiteDefinitionConfiguration.getRootGroup(), ROOTGROUP_BINDING);
            protocolMarshaller.marshall(suiteDefinitionConfiguration.getDevicePermissionRoleArn(), DEVICEPERMISSIONROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
