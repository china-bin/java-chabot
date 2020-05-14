package com.springboot.fast;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication()
@MapperScan("com.springboot.fast.model.mapper")
@EnableTransactionManagement
public class SpringBootFastApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFastApplication.class, args);
    }

}
