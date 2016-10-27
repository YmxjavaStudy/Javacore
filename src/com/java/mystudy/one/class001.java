package com.java.mystudy.one;

import lombok.Getter;
import lombok.Setter;


class person{
	@Setter  @Getter
	private String name="yan";
	@Setter @Getter
	private int age=25;
	public person(){}
	public person(String n,int a){
	name=n;
	age=a;
	System.out.println("public person(String n,int a)");
	}
	public String talk(){
		return"我的名字"+name+"年龄"+age;
	}
}


public class class001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
person person=new person("zhangsan ",   25);
person.talk();
System.out.println(person.talk());

	}

}
