package com.java.study.two;

public class newTextphone implements INphone {

	@Override
	public void startos() {
		// TODO Auto-generated method stub
		System.out.println("������һ��INphone��ʵ���࣬��������������");
	}

	@Override
	public void printSelfName() {
		// TODO Auto-generated method stub
		System.out.println("������ִ��printSelfName������" + this.getClass());
	}

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
		System.out.println("����ʵ��INphone�ӿ���һ��ʵ���࣬�ҿ���ʹ��Ps���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INphone impl3 = new newTextphone();
		impl3.startos();
		impl3.usePs();
		impl3.printSelfName();
		System.out.println("***********************");
		Phone impl4 = new Textphone();
		impl4.startos();
		impl4.printSelfName();
        
	}

}

