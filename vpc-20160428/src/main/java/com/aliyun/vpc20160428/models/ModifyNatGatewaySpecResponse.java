// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyNatGatewaySpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyNatGatewaySpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNatGatewaySpecResponse self = new ModifyNatGatewaySpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNatGatewaySpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
