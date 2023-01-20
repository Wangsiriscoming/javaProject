package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.LogDao;
import project.service.LogService;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;


    public void log(String out, String in, int money) {
        logDao.log("转账操作由"+out+"到"+in+"，金额："+money);
    }
}
