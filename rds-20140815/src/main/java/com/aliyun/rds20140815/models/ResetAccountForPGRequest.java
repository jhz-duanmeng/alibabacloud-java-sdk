// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ResetAccountForPGRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("AccountPassword")
    @Validation(required = true)
    public String accountPassword;

    public static ResetAccountForPGRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAccountForPGRequest self = new ResetAccountForPGRequest();
        return TeaModel.build(map, self);
    }

    public ResetAccountForPGRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ResetAccountForPGRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ResetAccountForPGRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

}
