package com.springboot.fast.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * 程序启动后通过ApplicationRunner处理一些事务
 *
 */
@Component
public class SpringbootFastApplicationRunner implements ApplicationRunner {
    private Logger log = LoggerFactory.getLogger(SpringbootFastApplicationRunner.class);

    @Value("${server.port}")
    private int port;

    @Override
    public void run(ApplicationArguments applicationArguments) {
        log.info("程序部署完成：http://localhost:" + port + "/index");
    }
}
