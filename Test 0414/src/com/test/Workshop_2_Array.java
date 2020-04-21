package com.test;
public class Workshop_2_Array {

	public static void main(String[] args) {
		String student1[][] = new String[][] {
			{"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"},
			{"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"},
			{"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
			{"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"},
			{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"}
		};
		String answer[][] = new String[][] { {
			"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"}};			
		
		for(int i = 0; i < 5 ; i++) {
			int count = 0;
			for(int j = 0; j < 10; j++) {
				if(student1[i][j] == answer[0][j]) {
					count++;
				}
			}
			System.out.println("The Student " + (i+1) + "'s" + " Score is " + count);
		}
		}
		}
	


