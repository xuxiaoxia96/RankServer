package com.xushaoshen.controller;

import com.xushaoshen.param.RedisRankDelParam;
import com.xushaoshen.param.RedisRankMessageParam;
import com.xushaoshen.param.RedisRankRangeParam;
import com.xushaoshen.service.RedisRankService;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author xushaoshen
 * @date2023/3/20 0020 22:53
 */
@RestController
@RequestMapping(value = "/redis/rank/")
public class RedisRankController {

    @Resource
    RedisRankService redisRankService;

    /**
     * 新增
     * @param param
     * @return
     */
    @PostMapping(value = "/add")
    public boolean add(@RequestBody RedisRankMessageParam param){
        Boolean aBoolean = redisRankService.addScore(param);
        return aBoolean!=null?aBoolean:false;
    }

    /**
     * 删除用户，包含批量删除
     * @param param
     * @return
     */
    @PostMapping(value = "/del")
    public Long del(@RequestBody RedisRankDelParam param){
        Long removeNum = redisRankService.remove(param);
        return removeNum;
    }

    /**
     * 当前用户排名
     * @param param
     * @return
     */
    @PostMapping(value = "/getUidRank")
    public Long getUidRank(@RequestBody RedisRankMessageParam param){
        Long rank = redisRankService.getRank(param);
        return rank;
    }

    /**
     * 指定区间名次
     * @param param
     * @return
     */
    @PostMapping(value = "/getRangeRank")
    public Set<String> getRangeRank(@RequestBody RedisRankRangeParam param){
        Set<String> set = redisRankService.getRangeByRank(param);
        return set;
    }
}
