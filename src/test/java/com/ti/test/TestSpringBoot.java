package com.ti.test;

import com.ti.config.ConfigProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSpringBoot {
    @Autowired
    private ConfigProperties configProperties;
    @Test
    public void testConfig() throws Exception {

    }

}
