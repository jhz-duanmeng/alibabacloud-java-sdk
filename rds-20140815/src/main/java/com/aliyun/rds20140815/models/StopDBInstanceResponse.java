// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StopDBInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static StopDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDBInstanceResponse self = new StopDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public StopDBInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
