package com.techstu.learning.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyLog {
    @Bean
    public MyLog logTest(){
        return new MyLog();
    }
    public void test(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
    }
}
