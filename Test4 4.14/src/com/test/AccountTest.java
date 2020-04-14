package com.test;
class Account{
	static double interest;
	private double baleance;
	private String accNumber;
	private String name;
	
	public Account(String acc, String name, int bal) {  //������  �ν��Ͻ����� ���� acc���ڰ� this.accNumber�� ��.
		this.accNumber = acc;
		this.name = name;
		this.baleance = bal;
	}
	public void deposit(int baleance) { //���� baleance ���ڰ� this.baleance�� ��
		this.baleance += baleance;
	}
	public void withdraw(int baleance) {
		this.baleance -= baleance;
	}
	public void addInterest() {
		baleance += (baleance*interest);
	}
	public String getAccountNo() {
		return this.accNumber;    //this�ص� �ǰ� ���ص���
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
		Account customer1=new Account("111-222-33333333","������",20000);
		Account customer2=new Account("555-666-77777777","���ſ�",100000);
		System.out.println("�⺻ ������");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�ѹ��� �����");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("�������� ���"); 
		Account.interest=0.05;
		customer1.addInterest(); //����� �ݾ�=����+����*������
		customer2.addInterest();//����� �ݾ�=����+����*������
		printAccount(customer1);
		printAccount(customer2);
	}
	static void printAccount(Account customer){
		System.out.println("���¹�ȣ:"+customer.getAccountNo());
		System.out.println("�������̸�:"+customer.getAccountName());
		System.out.println("�ܾ�:"+customer.getBalance());
		System.out.println();
		}

	

}
