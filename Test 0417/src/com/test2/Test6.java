package com.test2;

import java.util.StringTokenizer;

public class Test6 {

	public static void main(String[] args) {
		String str = "µÎ:ºÎ:´Â:±Í:¿±:´Ù";
		StringTokenizer s =  new StringTokenizer(str, ":");
		while(s.hasMoreTokens()) {
			System.out.print(s.nextToken() + " ");
		}
	}
}
