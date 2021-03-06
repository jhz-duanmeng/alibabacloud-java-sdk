// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlAuditRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("DbName")
    @Validation(required = true)
    public String dbName;

    @NameInMap("IsRecall")
    public Boolean isRecall;

    @NameInMap("RecallStartTimestamp")
    public String recallStartTimestamp;

    @NameInMap("RecallEndTimestamp")
    public String recallEndTimestamp;

    public static EnableSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditRequest self = new EnableSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public EnableSqlAuditRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public EnableSqlAuditRequest setIsRecall(Boolean isRecall) {
        this.isRecall = isRecall;
        return this;
    }
    public Boolean getIsRecall() {
        return this.isRecall;
    }

    public EnableSqlAuditRequest setRecallStartTimestamp(String recallStartTimestamp) {
        this.recallStartTimestamp = recallStartTimestamp;
        return this;
    }
    public String getRecallStartTimestamp() {
        return this.recallStartTimestamp;
    }

    public EnableSqlAuditRequest setRecallEndTimestamp(String recallEndTimestamp) {
        this.recallEndTimestamp = recallEndTimestamp;
        return this;
    }
    public String getRecallEndTimestamp() {
        return this.recallEndTimestamp;
    }

}
