package iproject.dao.impl;

import iproject.dao.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user save...");
    }
}
