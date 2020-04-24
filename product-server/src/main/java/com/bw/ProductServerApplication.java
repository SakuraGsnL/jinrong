package com.bw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.bw.mapper")
public class ProductServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductServerApplication.class,args);
    }
}