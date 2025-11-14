package com.example;

import java.util.Scanner;

public class Dec2Bi {
public static void main(String[] args) {
	int b=500;
	Scanner sc =new Scanner(System.in);;
	System.out.println("enter Number");
	int a=sc.nextInt();
	while(b>0) {
		b=a/2;
		System.out.printf(+a%2 +" ");
		a=b;
		
	}
}
}
