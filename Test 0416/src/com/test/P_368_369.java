package com.test;
interface Printable{ // MS사가 제공한 인터페이스
 	void print(String doc);  // 흑백 출력을 위한 추상 메서드
}

class Prn204Drv implements Printable{

	@Override
	public void print(String doc) {
			System.out.println("From Md-204 printer");
			System.out.println(doc);
		}
	}
	
class Prn731Drv implements Printable {

	@Override
	public void print(String doc) {		// L사의 흑백 프린터 드라이버
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	} 
}

public class P_368_369 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		
		Printable prn = new Prn204Drv();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn731Drv();
		prn.print(myDoc);
	}
}
