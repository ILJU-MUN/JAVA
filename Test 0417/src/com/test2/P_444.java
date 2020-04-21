package com.test2;

public class P_444 {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);   // ¹Ú½Ì
		Double dObj = new Double(3.14);  // ¹Ú½Ì
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj.intValue();  // ¾ð¹Ú½Ì
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
	}

}
