// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ConfigDBProxyService")
    @Validation(required = true)
    public String configDBProxyService;

    @NameInMap("DBProxyInstanceNum")
    public String DBProxyInstanceNum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static ModifyDBProxyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyRequest self = new ModifyDBProxyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyRequest setConfigDBProxyService(String configDBProxyService) {
        this.configDBProxyService = configDBProxyService;
        return this;
    }
    public String getConfigDBProxyService() {
        return this.configDBProxyService;
    }

    public ModifyDBProxyRequest setDBProxyInstanceNum(String DBProxyInstanceNum) {
        this.DBProxyInstanceNum = DBProxyInstanceNum;
        return this;
    }
    public String getDBProxyInstanceNum() {
        return this.DBProxyInstanceNum;
    }

    public ModifyDBProxyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public ModifyDBProxyRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBProxyRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
