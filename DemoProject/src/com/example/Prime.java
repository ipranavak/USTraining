package com.example;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i=2;
		System.out.println("Enter Number");
		int a=sc.nextInt();
		while (i<=Math.sqrt(a)) {
			if(a%i==0) {
				System.out.println("not prime");
				return;		
			}
			i++;
			}
		System.out.println("Prime");
		}
		
	}
