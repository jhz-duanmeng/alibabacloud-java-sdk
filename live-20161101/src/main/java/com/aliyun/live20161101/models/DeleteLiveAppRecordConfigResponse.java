// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAppRecordConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteLiveAppRecordConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAppRecordConfigResponse self = new DeleteLiveAppRecordConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAppRecordConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
