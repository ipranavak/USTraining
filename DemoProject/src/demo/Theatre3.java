package demo;

public class Theatre3 implements MalayalamMovies,TamilMovies {
	int totalPrice=0;
	@Override
	public void VadaChennai() {
		// TODO Auto-generated method stub
		System.out.println("Executive Seats for VadaChennai cost 900");
		int ticketPrice=900;
		totalPrice+=ticketPrice;
		
	}

	@Override
	public void Ratchasan() {
		// TODO Auto-generated method stub
		System.out.println("Executive Seats for Ratchasan cost 500");
		int ticketPrice=500;
		totalPrice+=ticketPrice;
	}

	@Override
	public void Retro() {
		// TODO Auto-generated method stub
		System.out.println("Executive Seats for Retro cost 700");
		int ticketPrice=700;
		totalPrice+=ticketPrice;
		
	}

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
	public void Total() {
		System.out.println("Total Ticket Booking Price="+totalPrice);}
}
