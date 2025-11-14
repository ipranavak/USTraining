package com.example;

import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Word");
	String A=sc.next();
	int count=0;
	char[] arr={'a','e','i','o','u'};
	for(int i=0;i<A.length();i++)
	{
		for(int y=0;y<arr.length;y++) {
			
			count=(A.charAt(i)==arr[y])?count+1:count;
	}
}
System.out.println(count);
}
}
