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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeFastSnapshotRestoresRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFastSnapshotRestoresRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeFastSnapshotRestoresRequest> {

    /**
     * <p>
     * The filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code>: The Availability Zone of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code>: The ID of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     * <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code>: The Availability Zone of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code>: The ID of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     * <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filters. The possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>availability-zone</code>: The Availability Zone of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code>: The ID of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     *         <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * The filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code>: The Availability Zone of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code>: The ID of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     * <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code>: The Availability Zone of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code>: The ID of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     *        <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(filters);
    }

    /**
     * <p>
     * The filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code>: The Availability Zone of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code>: The ID of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     * <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code>: The Availability Zone of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code>: The ID of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     *        <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters. The possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>availability-zone</code>: The Availability Zone of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code>: The ID of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     * <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        The filters. The possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>availability-zone</code>: The Availability Zone of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>owner-id</code>: The ID of the AWS account that enabled fast snapshot restore on the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code>: The ID of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code>: The state of fast snapshot restores for the snapshot (<code>enabling</code> |
     *        <code>optimizing</code> | <code>enabled</code> | <code>disabling</code> | <code>disabled</code>).
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFastSnapshotRestoresRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DescribeFastSnapshotRestoresRequest> getDryRunRequest() {
        Request<DescribeFastSnapshotRestoresRequest> request = new DescribeFastSnapshotRestoresRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFastSnapshotRestoresRequest == false)
            return false;
        DescribeFastSnapshotRestoresRequest other = (DescribeFastSnapshotRestoresRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFastSnapshotRestoresRequest clone() {
        return (DescribeFastSnapshotRestoresRequest) super.clone();
    }
}
