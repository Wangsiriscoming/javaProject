package project.dao.impl;

import org.springframework.stereotype.Repository;
import project.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book project.dao save...");
    }
}
