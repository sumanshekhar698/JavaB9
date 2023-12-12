package com.java.oops.abstraction;


//0 -100%
public abstract class BankAcountAbstractClass {//if you have any abstract fn, you should declare the class as abstract

	int money;
	int acNo;
	String bankName;
	String IFSCcode;

	void checkBalance() {//concrete fn
		System.out.println(this.money);
	}

	abstract int withdrawSomeMoney(int amount);// abstract fn just have method dignature and not the body

	abstract String getBankDetails();

}
