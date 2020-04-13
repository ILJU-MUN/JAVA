package com.test;
class MyClass3{
	int a;
	static int b;
	public MyClass3() {
		
	}
	public static void setAValue(int x) {
		b = x;
		//setAValue(a); statitc 메서드는 statitc 변수만 호출 가능
	}
	public void setBValue(int y) {
		a = y;
		setAValue(10);
	}
}
public class Test9 {
	public static void main(String[] args) {
		MyClass3.b = 20;
		MyClass3 m = new MyClass3();
		m.a = 20;
		m.b = 30;
	}

}
