package com.test;
class MyClass4{
	static int a;
	static int b;
	static {   // static 변수 한꺼번에 초기화
		a = 1; 
		b = 2;
		System.out.println("Statitc Initialize");
	}
}
public class Test10 {

	public static void main(String[] args) {
		MyClass4 mc = new MyClass4();
	}

}
