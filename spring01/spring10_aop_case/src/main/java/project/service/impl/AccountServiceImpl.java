package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.dao.AccountDao;
import project.domain.Account;
import project.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;


    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findById(Integer id) {
        return accountDao.findById(id);
    }
}
