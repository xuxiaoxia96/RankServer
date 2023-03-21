package com.xushaoshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author xushaosheng
 * @Date 2023/3/21 0020 00:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RankSrvApplication {
    public static void main(String[] args) {
        SpringApplication.run(RankSrvApplication.class, args);
    }
}
