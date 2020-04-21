package com.test;


public class BBSItem {
	static int seqNo; 			//일련번호 필드
	String writer; 			//작성자 필드
	String writtenDate;			//작성일자 필드
	String title;			//제목필드
	String content;			//내용필드
	 
	public BBSItem(String writer, String writtenDate, String title, String content){  //생성자
		this.seqNo++;  // or seqNo++
		// BBSItem 생성자에서 인자 int seqNo을 받으면 메인 메서드에서 내가 계속 생성하는 것이 되버림
		// 그래서 인자 int seqNo을 지우고 클래스 seqNo를 공용변수(static)으로 만들고 this.seqNo++ 해줘야함 그래야 인스턴스 생성할때마다 1씩 증가
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
	}
	public void outPut() {
		System.out.println(seqNo + writer + writtenDate + title + content);
	}
	
	public static void main(String[] args) {
		BBSItem b1 = new BBSItem("기", "모", "링", "띠");
		b1.outPut();
		BBSItem b2 = new BBSItem("기", "모", "링", "띠");
		b2.outPut();
	}

}
