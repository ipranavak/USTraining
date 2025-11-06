package com.example;

public class Bankk {
	int amount=5000;
	void balance()
	{
		System.out.println("Account balance is"+amount);
	}
	void withdraw(int amount)
	{	if(amount>this.amount) {
		System.out.println("No money");
	}
	else {
		System.out.println(this.amount-amount);}
		
	}
	void deposit(int amount)
	{
		System.out.println(amount+this.amount);
		
	}
	public static void main(String[] args) {
		Bankk b=new Bankk();
		b.balance();
		b.withdraw(90000);
		b.deposit(600);
		
	}
}
