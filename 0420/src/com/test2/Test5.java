package com.test2;
interface IAnimal<T> {
	void breath();
	void set(T t);
	T get();
}
class Animal<T> implements IAnimal<T>{
	T animal;
	@Override
	public void breath() {System.out.println("Animal breath");}

	@Override
	public void set(T t) {this.animal = t;}

	@Override
	public T get() {return this.animal;}
	
}
class Dog{}
public class Test5 {
	public static void main(String[] args) {
		Animal<Dog> a = new Animal<Dog>();
		a.set(new Dog());
		Dog a1 = a.get();
		a.breath();
	}

}
