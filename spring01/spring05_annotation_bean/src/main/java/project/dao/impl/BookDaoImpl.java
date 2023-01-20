package project.dao.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import project.dao.BookDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
//@Scope("prototype")  //修改为非单例模式 （非单例模式spring不再接管bean的生命周期，因此destroy不会被执行，容器对象在关闭后仍存在于内存中无法销毁）
@Scope("singleton")  //修改为单例模式（默认）
public class BookDaoImpl implements BookDao {


    @Override
    public void save() {
        System.out.println("book project.dao save...");
    }

    @PostConstruct  //构造方法后运行的方法
    public void init() {
        System.out.println("init...");
    }

    @PreDestroy   //彻底销毁前运行的方法
    public void destroy() {
        System.out.println("destroy...");
    }
}
