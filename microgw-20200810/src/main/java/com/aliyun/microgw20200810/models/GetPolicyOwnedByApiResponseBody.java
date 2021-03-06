// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetPolicyOwnedByApiResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.Map<String, DataValue> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetPolicyOwnedByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyOwnedByApiResponseBody self = new GetPolicyOwnedByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyOwnedByApiResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPolicyOwnedByApiResponseBody setData(java.util.Map<String, DataValue> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, DataValue> getData() {
        return this.data;
    }

    public GetPolicyOwnedByApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
