package com.java.study.one;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public abstract class phone {
private String model;
private String height;
public abstract void startos();
public phone() {
	super();
	System.out.println("我是父类，现在执行的是父类抽象方法！");
}
public void Tphone() {
	// TODO Auto-generated method stub
	
}

}
