package iproject.factory;

import iproject.dao.BookDao;
import iproject.dao.impl.BookDaoImpl;

public class BookDaoFactory {
    public static BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
