// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAutoSnapshotPolicyExResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyExResponse self = new ModifyAutoSnapshotPolicyExResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyExResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
