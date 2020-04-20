package com.test;
class Box4<T extends Number>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
public class P_498 {

	public static void main(String[] args) {
		Box4<Integer> iBox = new Box4<>(); // Integer는 Number를 상속
		iBox.set(24);
		
		Box4<Double> dBox = new Box4<>(); // Double은 Number를 상속
		dBox.set(5.97);
		
		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}

}
