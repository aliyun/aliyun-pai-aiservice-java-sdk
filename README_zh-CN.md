# aliyun-pai-aiservice-java-sdk 
阿里云 PAI-AIService 服务的 java  SDK.

[English](./README.md) | 简体中文

[多媒体分析文档](https://help.aliyun.com/zh/pai/user-guide/multimedia-analysis?spm=a2c4g.11186623.0.0.31a419d5APYtKi)

[AI写真文档](https://help.aliyun.com/zh/pai/user-guide/overview-of-ai-portraits?spm=a2c4g.11174283.0.0.34165e0fdiZgrH)

## 安装

```
<dependency>
  <groupId>com.aliyun.openservices.aiservice</groupId>
  <artifactId>aiservice-sdk</artifactId>
  <version>1.0.4</version>
</dependency>
```


## 使用方式

AI 写真训练，写真制作查看 [AIGCImageTest](src/test/java/com/aliyun/openservices/aiservice/api/AIGCImageTest.java)

AI 写真训练，制作相关接口查看 [AigcImagesApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AigcImagesApiTest.java)

多媒体分析图片接口查看  [AiServiceImageApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceImageApiTest.java)

多媒体分析视频接口查看  [AiServiceVideoApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceVideoApiTest.java)

LLM裁判员模型接口查看  [AiServiceLlmApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceLlmApiTest.java)

## 版本说明
### 1.0.4 (2024-05-31)
* 调整 LLM 裁判员模型请求格式
 
### 1.0.3 (2024-05-17)
* 增加 LLM 裁判员模型请求方式
 
### 1.0.2 (2024-04-02)
* 增加 LLM 裁判员模型

