package project.service;

import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

public interface AccountService {
    /**
     * 转账操作
     * out：转出方
     * in：转入方
     * money：金额
     */
//    @Transactional(rollbackFor = {IOException.class})  //开启事务  //rollbackFor可以指定事务运行时若出现下列异常则回滚
    @Transactional
    public void transfer(String out,String in,int money) throws IOException;
}
