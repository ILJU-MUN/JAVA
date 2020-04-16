package com.test;

interface Animal2 {
	void breath();
}
interface Insect2 {
	void breath();
}
class Beetle implements Animal2, Insect2{
	public void breath() {
		System.out.println("Breath Beetle");
	}
}
public class Test5 {

	public static void main(String[] args) {
		Animal2 a = new Beetle();
		a.breath();
		Insect2 b = new Beetle();
		b.breath();
	}

}
