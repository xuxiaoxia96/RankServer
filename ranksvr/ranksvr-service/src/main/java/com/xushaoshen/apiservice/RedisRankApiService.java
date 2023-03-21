package com.xushaoshen.apiservice;

import com.xushaoshen.api.RedisRankApi;
import com.xushaoshen.param.RedisRankMessageParam;
import com.xushaoshen.param.RedisRankRangeParam;
import com.xushaoshen.param.RedisRankTopParam;
import com.xushaoshen.service.RedisRankService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @Desc 对外暴露接口处理层
 * @date2023/3/20 0020 23:11
 */
@Service(timeout = 3000)
public class RedisRankApiService implements RedisRankApi {

    @Resource
    RedisRankService redisRankService;

    /**
     * 获得当前用户排名
     * @param param
     * @return
     */
    public Long getUidRank(RedisRankMessageParam param) {
        return redisRankService.getRank(param);
    }

    /**
     * 获得前n个人
     * @param param
     * @return
     */
    public Set<String> getTop(RedisRankTopParam param) {
        return redisRankService.getTopN(param);
    }

    /**
     * 获得排名区间内的人
     * @param param
     * @return
     */
    public Set<String> getRang(RedisRankRangeParam param) {
        return redisRankService.getRangeByRank(param);
    }
}
