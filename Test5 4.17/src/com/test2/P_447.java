package com.test2;

public class P_447 {
	public static void main(String[] args) {
		Integer num = 10;
		num++;
		System.out.println(num);
		
		num+=3;  // ����ڽ�, �����ڽ� ���� ����
		System.out.println(num);
		
		int r = num + 5;  // ���� ��ڽ� ����
		Integer rObj = num - 5;  // ���� ��ڽ� ����
		System.out.println(r);
		System.out.println(rObj);
	}
}
