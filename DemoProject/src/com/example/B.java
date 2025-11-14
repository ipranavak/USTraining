package com.example;
class A{
	A(){
		System.out.println("A class Constructor");
	}
	A(int x){
		System.out.println("The value is"+x);
	}
}
public class B extends A {
	B(){
		super(5);
		System.out.println("B class Constructor");
	}
	B(int x){
		super(x);
		System.out.println("B class x value is"+x);
	}
public static void main(String[] args) {
	new B();
}
}
