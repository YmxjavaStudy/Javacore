package com.java.study.two;

public class Textphone implements Phone, INphone {

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
System.out.println("����ʵ��INphone�ӿڣ��ҿ���ʹ��Ps���");
	}

	@Override
	public void startos() {
		// TODO Auto-generated method stub
System.out.println("����ʵ��Phone�ӿڣ���ʵ�ֵ���staros������");
	}

	@Override
	public void printSelfName() {
		// TODO Auto-generated method stub
System.out.println("����ʵ��Phone�ӿڣ���ʵ�ֵ���PrintSelfName������"+this.getClass());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
INphone impl1=new Textphone();
Phone impl2=new Textphone();
impl1.usePs();
impl1.startos();
impl2.startos();
impl2.printSelfName();
	}

}
