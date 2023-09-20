package com.aliyun.openservices.aiservice.api;

public class Constants {
    public static String appId = "";
    public static String token = "";
    public static String host = "";

    static {
        appId = System.getenv("AppId");
        token = System.getenv("Token");
        host = System.getenv("Host");
    }
}
