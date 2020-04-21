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
		Box1<Apple> aBox = new Box1<Apple>();  // T�� Ŭ������ �Ұ��
		//aBox.set("Apple"); ���α׷����� �Ǽ�
		aBox.set(new Apple());
		Apple ap = aBox.get();
		System.out.println(ap);
		
		Box1<Orange> bBox = new Box1<Orange>();
		//bBox.set("Orange"); ���α׷����� �Ǽ�
		bBox.set(new Orange());
		Orange og = bBox.get();
		System.out.println(og);
		
		Box1<Integer> iBox = new Box1<Integer>();  // T�� Integer�� �Ұ��
		iBox.set(123);
		System.out.println(iBox.get()); //�׳� ��������
		
		int num = iBox.get();  // int num�� �����ؼ� ��������
		System.out.println(num);
		
	}

}
