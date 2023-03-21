package com.xushaoshen.common;

import lombok.Data;

@Data
public class RedisRankMessage {
    /**
     * 榜单id
     */
    private String rankKey;
    /**
     * 用户id
     */
    private String uid;
    /**
     * 分数
     */
    private Integer score;
}