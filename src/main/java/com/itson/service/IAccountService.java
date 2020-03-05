package com.itson.service;

import com.itson.domain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAll();

    void saveAccount(Account account);

}
