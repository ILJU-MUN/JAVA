package com.test;

public class Test5 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		for(int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		for(int a : arr) {
			System.out.println(a);
		}
		String[] str = {"�̼���", "������", "��������"};
		for(String nm : str) {                                //for-each��
			System.out.println(nm);
		}
	}

}
