package com.java.oops.interfaces;

public interface BankAccount {
	
	

	String bankName = "Royal Bank";//final public 


//	void checkBalance() {//Cannot have any normal concrete fn
//		System.out.println(this.money);
//	}

	void checkBalance() ;
	int withdrawSomeMoney(int amount);// abstract fn just have method dignature and not the body
	abstract String getBankDetails();

}
