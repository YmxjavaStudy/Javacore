package com.java.study.two;

public class TPhone implements Phone {

	public void startos() {
		// TODO Auto-generated method stub
 System.out.println("����ʵ�ֽӿ�startos����");
	}

	public void printSelfName() {
		// TODO Auto-generated method stub
System.out.println("����ʵ�ֽӿ�printSelfName������");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone A=new TPhone();
A.printSelfName();
A.startos();

	}

}
