package com.Destination.OperatorsAndLoops;

public class ArithmeticOperationExample {
	public static void main(String[] args) {
		int a=100;
		int b=50;
		System.out.println("The value1="+a);
		System.out.println("The value2="+b);
		
		ArithmeticOperations ob=new ArithmeticOperations();
		ob.add(a, b);
		ob.sub(a, b);
		ob.mul(a, b);
		ob.div(a, b);
		ob.mod(a, b);
		
		
	}

}
