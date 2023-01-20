package project.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import project.domain.User;

import javax.swing.plaf.SliderUI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/*
    参数传递
 */


/**
 * @RequestParam：用于接收url地址传参，表单传参【application/x-www-form-urlencoded】
 * @RequestBody：用于接收json数据【application/json】
 * @ResponseBody：将方法的返回值以json/xml的数据格式返回给客户端
 */

@Controller
@RequestMapping("/car")
public class CarController {

    //普通参数传递
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name,int age){
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'module':'common param'}";
    }

    //普通参数传递：请求参数与形参名不同
    @RequestMapping("/commonParamDifferentName")
    @ResponseBody                          //@RequestParam：将请求参数的参数名绑定到后端的name
    public String commonParamDifferentName(@RequestParam("username") String name, int age){
        System.out.println("普通参数传递 name ==>" + name);
        System.out.println("普通参数传递 age ==>" + age);
        return "{'module':'common param different name'}";
    }

    //POJO参数
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user){
        System.out.println("pojo参数传递 user==>" + user);
        return "{'module':'pojo param'}";
    }

    //数组参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] hobbies){
        System.out.println("数组参数传递 hobbies==>" + Arrays.toString(hobbies));
        return "{'module':'array param'}";
    }

    //集合参数
    @RequestMapping("/listParam")
    @ResponseBody          //@RequestParam：告诉spring参数List<String>并非一个对象，将其当作数据类型处理
    public String listParam(@RequestParam List<String> hobbies){
        System.out.println("集合参数传递 hobbies==>" + hobbies);
        return "{'module':'list param'}";
    }

    //集合参数：json格式
    @RequestMapping("/listParamForJson")
    @ResponseBody                 //@RequestBody直接以String接收前端传过来的json数据
    public String listParamForJson(@RequestBody List<String> hobbies){
        System.out.println("集合参数传递(json) hobbies==>" + hobbies);
        return "{'module':'list param for json'}";
    }

    //POJO参数：json格式
    @RequestMapping("/pojoParamForJson")
    @ResponseBody                  //@RequestBody以简单对象接收前端传过来的json数据
    public String pojoParamForJson(@RequestBody User user){
        System.out.println("pojo参数传递(json) user==>" + user);
        return "{'module':'pojo param for json'}";
    }

    //集合+pojo参数：json格式
    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list){
        System.out.println("集合+pojo参数传递(json) list==>" + list);
        return "{'module':'list pojo param for json'}";
    }

    //日期参数
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2){
        System.out.println("日期参数传递 date==>" + date);  //默认格式是yyyy/MM/dd
        System.out.println("日期参数传递 date1==>" + date1);  //为date1修改参数格式
        System.out.println("日期参数传递 date2==>" + date2);
        return "{'module':'date param'}";
    }

}
