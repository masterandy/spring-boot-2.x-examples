package com.yi.redshift;

import com.alibaba.fastjson.JSONObject;
import com.yi.redshift.mapper.BaikeMapper;
import com.yi.redshift.model.Baike;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringBootRedshiftApplicationTests {
    @Autowired
    BaikeMapper baikeMapper;

    @Test
    void insertSelective() {
        List<String> list1 = new ArrayList<>();
        list1.add("文学");
        list1.add("小说");
        String tag1 = JSONObject.toJSONString(list1);
        Baike baike1 = new Baike(1,"老人与海", tag1, 1000, 10, "海明威", "男", 100);

        List<String> list2 = new ArrayList<>();
        list2.add("魔幻");
        list2.add("小说");
        String tag2 = JSONObject.toJSONString(list2);
        Baike baike2 = new Baike(2,"全职法师", tag2, 1000000, 5, "乱", "男", 1000);

        baikeMapper.insertBaike(baike1);
        baikeMapper.insertBaike(baike2);
    }

    @Test
    void selectByPrimaryBook() {
        List<Baike> baike = baikeMapper.selectListBySQL("全职法师");

        System.out.println(baike);
    }

    @Test
    void selectByPrimaryKey() {
        Baike baike = baikeMapper.selectById(2);
        System.out.println(baike);
    }

    @Test
    void updateByPrimaryKeySelective() {
        Baike baike = new Baike();
        baike.setId(1);
        baike.setGood(600);
        baike.setUpdateDate(new Date());

        baikeMapper.updateBaike(baike);
    }

    @Test
    void deleteByPrimaryKey() {
        int delete = baikeMapper.deleteById(1);
        System.out.println(delete);
    }
}
