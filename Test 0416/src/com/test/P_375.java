package com.test;
interface Printable4{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);  // �������̽��� static �޼ҵ� ȣ��
	}
}

//���������� Printable4���� �����ؾ� �� �޼ҵ尡 �������� �ʴ´�.
class Printer implements Printable4{ }

public class P_375 {

	public static void main(String[] args) {
		String myDoc = "This is a report about ...";
		Printable4 prn = new Printer();
		prn.print(myDoc);
		
		//�������̽��� static �޼ҵ� ���� ȣ��
		Printable4.printLine("end of line");
	}

}
