package com.xushaoshen.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xushaoshen
 * @date2023/3/20 0020 22:39
 */
@Data
public class RedisRankMessageParam implements Serializable {
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
