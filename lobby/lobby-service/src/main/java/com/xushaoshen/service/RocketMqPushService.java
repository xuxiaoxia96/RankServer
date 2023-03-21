package com.xushaoshen.service;

import com.alibaba.fastjson.JSONObject;
import com.xushaoshen.constant.RocketMqConstant;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

/**
 * @Description: mq的推送实现类
 * @Author xushaoshen
 * @Date Created in 2023年03月21日 14:59
 */
@Service
@Slf4j
public class RocketMqPushService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
      * @Description 分tag发送
      */
    public void send(String topic,String tag, Object message) {
        String destination = topic + ":" + tag;
        send(destination, message);
    }

    /**
      * @Description 最终发送消息实现
      */
    public void send(String destination, Object message) {
        // 设置业务键，此处根据公共的参数进行处理
        // 更多的其它基础业务处理...
        SendResult sendResult = rocketMQTemplate.syncSend(destination, message);
        log.info("send topic:{},result:{}",destination,JSONObject.toJSONString(sendResult));
    }
}
