package com.test;
class Box10<T>{
	private T ob;
	public void set(T o) { ob = o;}
	public T get() { return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Unboxer3{
	public static <T> T openBox(Box10<T> box) {
		return box.get();
	}
	public static void peekBox(Box10<?> box) { // 와일드 카드 사용
		System.out.println(box);
	}
}
public class P_516 {
	public static void main(String[] args) {
		Box10<String> box = new Box10<>();
		box.set("So Simple String");
		Unboxer3.peekBox(box);
	}

}
