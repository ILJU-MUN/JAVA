package com.test2;

public class P_444 {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);   // �ڽ�
		Double dObj = new Double(3.14);  // �ڽ�
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj.intValue();  // ��ڽ�
		double num2 = dObj.doubleValue();
		System.out.println(num1);
		System.out.println(num2);
		System.out.println();
	}

}
