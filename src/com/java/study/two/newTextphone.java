package com.java.study.two;

public class newTextphone implements INphone {

	@Override
	public void startos() {
		// TODO Auto-generated method stub
		System.out.println("我是另一个INphone的实现类，我正在启动程序！");
	}

	@Override
	public void printSelfName() {
		// TODO Auto-generated method stub
		System.out.println("我正在执行printSelfName方法！" + this.getClass());
	}

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
		System.out.println("我是实现INphone接口另一个实现类，我可以使用Ps软件");
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

