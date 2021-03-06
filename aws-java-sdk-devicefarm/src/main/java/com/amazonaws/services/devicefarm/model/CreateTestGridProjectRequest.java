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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/CreateTestGridProject" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTestGridProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Human-readable name of the Selenium testing project.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Human-readable description of the project.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Human-readable name of the Selenium testing project.
     * </p>
     * 
     * @param name
     *        Human-readable name of the Selenium testing project.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Human-readable name of the Selenium testing project.
     * </p>
     * 
     * @return Human-readable name of the Selenium testing project.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Human-readable name of the Selenium testing project.
     * </p>
     * 
     * @param name
     *        Human-readable name of the Selenium testing project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridProjectRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Human-readable description of the project.
     * </p>
     * 
     * @param description
     *        Human-readable description of the project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of the project.
     * </p>
     * 
     * @return Human-readable description of the project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of the project.
     * </p>
     * 
     * @param description
     *        Human-readable description of the project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTestGridProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTestGridProjectRequest == false)
            return false;
        CreateTestGridProjectRequest other = (CreateTestGridProjectRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public CreateTestGridProjectRequest clone() {
        return (CreateTestGridProjectRequest) super.clone();
    }

}
