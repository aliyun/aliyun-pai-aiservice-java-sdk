package com.aliyun.openservices.aiservice.model;

import com.aliyun.openservices.aiservice.StringUtil;
import com.google.gson.annotations.SerializedName;

public class ChatMessagePart {

    @SerializedName("type")
    private ChatMessagePartType type  = null;

    @SerializedName("mode")
    private ChatMessagePartMode mode = null;

    @SerializedName("json")
    private ChatMessagePartJson json = new ChatMessagePartJson();

    public void preprocessor() {
        if (null == type) {
            type = ChatMessagePartType.JSON;
        }
        if (StringUtil.isEmpty(json.getAnswer())) {
            if (StringUtil.isEmpty(json.getAnswer1()) && StringUtil.isEmpty(json.getAnswer2())) {
                throw  new RuntimeException("answer field missing");
            } else if (StringUtil.isEmpty(json.getAnswer1())) {
                throw  new RuntimeException("answer1 field missing");
            } else if (StringUtil.isEmpty(json.getAnswer2())) {
                throw  new RuntimeException("answer2 field missing");
            }
        }

        if (null == mode) {
            if (!StringUtil.isEmpty(json.getAnswer())) {
                mode = ChatMessagePartMode.ChatMessagePartModeSingle;
            } else if (!StringUtil.isEmpty(json.getAnswer1()) && !StringUtil.isEmpty(json.getAnswer2())){
                mode = ChatMessagePartMode.ChatMessagePartModePair;
            }
        }
    }

     public enum ChatMessagePartType {
        JSON("json");
        private final String type;

        ChatMessagePartType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        }

    public enum ChatMessagePartMode {
        ChatMessagePartModePair("pairwise"),
        ChatMessagePartModeSingle("single");
        private final String mode;
        ChatMessagePartMode(String mode) {
            this.mode = mode;
        }

        public String getMode() {
            return mode;
        }
    }

    public ChatMessagePartType getType() {
        return type;
    }
    public void setType(ChatMessagePartType type) {
        this.type = type;
    }
    public ChatMessagePartMode getMode() {
        return mode;
    }
    public void setMode(ChatMessagePartMode mode) {
        this.mode = mode;
    }
    public ChatMessagePartJson getJson() {
        return json;
    }
    public void setJson(ChatMessagePartJson json) {
        this.json = json;
    }

}



