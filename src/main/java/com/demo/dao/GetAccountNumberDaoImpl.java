package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class GetAccountNumberDaoImpl {
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	public String getAccountNumber(String specialKey) {
		return (String) jdbcTemplate.queryForObject("select account_number from hsbc_user where special_key = ?",new Object[] {specialKey},String.class);
		
	}
}
