package com.test2;
class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void gotoSchool() {
		System.out.println(name + "이 학교에 간다");
	}
}
public class Test3 {
	public static void main(String[] agrs) {
		Student s = new Student("문일주", 12);
		s.gotoSchool();
	}
}
