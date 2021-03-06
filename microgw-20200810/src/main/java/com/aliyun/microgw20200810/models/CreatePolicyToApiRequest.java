// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class CreatePolicyToApiRequest extends TeaModel {
    // creationDateTime
    @NameInMap("creationDateTime")
    public String creationDateTime;

    // direction
    @NameInMap("direction")
    public String direction;

    // policyAliasName
    @NameInMap("policyAliasName")
    public String policyAliasName;

    // policyContent
    @NameInMap("policyContent")
    public String policyContent;

    // policyGroup
    @NameInMap("policyGroup")
    public String policyGroup;

    // policyId
    @NameInMap("policyId")
    public Long policyId;

    // policyName
    @NameInMap("policyName")
    public String policyName;

    // priority
    @NameInMap("priority")
    public Long priority;

    // scope
    @NameInMap("scope")
    public String scope;

    // status
    @NameInMap("status")
    public Boolean status;

    // type
    @NameInMap("type")
    public Long type;

    public static CreatePolicyToApiRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyToApiRequest self = new CreatePolicyToApiRequest();
        return TeaModel.build(map, self);
    }

    public CreatePolicyToApiRequest setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public CreatePolicyToApiRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public CreatePolicyToApiRequest setPolicyAliasName(String policyAliasName) {
        this.policyAliasName = policyAliasName;
        return this;
    }
    public String getPolicyAliasName() {
        return this.policyAliasName;
    }

    public CreatePolicyToApiRequest setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }
    public String getPolicyContent() {
        return this.policyContent;
    }

    public CreatePolicyToApiRequest setPolicyGroup(String policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }
    public String getPolicyGroup() {
        return this.policyGroup;
    }

    public CreatePolicyToApiRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

    public CreatePolicyToApiRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreatePolicyToApiRequest setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public CreatePolicyToApiRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreatePolicyToApiRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public CreatePolicyToApiRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
