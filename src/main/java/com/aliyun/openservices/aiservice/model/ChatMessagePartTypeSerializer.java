package com.aliyun.openservices.aiservice.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class ChatMessagePartTypeSerializer implements JsonSerializer<ChatMessagePart.ChatMessagePartType> {
    @Override
    public JsonElement serialize(ChatMessagePart.ChatMessagePartType src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.getType());
    }
}