package com.test;

interface Printable5{
	void printLine(String str);
}

class SimplePrinter implements Printable5{
	public void printLine(String str) {
		System.out.println(str);
	}
}

class MultiPrinter extends SimplePrinter{    // Printable을 직접 구현함
	public void printLine(String str) {
		super.printLine("Strart of multi...");
		super.printLine(str);
		super.printLine("end of multi");
	}
}

public class P_376_377 {

	public static void main(String[] args) {
		Printable5 prn1 = new SimplePrinter();
		Printable5 prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable5) {
			prn1.printLine("This is a simple printer.");
		}
	}

}
