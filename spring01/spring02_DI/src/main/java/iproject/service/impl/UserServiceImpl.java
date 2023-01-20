package iproject.service.impl;

import iproject.dao.UserDao;
import iproject.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("userservice save..");
        userDao.save();
    }
}
