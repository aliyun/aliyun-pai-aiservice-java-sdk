package com.aliyun.openservices.aiservice.api;

import com.aliyun.openservices.aiservice.ApiClient;
import com.aliyun.openservices.aiservice.ApiException;
import com.aliyun.openservices.aiservice.model.AIGCImageCreateResponse;
import com.aliyun.openservices.aiservice.model.AIGCImageTrainResponse;
import com.aliyun.openservices.aiservice.model.AsyncJobResponse;
import com.aliyun.openservices.aiservice.model.AsyncJobState;

import java.util.Arrays;
import java.util.List;

public class AIGCImageTest {
    public static ApiClient apiClient;
    static {
        String host  = Constants.host;
        String appId = Constants.appId;
        String token = Constants.token;
         apiClient = new ApiClient(host, appId, token);
    }
    public static AigcImagesApi createApi() {
        return  new AigcImagesApi(apiClient);
    }
    public static AiServiceJobApi createJobApi() {
        return  new AiServiceJobApi(apiClient);
    }
    public static void main(String[] args) throws Exception {
        AigcImagesApi api = createApi();
        // 训练图片
        List<String> images = Arrays.asList("https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/1.jpg",
                "https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_images/foto/train/0.jpg");

        AIGCImageTrainResponse response = api.aigcImagesTrain(images);
        Integer jobId = response.getData().getJobId(); // 异步任务ID
        String modelId = response.getData().getModelId(); // 模型ID
        System.out.println("jobId:" + jobId);


        AiServiceJobApi jobApi = createJobApi();

        // 异步获取 job 状态
        while (true) {
            AsyncJobResponse jobResponse = jobApi.getAsyncJob(jobId);
            if (jobResponse.getData().get("job").getState() == AsyncJobState.JOB_STATE_WAIT) { // job running
                System.out.println("job running");
            } else if (jobResponse.getData().get("job").getState() == AsyncJobState.JOB_STATE_SUCCESS) {
                System.out.println("job success");
                System.out.println(jobResponse);
                break;
            } else {
                System.out.println("job fail");
                System.out.println(jobResponse);
                throw  new Exception("job fail");
            }

            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        String templateImage = "https://pai-aigc-photog-bj.oss-cn-beijing.aliyuncs.com/photog/user_weights/foto10/validation/global_step_Blue_1_100_0.jpg";
        AIGCImageCreateResponse createResponse = api.aigcImagesCreate(modelId, templateImage);

        System.out.println(createResponse);
        // 生成图片的 base64
        System.out.println(createResponse.getData().getImage());


    }
}
