// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeSnapshotsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("SnapshotLinkId")
    public String snapshotLinkId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SnapshotIds")
    public String snapshotIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SnapshotName")
    public String snapshotName;

    @NameInMap("Status")
    public String status;

    @NameInMap("SnapshotType")
    public String snapshotType;

    @NameInMap("Filter")
    public java.util.List<DescribeSnapshotsRequestFilter> filter;

    @NameInMap("Usage")
    public String usage;

    @NameInMap("SourceDiskType")
    public String sourceDiskType;

    @NameInMap("Tag")
    public java.util.List<DescribeSnapshotsRequestTag> tag;

    @NameInMap("Encrypted")
    public Boolean encrypted;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("KMSKeyId")
    public String KMSKeyId;

    @NameInMap("Category")
    public String category;

    public static DescribeSnapshotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSnapshotsRequest self = new DescribeSnapshotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSnapshotsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSnapshotsRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public DescribeSnapshotsRequest setSnapshotLinkId(String snapshotLinkId) {
        this.snapshotLinkId = snapshotLinkId;
        return this;
    }
    public String getSnapshotLinkId() {
        return this.snapshotLinkId;
    }

    public DescribeSnapshotsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSnapshotsRequest setSnapshotIds(String snapshotIds) {
        this.snapshotIds = snapshotIds;
        return this;
    }
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    public DescribeSnapshotsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSnapshotsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSnapshotsRequest setSnapshotName(String snapshotName) {
        this.snapshotName = snapshotName;
        return this;
    }
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public DescribeSnapshotsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSnapshotsRequest setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    public String getSnapshotType() {
        return this.snapshotType;
    }

    public DescribeSnapshotsRequest setFilter(java.util.List<DescribeSnapshotsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeSnapshotsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeSnapshotsRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

    public DescribeSnapshotsRequest setSourceDiskType(String sourceDiskType) {
        this.sourceDiskType = sourceDiskType;
        return this;
    }
    public String getSourceDiskType() {
        return this.sourceDiskType;
    }

    public DescribeSnapshotsRequest setTag(java.util.List<DescribeSnapshotsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSnapshotsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeSnapshotsRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public DescribeSnapshotsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSnapshotsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeSnapshotsRequest setKMSKeyId(String KMSKeyId) {
        this.KMSKeyId = KMSKeyId;
        return this;
    }
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    public DescribeSnapshotsRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public static class DescribeSnapshotsRequestFilter extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSnapshotsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestFilter self = new DescribeSnapshotsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSnapshotsRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeSnapshotsRequestTag extends TeaModel {
        @NameInMap("value")
        public String value;

        @NameInMap("key")
        public String key;

        public static DescribeSnapshotsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSnapshotsRequestTag self = new DescribeSnapshotsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSnapshotsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSnapshotsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
