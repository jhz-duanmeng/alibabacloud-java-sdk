// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTableRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    @NameInMap("OutputFormat")
    @Validation(required = true)
    public String outputFormat;

    @NameInMap("UseFinanceModel")
    @Validation(required = true)
    public Boolean useFinanceModel;

    @NameInMap("AssureDirection")
    @Validation(required = true)
    public Boolean assureDirection;

    @NameInMap("HasLine")
    @Validation(required = true)
    public Boolean hasLine;

    @NameInMap("SkipDetection")
    @Validation(required = true)
    public Boolean skipDetection;

    public static RecognizeTableRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableRequest self = new RecognizeTableRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTableRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeTableRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public RecognizeTableRequest setUseFinanceModel(Boolean useFinanceModel) {
        this.useFinanceModel = useFinanceModel;
        return this;
    }
    public Boolean getUseFinanceModel() {
        return this.useFinanceModel;
    }

    public RecognizeTableRequest setAssureDirection(Boolean assureDirection) {
        this.assureDirection = assureDirection;
        return this;
    }
    public Boolean getAssureDirection() {
        return this.assureDirection;
    }

    public RecognizeTableRequest setHasLine(Boolean hasLine) {
        this.hasLine = hasLine;
        return this;
    }
    public Boolean getHasLine() {
        return this.hasLine;
    }

    public RecognizeTableRequest setSkipDetection(Boolean skipDetection) {
        this.skipDetection = skipDetection;
        return this;
    }
    public Boolean getSkipDetection() {
        return this.skipDetection;
    }

}
