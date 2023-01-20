package iproject.dao.impl;

import iproject.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private int price;
    private String name;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("bookdao save.." + name + price);
    }
}
