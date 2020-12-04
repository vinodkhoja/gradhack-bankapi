package com.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.bean.Account;
import com.demo.dao.AccountDao;
import com.demo.dao.AccountDaoImpl;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	AccountDao accountDao = new AccountDaoImpl();
	public String validateUser(Account account) {
		return accountDao.validateUser(account);
}
}
