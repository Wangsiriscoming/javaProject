package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.domain.Book;

import java.util.ArrayList;
import java.util.List;

@RestController  //@RestController = @Controller + @ResponseBody
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save ==>" + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll(){
        System.out.println("book getAll is running");

        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门教程");
        book1.setDescription("测试数据1");

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战教程");
        book2.setDescription("测试数据2");

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);

        return list;
    }

}
