package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")   //设置请求路径前缀，防止不同模块间发生路径相同冲突
public class BookController {


    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("book save...");
        return "{'module':'book save'}";
    }

}
