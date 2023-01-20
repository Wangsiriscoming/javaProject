package com.project;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.project.dao.UserDao;
import com.project.domian.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus01QuickstartApplicationTests {


    @Autowired
    private UserDao userDao;

    @Test
    void testSave(){
        User user = new User();
        user.setName("王sir");
        user.setPassword("itcast");
        user.setAge(35);
        user.setTel("1388248744");
        userDao.insert(user);
    }

    @Test
    void testDelete(){
        userDao.deleteById(1568880334198665218L);
    }

    @Test
    void testUpdate(){   //动态SQL，无需填写所有字段的值
        User user = new User();
        user.setId(1L);
        user.setName("Tom666");
        userDao.updateById(user);
    }

    @Test
    void testById(){
        User user = userDao.selectById(1L);
        System.out.println(user);
    }


    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void testGetByPage(){
        IPage page = new Page(3,1);  //查询第一页的前两条信息
        userDao.selectPage(page,null);
        System.out.println("当前页码:" + page.getCurrent());
        System.out.println("每页显示数:" + page.getSize());
        System.out.println("总页数:" + page.getPages());
        System.out.println("数据总条数:" + page.getTotal());
        System.out.println("数据:" + page.getRecords());
    }

}
