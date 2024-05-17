package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatCompletionMessage {
    @SerializedName("role")
    private String role = null;

    @SerializedName("content")
    private String content = null;

    @SerializedName("multiContent")
    private List<ChatMessagePart> multiContent = null;

    public ChatCompletionMessage role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     * @return role
     **/
    @Schema(example = "user", description = "")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ChatCompletionMessage content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     **/
    @Schema(example = "请介绍下你自己", description = "")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<ChatMessagePart> getMultiContent() {
        return multiContent;
    }

    public void setMultiContent(List<ChatMessagePart> multiContent) {
        this.multiContent = multiContent;
    }

    public ChatCompletionMessage multiContent(List<ChatMessagePart> multiContent) {
        this.multiContent = multiContent;
        return this;
    }

    public ChatCompletionMessage addChatMessagePart(ChatMessagePart chatMessagePart) {
        if (null == multiContent) {
            multiContent = new ArrayList<ChatMessagePart>();
        }
        this.multiContent.add(chatMessagePart);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChatCompletionMessage chatCompletionMessage = (ChatCompletionMessage) o;
        return Objects.equals(this.role, chatCompletionMessage.role) &&
                Objects.equals(this.content, chatCompletionMessage.content) &&
                Objects.equals(this.multiContent, chatCompletionMessage.multiContent)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, content, multiContent);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LLMEvalJudgerRequestMessages {\n");

        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    multicontent: ").append(toIndentedString(multiContent)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public void preprocessor() {
        if (null != multiContent && null != content) {
            throw  new RuntimeException("can't use both Content and MultiContent properties simultaneously");
        }

        if (null != multiContent && multiContent.size() > 0) {
            for (ChatMessagePart chatMessagePart : multiContent) {
                chatMessagePart.preprocessor();
            }
        }
    }
}
