//메서드 오버라이딩 (메서드 이름 같아도 들어가는 변수 갯수가 다르면 중복 가능)

package com.test;
class Calculator{
	int result;
	
	public Calculator() { //result값 0으로 초기화 시키는 생성자 
		result = 0;
	}
	public Calculator(int r) { // 입력값 있으면 얘 호출
		result = r;
	}
	int add(int a, int b) {  //변수 따로
		 int result = a + b;
		 return result;
	}
	int subtract(int a, int b) {
		int result = a - b;
		return result;
	}
	int add(int a, int b, int c) {
		int result = a + b + c;
		return result;
	}
	

}
public class Test3 {

	public static void main(String[] args) { //변수 따로
		Calculator ca = new Calculator();
		int c = ca.add(1, 2);
		System.out.println(c);
		int a = 1;
		int b = 2;
		int result = ca.add(a, b);
		System.out.println(result);
		int d = ca.subtract(5, 1);
		System.out.println(d);
		
		Calculator ca2 = new Calculator(100);
		int i = ca2.result;
		System.out.println(ca2.result);
		int j = ca.add(i, 20);
		System.out.println(j);
		
	}

}
