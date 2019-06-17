package com.yi.druid.controller;

import com.yi.druid.model.Baike;
import com.yi.druid.model.BaikeExample;
import com.yi.druid.service.BaikeService;
import com.yi.druid.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 百科接口
 *
 * @author YI
 * @date 2019年6月16日
 */
@RestController
public class BaikeController {
    @Autowired
    BaikeService baikeService;


    @RequestMapping(value = "/selectByExample", method = RequestMethod.POST)
    public MessageResult selectByExample(){
        BaikeExample example = new BaikeExample();
        BaikeExample.Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo("海明威");

        List<Baike> baikes = baikeService.selectByExample(example);

        return MessageResult.ok(baikes);
    }


    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    public MessageResult selectById(){


        Baike baike = baikeService.selectByPrimaryKey(1L);

        return MessageResult.ok(baike);
    }


    @RequestMapping(value = "/getBaike", method = RequestMethod.POST)
    public MessageResult getBaike(String name){

        return MessageResult.ok(name);
    }
}
