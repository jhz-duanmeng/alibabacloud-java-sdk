// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class EstablishRelationTableToBusinessRequest extends TeaModel {
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("BusinessId")
    @Validation(required = true)
    public String businessId;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("FolderId")
    public String folderId;

    public static EstablishRelationTableToBusinessRequest build(java.util.Map<String, ?> map) throws Exception {
        EstablishRelationTableToBusinessRequest self = new EstablishRelationTableToBusinessRequest();
        return TeaModel.build(map, self);
    }

    public EstablishRelationTableToBusinessRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public EstablishRelationTableToBusinessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public EstablishRelationTableToBusinessRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public EstablishRelationTableToBusinessRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public EstablishRelationTableToBusinessRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

}
