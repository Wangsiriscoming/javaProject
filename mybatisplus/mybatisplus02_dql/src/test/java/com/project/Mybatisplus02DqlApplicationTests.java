package com.project;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.project.dao.UserDao;
import com.project.domian.User;
import com.project.domian.query.UserQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // lt(<) le(<=) gt(>) ge(>=) between(包含等号的)
        //方式一：条件查询
        /*QueryWrapper qw = new QueryWrapper();
        *//*qw.lt("age",18);   //lt = less than*//*
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);*/

        //方式二：Lambda条件查询
        /*QueryWrapper<User> qw = new QueryWrapper<User>();
        qw.lambda().lt(User::getAge,4);
        List<User> userList = userDao.selectList(qw);
        System.out.println(userList);*/

        //方式三：Lambda条件查询
        /*LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();  //此句 = QueryWrapper + lambda()
        //查询4到30岁之间的数据
        *//*lqw.lt(User::getAge,30);  //lt = less than
        lqw.gt(User::getAge,4);   //gt = greater than*//*
        //查询小于4岁或者大于30岁的数据
        *//*lqw.lt(User::getAge,4).or().gt(User::getAge,30);*//*
        //查询4到21岁之间的数据
        lqw.between(User::getAge,4,21);
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);*/


        //条件查询null判断
        /*//模拟页面传递过来的查询数据
        UserQuery uq = new UserQuery();
        uq.setAge(3);
        uq.setAge2(30);
        //null判定
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge,uq.getAge2());
        //如果age2参数不为null，则连接当前条件，否则sql语句会出现where age = null 的错误
        lqw.lt(null != uq.getAge2(),User::getAge,uq.getAge2());
//        lqw.gt(User::getAge,uq.getAge());
        lqw.gt(null != uq.getAge(),User::getAge,uq.getAge());
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);*/


        //查询投影
        /*//查询特定字段
        //第一种：Lambda格式
        *//*LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.select(User::getId,User::getName,User::getAge);*//*
        //第二种
        *//*QueryWrapper<User> lqw = new QueryWrapper<User>();
        lqw.select("id","name","age");
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);*//*

        QueryWrapper<User> lqw = new QueryWrapper<User>();
        lqw.select("count(*) as count, tel");  //起个别名叫count，否则会输出count(*) = ...
        lqw.groupBy("tel");   //分组
        List<Map<String, Object>> mapList = userDao.selectMaps(lqw);
        System.out.println(mapList);*/


        //条件查询设置
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        //等同于= : 如果User::getName = Jerry 并且 User::getPassword = jerry
        /*lqw.eq(User::getName,"Jerry").eq(User::getPassword,"jerry");
        User user = userDao.selectOne(lqw);*/
        //模糊匹配 like  likeLeft(%J) likeRight(J%)
//        lqw.like(User::getName,"J");
        lqw.likeRight(User::getName,"J");
        List<User> user = userDao.selectList(lqw);
        System.out.println(user);

    }

    @Test  //测试映射匹配兼容性
    void testTable(){
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        List<User> userList = userDao.selectList(lqw);
        System.out.println(userList);
    }

    @Test  //测试id生成策略
    void testSave(){
        User user = new User();
        user.setName("王杏月");
        user.setPassword("554457");
        user.setAge(20);
        user.setTel("13208943386");
        userDao.insert(user);
    }

    @Test  //测试多数据的删除
    void testDeleteIds(){
        List<Long> list = new ArrayList<>();
        list.add(1569202479768317954L);
        list.add(5L);

        userDao.deleteBatchIds(list);
    }

    @Test
    void deleteLogic(){
        userDao.deleteById(2L);
        System.out.println(userDao.selectList(null));
    }


    @Test  //测试乐观锁机制
    void testUpdate(){
        //模拟多线程操作
        User user = userDao.selectById(3L);  //先拿到包含version字段信息的数据,后面在进行更新操作时mp才会对version进行修改
        User user2 = userDao.selectById(3L);

        user.setName("Tom1");
        userDao.updateById(user);

        user2.setName("Tom2");
        userDao.updateById(user2);
    }

}
