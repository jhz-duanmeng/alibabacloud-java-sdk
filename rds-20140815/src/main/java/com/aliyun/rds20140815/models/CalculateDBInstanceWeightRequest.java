// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CalculateDBInstanceWeightRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    public static CalculateDBInstanceWeightRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateDBInstanceWeightRequest self = new CalculateDBInstanceWeightRequest();
        return TeaModel.build(map, self);
    }

    public CalculateDBInstanceWeightRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

}
