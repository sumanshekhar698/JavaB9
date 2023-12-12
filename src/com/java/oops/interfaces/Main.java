package com.java.oops.interfaces;

public class Main {

	public static void main(String[] args) {
//		new BankAccount();//interface cannot be instantiated Directly
		
		System.out.println(BankAccountImpl.bankName);
		BankAccountImpl ac1 = new BankAccountImpl();
		
		BankAccount ac2 = new BankAccount() {
			
			@Override
			public int withdrawSomeMoney(int amount) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getBankDetails() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void checkBalance() {
				// TODO Auto-generated method stub
				
			}
		};
		

	}

}
