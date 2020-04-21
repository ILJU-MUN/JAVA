package com.test2;
//오토박싱, 오토 언박싱
public class P_446 {
	public static void main(String[] args) {
		Integer iObj = 10;     // 오토 박싱 진행
		Double dObj = 3.14;  // 오토 언박싱 진행
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println();
		
		int num1 = iObj;
		double num2 = dObj;
		System.out.println(num1);
		System.out.println(num2);
	}

}
