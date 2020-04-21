package com.test;
class Apple1 extends Object{}
class Box2<T> extends Object{
	private T a;
	public Box2(T a) {  // Object a = new Apple();
		this.a = a;
	}
	public void setBox(T a) {
		this.a = a;
	}
	public T getBox() {
		return this.a = a;
	}
}
public class Test5 {

	public static void main(String[] args) {
		Object o = new Apple1();
		Object o1;
		o1 = new Apple1();
		Box2 b = new Box2(new Apple());
		Apple a = (Apple)b.getBox();
	}

}
