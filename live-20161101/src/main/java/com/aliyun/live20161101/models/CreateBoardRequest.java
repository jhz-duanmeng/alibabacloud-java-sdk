// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateBoardRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("AppUid")
    @Validation(required = true)
    public String appUid;

    public static CreateBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBoardRequest self = new CreateBoardRequest();
        return TeaModel.build(map, self);
    }

    public CreateBoardRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateBoardRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

}
