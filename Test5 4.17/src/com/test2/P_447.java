package com.test2;

public class P_447 {
	public static void main(String[] args) {
		Integer num = 10;
		num++;
		System.out.println(num);
		
		num+=3;  // 오토박싱, 오토언박싱 동시 진행
		System.out.println(num);
		
		int r = num + 5;  // 오토 언박싱 진행
		Integer rObj = num - 5;  // 오토 언박싱 진행
		System.out.println(r);
		System.out.println(rObj);
	}
}
