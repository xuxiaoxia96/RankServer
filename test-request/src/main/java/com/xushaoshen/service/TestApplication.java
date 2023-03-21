package com.xushaoshen.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author xushaosheng
 * @Date 2023/3/21 0020 00:23
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}