package com.example;

public class StaticDog {
static int bones=6;
public static void main(String[] args) {
	StaticDog d1=new StaticDog();
	StaticDog d2=new StaticDog();
	d1.bones+=700;
	System.out.println("no of initial bones "+d1.bones);
	System.out.println("no od bones later "+d2.bones);
	System.out.println(StaticDog.bones);
}
}
