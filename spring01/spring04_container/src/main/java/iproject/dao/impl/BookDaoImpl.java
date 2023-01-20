package iproject.dao.impl;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import iproject.dao.BookDao;

public class BookDaoImpl implements BookDao {

    public BookDaoImpl() {
        System.out.println("constructor");
    }

    public void save() {
        System.out.println("book project.dao save...");
    }
}
