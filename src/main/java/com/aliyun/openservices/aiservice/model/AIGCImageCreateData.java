package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

public class AIGCImageCreateData {
    @SerializedName("cost_time")
    private Float costTime = null;

    @SerializedName("image")
    private String image = null;

    public Float getCostTime() {
        return costTime;
    }

    public void setCostTime(Float costTime) {
        this.costTime = costTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
