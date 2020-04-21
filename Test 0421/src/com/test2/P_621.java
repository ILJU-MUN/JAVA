package com.test2;
enum Animal{
	DOG, CAT
}

enum Person{
	MAN, WOMAN
}

public class P_621 {
	public static void main(String[] args) {
		who(Person.MAN); // 정상적인 메소드 호출
		//who(Animal CAT);  // 비정상적인 메소드 호출
			}
	
	public static void who(Person man) {
		switch (man) {
		case MAN :
			System.out.println("남자손님 입니다.");
			break;
		case WOMAN :
			System.out.println("여성손님 입니다.");
			break;
		}
	}
}
