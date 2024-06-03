package com.aliyun.openservices.aiservice.api;

import com.aliyun.openservices.aiservice.ApiClient;
import com.aliyun.openservices.aiservice.model.ChatCompletionChoice;
import com.aliyun.openservices.aiservice.model.ChatCompletionResponse;
import com.aliyun.openservices.aiservice.model.LLMEvalJudgerResponse;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


/**
 * API tests for AiServiceLlmApi
 */
@Ignore
public class AiServiceLlmApiTest {

    private  AiServiceLlmApi api;

    @Before
    public void createApi() {
        String host  = Constants.host;
        String appId = Constants.appId;
        String token = Constants.token;
        ApiClient apiClient = new ApiClient(host, appId, token);
        api = new AiServiceLlmApi(apiClient);
    }
    /**
     * 裁判员模型服务
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void llmEvalJudgerTest() throws Exception {

        String requestBody = "[\n" +
                "                {\n" +
                "                    \"role\": \"user\",\n" +
                "                    \"content\": [\n" +
                "                        {\n" +
                "                            \"mode\": \"pairwise\",\n" +
                "                            \"type\": \"json\",\n" +
                "                            \"json\": {\n" +
                "                                \"question\": \"请介绍下你自己\",\n" +
                "                                \"answer1\": \"我是一个人工智能助手，由 OpenAI 设计并开发，旨在帮助用户解答问题、提供信息、学习语言和执行各种语言处理任务。\",\n" +
                "                                \"answer2\": \"我是一个人工智能助手，设计用来回答问题、提供信息、助力解决问题，并在不同的领域与场景中辅助用户。\"\n" +
                "                            }\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            ]";

        LLMEvalJudgerResponse response = api.create("Themis-1.0", requestBody);

        System.out.println(response);

        ChatCompletionResponse chatCompletionResponse = response.getChatCompletionResponse();
        System.out.println(chatCompletionResponse.getId());
        System.out.println(chatCompletionResponse.getModel());

        for (ChatCompletionChoice chatCompletionChoice: chatCompletionResponse.getChoices()) {
            System.out.println(chatCompletionChoice.getIndex() + ":" + chatCompletionChoice.getText());
        }
    }
    @Test
    public void llmEvalJudgerMultiContentTest() throws Exception {
        String requestBody = "[\n" +
                "    {\n" +
                "        \"role\": \"user\",\n" +
                "        \"content\": [\n" +
                "            {\n" +
                "                \"type\": \"json\",\n" +
                "                \"mode\": \"single\",\n" +
                "                \"json\": {\n" +
                "                    \"question\": \"评价一下2021年的暴雪游戏公司\",\n" +
                "                    \"answer\": \"2021年对暴雪游戏公司来说是一个充满挑战和变化的一年。公司在这一年面临了一些负面的新闻和争议，比如员工抗议、性别歧视指控等，这些事件对公司声誉造成了一定影响。然而，暴雪游戏公司也在2021年发布了一些备受期待的游戏作品，比如《暗黑破坏神2：复仇》和《炉石传说》的新资料片等，这些作品受到了玩家们的欢迎和好评。总的来说，2021年对暴雪游戏公司来说是一个充满挑战和机遇并存的一年，希望他们能够在未来继续努力，重塑公司形象，为玩家们带来更多优秀的游戏作品。\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "]";


        LLMEvalJudgerResponse response = api.create("Themis-1.0", requestBody);

        System.out.println(response);

        ChatCompletionResponse chatCompletionResponse = response.getChatCompletionResponse();
        System.out.println(chatCompletionResponse.getId());
        System.out.println(chatCompletionResponse.getModel());

        for (ChatCompletionChoice chatCompletionChoice: chatCompletionResponse.getChoices()) {
            System.out.println(chatCompletionChoice.getIndex() + ":" + chatCompletionChoice.getText());
        }
    }
    @Test
    public void llmEvalJudgerTest2() throws Exception {
        String requestBody = "[\n" +
                "                {\"role\": \"assistant\", \"content\": \"你是一个人工智能助手\"},\n" +
                "                {\"role\": \"user\", \"content\": \"请介绍下你自己\"}\n" +
                "            ]";


        LLMEvalJudgerResponse response = api.create("Themis-1.0", requestBody);

        System.out.println(response);

        ChatCompletionResponse chatCompletionResponse = response.getChatCompletionResponse();
        System.out.println(chatCompletionResponse.getId());
        System.out.println(chatCompletionResponse.getModel());

        for (ChatCompletionChoice chatCompletionChoice: chatCompletionResponse.getChoices()) {
            System.out.println(chatCompletionChoice.getIndex() + ":" + chatCompletionChoice.getText());
        }
    }
}
