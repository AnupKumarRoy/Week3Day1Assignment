package org.system;

public class BankInfo {
	public void saving() {
		System.out.println("saving is 100cr");
	}
	public void fixed() {
		System.out.println("fixed is 10cr");
	}
	public void dospite() {
		System.out.println("dospite is 50cr");
	}
	public static void main(String[] args) {
	
BankInfo bank = new BankInfo();
bank.dospite();
bank.fixed();
bank.saving();
	}

}
