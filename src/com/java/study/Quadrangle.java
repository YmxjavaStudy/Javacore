package com.java.study;

public class Quadrangle {
	private Quadrangle[] qtest = new Quadrangle[6];//ʵ���������ı��ε��������
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
		q.draw(new Square());//�������ζ���Ϊ��������draw()����
		q.draw(new Parallelogramgle());//��ƽ���ı��ζ���Ϊ��������draw()����
	}

}

class Square extends Quadrangle {//����һ���������࣬�̳��ı�����
	public Square() {
		System.out.println("������");
	}
}

class Parallelogramgle extends Quadrangle {//����һ��ƽ���ı����࣬�̳��ı�����
	public Parallelogramgle() {
		System.out.println("ƽ���ı���");
	}
}