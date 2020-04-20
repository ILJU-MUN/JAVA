package com.test;
class Apple{
	public String toString() {
		return "I am an apple.";
	}
}
class Orange{
	public String toString() {
		return "I am an Orange";
	}
}
class Box1<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class P_491 {

	public static void main(String[] args) {
		Box1<Apple> aBox = new Box1<Apple>();  // T를 클래스로 할경우
		//aBox.set("Apple"); 프로그래머의 실수
		aBox.set(new Apple());
		Apple ap = aBox.get();
		System.out.println(ap);
		
		Box1<Orange> bBox = new Box1<Orange>();
		//bBox.set("Orange"); 프로그래머의 실수
		bBox.set(new Orange());
		Orange og = bBox.get();
		System.out.println(og);
		
		Box1<Integer> iBox = new Box1<Integer>();  // T를 Integer로 할경우
		iBox.set(123);
		System.out.println(iBox.get()); //그냥 가져오기
		
		int num = iBox.get();  // int num에 저장해서 가져오기
		System.out.println(num);
		
	}

}
