package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bean.Transaction;
import com.demo.dao.TransactionDao;
import com.demo.dao.TransactionDaoImpl;
@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionDao transactionDao = new TransactionDaoImpl();
	public List<Transaction> getTransactions(String specialKey) {
		// TODO Auto-generated method stub
		return transactionDao.getTransactions(specialKey);
		
	}

}
