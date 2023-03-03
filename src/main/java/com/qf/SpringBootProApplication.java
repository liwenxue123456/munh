package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qf.dao")
public class SpringBootProApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProApplication.class,args);
    }
}
