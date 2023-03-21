package com.xushaoshen.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xushaoshen
 * @date2023/3/20 0020 22:43
 */
@Data
public class RedisRankTopParam implements Serializable {
    /**
     * 榜单id
     */
    private String rankKey;

    /**
     * 前几名
     */
    private int top;
}
