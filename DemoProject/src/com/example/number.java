package com.example;

import javax.swing.JOptionPane;

public class number {
	public static void main(String[] args) {
		//System.out.println("Hello there");
		//System.out.println(args[2]);
		int a= Integer.parseInt(args[2]);
		//System.out.println("Square is "+a*a);
		JOptionPane.showMessageDialog(null, "Square is "+a*a);
	}

}
