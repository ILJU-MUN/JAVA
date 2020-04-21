package com.test;
class MyClass{
	String m;
	void mMethod() {
	}
}

public class Test3 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[3];
		
		int[] arr2 = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		for (int inx = 0; inx < arr2.length; inx++) {
			System.out.println(arr2[inx]);
		}
		for (int a : arr2) {
			System.out.println(a);
		}
		MyClass[] arr3;
		arr3 = new MyClass[3];
		arr3[0] =  new MyClass();
		arr3[1] = new MyClass();
		arr3[2] = new MyClass();
		arr3[0].m = "ȫ�浿";
		System.out.println(arr3[0].m);
	}

}
