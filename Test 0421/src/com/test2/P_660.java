package com.test2;
interface Printable2{
	void print(String s);
}
public class P_660 {
	public static void ShowString(Printable p, String s) {
		p.print(s);
	}
	public static void main(String[] args) {
		ShowString((s) -> {System.out.println(s);}, "What is rambda?");
	}

}
