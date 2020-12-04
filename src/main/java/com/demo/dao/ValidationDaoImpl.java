package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.bean.Account;
@Repository
public class ValidationDaoImpl{
	@Autowired 
	private JdbcTemplate jdbcTemplate;

	public int validateUser(Account account) {
		int isUser = (int) jdbcTemplate.queryForObject("select COUNT(1) from hsbc_user where username = ? AND password_user = ? AND account_number = ?", new Object[] {account.getUsername(),account.getPasswordUser(),account.getAccountNumber()}, Integer.class);
		return isUser;
	}
}
