package com.yi.druid.controller;

import cn.hutool.setting.dialect.Props;
import com.github.hwywl.antnest.annotation.decrypt.DESDecryptBody;
import com.github.hwywl.antnest.annotation.encrypt.DESEncryptBody;
import com.github.hwywl.antnest.annotation.init.GetProperties;
import com.github.hwywl.antnest.listener.GetPropertiesListener;
import com.yi.druid.model.Baike;
import com.yi.druid.model.BaikeExample;
import com.yi.druid.service.BaikeService;
import com.yi.druid.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        List<Baike> allBooks = new ArrayList<>();
        BaikeExample example = new BaikeExample();
        BaikeExample.Criteria criteria = example.createCriteria();

        criteria.andNameEqualTo("海明威");
        List<Baike> hBaikes = baikeService.selectByExample(example);

        criteria.andNameEqualTo("辰东");
        List<Baike> cBaikes = baikeService.selectByExample(example);

        criteria.andNameEqualTo("乱");
        List<Baike> lBaikes = baikeService.selectByExample(example);

        allBooks.addAll(hBaikes);
        allBooks.addAll(cBaikes);
        allBooks.addAll(lBaikes);

        return MessageResult.ok(allBooks);
    }


    @DESEncryptBody
    @RequestMapping(value = "/selectByIdEncrypt", method = RequestMethod.POST)
    @GetProperties(properties = {"d.properties", "c.properties"})
    public MessageResult selectByIdEncrypt(){


        Baike baike = baikeService.selectByPrimaryKey(1L);

        Map cachemap = GetPropertiesListener.CACHEMAP;
        System.out.println(cachemap.get("d.spring.datasource.username"));

        return MessageResult.ok(baike);
    }

    @DESDecryptBody
    @RequestMapping(value = "/selectByIdDecrypt", method = RequestMethod.GET)
    public MessageResult selectByIdDecrypt(@RequestBody String content){

        System.out.println(content);

        return MessageResult.ok(content);
    }


    @RequestMapping(value = "/getBaike", method = RequestMethod.POST)
    public MessageResult getBaike(String name){

        return MessageResult.ok(name);
    }
}
