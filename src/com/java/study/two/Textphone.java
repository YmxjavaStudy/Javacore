package com.java.study.two;

public class Textphone implements Phone, INphone {

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
System.out.println("我是实现INphone接口，我可以使用Ps软件");
	}

	@Override
	public void startos() {
		// TODO Auto-generated method stub
System.out.println("我是实现Phone接口，我实现的是staros方法！");
	}

	@Override
	public void printSelfName() {
		// TODO Auto-generated method stub
System.out.println("我是实现Phone接口，我实现的是PrintSelfName方法！"+this.getClass());
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
