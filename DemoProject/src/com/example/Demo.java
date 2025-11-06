package com.example;

import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Demo {

	public static void main(String[] args) {
		System.out.println("welcome 2 java");
		Dog.main(null);
		JButton jb=new JButton("Click me");
		int a=Integer.parseInt(JOptionPane.showInputDialog(jb,"Enter Name"));
		//int a= Integer.parseInt(name);
		//String b=JOptionPane.showInputDialog(component, object)
		System.out.println(a);
		JOptionPane.showMessageDialog(jb, "Hai "+a+" welcome");
	}

	}


