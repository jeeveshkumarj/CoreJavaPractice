package com.Destination.Static;

public class StaticEx {
	static int a,b,c;
	int p,q,r;
	//static block
	static {
	a=100;
	b=200;
	c=300;
	// p=400; cannot initiallize non static variables
	}
	//non static block
	{
		p=1000;
		q=2000;
		c=3000;
		a=10001;
	}
	static void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(p);
	}
	void display2() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(a);
	}


	public static void main(String[] args) {
		System.out.println(StaticEx.a);
		System.out.println(StaticEx.b);
		System.out.println(StaticEx.c);
		System.out.println("---------------------");
		StaticEx.display1();
		
		StaticEx ob= new StaticEx();
		System.out.println(ob.a);
		System.out.println(ob.b);
		System.out.println(ob.c);
		ob.display2();
		ob.display1();
		
	}
}
