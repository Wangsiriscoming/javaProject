package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//定义controller
//使用@Controller定义bean
@Controller
public class UserController {
    //设置当前操作的访问路径
    @RequestMapping("/save")
    //设置当前擦操作的返回值类型
    @ResponseBody   //将后端以return返回的javabean类型数据转为json类型数据
    public String save(){
        System.out.println("user save...");
        return "{'module':'springmvc'}";
    }


    @RequestMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("user delete...");
        return "{'module':'springmvc delete'}";
    }


}
