package project.dao.impl;


import project.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }

    public void update(){
        System.out.println("book dao update ...");
    }

    public void delete(){
        System.out.println("book dao delete ...");
    }

    public int select(){
        System.out.println("book dao select ...");
        return 100;
    }
}
