package com.test;

class Box2{
	private String conts;
	Box2(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}
public class P_289 {

	public static void main(String[] args) {
		Box2[] ar = new Box2[4];
		
		//배열 인스턴스 저장
		ar[0] = new Box2("First");
		ar[1] = new Box2("Second");
		ar[2] = new Box2("Third");
		ar[3] = new Box2("");
		
		//저장된 인스턴스의 참조
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		for (Box2 a : ar) {
			System.out.println(a);
		}
		
		for(int x = 0; x < ar.length; x++ ) {
			System.out.println(ar[x]);
		}
	}

}
