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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GetResourceConfigHistoryRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GetResourceConfigHistoryRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceId").build();
    private static final MarshallingInfo<java.util.Date> LATERTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("laterTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> EARLIERTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("earlierTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CHRONOLOGICALORDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("chronologicalOrder").build();
    private static final MarshallingInfo<Integer> LIMIT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("limit").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("nextToken").build();

    private static final GetResourceConfigHistoryRequestMarshaller instance = new GetResourceConfigHistoryRequestMarshaller();

    public static GetResourceConfigHistoryRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GetResourceConfigHistoryRequest getResourceConfigHistoryRequest, ProtocolMarshaller protocolMarshaller) {

        if (getResourceConfigHistoryRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getLaterTime(), LATERTIME_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getEarlierTime(), EARLIERTIME_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getChronologicalOrder(), CHRONOLOGICALORDER_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getLimit(), LIMIT_BINDING);
            protocolMarshaller.marshall(getResourceConfigHistoryRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
