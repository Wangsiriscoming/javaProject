package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.AccountDao;
import project.service.AccountService;
import project.service.LogService;

import java.io.IOException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    public void transfer(String out, String in, int money) throws IOException {

        try{
            accountDao.outMoney(out,money);
//        int i = 1/0;   //模拟事务运行过程中出现错误
//        if(true){throw new IOException();}  //模拟事务运行过程中出现IO异常
            accountDao.inMoney(in,money);
        }finally {
            logService.log(out,in,money);
        }

    }
}
