package com.java.study.two;

public class TPhone implements Phone {

	public void startos() {
		// TODO Auto-generated method stub
 System.out.println("我是实现接口startos方法");
	}

	public void printSelfName() {
		// TODO Auto-generated method stub
System.out.println("我是实现接口printSelfName方法！");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Phone A=new TPhone();
A.printSelfName();
A.startos();

	}

}
