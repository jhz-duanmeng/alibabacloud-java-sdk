// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamOptimizedFeatureConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("ConfigName")
    @Validation(required = true)
    public String configName;

    public static DescribeLiveStreamOptimizedFeatureConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamOptimizedFeatureConfigRequest self = new DescribeLiveStreamOptimizedFeatureConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamOptimizedFeatureConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveStreamOptimizedFeatureConfigRequest setConfigName(String configName) {
        this.configName = configName;
        return this;
    }
    public String getConfigName() {
        return this.configName;
    }

}
