package com.xushaoshen.controller;

import com.xushaoshen.common.RedisRankMessage;
import com.xushaoshen.constant.RocketMqConstant;
import com.xushaoshen.service.RocketMqPushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mq/rank")
public class MqPushController {
    @Autowired
    private RocketMqPushService rocketMqPushService;


    /**
     * 普通消息投递
     */
    @PostMapping("/push")
    public String push(@RequestBody RedisRankMessage redisRankMessage) {
        rocketMqPushService.send(RocketMqConstant.RANK_TOPIC, redisRankMessage);
        return "投递消息 => 成功";
    }
}
