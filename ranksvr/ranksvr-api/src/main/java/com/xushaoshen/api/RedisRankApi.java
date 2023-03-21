package com.xushaoshen.api;

import com.xushaoshen.param.RedisRankMessageParam;
import com.xushaoshen.param.RedisRankRangeParam;
import com.xushaoshen.param.RedisRankTopParam;

import java.util.Set;

/**
 * @Desc 对外暴露接口
 * @date2023/3/20 0020 23:08
 */
public interface RedisRankApi {
    /**
     * 获得当前用户排名
     * @param param
     * @return
     */
     Long getUidRank(RedisRankMessageParam param);

    /**
     * 获得前n个人
     * @param param
     * @return
     */
    Set<String> getTop(RedisRankTopParam param);

    /**
     * 获得区间内的人
     * @param param
     * @return
     */
    Set<String> getRang(RedisRankRangeParam param);
}
