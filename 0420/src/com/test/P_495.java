package com.test;
class Box3<T>{
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class P_495 {
	public static void main(String[] args) {
		Box3<String> sBox = new Box3<String>();  // Box의 스트링 형태에?
		sBox.set("I am so happy");
		
		Box3<Box3<String>> wBox = new Box3<>(); // box3를 box3로 포장해서 스트링형태의 객채를 생성 , 그래서 밑에 주소값만 나옴
		wBox.set(sBox);
		
		Box3<Box3<Box3<String>>> zBox = new Box3<>();
		zBox.set(wBox);
		System.out.println(zBox.get().get().get());
		System.out.println(sBox.get());
		System.out.println(wBox.get());  //주소값
		System.out.println(zBox.get());  //주소값
	}

}
