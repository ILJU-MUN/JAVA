package com.test2;
class User {
	public String id;
	public String password;
	
	@Override
	public boolean equals(Object o) {
		User user = (User)o;
		boolean checkFlag = false;
		if(this.id == user.id && this.password == user.password) {
			checkFlag = true;
		}
		return checkFlag;
	}
}
public class Test4 {

	public static void main(String[] args) {
		User user = new User();
		user.id = "test";
		user.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password = "1234";
		if(user.equals(u2)) {
			System.out.println("Equal a user");
		}else {
			System.out.println("Not Equal a user");
		}
		
//		Object o = new Object();
//		Object o1 = new Object();
//		Object o2 = o;
//		if(o.equals(o2)) {
//			System.out.println("Equal");
//		}else {
//			System.out.println("Not equal");
//		}
	}

}
