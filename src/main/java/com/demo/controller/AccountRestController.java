package com.demo.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.demo.bean.Account;
import com.demo.bean.Transaction;
import com.demo.service.AccountService;
import com.demo.service.AccountServiceImpl;
import com.demo.service.TransactionService;
import com.demo.service.TransactionServiceImpl;

@RestController
public class AccountRestController {
	@Autowired
	AccountService accountService = new AccountServiceImpl();
	@Autowired
	TransactionService transactionService = new TransactionServiceImpl();
	@CrossOrigin
	@PostMapping("/authenticateuser")
	public String createPost(@RequestParam("username") String username,@RequestParam("password") String passwordUser,@RequestParam("accountnumber") String accountNumber){
		Account account = new Account(username,passwordUser,accountNumber);
		String responseOfAuthentication = accountService.validateUser(account);
		return responseOfAuthentication;
	}
	@PostMapping("/gettransactions")
	public List<Transaction> getTransactions(@RequestParam("specialkey") String specialKey) {
		List<Transaction> plist = transactionService.getTransactions(specialKey);
		if(plist!=null) return plist;
		else return null;
	}
	@PostMapping("/authenticate")
	public String userd(@RequestParam("specialkey") String username){
		List<String> list=new ArrayList<String>();  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		return username;
	}
}
