package demo;

public class Theatre1 implements MalayalamMovies {
	int totalPrice=0;

	@Override
	public void DiesIre() {
		// TODO Auto-generated method stub
		System.out.println("Executive Seats for Dies Ire cost 500");
		int ticketPrice=500;
		totalPrice+=ticketPrice;
	}

	@Override
	public void Roscharch() {
		// TODO Auto-generated method 
		System.out.println("Executive Seats for Roscharch cost 400");
		int ticketPrice=400;
		totalPrice+=ticketPrice;
	
		
	}

	@Override
	public void Villain() {
		// TODO Auto-generated method stub
		System.out.println("Executive Seats for Villain cost 200");
		int ticketPrice=200;
		totalPrice+=ticketPrice;
		
	}
	public void total() {
		System.out.println("Total Ticket Booking Price="+totalPrice);
		
	}
	

}
