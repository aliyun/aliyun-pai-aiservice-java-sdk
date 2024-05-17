package com.aliyun.openservices.aiservice.model;

import com.google.gson.annotations.SerializedName;

public class ChatMessagePartJson {
    @SerializedName("question")
    private String question;

    @SerializedName("answer")
    private String answer;

    @SerializedName("answer1")
    private String answer1;

    @SerializedName("answer2")
    private String answer2;

    @SerializedName("scene")
    private String scene;

    @SerializedName("scene_desc")
    private String sceneDesc;

    @SerializedName("metric")
    private String metric;

    @SerializedName("max_score")
    private String maxScore;

    @SerializedName("score_desc")
    private String scoreDesc;

    @SerializedName("ref_answer")
    private String refAnswer;

    @SerializedName("steps")
    private String steps;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getSceneDesc() {
        return sceneDesc;
    }

    public void setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(String maxScore) {
        this.maxScore = maxScore;
    }

    public String getScoreDesc() {
        return scoreDesc;
    }

    public void setScoreDesc(String scoreDesc) {
        this.scoreDesc = scoreDesc;
    }

    public String getRefAnswer() {
        return refAnswer;
    }

    public void setRefAnswer(String refAnswer) {
        this.refAnswer = refAnswer;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public ChatMessagePartJson question(String question) {
        this.question = question;
        return this;
    }

    public ChatMessagePartJson answer(String answer) {
        this.answer = answer;
        return this;
    }

    public ChatMessagePartJson answer1(String answer1) {
        this.answer1 = answer1;
        return this;
    }

    public ChatMessagePartJson answer2(String answer2) {
        this.answer2 = answer2;
        return this;
    }

    public ChatMessagePartJson scene(String scene) {
        this.scene = scene;
        return this;
    }

    public ChatMessagePartJson sceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }

    public ChatMessagePartJson metric(String metric) {
        this.metric = metric;
        return this;
    }

    public ChatMessagePartJson maxScore(String maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    public ChatMessagePartJson scoreDesc(String scoreDesc) {
        this.scoreDesc = scoreDesc;
        return this;
    }

    public ChatMessagePartJson refAnswer(String refAnswer) {
        this.refAnswer = refAnswer;
        return this;
    }

    public ChatMessagePartJson steps(String steps) {
        this.steps = steps;
        return this;
    }
}
