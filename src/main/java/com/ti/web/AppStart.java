package com.ti.web;

import com.ti.config.ConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@ComponentScan(basePackages = "com.ti")
public class AppStart {
    @Autowired
    private ConfigProperties configProperties;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        System.out.println(configProperties.getAddress());
        return "hello spring boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class,args);
    }
}
