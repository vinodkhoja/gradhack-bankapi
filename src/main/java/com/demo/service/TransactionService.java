package com.demo.service;

import java.util.List;

import com.demo.bean.Transaction;

public interface TransactionService {

	List<Transaction> getTransactions(String specialKey);

}
