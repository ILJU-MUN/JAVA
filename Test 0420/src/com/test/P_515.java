package com.test;
class Box9<T>{
	private T ob;
	public void set(T o) {ob = o;}
	public T get() {return ob;}
	
	@Override
	public String toString() {
		return ob.toString();
	}
}
class Unboxer2{
	public static <T> T openBox(Box9<T> box) {
		return box.get();
	}
	
	//���� ���� ���빰�� Ȯ���ϴ�(����ϴ�) ����� ���׸� �޼ҵ�
	public static <T> void peekBox(Box9<T> box) {
		System.out.println(box);
	}
}

public class P_515 {
	public static void main(String[] args) {
		Box9<String> box = new Box9<>();
		box.set("So Simple String");
		Unboxer2.peekBox(box);  // ���� ���� ���빰�� Ȯ���� ����.
	}

}
