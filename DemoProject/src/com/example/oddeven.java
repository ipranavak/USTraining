package com.example;

import javax.swing.JOptionPane;

public class oddeven {

	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog(" Number"));
		//int b=Integer.parseInt(JOptionPane.showInputDialog("Add Second Number"));
		if(a%2==0) {
			JOptionPane.showMessageDialog(null, "Even");
		}
		else{
			JOptionPane.showMessageDialog(null, "Odd");
		}

	}

}
