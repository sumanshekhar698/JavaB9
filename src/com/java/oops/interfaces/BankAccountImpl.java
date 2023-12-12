package com.java.oops.interfaces;

public class BankAccountImpl extends Object implements BankAccount , RBI{//a class can implement multiple interfaces

	int money;
	int acNo;
//	 String bankName;
	String IFSCcode;
	
	@Override
	public void checkBalance() {
		System.out.println(this.money);
		
	}

	@Override
	public int withdrawSomeMoney(int amount) {
		if (amount > money) {
			return -1;
		} else {
			money -= amount;
			return amount;
		}
	}

	@Override
	public String getBankDetails() {
		return "BankAcount [money=" + money + ", acNo=" + acNo + ", bankName=" + bankName + ", IFSCcode=" + IFSCcode
				+ "]";
	}

}


interface RBI extends WorldBank{
	
}

interface WorldBank{
	
}

