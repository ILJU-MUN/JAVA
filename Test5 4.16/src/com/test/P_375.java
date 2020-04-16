package com.test;
interface Printable4{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);  // 인터페이스의 static 메소드 호출
	}
}

//인터페으스 Printable4에는 구현해야 할 메소드가 존재하지 않는다.
class Printer implements Printable4{ }

public class P_375 {

	public static void main(String[] args) {
		String myDoc = "This is a report about ...";
		Printable4 prn = new Printer();
		prn.print(myDoc);
		
		//인터페이스의 static 메소드 직접 호출
		Printable4.printLine("end of line");
	}

}
