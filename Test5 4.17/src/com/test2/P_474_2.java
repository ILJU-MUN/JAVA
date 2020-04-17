package com.test2;

import java.util.Arrays;

class Student2 implements Comparable{
	int rollno;
	String name;
	int age;
	public Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student2 s = (Student2)o;
		if(this.name.length() > s.name.length())
			return 1;
		else 
			return -1;
	}
}
public class P_474_2 {
	public static void main(String[] args) {
		Student2[] stus  = new Student2[3];
		stus[0] = new Student2(1, "우진뒤져", 25);
		stus[1] = new Student2(2, "김우진뒤져", 10);
		stus[2] = new Student2(3, "김우진뒤져버려", 40);
		Arrays.sort(stus);
		for(Student2 s : stus) {
			System.out.println(s.name);
		}
	}

}
