package demo;

import java.util.Scanner;

public class Customer2 extends SBIBank {
	public static void main(String[] args) {
		Customer1 c=new Customer1();
		System.out.println("Enter Amount");
		 Scanner sc= new Scanner(System.in);  
		int a= sc.nextInt();
		c.intrestRate(a);
	}

}
