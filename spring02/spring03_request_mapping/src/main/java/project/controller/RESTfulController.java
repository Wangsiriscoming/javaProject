package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.domain.User;

@Controller
@RequestMapping("/rest")
public class RESTfulController {

//    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @PostMapping("/users")  //等同于上句
    @ResponseBody
    public String save(@RequestBody User user){
        System.out.println("user save..." + user);
        return "'module':'user save'";
    }

//    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/users/{id}")  //等同于上句
    @ResponseBody
    public String delete(@PathVariable Integer id){   //@PathVariable 路径变量：此变量来自路径
        System.out.println("user delete..." + id);
        return "'module':'user delete'";
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..." + user);
        return "'module':'user update'";
    }

    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String getById(@PathVariable Integer id){   //@PathVariable 路径变量：绑定路径参数与处理器方法形参间的关系，要求路径参数名与形参名一一对应
        System.out.println("user getById..." + id);
        return "'module':'user getById'";
    }

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "'module':'user getAll'";
    }


}
