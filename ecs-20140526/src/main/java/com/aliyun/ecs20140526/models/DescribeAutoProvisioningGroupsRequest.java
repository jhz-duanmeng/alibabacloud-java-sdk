// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeAutoProvisioningGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AutoProvisioningGroupName")
    public String autoProvisioningGroupName;

    @NameInMap("AutoProvisioningGroupId")
    public java.util.List<String> autoProvisioningGroupId;

    @NameInMap("AutoProvisioningGroupStatus")
    public java.util.List<String> autoProvisioningGroupStatus;

    public static DescribeAutoProvisioningGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoProvisioningGroupsRequest self = new DescribeAutoProvisioningGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAutoProvisioningGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAutoProvisioningGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAutoProvisioningGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupName(String autoProvisioningGroupName) {
        this.autoProvisioningGroupName = autoProvisioningGroupName;
        return this;
    }
    public String getAutoProvisioningGroupName() {
        return this.autoProvisioningGroupName;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupId(java.util.List<String> autoProvisioningGroupId) {
        this.autoProvisioningGroupId = autoProvisioningGroupId;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupId() {
        return this.autoProvisioningGroupId;
    }

    public DescribeAutoProvisioningGroupsRequest setAutoProvisioningGroupStatus(java.util.List<String> autoProvisioningGroupStatus) {
        this.autoProvisioningGroupStatus = autoProvisioningGroupStatus;
        return this;
    }
    public java.util.List<String> getAutoProvisioningGroupStatus() {
        return this.autoProvisioningGroupStatus;
    }

}
