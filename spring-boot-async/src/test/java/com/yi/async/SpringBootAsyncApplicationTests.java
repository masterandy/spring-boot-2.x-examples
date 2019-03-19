package com.yi.async;

import cn.hutool.json.JSONUtil;
import com.yi.async.model.Baike;
import com.yi.async.service.BaikeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAsyncApplicationTests {

    @Autowired
    private BaikeService baikeService;

    @Test
    public void test1() {
        List<String> list1 = new ArrayList<>();
        list1.add("魔幻");
        list1.add("小说");
        String tag1 = JSONUtil.toJsonStr(list1);
        Baike baike1 = new Baike("遮天", tag1, 661000, 11, "辰东", "男", 100, Byte.valueOf("1"));

        List<String> list2 = new ArrayList<>();
        list2.add("文学");
        list2.add("小说");
        String tag2 = JSONUtil.toJsonStr(list2);
        Baike baike2 = new Baike("红楼梦", tag2, 900880, 22, "曹雪芹", "女", 1000, Byte.valueOf("1"));

        Future<Integer> save1 = baikeService.save(baike1);
        Future<Integer> save2 = baikeService.save(baike2);

        System.out.println(save1);
        System.out.println(save2);
    }

}
