package com.aliyun.openservices.aiservice.model;

import java.util.ArrayList;
import java.util.List;

public class ChatCompletionRequest {
    private String model = null;

    private List<ChatCompletionMessage> messages = new ArrayList<>();

    public ChatCompletionRequest(String model) {
        this.model = model;
    }

    public void addChatCompletionMessage(ChatCompletionMessage message) {
        this.messages.add(message);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<ChatCompletionMessage> getMessages() {
        return messages;
    }

    public void setMessages(List<ChatCompletionMessage> messages) {
        this.messages = messages;
    }
}
