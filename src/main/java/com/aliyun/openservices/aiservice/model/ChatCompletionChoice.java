package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

public class ChatCompletionChoice {

    @SerializedName("index")
    private Integer index = null;


    @SerializedName("text")
    private String text = null;

    @SerializedName("finish_reason")
    private String finishReason = null;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }
}
