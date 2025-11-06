package demo;

public interface Food {
	public void Sambar();
	public void Vada();

}
class VegFood implements Food{
	int totalPrice=0;
	@Override
	public void Sambar() {
		// TODO Auto-generated method stub
		int price=30;
		System.out.println("Price of Sambar= "+price);
		totalPrice+=price;
	}

	@Override
	public void Vada() {
		// TODO Auto-generated method stub
		int price=10;
		System.out.println("Price of vada= "+price);
		totalPrice+=price;
	}
	public void total() {
		System.out.println("Total Price for food= "+totalPrice);
	}
}