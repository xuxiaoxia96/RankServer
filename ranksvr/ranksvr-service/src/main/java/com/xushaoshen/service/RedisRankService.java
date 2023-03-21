package com.xushaoshen.service;

import com.xushaoshen.param.RedisRankDelParam;
import com.xushaoshen.param.RedisRankMessageParam;
import com.xushaoshen.param.RedisRankRangeParam;
import com.xushaoshen.param.RedisRankTopParam;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

@Service
public class RedisRankService {
    @Resource
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 新增用户或者更新用户
     *
     * @param rankMessage
     */
    public Boolean addScore(RedisRankMessageParam rankMessage) {
        ZSetOperations<String, String> zSetOps = redisTemplate.opsForZSet();
        Boolean flag = zSetOps.add(rankMessage.getRankKey(), rankMessage.getUid(), rankMessage.getScore());
        return flag;
    }

    /**
     * 获得当前用户排名
     *
     * @param rankMessage
     */
    public Long getRank(RedisRankMessageParam rankMessage) {
        ZSetOperations<String, String> zSetOps = redisTemplate.opsForZSet();
        return zSetOps.rank(rankMessage.getRankKey(), rankMessage.getUid());
    }

    /**
     * 获得榜单前n名
     *
     * @param topParam
     * @return
     */
    public Set<String> getTopN(RedisRankTopParam topParam) {
        ZSetOperations<String, String> zSetOps = redisTemplate.opsForZSet();
        return zSetOps.reverseRange(topParam.getRankKey(), 0, topParam.getTop());
    }

    /**
     * 获得榜单区间
     *
     * @param param
     * @return
     */
    public Set<String> getRangeByRank(RedisRankRangeParam param) {
        ZSetOperations<String, String> zSetOps = redisTemplate.opsForZSet();
        return zSetOps.range(param.getRankKey(), param.getBegin(), param.getEnd());
    }

    /**
     * 获得榜单区间
     *
     * @param delParam
     * @return
     */
    public Long remove(RedisRankDelParam delParam) {
        ZSetOperations<String, String> zSetOps = redisTemplate.opsForZSet();
        return zSetOps.remove(delParam.getRankKey(), delParam.getUidList().toArray());
    }
}


