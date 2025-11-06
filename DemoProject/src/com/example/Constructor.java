package com.example;

public class Constructor {
	Constructor()
	{
		//System.out.println("jsddhdh");
	}
	Constructor(int x){
		this.(88);
		System.out.println("name is"+x);
		}
	
	void eat()
	{	
		System.out.println("Eats rats");
	}
	void eat(int a) {
		System.out.println("eats"+a+"rats");
	}
	public static void main(String[] args) {
		Constructor c=new Constructor();
		c.eat();
		c.eat(4);
		new Constructor(4);
	}
}
