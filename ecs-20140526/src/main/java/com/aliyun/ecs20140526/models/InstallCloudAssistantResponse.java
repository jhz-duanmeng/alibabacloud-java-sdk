// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class InstallCloudAssistantResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static InstallCloudAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallCloudAssistantResponse self = new InstallCloudAssistantResponse();
        return TeaModel.build(map, self);
    }

    public InstallCloudAssistantResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
