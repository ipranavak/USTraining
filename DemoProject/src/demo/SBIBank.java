package demo;

public class SBIBank implements Loan {

	@Override
	public void intrestRate(int amount) {
		// TODO Auto-generated method stub
		int a=(int)(amount*18/100);
		System.out.println("Intrest Rate for SBI is"+a);
	}

}
