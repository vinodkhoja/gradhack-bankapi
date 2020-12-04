package com.demo.dao;

import java.util.List;

import com.demo.bean.Transaction;

public interface TransactionDao {

	List<Transaction> getTransactions(String specialKey);
	
}
