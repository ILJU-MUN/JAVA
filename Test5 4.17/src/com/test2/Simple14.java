package com.test2;

import java.util.Arrays;

class Student1 implements Comparable{
	int rollno;
	String name;
	int age;
	public Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student1 s = (Student1)o;
		if(this.age == s.age)
			return 0;
		else if(this.age > s.age)
			return 1;
		else 
			return -1;
	}
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
}
public class Simple14 {
	public static void main(String[] args) {
		Student1[] stus  = new Student1[3];
		stus[0] = new Student1(1, "홍길동", 25);
		stus[1] = new Student1(2, "이순신", 10);
		stus[2] = new Student1(3, "강감찬", 40);
		Arrays.sort(stus);
		for(Student1 s : stus) {
			System.out.println(s);
		}
	}

}
