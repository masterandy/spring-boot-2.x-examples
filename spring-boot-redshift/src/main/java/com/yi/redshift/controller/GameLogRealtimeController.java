package com.yi.redshift.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yi.redshift.mapper.GameLogRealtimeMapper;
import com.yi.redshift.model.GameLogRealtime;
import com.yi.redshift.utils.MessageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * game_log_realtime
 * @author YI 2019-12-20
 */
@RestController
@RequestMapping("/gameLogRealtime")
public class GameLogRealtimeController {

    @Autowired
    private GameLogRealtimeMapper gameLogRealtimeMapper;

    /**
     * 查询/插入
     */
    @PostMapping("/find")
    public MessageResult find(String openId){
        List<GameLogRealtime> events = gameLogRealtimeMapper.selectList(new QueryWrapper<GameLogRealtime>().eq("open_id",openId));

        events.forEach(e -> {
            e.setOpenId("32EC0Fvn02q4ig0lQ0007SQYb22saaa");
            gameLogRealtimeMapper.insert(e);
        });

        if(events!=null){
            return MessageResult.ok(events);
        }else{
            return MessageResult.errorMsg("没有找到数据");
        }
    }

    /**
     * 查询
     */
    @PostMapping("/findByOpenId")
    public MessageResult findByOpenId(String openId){
        List<GameLogRealtime> events = gameLogRealtimeMapper.selectList(new QueryWrapper<GameLogRealtime>().eq("open_id",openId));

        if(events!=null){
            return MessageResult.ok(events);
        }else{
            return MessageResult.errorMsg("没有找到数据");
        }
    }

    /**
     * 查询
     */
    @PostMapping("/findByDt")
    public MessageResult findByDt(String dt){
        List<GameLogRealtime> events = gameLogRealtimeMapper.selectListBySQL(dt);

        if(events!=null){
            return MessageResult.ok(events);
        }else{
            return MessageResult.errorMsg("没有找到数据");
        }
    }
}
