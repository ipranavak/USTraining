package demo;

public class ICICIBank implements Loan{

	@Override
	public void intrestRate(int amount) {
		// TODO Auto-generated method stub
		int b=amount*15/100;
		System.out.println("Loan Intrest for ICICI Bank is"+b);
		
	}
	

}
