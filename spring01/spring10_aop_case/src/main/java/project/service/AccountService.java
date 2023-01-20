package project.service;

import project.domain.Account;

import java.util.List;

public interface AccountService {


    List<Account> findAll();

    Account findById(Integer id);

}
