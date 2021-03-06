// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceRequest extends TeaModel {
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static DescribeDnsProductInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceRequest self = new DescribeDnsProductInstanceRequest();
        return TeaModel.build(map, self);
    }

}
