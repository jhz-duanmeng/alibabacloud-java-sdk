// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static StartCasterRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCasterRequest self = new StartCasterRequest();
        return TeaModel.build(map, self);
    }

    public StartCasterRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
