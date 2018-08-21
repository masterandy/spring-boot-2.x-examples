package com.yi.solr.controller;

import com.yi.solr.model.Baike;
import com.yi.solr.service.BaikeService;
import com.yi.solr.utils.MessageResult;
import com.yi.solr.utils.SolrDocBeanUtil;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.UpdateResponse;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 测试
 */
@RestController
@RequestMapping("/solr")
public class BaikeController {
    @Autowired
    BaikeService baikeService;

    @RequestMapping("/init")
    public MessageResult init(){
        MessageResult result = MessageResult.ok();
        List<Baike> baikeList = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("文学");
        list1.add("小说");
        Baike baike1 = new Baike(1, "老人与海", list1, 1000, 10, "海明威", "男", 100, 0, new Date(), new Date());

        List<String> list2 = new ArrayList<>();
        list2.add("魔幻");
        list2.add("小说");
        Baike baike2 = new Baike(2, "全职法师", list2, 1000000, 10, "乱", "男", 1000, 0, new Date(), new Date());


        baikeList.add(baike1);
        baikeList.add(baike2);

        try {
            baikeService.addBeans(baikeList);
        } catch (IOException | SolrServerException e) {
            result = MessageResult.errorMsg(e.getMessage());
            e.printStackTrace();
        }

        return result;
    }

    @RequestMapping("/queryAll")
    public MessageResult queryAll(){
        MessageResult result = MessageResult.ok();
        SolrDocumentList solrDocumentList = null;

        try {
            solrDocumentList = baikeService.queryAll();
        } catch (IOException | SolrServerException e) {
            result = MessageResult.errorMsg(e.getMessage());
            e.printStackTrace();
        }

        List<Baike> baikes = (List<Baike>)SolrDocBeanUtil.toBeanList(solrDocumentList, Baike.class);
        result.setData(baikes);

        return result;
    }
}
