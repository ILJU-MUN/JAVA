package com.test;
class Account{
	static double interest;
	private double baleance;
	private String accNumber;
	private String name;
	
	public Account(String acc, String name, int bal) {  //생성자  인스턴스에서 받은 acc인자가 this.accNumber로 들어감.
		this.accNumber = acc;
		this.name = name;
		this.baleance = bal;
	}
	public void deposit(int baleance) { //받은 baleance 인자가 this.baleance로 들어감
		this.baleance += baleance;
	}
	public void withdraw(int baleance) {
		this.baleance -= baleance;
	}
	public void addInterest() {
		baleance += (baleance*interest);
	}
	public String getAccountNo() {
		return this.accNumber;    //this해도 되고 안해도됨
	}
	public String getAccountName() {
		return this.name;
	}
	public double getBalance() {
		return this.baleance;
	}
}

public class AccountTest {

	public static void main(String[] args) {
		Account customer1=new Account("111-222-33333333","최은희",20000);
		Account customer2=new Account("555-666-77777777","남매월",100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산"); 
		Account.interest=0.05;
		customer1.addInterest(); //저축된 금액=원금+원금*이자율
		customer2.addInterest();//저축된 금액=원금+원금*이자율
		printAccount(customer1);
		printAccount(customer2);
	}
	static void printAccount(Account customer){
		System.out.println("계좌번호:"+customer.getAccountNo());
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
		}

	

}
