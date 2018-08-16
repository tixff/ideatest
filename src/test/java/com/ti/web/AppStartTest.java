package com.ti.web;

import com.ti.config.ConfigProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppStartTest {
    @Autowired
    private ConfigProperties configProperties;
    @Test
    public void hello() throws Exception {
        System.out.println(configProperties.toString());
    }

    @Test
    public void main() throws Exception {
    }
    @Test
    public void DemoTest(){
        System.out.println(configProperties.toString());
    }

}