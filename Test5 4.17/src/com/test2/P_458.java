
package com.test2;

import java.util.Random;

public class P_458 {
	public static void main(String[] args) {
		Random rand = new Random(12);
		
		for(int i =0; i < 7; i++) {
			System.out.println(rand.nextInt(1000));
		}
	}

}
