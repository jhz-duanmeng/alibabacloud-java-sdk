// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TerminateVirtualBorderRouterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TerminateVirtualBorderRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateVirtualBorderRouterResponse self = new TerminateVirtualBorderRouterResponse();
        return TeaModel.build(map, self);
    }

    public TerminateVirtualBorderRouterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
