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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotdeviceadvisor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SuiteDefinitionInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SuiteDefinitionInformationJsonUnmarshaller implements Unmarshaller<SuiteDefinitionInformation, JsonUnmarshallerContext> {

    public SuiteDefinitionInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        SuiteDefinitionInformation suiteDefinitionInformation = new SuiteDefinitionInformation();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("suiteDefinitionId", targetDepth)) {
                    context.nextToken();
                    suiteDefinitionInformation.setSuiteDefinitionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("suiteDefinitionName", targetDepth)) {
                    context.nextToken();
                    suiteDefinitionInformation.setSuiteDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultDevices", targetDepth)) {
                    context.nextToken();
                    suiteDefinitionInformation.setDefaultDevices(new ListUnmarshaller<DeviceUnderTest>(DeviceUnderTestJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("intendedForQualification", targetDepth)) {
                    context.nextToken();
                    suiteDefinitionInformation.setIntendedForQualification(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    suiteDefinitionInformation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return suiteDefinitionInformation;
    }

    private static SuiteDefinitionInformationJsonUnmarshaller instance;

    public static SuiteDefinitionInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SuiteDefinitionInformationJsonUnmarshaller();
        return instance;
    }
}
