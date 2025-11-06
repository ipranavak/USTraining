package com.example;

import java.util.Scanner;

public class RightTri {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=5;i++) {
		for (int y=5;y>=i;y--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
