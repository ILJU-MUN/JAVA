package com.test2;

import java.util.function.BiFunction;

interface AddOp{
	int add(int a, int b);
}

public class Test5 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> d = (a,b) -> {return a+b;};
		//BiFunction�� �Ķ���͸� 2�� ���� 3��°�� ���ϰ�
		int r = d.apply(2, 3);
		System.out.println(r);
	}
}