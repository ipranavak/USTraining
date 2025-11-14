package com.example;

import java.util.Scanner;

public class bi2dec {
	public static void main(String[] args) {
		System.out.print((int)Math.pow(2, 3));
		int i=0;
		int rem=0;
		int decimal=0;
		Scanner sc=new Scanner(System.in);
		int binary=sc.nextInt();
		while(binary>0) {
			rem=binary%10;
			decimal+=rem*(int)Math.pow(2,i);
			binary=binary/10;
			i++;
			
		}
		System.out.println(decimal);	}

}
