// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamOptimizedFeatureConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetLiveStreamOptimizedFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamOptimizedFeatureConfigResponse self = new SetLiveStreamOptimizedFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamOptimizedFeatureConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
