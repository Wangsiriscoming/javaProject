package iproject.dao.impl;

import iproject.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        System.out.println("book project.dao save.." + name);
    }
}
