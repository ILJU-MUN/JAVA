package com.test2;
enum Animal{
	DOG, CAT
}

enum Person{
	MAN, WOMAN
}

public class P_621 {
	public static void main(String[] args) {
		who(Person.MAN); // �������� �޼ҵ� ȣ��
		//who(Animal CAT);  // ���������� �޼ҵ� ȣ��
			}
	
	public static void who(Person man) {
		switch (man) {
		case MAN :
			System.out.println("���ڼմ� �Դϴ�.");
			break;
		case WOMAN :
			System.out.println("�����մ� �Դϴ�.");
			break;
		}
	}
}
