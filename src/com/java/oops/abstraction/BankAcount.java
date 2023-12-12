package com.java.oops.abstraction;

public class BankAcount {

	int money;
	int acNo;
	String bankName;
	String IFSCcode;

	void checkBalance() {
		System.out.println(this.money);
	}

	int withdrawSomeMoney(int amount) {
		if (amount > money) {
			return -1;
		} else {
			money -= amount;
			return amount;
		}
	}

	String getBankDetails() {
		return "BankAcount [money=" + money + ", acNo=" + acNo + ", bankName=" + bankName + ", IFSCcode=" + IFSCcode
				+ "]";
	}

}
