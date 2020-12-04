package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.bean.Account;
@Repository
public class AccountDaoImpl implements AccountDao{
	@Autowired 
	private JdbcTemplate jdbcTemplate;

	public String validateUser(Account account) {
		String special_key = (String) jdbcTemplate.queryForObject("select special_key from hsbc_user where username = ? AND password_user = ? AND account_number = ?", new Object[] {account.getUsername(),account.getPasswordUser(),account.getAccountNumber()} , String.class);
		if(special_key != null) {
			return special_key;
		}
		else {
			return "unreckonized user";
		}
	}
}
// package com.demo.dao;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.stereotype.Repository;

// import com.demo.bean.Account;
// @Repository
// public class AccountDaoImpl implements AccountDao{
// 	@Autowired 
// 	private JdbcTemplate jdbcTemplate;
// 	@Autowired 
// 	ValidationDaoImpl validationDao = new ValidationDaoImpl(); 
// 	public String validateUser(Account account) {
// 		if(validationDao.validateUser(account) ==1) {
// 			String special_key = (String) jdbcTemplate.queryForObject("select special_key from hsbc_user where username = ? AND password_user = ? AND account_number = ?", new Object[] {account.getUsername(),account.getPasswordUser(),account.getAccountNumber()} , String.class);
// 			return special_key;
// 		}
// 		else {
// 			return "unreckonized user";
// 		}
// 	}
// }
