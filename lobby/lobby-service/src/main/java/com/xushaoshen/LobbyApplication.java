package com.xushaoshen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author xushaosheng
 * @Date 2023/3/20 0020 21:59
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LobbyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LobbyApplication.class, args);
    }
}
