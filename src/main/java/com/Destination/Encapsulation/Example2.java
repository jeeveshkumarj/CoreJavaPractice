package com.Destination.Encapsulation;

import java.util.Scanner;

class Tiger{
	String name;
	String  color;
	String country;
	int age;
	
	void setStaticName() {
		name="Ramu";
	}
	void setStaticColor() {
		color="Orange";
	}
	void setStaticCountry() {
		country="Africa";
	}
	void setStaticAge() {
		age=12;
	}
	void setDynamicName(String n) {
		name=n;
	}
	void setDynamicColor(String col) {
		color=col;
	}
	void setDynamicCountry(String c) {
		country=c;
	}
	void setDynamicAge(int a) {
		age=a;
	}
	
	String getName() {
		return name;
	}
	String getColor() {
		return color;
	}
	
	String getCountry() {
		return country;
	}
	
	int getAge() {
		return age;
	}
	
	
}
public class Example2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tiger t1=new Tiger();
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("--------------------");
		t1.setStaticName();
		t1.setStaticColor();
		t1.setStaticCountry();
		t1.setStaticAge();
		
		System.out.println(t1.getName());
		System.out.println(t1.getColor());
		System.out.println(t1.getCountry());
		System.out.println(t1.getAge());
		System.out.println("--------------------");
		Tiger t2=new Tiger();
		t2.setDynamicName("Sherkhan");
		t2.setDynamicColor("White");
		t2.setDynamicCountry("India");
		t2.setDynamicAge(20);
		
		System.out.println(t2.getName());
		System.out.println(t2.getColor());
		System.out.println(t2.getCountry());
		System.out.println(t2.getAge());
		
	}

}
