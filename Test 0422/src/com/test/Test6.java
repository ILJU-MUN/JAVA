package com.test;

import java.util.function.*;
interface Database2{void open(String dbName);}
public class Test6 {
	public static void main(String[] args) {
		Database2 db = (dbName) -> {
			System.out.println(dbName + "open");
		};
		
		Consumer<String> o = (dbName) -> {
			//          �� dbName �� Ÿ��
			System.out.println(dbName + "open");
		};
		o.accept("Database");  // accept�� ��� �Ķ���Ͱ� ��
	}

}
