package demo;

public class Theatre2 implements TamilMovies{
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
	public void Total() {
		System.out.println("Total Ticket Booking Price="+totalPrice);
	}

}
