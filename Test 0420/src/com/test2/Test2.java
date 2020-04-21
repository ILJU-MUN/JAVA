package com.test2;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A{}
class C extends A{}

public class Test2 {
	static void testMethod(List<? extends A> els) {
		for (Object o : els) {
			System.out.println(o);
		}
	}
	static <T extends A>void testMethod2(List<T> els) {
		for (Object o : els) {
				System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<A> aList = new ArrayList<A>();
		List<B> bList = new ArrayList<B>();
		testMethod(aList);
		testMethod(bList);
		testMethod2(aList);
		testMethod2(bList);
//		aList = bList;
//		bList = aList;
//		List<B> bList2 = aList;
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
	}
}
