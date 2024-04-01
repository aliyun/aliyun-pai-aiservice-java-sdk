package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChatCompletionResponse {

    @SerializedName("id")
    private String id = null;

    @SerializedName("object")
    private String object = null;

    @SerializedName("created")
    private Long created = null;

    @SerializedName("model")
    private String model = null;

    @SerializedName("choices")
    private List<ChatCompletionChoice> choices = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatCompletionChoice> getChoices() {
        return choices;
    }

    public void setChoices(List<ChatCompletionChoice> choices) {
        this.choices = choices;
    }
}
