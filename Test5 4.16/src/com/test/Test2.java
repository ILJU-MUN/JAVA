package com.test;

class Student{
	// member variables
	protected String name;
	protected int age;
	// constructors
	public Student(){
		this.name = "홍길동";
		this.age = 20;
	}
	// constructor overloading
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	// member methods
	public void studying() {System.out.println("Student studying");}
	// method overloading
	public void studying(String msg) {System.out.println("Student studying " + msg);}
}
class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() {
		this.name = "강감찬";
		this.age = 25;
		this.grade = 50;
	}
	public MiddleStudent(String name, int age, int grade) {
		super(name, age);
		/*this.name = name;
		this.age = age;*/
		this.grade = grade;
	}
	public void playingGame() {System.out.println("MiddleStudent playingGame");}
	public void studying() {System.out.println("MiddleStudent studying");}
	public void studying(String msg) {System.out.println("MiddleStudent studying " + msg);}
}
public class Test2 {

	public static void main(String[] args) {
		//Student std = new Student();
		//MiddleStudent std2 = new MiddleStudent();
		MiddleStudent midStu2 = new MiddleStudent("이순신", 20, 50);
		midStu2.studying();
		midStu2.playingGame();
		
		Student midStu3 = new MiddleStudent("권율", 50, 50);
		midStu3.studying();
		midStu3.studying("마마");
		
		MiddleStudent stu = (MiddleStudent)midStu3;
		stu.playingGame();
		stu.studying();
		stu.studying("ㅂ무릉");
		
	}

}
