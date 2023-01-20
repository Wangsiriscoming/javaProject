package iproject.factory;

import iproject.dao.UserDao;
import iproject.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    //代替原始实例工厂中创建对象的方法
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    //规定返回的bean的类型
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    @Override
    public boolean isSingleton() {
        return false;  //修改FactoryBean为非单例模式 （默认是true，即单例）
    }
}
