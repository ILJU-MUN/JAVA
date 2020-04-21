package com.test;
class Animal<T>{
	T b;
	void setBreat(T b) {this.b = b;}
	T getBreath() {
		return b;
	}
}

class Dog{
	@Override
	public String toString() {
		return "Dog";
	}
}
class Cat{
	public String toString() {
		return "Cat";
	}
}

public class Test2 {

	public static void main(String[] args) {
		Animal<Dog> a = new Animal<Dog>();
		a.setBreat(new Dog());
		Dog a1 = a.getBreath();
		System.out.println(a1);
		
		Animal<Cat> c = new Animal<Cat>();
		c.setBreat(new Cat());
		Cat c1 = c.getBreath();
		System.out.println(c1);
	
		
		
	}

}
