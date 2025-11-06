package com.example;

public class bank {
int amount=5000;
public static void main(String[] args) {
	bank b1=new bank();
	bank b2=new bank();
	b1.amount+=8000;
	System.out.println("first amount is " +b1.amount);
	System.out.println("second amount is" +b2.amount);
}
}

