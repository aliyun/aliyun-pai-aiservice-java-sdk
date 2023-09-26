package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class AIGCImageCheckResult {
    @SerializedName("code")
    private Integer code = null;

    @SerializedName("frontal")
    private Boolean frontal = null;

    @SerializedName("url")
    private String url = null;

    @SerializedName("message")
    private String message = null;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getFrontal() {
        return frontal;
    }

    public void setFrontal(Boolean frontal) {
        this.frontal = frontal;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        AIGCImageCheckResult that = (AIGCImageCheckResult) o;
        return Objects.equals(code, that.code) && Objects.equals(frontal, that.frontal) && Objects.equals(url, that.url) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, frontal, url, message);
    }

    @Override
    public String toString() {
        return "AIGCImageCheckResult{" +
                "code=" + code +
                ", frontal=" + frontal +
                ", url='" + url + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
