package com.test2;
class School{
	private int m = 10;
	class Student{
		void msg() {System.out.println(m);}
	}
}
class School2{
	private static int m = 10;
	static class Student2{
		void msg() {System.out.println(m);}
	}
}
public class Test4 {
	public static void main(String[] args) {
		School s = new School();
		//School.Student s2 = new School.Student();
		School.Student s3 = s.new Student();
		s3.msg();
		
		School2.Student2 s4 = new School2.Student2();
		s4.msg();
	}

}
