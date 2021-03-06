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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/DisassociateIdentityProviderConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateIdentityProviderConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private Update update;

    /**
     * @param update
     */

    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * @return
     */

    public Update getUpdate() {
        return this.update;
    }

    /**
     * @param update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateIdentityProviderConfigResult withUpdate(Update update) {
        setUpdate(update);
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
        if (getUpdate() != null)
            sb.append("Update: ").append(getUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateIdentityProviderConfigResult == false)
            return false;
        DisassociateIdentityProviderConfigResult other = (DisassociateIdentityProviderConfigResult) obj;
        if (other.getUpdate() == null ^ this.getUpdate() == null)
            return false;
        if (other.getUpdate() != null && other.getUpdate().equals(this.getUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpdate() == null) ? 0 : getUpdate().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateIdentityProviderConfigResult clone() {
        try {
            return (DisassociateIdentityProviderConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
