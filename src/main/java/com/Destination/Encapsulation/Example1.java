package com.Destination.Encapsulation;

import java.util.Scanner;

class Dog{
	String name;
	String breed;
	String color;
	int cost;
	int age;
	
	void setDataStatic() {
		name="Tummy";
		color="black";
		breed="Indie";
		cost=100;
		age=1;
	}
	
	void getData() {
		System.out.println("The dog details are:");
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	
	void setDataDynamic(String n,String col,String b,int c,int a) {
		name=n;
		color=col;
		breed=b;
		cost=c;
		age=a;
	}
}
public class Example1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dog d1=new Dog();
		d1.getData();
		
		d1.setDataStatic();
		d1.getData();
		System.out.println("----------------------------");
		
		Dog d2=new Dog();
		System.out.println("Enter dog name:");
		String name=sc.next();
		System.out.println("Enter dog color");
		String color=sc.next();
		System.out.println("Enter dog breed");
		String breed=sc.next();
		System.out.println("Enter the dog cost:");
		int cost=sc.nextInt();
		System.out.println("Enter the dog age:");
		int age=sc.nextInt();
		d2.getData();
	}

}