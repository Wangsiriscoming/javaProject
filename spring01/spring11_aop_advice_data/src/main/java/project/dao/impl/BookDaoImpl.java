package project.dao.impl;

import org.springframework.stereotype.Repository;
import project.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {

    public String findName(int id , String password) {
        System.out.println("id:" + id);
        return "itcast";
    }

}
