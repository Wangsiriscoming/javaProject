package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import project.domain.User;

import java.util.ArrayList;
import java.util.List;

/*
    响应
 */

@Controller
@RequestMapping("/result")
public class ResultController {

    //响应页面/跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "index.jsp";
    }

    //响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }

    //响应POJO对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("wangsir");
        user.setAge(21);
        return user;
    }

    //响应POJO集合对象
    @RequestMapping("/toJsonPOJOList")
    @ResponseBody
    public List<User> toJsonPOJOList(){
        System.out.println("返回POJO集合数据");
        User user1 = new User();
        user1.setName("wangsir");
        user1.setAge(21);

        User user2 = new User();
        user2.setName("王杏月");
        user2.setAge(20);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        return userList;
    }

}
