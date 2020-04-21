package com.test;

interface Animal{
	void breath();
}
class Dog implements Animal{
	public void breath() {
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog bark");
	}
}
class Cat implements Animal{
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Cat meow");
	}
}

public class Test3 {
	public static void main(String[] args) {
	
		Dog d = new Dog();
		Animal a = d;
		a.breath();
		Animal c = new Cat();
		c.breath();
	}

}
