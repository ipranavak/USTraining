package com.example;

import java.util.Scanner;

public class ArrayC {
public static void main(String[] args) {
	int a=0;
	Scanner sc= new Scanner(System.in);
	int marks[]=new int[5];
	for(int i=0;i<marks.length;i++) {
		System.out.println("enter mark");
		marks[i]=sc.nextInt();
		a+=marks[i]<40?1:0;
			}
	System.out.println("ENtered numbers are:");
//	for(int n:marks) {
//		System.out.println(n);
//	}
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
}
	System.out.println(a);
}
}
