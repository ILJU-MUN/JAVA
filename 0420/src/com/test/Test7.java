package com.test;

class Store<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T getValue() {
		return this.t;
	}
}
class Box8<T, S>{
	private T t;
	private S s;
	public void add(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public T getFirst() {
		return this.t;
	}
	public T getTwo() {
		return this.t;
	}
}
public class Test7 {

	public static void main(String[] args) {
		Box8<String, Integer> b = new Box8<String, Integer>();
		b.add("홍길동", 1234);
		System.out.println(b.getFirst());
		Box8<String, Store<String>> b1 = new Box8<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("test");
		b1.add("강감찬", s);
		System.out.println(b1.getFirst());
		System.out.println(s.getValue());
	}

}
