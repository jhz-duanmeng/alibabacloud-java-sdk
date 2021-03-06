// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryBestSession4ItemsShrinkRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("LmItemIds")
    public String lmItemIdsShrink;

    @NameInMap("ItemIds")
    public String itemIdsShrink;

    public static QueryBestSession4ItemsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBestSession4ItemsShrinkRequest self = new QueryBestSession4ItemsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryBestSession4ItemsShrinkRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryBestSession4ItemsShrinkRequest setLmItemIdsShrink(String lmItemIdsShrink) {
        this.lmItemIdsShrink = lmItemIdsShrink;
        return this;
    }
    public String getLmItemIdsShrink() {
        return this.lmItemIdsShrink;
    }

    public QueryBestSession4ItemsShrinkRequest setItemIdsShrink(String itemIdsShrink) {
        this.itemIdsShrink = itemIdsShrink;
        return this;
    }
    public String getItemIdsShrink() {
        return this.itemIdsShrink;
    }

}
