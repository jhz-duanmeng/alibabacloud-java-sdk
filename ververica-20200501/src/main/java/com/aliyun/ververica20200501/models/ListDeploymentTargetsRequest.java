// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListDeploymentTargetsRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static ListDeploymentTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTargetsRequest self = new ListDeploymentTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTargetsRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
