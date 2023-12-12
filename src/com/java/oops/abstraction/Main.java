package com.java.oops.abstraction;

public class Main {

	public static void main(String[] args) {

		BankAcount ac1 = new BankAcount();
//		new BankAcountAbstractClass();// You cannot insntiate a abstract class DIRECTLY
		
		
		BankAccountImplmentation ac2 = new BankAccountImplmentation();
		String bankDetails = ac2.getBankDetails();
		System.out.println(bankDetails);
		
		
		
		BankAcountAbstractClass ac3 = new BankAcountAbstractClass() {//Annonymous Inner Type/Class
			
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
		};
		
		int withdrawSomeMoney = ac3.withdrawSomeMoney(100);
		System.out.println(withdrawSomeMoney);
	}

}
