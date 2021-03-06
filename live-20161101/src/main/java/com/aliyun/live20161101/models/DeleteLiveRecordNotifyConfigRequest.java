// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveRecordNotifyConfigRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DeleteLiveRecordNotifyConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRecordNotifyConfigRequest self = new DeleteLiveRecordNotifyConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRecordNotifyConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveRecordNotifyConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
