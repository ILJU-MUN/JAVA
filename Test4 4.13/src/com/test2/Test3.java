package com.test2;
class Data{
	void open() {System.out.println("Data open");}
}
class Execl extends Data {
	void open() {System.out.println("Execl open");}
}
class Word extends Data{
	void open() {System.out.println("Word open");}
}
class TestModule{
	public void TestModule() {
		Data d = new Word();
		d.open();
	}
}
public class Test3 {

	public static void main(String[] args) {
		Execl e = new Execl();
		e.open(); //오버라이딩 되서 Execl의 메서드 호출
	}

}
