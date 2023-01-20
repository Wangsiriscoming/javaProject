package iproject.factory;

import iproject.dao.UserDao;
import iproject.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
