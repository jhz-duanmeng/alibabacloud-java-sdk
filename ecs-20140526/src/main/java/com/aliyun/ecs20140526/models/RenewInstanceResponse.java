// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RenewInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RenewInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponse self = new RenewInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RenewInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
