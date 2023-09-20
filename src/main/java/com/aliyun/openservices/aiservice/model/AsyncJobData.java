package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;
import java.util.Objects;

public class AsyncJobData {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("app_id")
    private String appId = null;

    @SerializedName("state")
    private Integer state = null;

    @SerializedName("message")
    private String message = null;

    @SerializedName("Result")
    private Object result = null;

    @SerializedName("request_id")
    private String requestId = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getResult() {
        return result;
    }

    public void setResult( Object result) {
        this.result = result;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsyncJobData that = (AsyncJobData) o;
        return Objects.equals(id, that.id) && Objects.equals(appId, that.appId) && Objects.equals(state, that.state) && Objects.equals(message, that.message) && Objects.equals(result, that.result) && Objects.equals(requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, appId, state, message, result, requestId);
    }

    @Override
    public String toString() {
        return "AsyncJobData{" +
                "id=" + id +
                ", appId='" + appId + '\'' +
                ", state=" + state +
                ", message='" + message + '\'' +
                ", result=" + result +
                ", requestId='" + requestId + '\'' +
                '}';
    }
}
