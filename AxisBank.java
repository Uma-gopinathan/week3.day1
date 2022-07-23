package org.bank;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bankObj = new AxisBank();
		bankObj.fixed();
		bankObj.saving();
		//overriding method deposit
		bankObj.deposit(23000);
		bankObj.deposit();
	}
	public void deposit(int intDepositAmt) {
		System.out.println("Amount deposited into axis bank account: "+intDepositAmt);
	}
}
