// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeFirstDrdsInstanceByOrderIdRequest extends TeaModel {
    @NameInMap("OrderId")
    @Validation(required = true)
    public String orderId;

    public static DescribeFirstDrdsInstanceByOrderIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFirstDrdsInstanceByOrderIdRequest self = new DescribeFirstDrdsInstanceByOrderIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFirstDrdsInstanceByOrderIdRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
