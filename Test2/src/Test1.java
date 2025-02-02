// Instance variable (공용으로 사용)
// static variable 메모리에 미리 적재되있어서 바로 사용 가능
class A{
	int data = 50; // Instance variable 
	static int m = 100; // static variable 
	//함수
	void method() {
		int n = 90; // local variable
	}
}

class Student{
	String name;
	int age;
	void goSchool() {
		System.out.println(name + age + "세" + "학교에 가다.");
	}
}

public class Test1 {
	// Local variable  메서드(함수) 내의 변수들이 로컬변수
	public static void main(String[] args) {
		Student stu = new Student(); //인스턴스 밸류 사용
		stu.name = "이순신";
		stu.age = 20;
		stu.goSchool(); // 메모리에서 추출
		
		System.out.println(A.m);
		A.m = 200;
		System.out.println(A.m);
		A a = new A();
		System.out.println(a.data);
		
		String str = "1234";
		int a1 = Integer.parseInt(str);
		Integer a2 = new Integer(a1); // Wrapper class
		String str2 = a2.toString(); // look up
		
	}

}
