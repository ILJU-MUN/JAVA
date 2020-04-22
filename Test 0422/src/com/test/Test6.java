package com.test;

import java.util.function.*;
interface Database2{void open(String dbName);}
public class Test6 {
	public static void main(String[] args) {
		Database2 db = (dbName) -> {
			System.out.println(dbName + "open");
		};
		
		Consumer<String> o = (dbName) -> {
			//          ↑ dbName 의 타입
			System.out.println(dbName + "open");
		};
		o.accept("Database");  // accept를 써야 파라미터가 들어감
	}

}
