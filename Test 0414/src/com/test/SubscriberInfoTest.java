package com.test;
class SubscriberInfo{
	String name;
	String id;
	String password;
	String phoneNo;
	String address;
	public SubscriberInfo(String nm, String id, String pass, String pn, String add) {
		this.name = nm;
		this.id = id;
		this.password = pass;
		this.phoneNo = pn;
		this.address = add;
	}
	public SubscriberInfo(String nm, String id, String pass) {
		this.name = nm;
		this.id = id;
		this.password = pass;
	}
	public SubscriberInfo() {}
	public void setAddress(String add) {
		this.address = add;
	}
	public void setPhoneNo(String pn) {
		this.phoneNo = pn;
	}
	
}
public class SubscriberInfoTest {

	public static void main(String[] args) {
		SubscriberInfo obj1, obj2,obj3;
		obj1=new SubscriberInfo("박유신","1017db","daewi");
		obj2=new SubscriberInfo("백곰","baekom","white", 			"200-000-0000","north pole");
		obj3=new SubscriberInfo();
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
		printSubscriberInfo(obj3);
		obj1.setAddress("교직원1숙사");
		obj1.setPhoneNo("133-1234-5678");
		printSubscriberInfo(obj1);
	}
	static void printSubscriberInfo(SubscriberInfo obj){
		System.out.println("이름:"+obj.name);
		System.out.println("아이디:"+obj.id);
		System.out.println("패스워드:"+obj.password);
		System.out.println("전화번호:"+obj.phoneNo);
		System.out.println("주소:"+obj.address);
		System.out.println();

	}

}
