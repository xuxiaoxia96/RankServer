package com.xushaoshen.service;

import com.xushaoshen.api.RedisRankApi;
import com.xushaoshen.param.RedisRankMessageParam;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @date2023/3/21 0021 21:27
 */
@RestController
@RequestMapping(value = "/test")
public class RankSvrTestController {
    @Reference
    RedisRankApi redisRankApi;

    @PostMapping("/getUidRank")
    public Long test(@RequestBody RedisRankMessageParam param) {
       return redisRankApi.getUidRank(param);
    }
}
