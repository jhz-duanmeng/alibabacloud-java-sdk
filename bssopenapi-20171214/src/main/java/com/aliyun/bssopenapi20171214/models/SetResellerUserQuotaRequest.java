// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SetResellerUserQuotaRequest extends TeaModel {
    @NameInMap("Amount")
    @Validation(required = true)
    public String amount;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("OutBizId")
    public String outBizId;

    public static SetResellerUserQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetResellerUserQuotaRequest self = new SetResellerUserQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetResellerUserQuotaRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public SetResellerUserQuotaRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SetResellerUserQuotaRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

}
