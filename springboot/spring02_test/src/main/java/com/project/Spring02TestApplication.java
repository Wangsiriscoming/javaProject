package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //这个类起到了配置类的作用(把它所在的包及其子包全都扫描一遍，以此加载所有的bean)
public class Spring02TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring02TestApplication.class, args);
    }

}
