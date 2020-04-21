package com.test;
class Box7<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}
class BoxFactory2{
	public static <T extends Number>/*숫자만 쓸수있도록 제한*/ Box7<T>/*반환형*/ makeBox(T o){ 
		Box7<T> box = new Box7<T>();
		box.set(o);
		System.out.println("Boxed data : " + o.intValue());
		return box;
	}
}
class Unboxer{
	public static <T extends Number> T openBox(Box7<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
	}
}
public class P_506 {
	public static void main(String[] args) {
		Box7<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
		int n = Unboxer.openBox(sBox);
		System.out.println("Returned data : " + n);
	}

}
