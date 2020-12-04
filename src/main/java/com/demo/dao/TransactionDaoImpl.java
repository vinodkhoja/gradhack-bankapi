package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.demo.bean.Transaction;
@Repository
public class TransactionDaoImpl implements TransactionDao{
	@Autowired 
	private JdbcTemplate jdbcTemplate;
	@Autowired 
	GetAccountNumberDaoImpl getAccountNumberDaoImpl =  new GetAccountNumberDaoImpl();
	public List<Transaction> getTransactions(String specialKey) {
		// TODO Auto-generated method stub
		String accountNumber = getAccountNumberDaoImpl.getAccountNumber(specialKey);
		
		
		  List<Transaction> tlist =
		  jdbcTemplate.query("select * from hsbc_transactions where account_number = ?"
		  ,new Object[] {accountNumber}, new RowMapper<Transaction>() { public
		  Transaction mapRow(ResultSet rs, int rowNum) throws SQLException {
		  Transaction t=new Transaction(); t.setTransactionId(rs.getString(1));
		  t.setAccoutnNumber(rs.getString(2)); t.setBank_name(rs.getString(3));
		  t.setDot(rs.getString(4)); t.setWithdrawl(rs.getString(5));
		  t.setDeposit(rs.getString(6)); t.setPurpose(rs.getString(7));
		  t.setClosingBalance(rs.getString(8)); return t; } }); return tlist;
		 
	}
}
