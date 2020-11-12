// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class CreateDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeploymentResponseBody body;

    public static CreateDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentResponse self = new CreateDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentResponse setBody(CreateDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentResponseBody getBody() {
        return this.body;
    }

}
