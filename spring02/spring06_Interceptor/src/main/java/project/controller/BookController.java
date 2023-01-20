package project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project.domain.Book;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public String save(@RequestBody Book book){
        System.out.println("book save..." + book);
        return "{'module':'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){   //@PathVariable 路径变量：此变量来自路径
        System.out.println("book delete..." + id);
        return "{'module':'book delete'}";
    }

    @PutMapping
    public String update(@RequestBody Book book){
        System.out.println("book update..." + book);
        return "{'module':'book update'}";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){   //@PathVariable 路径变量：绑定路径参数与处理器方法形参间的关系，要求路径参数名与形参名一一对应
        System.out.println("book getById..." + id);
        return "{'module':'book getById'}";
    }

    @GetMapping
    public String getAll(){
        System.out.println("book getAll...");
        return "{'module':'book getAll'}";
    }

}
