package com.aliyun.openservices.aiservice.api;


import com.aliyun.openservices.aiservice.ApiCallback;
import com.aliyun.openservices.aiservice.ApiClient;
import com.aliyun.openservices.aiservice.ApiException;
import com.aliyun.openservices.aiservice.ApiResponse;
import com.aliyun.openservices.aiservice.Configuration;
import com.aliyun.openservices.aiservice.Pair;
import com.aliyun.openservices.aiservice.ProgressRequestBody;
import com.aliyun.openservices.aiservice.ProgressResponseBody;
import com.aliyun.openservices.aiservice.model.LLMEvalJudgerRequest;
import com.aliyun.openservices.aiservice.model.LLMEvalJudgerRequestMessages;
import com.aliyun.openservices.aiservice.model.LLMEvalJudgerResponse;
import com.aliyun.openservices.aiservice.model.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AiServiceLlmApi {
    private ApiClient apiClient;

    private Gson gson = new Gson();
    private Type llmEvalJudgerRequestMessagesType = new TypeToken<List<LLMEvalJudgerRequestMessages>>(){}.getType();
    public AiServiceLlmApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AiServiceLlmApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for llmEvalJudgerPost
     * @param body llm eval judger body (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call llmEvalJudgerPostCall(LLMEvalJudgerRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v1/llm/eval_judger";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "auth", "requestTime" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call llmEvalJudgerPostValidateBeforeCall(LLMEvalJudgerRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling llmEvalJudgerPost(Async)");
        }
        
        com.squareup.okhttp.Call call = llmEvalJudgerPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     *
     * 裁判员模型服务
     * @param chatCompletionRequest
     * @return
     */
    /**
    public LLMEvalJudgerResponse llmEvalJudger(ChatCompletionRequest chatCompletionRequest) throws ApiException {
        return this.llmEvalJudger(chatCompletionRequest, "");
    }
     **/

    public LLMEvalJudgerResponse create(String model, String judgerRequestbody ) throws ApiException {
        return this.create(model, judgerRequestbody, null);
    }

    public LLMEvalJudgerResponse create(String model, String judgerRequestbody, String modelName) throws ApiException {
        List<LLMEvalJudgerRequestMessages> messages = gson.fromJson(judgerRequestbody, llmEvalJudgerRequestMessagesType);

        LLMEvalJudgerRequest llmEvalJudgerRequest = new LLMEvalJudgerRequest();
        llmEvalJudgerRequest.setAction("LLMEvalJudger");
        llmEvalJudgerRequest.setModel(model);
        llmEvalJudgerRequest.setModelName(modelName);
        llmEvalJudgerRequest.setMessages(messages);

        return this.llmEvalJudgerPost(llmEvalJudgerRequest);
    }

    /**
    public LLMEvalJudgerResponse llmEvalJudger(ChatCompletionRequest chatCompletionRequest, String modelName) throws ApiException {
        LLMEvalJudgerRequest llmEvalJudgerRequest = new LLMEvalJudgerRequest();
        llmEvalJudgerRequest.setAction("LLMEvalJudger");
        llmEvalJudgerRequest.setModelName(modelName);
        llmEvalJudgerRequest.setModel(chatCompletionRequest.getModel());

        List<LLMEvalJudgerRequestMessages>  messagesList = new ArrayList<>(chatCompletionRequest.getMessages().size());

        for (ChatCompletionMessage message : chatCompletionRequest.getMessages()) {
            message.preprocessor();
            LLMEvalJudgerRequestMessages llmEvalJudgerRequestMessages = new LLMEvalJudgerRequestMessages();
            llmEvalJudgerRequestMessages.role(message.getRole());
            if (message.getMultiContent() != null) {
                llmEvalJudgerRequestMessages.setContent(message.getMultiContent());
            } else if (message.getContent() != null) {
                llmEvalJudgerRequestMessages.setContent(message.getContent());
            }
            messagesList.add(llmEvalJudgerRequestMessages);
        }
        llmEvalJudgerRequest.setMessages(messagesList);

        return this.llmEvalJudgerPost(llmEvalJudgerRequest);
    }
     **/

    /**
     * 裁判员模型服务
     * 
     * @param body llm eval judger body (required)
     * @return Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LLMEvalJudgerResponse llmEvalJudgerPost(LLMEvalJudgerRequest body) throws ApiException {
        ApiResponse<LLMEvalJudgerResponse> resp = llmEvalJudgerPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 裁判员模型服务
     * 
     * @param body llm eval judger body (required)
     * @return ApiResponse&lt;Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LLMEvalJudgerResponse> llmEvalJudgerPostWithHttpInfo(LLMEvalJudgerRequest body) throws ApiException {
        com.squareup.okhttp.Call call = llmEvalJudgerPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LLMEvalJudgerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 裁判员模型服务 (asynchronously)
     * 
     * @param body llm eval judger body (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call llmEvalJudgerPostAsync(LLMEvalJudgerRequest body, final ApiCallback<Response> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = llmEvalJudgerPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
