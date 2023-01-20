package com.example.controller;

import com.example.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    //==========第一种读取配置的方式=========
    @Value("${lesson}")
    private String lesson;

    @Value("${server.port}")
    private Integer port;

    @Value("${enterprise.subject[0]}")
    private String subject_00;

    //==========第二种读取配置的方式=========
    @Autowired   //会自动将配置文件中的所有信息自动填充到此
    private Environment environment;  //Environment用来加载所有的环境信息

    //==========第三种读取配置的方式=========
    @Autowired
    private Enterprise enterprise;


    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        /*System.out.println(lesson);
        System.out.println(port);
        System.out.println(subject_00);*/

        /*System.out.println(environment.getProperty("lesson"));
        System.out.println(environment.getProperty("server.port"));
        System.out.println(environment.getProperty("enterprise.age"));
        System.out.println(environment.getProperty("enterprise.subject[1]"));*/

        System.out.println(enterprise);
        System.out.println("id==>" + id);
        return "hello,spring boot!";
    }

}
