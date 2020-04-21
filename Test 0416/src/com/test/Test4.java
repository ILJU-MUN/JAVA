package com.test;

interface IShape {
	void draw(int a, int b);
}
class Circle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Circle : " + a + "," + b);
	}
}
class Rectangle implements IShape{
	public void draw(int a, int b) {
		System.out.println("Draw a Rectangle : " + a + "," + b);
	}
}
class DrawManager{
	IShape s;
	public DrawManager(IShape s) {  // IShape s = new Circle();
		this.s = s;
	}
	public void draw(int a, int b) {
		this.s.draw(a, b);
	}
}
public class Test4 {

	public static void main(String[] args) {
		DrawManager d = new DrawManager(new Circle());
		d.draw(1, 2);
		DrawManager r = new DrawManager(new Rectangle());
		r.draw(2, 4);
	}
}
