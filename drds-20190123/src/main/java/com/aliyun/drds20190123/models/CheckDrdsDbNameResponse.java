// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckDrdsDbNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Result")
    @Validation(required = true)
    public Boolean result;

    public static CheckDrdsDbNameResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDrdsDbNameResponse self = new CheckDrdsDbNameResponse();
        return TeaModel.build(map, self);
    }

    public CheckDrdsDbNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDrdsDbNameResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckDrdsDbNameResponse setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
