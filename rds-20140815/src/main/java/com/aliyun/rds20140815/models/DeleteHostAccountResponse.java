// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteHostAccountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteHostAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHostAccountResponse self = new DeleteHostAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHostAccountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
