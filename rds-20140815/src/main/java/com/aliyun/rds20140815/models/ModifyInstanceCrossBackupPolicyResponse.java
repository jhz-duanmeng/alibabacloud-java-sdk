// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyInstanceCrossBackupPolicyResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 源实例地域ID，可以通过接口[DescribeRegions](~~26243~~)查看地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 跨地域备份的目的地域ID。; 
    @NameInMap("CrossBackupRegion")
    @Validation(required = true)
    public String crossBackupRegion;

    // description: 跨地域备份保存类型。默认值：**1**，表示每个备份都保存。; 
    @NameInMap("CrossBackupType")
    @Validation(required = true)
    public String crossBackupType;

    // description: 跨地域备份总开关，取值：* **0**：关闭；* **1**：开启。; 
    @NameInMap("BackupEnabled")
    @Validation(required = true)
    public String backupEnabled;

    // description: 跨地域日志备份开关，取值：* **0**：关闭；* **1**：开启。; 
    @NameInMap("LogBackupEnabled")
    @Validation(required = true)
    public String logBackupEnabled;

    // description: 跨地域备份保留方式。默认值：**1**，表示按时长保留。; 
    @NameInMap("RetentType")
    @Validation(required = true)
    public Integer retentType;

    // description: 跨地域备份保留天数，取值：**7~1825**。; 
    @NameInMap("Retention")
    @Validation(required = true)
    public Integer retention;

    public static ModifyInstanceCrossBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceCrossBackupPolicyResponse self = new ModifyInstanceCrossBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceCrossBackupPolicyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyInstanceCrossBackupPolicyResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyInstanceCrossBackupPolicyResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceCrossBackupPolicyResponse setCrossBackupRegion(String crossBackupRegion) {
        this.crossBackupRegion = crossBackupRegion;
        return this;
    }
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    public ModifyInstanceCrossBackupPolicyResponse setCrossBackupType(String crossBackupType) {
        this.crossBackupType = crossBackupType;
        return this;
    }
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    public ModifyInstanceCrossBackupPolicyResponse setBackupEnabled(String backupEnabled) {
        this.backupEnabled = backupEnabled;
        return this;
    }
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponse setLogBackupEnabled(String logBackupEnabled) {
        this.logBackupEnabled = logBackupEnabled;
        return this;
    }
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    public ModifyInstanceCrossBackupPolicyResponse setRetentType(Integer retentType) {
        this.retentType = retentType;
        return this;
    }
    public Integer getRetentType() {
        return this.retentType;
    }

    public ModifyInstanceCrossBackupPolicyResponse setRetention(Integer retention) {
        this.retention = retention;
        return this;
    }
    public Integer getRetention() {
        return this.retention;
    }

}
