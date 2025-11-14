package com.example;

public class Dog {
int legs=4;//instance variable
void eat()
{
	System.out.println("Eats bones");
}
public static void main(String[] args) {
	Dog d=new Dog();
	System.out.println("dog has "+d.legs+" legs");
	d.eat();
}
}
