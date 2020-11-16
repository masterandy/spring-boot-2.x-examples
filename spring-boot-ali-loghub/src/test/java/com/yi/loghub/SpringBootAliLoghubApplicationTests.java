package com.yi.loghub;

import com.alibaba.fastjson.JSONObject;
import com.aliyun.openservices.log.response.PutLogsResponse;
import com.github.hwywl.config.Loglevel;
import com.github.hwywl.service.LogHubService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class SpringBootAliLoghubApplicationTests {

    /**
     * 通过map使得日志key-value配对分开
     */
    @Test
    void test01() {
        Map<String, String> map = new HashMap<>();
        map.put("send_server_id", "11");
        map.put("receive_server_id", "1");
        map.put("chat_type", "私聊");
        map.put("open_id", "rfikaseoioire98weio3966666");

        PutLogsResponse putLogsResponse = LogHubService.create().pushLogHub(map);
    }

    /**
     * 通过批量map使得日志key-value配对分开
     */
    @Test
    void test02() {
        List<Map<String, String>> batch = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("send_server_id", "11");
        map.put("receive_server_id", "1");
        map.put("chat_type", "私聊");
        map.put("open_id", "rfikaseoioire98weio3966666");

        batch.add(map);

        PutLogsResponse putLogsResponse = LogHubService.create().pushLogHubBatch(batch);
    }

    /**
     * 上报字符串数据
     */
    @Test
    void test03() {
        String val = "锄禾日当午，汗滴禾下土谁知盘中餐，粒粒皆辛苦。。";

        LogHubService.create().pushLogHub("log", val);
    }

    /**
     * 批量上报字符串数据
     */
    @Test
    void test04() {
        List<String> vals = new ArrayList<>();
        vals.add("锄禾日当午，汗滴禾下土。");
        vals.add("谁知盘中餐，粒粒皆辛苦。");

        LogHubService.create().source("app").topic("android").pushLogHubListBatch("log", vals);
    }

    /**
     * 上报异常日志
     */
    @Test
    void test05() {
        String text = "{\"open_id\":\"rfikaseoioire98weio3966666\",\"platform_id\":11,\"app_id\":11}";

        JSONObject jsonObject = JSONObject.parseObject(text);
        try {
            Integer openId = (Integer) jsonObject.get("open_id");
        } catch (Exception e) {
            LogHubService.create()
                    .source("app")
                    .topic("android")
                    .pushLogHub(null, Loglevel.ERROR, text, e);

            e.printStackTrace();
        }
    }

}
