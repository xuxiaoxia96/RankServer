package com.xushaoshen.param;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xushaoshen
 * @date2023/3/20 0020 22:40
 */
@Data
public class RedisRankRangeParam implements Serializable {
    /**
     * 榜单id
     */
    private String rankKey;
    /**
     * 从几开始
     */
    private int begin;

    /**
     * 从几结束
     */
    private int end;
}
