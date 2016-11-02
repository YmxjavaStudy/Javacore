package com.java.Enum;

import java.awt.geom.Area;
import java.io.PrintStream;

public class Textenum {
	public static void print(Weekenum jin) {
		PrintStream out = System.out;
		switch (jin) {
		case MONDAY:
			out.println("周一");
			break;
		case TUESDAY:
			out.println("周二");
			break;
		case WEDNESDAY:
			out.println("周三");
			break;
		case THURSDAY:
			out.println("周四");
			break;
		case FRIDAY:
			out.println("周五");
			break;
		case SATURSDAY:
			out.println("周六");
			break;
		case SUNDAY:
			out.println("周日");
			break;
		}
	}

	public static void print2(Weekenum2 jin1) {
		PrintStream out = System.out;
		switch (jin1) {
		case MONDAY:
			out.println("周一");
			Printweek(jin1, out);
			break;
		case TUESDAY:
			out.println("周二");
			Printweek(jin1, out);
			break;
		case WEDNESDAY:
			out.println("周三");
			Printweek(jin1, out);
			break;
		case THURSDAY:
			out.println("周四");
			Printweek(jin1, out);
			break;
		case FRIDAY:
			out.println("周五");
			Printweek(jin1, out);
			break;
		case SATURDAY:
			out.println("周六");
			Printweek(jin1, out);
			break;
		case SUNDAY:
			out.println("周日");
			Printweek(jin1, out);
			break;
		}
	}

	private static void Printweek(Weekenum2 jin1, PrintStream out) {
		// TODO Auto-generated method stub
		out.println(jin1.getIndex() + "--" + jin1.getDesc());
	}

	public static void main(String[] args) {
		Area arr[] = new Area[2];
		// TODO Auto-generated method stub
		PrintStream out = System.out;
		out.println(Weekenum.SATURSDAY);
		out.println(Weekenum.SUNDAY);
		out.println("");
		print2(Weekenum2.WEDNESDAY);
		out.println("遍历数组并打印：");
		for (Weekenum2 string : Weekenum2.values()) {
			Printweek(string, out);
		}
	}

}
