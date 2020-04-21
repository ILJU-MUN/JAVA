package com.test2;
interface Printable{
	void print(String s);
}
public class P_658 {
	public static void main(String[] args) {
		Printable prn = (s) -> {System.out.println(s);};
		prn.print("What is Lambda?");
	}

}
