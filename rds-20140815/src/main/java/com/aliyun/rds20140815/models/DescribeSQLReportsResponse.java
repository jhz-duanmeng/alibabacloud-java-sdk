// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeSQLReportsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalRecordCount")
    @Validation(required = true)
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    @Validation(required = true)
    public Integer pageRecordCount;

    @NameInMap("Items")
    @Validation(required = true)
    public DescribeSQLReportsResponseItems items;

    public static DescribeSQLReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLReportsResponse self = new DescribeSQLReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSQLReportsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLReportsResponse setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeSQLReportsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSQLReportsResponse setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeSQLReportsResponse setItems(DescribeSQLReportsResponseItems items) {
        this.items = items;
        return this;
    }
    public DescribeSQLReportsResponseItems getItems() {
        return this.items;
    }

    public static class DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("AvgLatency")
        @Validation(required = true)
        public Long avgLatency;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem self = new DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem setAvgLatency(Long avgLatency) {
            this.avgLatency = avgLatency;
            return this;
        }
        public Long getAvgLatency() {
            return this.avgLatency;
        }

        public DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLReportsResponseItemsItemLatencyTopNItems extends TeaModel {
        @NameInMap("LatencyTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem;

        public static DescribeSQLReportsResponseItemsItemLatencyTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemLatencyTopNItems self = new DescribeSQLReportsResponseItemsItemLatencyTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItemsItemLatencyTopNItems setLatencyTopNItem(java.util.List<DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem> latencyTopNItem) {
            this.latencyTopNItem = latencyTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseItemsItemLatencyTopNItemsLatencyTopNItem> getLatencyTopNItem() {
            return this.latencyTopNItem;
        }

    }

    public static class DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem extends TeaModel {
        @NameInMap("SQLText")
        @Validation(required = true)
        public String SQLText;

        @NameInMap("SQLExecuteTimes")
        @Validation(required = true)
        public Long SQLExecuteTimes;

        public static DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem self = new DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem setSQLText(String SQLText) {
            this.SQLText = SQLText;
            return this;
        }
        public String getSQLText() {
            return this.SQLText;
        }

        public DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem setSQLExecuteTimes(Long SQLExecuteTimes) {
            this.SQLExecuteTimes = SQLExecuteTimes;
            return this;
        }
        public Long getSQLExecuteTimes() {
            return this.SQLExecuteTimes;
        }

    }

    public static class DescribeSQLReportsResponseItemsItemQPSTopNItems extends TeaModel {
        @NameInMap("QPSTopNItem")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem;

        public static DescribeSQLReportsResponseItemsItemQPSTopNItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItemQPSTopNItems self = new DescribeSQLReportsResponseItemsItemQPSTopNItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItemsItemQPSTopNItems setQPSTopNItem(java.util.List<DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem> QPSTopNItem) {
            this.QPSTopNItem = QPSTopNItem;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseItemsItemQPSTopNItemsQPSTopNItem> getQPSTopNItem() {
            return this.QPSTopNItem;
        }

    }

    public static class DescribeSQLReportsResponseItemsItem extends TeaModel {
        @NameInMap("ReportTime")
        @Validation(required = true)
        public String reportTime;

        @NameInMap("LatencyTopNItems")
        @Validation(required = true)
        public DescribeSQLReportsResponseItemsItemLatencyTopNItems latencyTopNItems;

        @NameInMap("QPSTopNItems")
        @Validation(required = true)
        public DescribeSQLReportsResponseItemsItemQPSTopNItems QPSTopNItems;

        public static DescribeSQLReportsResponseItemsItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItemsItem self = new DescribeSQLReportsResponseItemsItem();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItemsItem setReportTime(String reportTime) {
            this.reportTime = reportTime;
            return this;
        }
        public String getReportTime() {
            return this.reportTime;
        }

        public DescribeSQLReportsResponseItemsItem setLatencyTopNItems(DescribeSQLReportsResponseItemsItemLatencyTopNItems latencyTopNItems) {
            this.latencyTopNItems = latencyTopNItems;
            return this;
        }
        public DescribeSQLReportsResponseItemsItemLatencyTopNItems getLatencyTopNItems() {
            return this.latencyTopNItems;
        }

        public DescribeSQLReportsResponseItemsItem setQPSTopNItems(DescribeSQLReportsResponseItemsItemQPSTopNItems QPSTopNItems) {
            this.QPSTopNItems = QPSTopNItems;
            return this;
        }
        public DescribeSQLReportsResponseItemsItemQPSTopNItems getQPSTopNItems() {
            return this.QPSTopNItems;
        }

    }

    public static class DescribeSQLReportsResponseItems extends TeaModel {
        @NameInMap("Item")
        @Validation(required = true)
        public java.util.List<DescribeSQLReportsResponseItemsItem> item;

        public static DescribeSQLReportsResponseItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSQLReportsResponseItems self = new DescribeSQLReportsResponseItems();
            return TeaModel.build(map, self);
        }

        public DescribeSQLReportsResponseItems setItem(java.util.List<DescribeSQLReportsResponseItemsItem> item) {
            this.item = item;
            return this;
        }
        public java.util.List<DescribeSQLReportsResponseItemsItem> getItem() {
            return this.item;
        }

    }

}
