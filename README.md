# RankingList实现基于Redis的排行榜服务
## 整体架构
![image](https://user-images.githubusercontent.com/53639856/226639388-85a41c9a-9759-4a06-81f5-fa50fe7e79c7.png)
## 通信
1. 服务间基于dubbo的RPC调用 lobby->ranksvr
2. 消息中间件rocketmq: 
  - 生产者消费者模式解耦lobby和ranksvr
  - 异步消费，消息堆积能力
  - 防止用户量大数据过于频繁时，调用方给被调用方系统造成压力
3. 配置文件独立
4. 基于Redis的zset实现排行榜逻辑，服务启动可以在配置中心获取榜单配置

## TODO
1. 引入配置中心进行svr的配置管理
2. Redis的排行榜数据落盘、备份。讲Redis改造为集群
3. MQ封装协议，屏蔽异构平台的细节：发送方、接收方系统之间不需要了解双方，只需认识消息。

