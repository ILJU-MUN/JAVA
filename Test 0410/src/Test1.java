/*
 * 학생
 * - 이름, 나이, 키 ....
 * - 공부한다, 집에간다
 * 
 */
class Student {
	String name;
	int age;
	int height;
	void study() {System.out.println(name + "," + age + "," + height);};
	void gotohome() {};
}

/*
 * 학교
 *  - 위치, 명수
 *  - 수업한다.
 */
class School {
	String location;
	int qty;
	void teaching() {System.out.println("학교위치 : " + location + "," + "명수:" + qty );};
}

public class Test1 {
	
	public static void main(String[] args) {
		Student std = new Student(); //첫번째 학생 (인스턴스)
		std.name = "문일주";
		std.age = 27;
		std.height = 173;
		std.study();
		
		Student std2 = new Student(); //두번째 학생 (인스턴스)
		Student std3 = std; 
		
		School sho = new School();
		sho.location = "안산시 부곡동";
		sho.qty = 500;
		sho.teaching();
		Test(std);
	}
	
	static void Test(Student s) {	// Student s = std;
		s.study();
		}
	
}
