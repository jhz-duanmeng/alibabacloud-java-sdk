// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ConnectRouterInterfaceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("RouterInterfaceId")
    @Validation(required = true)
    public String routerInterfaceId;

    public static ConnectRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectRouterInterfaceRequest self = new ConnectRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public ConnectRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConnectRouterInterfaceRequest setRouterInterfaceId(String routerInterfaceId) {
        this.routerInterfaceId = routerInterfaceId;
        return this;
    }
    public String getRouterInterfaceId() {
        return this.routerInterfaceId;
    }

}
