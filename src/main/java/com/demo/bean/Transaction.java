package com.demo.bean;

public class Transaction {
	String transactionId;
	String accoutnNumber;
	String bank_name;
	String dot;
	String withdrawl;
	String deposit;
	String purpose;
	String closingBalance;
	public Transaction() {
		super();
	}
	public Transaction(String transactionId, String accoutnNumber, String bank_name, String dot, String withdrawl,
			String deposit, String purpose, String closingBalance) {
		super();
		this.transactionId = transactionId;
		this.accoutnNumber = accoutnNumber;
		this.bank_name = bank_name;
		this.dot = dot;
		this.withdrawl = withdrawl;
		this.deposit = deposit;
		this.purpose = purpose;
		this.closingBalance = closingBalance;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getAccoutnNumber() {
		return accoutnNumber;
	}
	public void setAccoutnNumber(String accoutnNumber) {
		this.accoutnNumber = accoutnNumber;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getDot() {
		return dot;
	}
	public void setDot(String dot) {
		this.dot = dot;
	}
	public String getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(String withdrawl) {
		this.withdrawl = withdrawl;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(String closingBalance) {
		this.closingBalance = closingBalance;
	}
	
	
}
