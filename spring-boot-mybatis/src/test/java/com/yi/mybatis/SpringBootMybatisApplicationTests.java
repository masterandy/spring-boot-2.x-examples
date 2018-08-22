package com.yi.mybatis;

import cn.hutool.json.JSONUtil;
import com.yi.mybatis.model.Baike;
import com.yi.mybatis.service.BaikeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {
    @Autowired
    BaikeService baikeService;

    @Test
    public void test1() {
        List<String> list1 = new ArrayList<>();
        list1.add("文学");
        list1.add("小说");
        String tag1 = JSONUtil.toJsonStr(list1);
        Baike baike1 = new Baike("老人与海", tag1, 1000, 10, "海明威", "男", 100);

        List<String> list2 = new ArrayList<>();
        list2.add("魔幻");
        list2.add("小说");
        String tag2 = JSONUtil.toJsonStr(list2);
        Baike baike2 = new Baike("全职法师", tag2, 1000000, 5, "乱", "男", 1000);

        baikeService.insertSelective(baike1);
        baikeService.insertSelective(baike2);
    }

}
