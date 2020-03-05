package com.itson.dao;

import com.itson.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {

    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) value(#{name},#{money})")
    void saveAccount(Account account);
}
