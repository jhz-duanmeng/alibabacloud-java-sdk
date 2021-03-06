// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartBoardRecordRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("BoardId")
    @Validation(required = true)
    public String boardId;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    public static StartBoardRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StartBoardRecordRequest self = new StartBoardRecordRequest();
        return TeaModel.build(map, self);
    }

    public StartBoardRecordRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartBoardRecordRequest setBoardId(String boardId) {
        this.boardId = boardId;
        return this;
    }
    public String getBoardId() {
        return this.boardId;
    }

    public StartBoardRecordRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
