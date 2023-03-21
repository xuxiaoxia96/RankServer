package com.xushaoshen.param;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xushaoshen
 * @date2023/3/20 0020 22:45
 */
@Data
public class RedisRankDelParam implements Serializable {
    /**
     * 榜单id
     */
    private String rankKey;

    /**
     * 用户id
     */
    private String uid;

    /**
     * 用户id集合
     */
    private List<String> uidList = new ArrayList<String>();

    public List<String> getUidList() {
        this.uidList.add(uid);
        return uidList;
    }
}
