package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class AIGCImageCheckData {
    @SerializedName("request_id")
    private String requestId = null;

    @SerializedName("images")
    private List<String> images = null;

    @SerializedName("cost_time")
    private Double costTime = null;

    @SerializedName("check_results")
    private List<AIGCImageCheckResult> checkResults = null;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public Double getCostTime() {
        return costTime;
    }

    public void setCostTime(Double costTime) {
        this.costTime = costTime;
    }

    public List<AIGCImageCheckResult> getCheckResults() {
        return checkResults;
    }

    public void setCheckResults(List<AIGCImageCheckResult> checkResults) {
        this.checkResults = checkResults;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AIGCImageCheckData that = (AIGCImageCheckData) o;
        return Objects.equals(requestId, that.requestId) && Objects.equals(images, that.images) && Objects.equals(costTime, that.costTime) && Objects.equals(checkResults, that.checkResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, images, costTime, checkResults);
    }

    @Override
    public String toString() {
        return "AIGCImageCheckData{" +
                "requestId='" + requestId + '\'' +
                ", images=" + images +
                ", costTime=" + costTime +
                ", checkResults=" + checkResults +
                '}';
    }



}
