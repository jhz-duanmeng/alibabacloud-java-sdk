// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveASRConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    @NameInMap("MnsTopic")
    public String mnsTopic;

    @NameInMap("MnsRegion")
    public String mnsRegion;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("HttpCallbackURL")
    public String httpCallbackURL;

    public static AddLiveASRConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveASRConfigRequest self = new AddLiveASRConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveASRConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AddLiveASRConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddLiveASRConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public AddLiveASRConfigRequest setMnsTopic(String mnsTopic) {
        this.mnsTopic = mnsTopic;
        return this;
    }
    public String getMnsTopic() {
        return this.mnsTopic;
    }

    public AddLiveASRConfigRequest setMnsRegion(String mnsRegion) {
        this.mnsRegion = mnsRegion;
        return this;
    }
    public String getMnsRegion() {
        return this.mnsRegion;
    }

    public AddLiveASRConfigRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public AddLiveASRConfigRequest setHttpCallbackURL(String httpCallbackURL) {
        this.httpCallbackURL = httpCallbackURL;
        return this;
    }
    public String getHttpCallbackURL() {
        return this.httpCallbackURL;
    }

}
