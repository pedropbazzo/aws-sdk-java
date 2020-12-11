/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * DescribeTransitGatewayConnectsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTransitGatewayConnectsRequestMarshaller implements
        Marshaller<Request<DescribeTransitGatewayConnectsRequest>, DescribeTransitGatewayConnectsRequest> {

    public Request<DescribeTransitGatewayConnectsRequest> marshall(DescribeTransitGatewayConnectsRequest describeTransitGatewayConnectsRequest) {

        if (describeTransitGatewayConnectsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeTransitGatewayConnectsRequest> request = new DefaultRequest<DescribeTransitGatewayConnectsRequest>(
                describeTransitGatewayConnectsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeTransitGatewayConnects");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        com.amazonaws.internal.SdkInternalList<String> describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayConnectsRequest
                .getTransitGatewayAttachmentIds();
        if (!describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsList.isEmpty()
                || !describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsList.isAutoConstruct()) {
            int transitGatewayAttachmentIdsListIndex = 1;

            for (String describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsListValue : describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsList) {
                if (describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsListValue != null) {
                    request.addParameter("TransitGatewayAttachmentIds." + transitGatewayAttachmentIdsListIndex,
                            StringUtils.fromString(describeTransitGatewayConnectsRequestTransitGatewayAttachmentIdsListValue));
                }
                transitGatewayAttachmentIdsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Filter> describeTransitGatewayConnectsRequestFiltersList = (com.amazonaws.internal.SdkInternalList<Filter>) describeTransitGatewayConnectsRequest
                .getFilters();
        if (!describeTransitGatewayConnectsRequestFiltersList.isEmpty() || !describeTransitGatewayConnectsRequestFiltersList.isAutoConstruct()) {
            int filtersListIndex = 1;

            for (Filter describeTransitGatewayConnectsRequestFiltersListValue : describeTransitGatewayConnectsRequestFiltersList) {

                if (describeTransitGatewayConnectsRequestFiltersListValue.getName() != null) {
                    request.addParameter("Filter." + filtersListIndex + ".Name",
                            StringUtils.fromString(describeTransitGatewayConnectsRequestFiltersListValue.getName()));
                }

                com.amazonaws.internal.SdkInternalList<String> filterValuesList = (com.amazonaws.internal.SdkInternalList<String>) describeTransitGatewayConnectsRequestFiltersListValue
                        .getValues();
                if (!filterValuesList.isEmpty() || !filterValuesList.isAutoConstruct()) {
                    int valuesListIndex = 1;

                    for (String filterValuesListValue : filterValuesList) {
                        if (filterValuesListValue != null) {
                            request.addParameter("Filter." + filtersListIndex + ".Value." + valuesListIndex, StringUtils.fromString(filterValuesListValue));
                        }
                        valuesListIndex++;
                    }
                }
                filtersListIndex++;
            }
        }

        if (describeTransitGatewayConnectsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeTransitGatewayConnectsRequest.getMaxResults()));
        }

        if (describeTransitGatewayConnectsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeTransitGatewayConnectsRequest.getNextToken()));
        }

        return request;
    }

}
