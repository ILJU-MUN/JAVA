package com.test;
class Man{
	String name;
	public Man(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}
class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}
public class P_321 {
	public static void main(String[] args) {
			BusinessMan m = new BusinessMan("길동", "네오플", "부장"); {
				m.tellYourInfo();
		}
	}
}