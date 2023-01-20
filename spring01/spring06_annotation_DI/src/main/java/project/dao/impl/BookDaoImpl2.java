package project.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import project.dao.BookDao;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {

    @Value("${name}")  //简单类型注入,从属性源中导入
    private String name;

    @Override
    public void save() {
        System.out.println("book dao2 save..." + name);
    }
}
