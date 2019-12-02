package com.techstu.learning.sort;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SortTest {
    @Autowired
    private Sort sort;
    @Test
    public void Test(){
        sort.test();
    }
}
