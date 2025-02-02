package com.workshop1;

import java.util.Scanner;

// 문제 1.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop01 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        
        System.out.print( " 아메리카노 주문 수량 : " );
        int i = getUserInput();
        
        System.out.print( " 카페라떼 주문 수량 : " );
        int il = getUserInput();
        
        
        System.out.print( " 베이글 주문 수량 : " );
        int b = getUserInput();
        
        
        System.out.print( " 크림치즈 주문 수량 : " );
        int c = getUserInput();
        
        System.out.println("========= 금액 ==========");
        System.out.println("아메리카노 주문 개수 : " + i);
        System.out.println("카페라떼 주문 개수 : " + il);
        System.out.println("베이글 주문 개수 : " + b);
        System.out.println("크림치즈 주문 개수 : " + c);
        
        int sum = function(i, il, b, c);
        System.out.println("총 구매 금액은" + sum + "원 입니다");
        
        double point = 0;
        if ((sum >= 12000) && sum < 30000) {
        	point = sum * 0.01;
        	System.out.println("적립 금액은 " + point + "원 입니다." );
        	
        } else if (sum >= 30000) {
        	point = sum * 0.02; 
        	System.out.println("적립 금액은" + point + "원 입니다.");
        	
        	} else {
        		System.out.println("적립금은 " + point + "원 입니다.");
        	}
        }
        
        
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
    public static int function(int i, int il, int b, int c) {
    	int sum = (i * 2000) + (il * 3000) + (b * 1500) + (c * 500);
    	return sum;
    }
}
