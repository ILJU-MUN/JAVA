package com.test;


public class BBSItem {
	static int seqNo; 			//�Ϸù�ȣ �ʵ�
	String writer; 			//�ۼ��� �ʵ�
	String writtenDate;			//�ۼ����� �ʵ�
	String title;			//�����ʵ�
	String content;			//�����ʵ�
	 
	public BBSItem(String writer, String writtenDate, String title, String content){  //������
		this.seqNo++;  // or seqNo++
		// BBSItem �����ڿ��� ���� int seqNo�� ������ ���� �޼��忡�� ���� ��� �����ϴ� ���� �ǹ���
		// �׷��� ���� int seqNo�� ����� Ŭ���� seqNo�� ���뺯��(static)���� ����� this.seqNo++ ������� �׷��� �ν��Ͻ� �����Ҷ����� 1�� ����
		this.writer=writer;
		this.writtenDate=writtenDate;
		this.title=title;
		this.content=content;
	}
	public void outPut() {
		System.out.println(seqNo + writer + writtenDate + title + content);
	}
	
	public static void main(String[] args) {
		BBSItem b1 = new BBSItem("��", "��", "��", "��");
		b1.outPut();
		BBSItem b2 = new BBSItem("��", "��", "��", "��");
		b2.outPut();
	}

}
