package com.test;
class MobilePhone{
	protected String number; //전화번호
	
	public MobilePhone(String num) {
		number = num;
	}
	public void answer() {
		System.out.println("Hi~  from" + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}
public class P_329_330 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-8888-9999", "3.5");
		sp.answer();
		sp.playApp();
	}

}
