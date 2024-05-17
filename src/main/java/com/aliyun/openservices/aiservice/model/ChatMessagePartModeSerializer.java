package com.aliyun.openservices.aiservice.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class ChatMessagePartModeSerializer implements JsonSerializer<ChatMessagePart.ChatMessagePartMode> {
    @Override
    public JsonElement serialize(ChatMessagePart.ChatMessagePartMode src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getMode());
    }
}