package com.Destination.Static;

import java.util.Scanner;

class Farmer{
	double principle,time,si;
	static double rate;
	static {
		rate=2.678;
	}
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		principle=sc.nextDouble();
		
		System.out.println("enter the time in years");
		time=sc.nextDouble();
		
		
	}
	void calculate() {
		si=principle*time*rate;
	}
	
	void display() {
		System.out.println("The simple interest is :"+si);
	}
}

public class StaticEx2 {
	public static void main(String[] args) {
		Farmer f1=new Farmer();
		f1.collectData();
		f1.calculate();
		f1.display();
		System.out.println("-------------------------");
		Farmer f2=new Farmer();
		f2.collectData();
		f2.calculate();
		f2.display();
		System.out.println("-----------------------");
		Farmer f3=new Farmer();
		f3.collectData();
		f3.calculate();
		f3.display();
		System.out.println("==============================");
	}
}