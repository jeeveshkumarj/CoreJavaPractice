package com.Destination.Constructor;


class Dog{
	String name;
	String color;
	String breed;
	int cost;
	int age;
	
	//default const
	public Dog() {
		System.out.println("Default Constructor");
	}
	
	//1 parameter const
	public Dog(String name) {
		this("Dacchu","Brown");
		System.out.println("Inside single parameterized constructor");
		this.name=name;
	}
	
	public Dog(String name,String color) {
		this("Farro","Yellow","Pug");
		System.out.println("Inside 2 parameterized constructor");
		this.name=name;
		this.color=color;
	}
	
	public Dog(String name,String color,String breed) {
		this("Hima","Blue","GR",5000);
		System.out.println("Inside 3 parameterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
	}
	
	public Dog(String name,String color,String breed,int cost) {
		this("Rocky","Black","GR -Imported",19000,5);
		System.out.println("Inside 4 parameterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost=cost;
	}
	
	public Dog(String name,String color,String breed,int cost,int age) {
		super();
		System.out.println("Inside 5 parameterized constructor");
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.color=color;
		this.age=age;
		
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getBreed() {
		return breed;
	}

	public int getCost() {
		return cost;
	}

	public int getAge() {
		return age;
	}
	
}
public class Const1 {
	public static void main(String[] args) {
		Dog d1= new Dog();
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getCost());
		System.out.println(d1.getAge());
		System.out.println("===================================================");
		
		Dog d2=new Dog("tommy","orange-white","Indie",7,0);
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getCost());
		System.out.println(d2.getAge());
		System.out.println("=====================================================");
		
		Dog d3=new Dog("Ramu");
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getBreed());
		System.out.println(d3.getCost());
		System.out.println(d3.getAge());
		
	}

}
