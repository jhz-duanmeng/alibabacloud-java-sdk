// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterDescriptionRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBClusterDescription")
    @Validation(required = true)
    public String DBClusterDescription;

    public static ModifyDBClusterDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterDescriptionRequest self = new ModifyDBClusterDescriptionRequest();
        return TeaModel.build(map, self);
    }

}
