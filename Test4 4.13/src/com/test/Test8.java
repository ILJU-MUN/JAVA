package com.test;
class MyClass{
	//int count; // 클래스 내에서만 사용 가능한 변수
	static int count;  //전역변수로 카운트 계속 증가
	public MyClass() {
		count++;
		System.out.println(count);
	}
}
public class Test8 {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		MyClass mc2 = new MyClass();
		MyClass.count = 100;
	}

}
