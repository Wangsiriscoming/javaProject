package project.dao.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import project.dao.BookDao;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book project.dao save...");
    }
}
