// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class RescaleApplicationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static RescaleApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        RescaleApplicationResponse self = new RescaleApplicationResponse();
        return TeaModel.build(map, self);
    }

    public RescaleApplicationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
