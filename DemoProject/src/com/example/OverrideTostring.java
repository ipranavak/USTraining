package com.example;

public class OverrideTostring {

	@Override
	public String toString() {
		return "Cat Object";
	}
public static void main(String[] args) {
	 OverrideTostring o= new OverrideTostring();
	 System.out.println(o);
}
}
