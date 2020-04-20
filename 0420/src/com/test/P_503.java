package com.test;

class Box6<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory{
	public static <T> Box6<T> makeBox(T o){
		Box6<T> box = new Box6<T>();
		box.set(o);
		return box;
	}
}
public class P_503 {
	public static void main(String[] args) {
		Box6<String> box = BoxFactory.makeBox("Sweet");
		System.out.println(box.get());
		
		Box6<Double> box2 = BoxFactory.makeBox(7.59);
		System.out.println(box2.get());
	}

}
