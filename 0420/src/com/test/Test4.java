package com.test;

import java.util.ArrayList;

class Box<T>{
	private T t;
	public  void add(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}
}
class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al = new ArrayList<T>();
	}
	public void setal(T v) {
		al.add(v);
	}
	public T getal(int inx) {
		return al.get(inx);
	}
}
public class Test4 {

	public static void main(String[] args) {
		Box<Integer> b = new Box<Integer>();
		b.add(new Integer(2));
		
		Box<String> b1 = new Box<String>();
		b1.add(new String("Hello Java"));
		System.out.println(b1.get());
		System.out.println(b.get());
	}

}
