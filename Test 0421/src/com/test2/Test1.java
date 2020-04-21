package com.test2;
public class Test1 {
	enum Season{
		WINTER, SPRING, SUMMER, FALL
	}
	enum Light{
		ON,OFF
	}
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
		}
		Season s = Season.WINTER;
		Season s1 = Season.SPRING;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.valueOf("WINTER").ordinal());
		System.out.println(Season.valueOf("SUMMER").ordinal()); // ordinal은 값의 순서를 보여줌
	}

}
