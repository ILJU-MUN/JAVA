package com.test;

import java.util.*;
import java.util.List;

class Student implements Comparable{
	public int age;
	public Student(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student stu = (Student)o;
		if(this.age > stu.age)
		return 1;
		else if(this.age < stu.age)
			return -1;
		else 
			return 0;
	}
}
public class Test2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		Student[] stuArr = new Student[3];  //������ �����
		stuArr[0] = new Student(1);    
		stuArr[1] = new Student(3);
		stuArr[2] = new Student(2);
		
		//��� 1.
		for(int inx = 0; inx < stuArr.length; inx++) {
			Student s = stuArr[inx];
			System.out.println(s.age);
		}
		System.out.println();
		//��� 2.
		for(Student s : stuArr) {
			System.out.println(s.age);
		}
		//sort ���. Ŭ������ implements Comparable �������
		System.out.println();
		
		Arrays.sort(stuArr);
		for(Student s : stuArr) {
			System.out.println(s.age);
		}
		List<Student> stu2 = new ArrayList<>();
		stu2.add(new Student(1));
		stu2.add(new Student(3));
		stu2.add(new Student(2));
		
		for(int jnx = 0; jnx < stu2.size(); jnx++ ) {
			System.out.println(stu2.get(jnx).age);
		}
		System.out.println();
		
		for(Student s : stu2) {
			System.out.println(s.age);
		}
		System.out.println();
		
		Iterator<Student> ltr = stu2.iterator();
		while(ltr.hasNext()) { //(ltr.hasNext) ���� ��ġ���� ���� �����Ͱ� ���� ������ �ݺ�	
			System.out.println(ltr.next().age);
		}
		System.out.println();
		Collections.sort(stu2);
		for(Student s : stu2) {
			System.out.println(s.age);
		}
	}
}

