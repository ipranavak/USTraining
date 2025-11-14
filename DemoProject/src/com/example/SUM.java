package com.example;

import java.util.Scanner;

public class SUM {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		System.out.println("Enter Number");
		int i= sc.nextInt();
		while(i>0){
			sum=sum+i;
			i--;
			
		}
		System.out.println("Sum is "+sum);
	}

}
