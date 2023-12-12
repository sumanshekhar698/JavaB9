package com.java.oops.abstraction;

public class BankAccountImplmentation extends BankAcountAbstractClass {

	@Override
	int withdrawSomeMoney(int amount) {
		if (amount > money) {
			return -1;
		} else {
			money -= amount;
			return amount;
		}
	}

	@Override
	String getBankDetails() {
		return "BankAcount [money=" + money + ", acNo=" + acNo + ", bankName=" + bankName + ", IFSCcode=" + IFSCcode
				+ "]";
	}

}
