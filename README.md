# aliyun-pai-aiservice-java-sdk 
AlibabaCloud PAI-AIService Java  SDK.

English | [简体中文](./README_zh-CN.md)

[Multi-Media Analysis Doc](https://www.alibabacloud.com/help/en/pai/user-guide/multimedia-analysis)

[AI-Portraits](https://help.aliyun.com/zh/pai/user-guide/overview-of-ai-portraits?spm=a2c4g.11174283.0.0.34165e0fdiZgrH)

## How to install

```
<dependency>
  <groupId>com.aliyun.openservices.aiservice</groupId>
  <artifactId>aiservice-sdk</artifactId>
  <version>1.0.4</version>
</dependency>
```


## How to use

AI-Portraits Training Demo [AIGCImageTest](src/test/java/com/aliyun/openservices/aiservice/api/AIGCImageTest.java)

AI-Portraits Producing Demo [AigcImagesApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AigcImagesApiTest.java)

Multi-Media Analysis Image Interface Demo [AiServiceImageApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceImageApiTest.java)

Multi-Media Analysis Video Interface Demo [AiServiceVideoApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceVideoApiTest.java)

LLM-Eval Judger Interface Demo  [AiServiceLlmApiTest](src/test/java/com/aliyun/openservices/aiservice/api/AiServiceLlmApiTest.java)

## Release Notes
### 1.0.4 (2024-05-31)
* Adjusted the LLM judge model request format 
 
### 1.0.3 (2024-05-17)
* Added Request Method for LLM Referee Model
 
### 1.0.2 (2024-04-02)
* Added LLM Referee Model