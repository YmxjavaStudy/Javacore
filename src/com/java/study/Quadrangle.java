package com.java.study;

public class Quadrangle {
	private Quadrangle[] qtest = new Quadrangle[6];//实例化保存四边形的数组对象
	private int nextIndex = 0;

	public void draw(Quadrangle q) {
		if (nextIndex < qtest.length) {
			qtest[nextIndex] = q;
			System.out.println(nextIndex);
			nextIndex++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrangle q = new Quadrangle();
		q.draw(new Square());//以正方形对象为参数调用draw()方法
		q.draw(new Parallelogramgle());//以平行四边形对象为参数调用draw()方法
	}

}

class Square extends Quadrangle {//定义一个正方形类，继承四边形类
	public Square() {
		System.out.println("正方形");
	}
}

class Parallelogramgle extends Quadrangle {//定义一个平行四边形类，继承四边形类
	public Parallelogramgle() {
		System.out.println("平行四边形");
	}
}