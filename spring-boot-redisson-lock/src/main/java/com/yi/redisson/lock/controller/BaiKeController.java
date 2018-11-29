package com.yi.redisson.lock.controller;

import cn.hutool.json.JSONUtil;
import com.yi.redisson.lock.model.Baike;
import com.yi.redisson.lock.utils.MessageResult;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 秒杀
 * @author YI
 * @date 2018-11-29 15:28:03
 */
@RestController
public class BaiKeController {
    private final StringRedisTemplate redisTemplate;
    private final RedissonClient redissonClient;

    private AtomicInteger successNum = new AtomicInteger(0);

    @Autowired
    public BaiKeController(RedissonClient redissonClient, StringRedisTemplate redisTemplate) {
        this.redissonClient = redissonClient;
        this.redisTemplate = redisTemplate;
    }

    /**
     * 初始化书本数量
     * @return MessageResult
     */
    @RequestMapping(value = "/initBaiKe", method = RequestMethod.GET)
    public MessageResult initBaiKe() {
        List<String> list = new ArrayList<>();
        list.add("魔幻");
        list.add("小说");
        Baike baike = new Baike(1, "全职法师", list, 1000000, 5, "乱", "男", 1000, 0, 20, new Date(), new Date());

        redisTemplate.opsForValue().set("baike", JSONUtil.toJsonStr(baike));

        successNum.set(0);

        return MessageResult.ok("数据初始化成功");
    }

    /**
     * 基于Redisson的锁
     * @return
     */
    @RequestMapping(value = "/kill/redis", method = RequestMethod.POST)
    public MessageResult secKillRedis() {
        MessageResult result = MessageResult.ok();
        RLock rLock = redissonClient.getLock("product_sku");

        try {
            rLock.lock();
            String baikeJson = redisTemplate.opsForValue().get("baike");
            Baike baike = JSONUtil.toBean(baikeJson, Baike.class);
            Integer sku = baike.getAmount();
            sku = sku - 1;
            if (sku < 0) {
                result.setMsg("库存不足");

                return result;
            }

            baike.setAmount(sku);
            redisTemplate.opsForValue().set("baike", JSONUtil.toJsonStr(baike));

            String msg = "减少库存成功,共减少" + successNum.incrementAndGet();
            result.setMsg(msg);
            System.out.println(msg);

            return result;
        } finally {
            rLock.unlock();
        }
    }
}
