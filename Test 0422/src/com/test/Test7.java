package com.test;

import java.util.function.Predicate;
interface CheckValue{
	boolean test2(Integer a);
}
public class Test7 {
	public static void main(String[] args) {
		Predicate<Integer> p = (a) -> (a > 18);   // true false �Ǻ� a�� �޾Ƽ� a�� 18���� ũ�� true �ƴϸ� false
		System.out.println(p.test(120));
		
		CheckValue c = (a) -> { 
			return (a > 18);
		};
		System.out.println(c.test2(20));
	}

}
