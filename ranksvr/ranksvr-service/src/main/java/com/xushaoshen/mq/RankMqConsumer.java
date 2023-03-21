package com.xushaoshen.mq;

import com.xushaoshen.common.RedisRankMessage;
import com.xushaoshen.constant.RocketMqConstant;
import com.xushaoshen.param.RedisRankMessageParam;
import com.xushaoshen.service.RedisRankService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Desc 等级mq消费
 * @date2023/3/20 0020 23:30
 */

@Slf4j
@Service
// topic 主题要与消息生产者一致
@RocketMQMessageListener(consumerGroup = "consumer-group", topic = RocketMqConstant.RANK_TOPIC)
public class RankMqConsumer implements RocketMQListener<RedisRankMessage> {
    @Resource
    RedisRankService redisRankService;
    public void onMessage(RedisRankMessage testMessaging) {
        log.info("消费到消息 => {}",testMessaging.toString());
        RedisRankMessageParam param = new RedisRankMessageParam();
        BeanUtils.copyProperties(testMessaging,param);
        Boolean aBoolean = redisRankService.addScore(param);
        log.info("消费结果 =>{}",aBoolean);
    }
}
