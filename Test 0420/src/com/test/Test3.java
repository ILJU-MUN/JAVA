package com.test;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("one");
		a1.add("two");
		for(String s : a1) {
			System.out.println(s);
		}
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		for(Integer s : a2) {
			System.out.println(s);
		}
	}

}
