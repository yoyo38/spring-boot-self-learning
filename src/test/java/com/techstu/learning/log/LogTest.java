package com.techstu.learning.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LogTest {
    @Autowired
    private MyLog myLog;
    @Test
    public void logTest(){
        myLog.test();
    }

}
