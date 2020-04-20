package com.test2;
class Box<T extends Number>{  
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
	public int get2() {
		return ob.intValue();
	}
	public double get3() {
		return ob.doubleValue();
	}

}
public class Test6 {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.set(1234);
		System.out.println(box.get2());
		
		Box<Double> box1 = new Box<Double>();
		box1.set(11.2);
		System.out.println(box1.get3());
	}

}
