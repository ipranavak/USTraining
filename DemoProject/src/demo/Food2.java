package demo;

public interface Food2 {
	public void Shawarma();
	public void ChickenBiriyani();

}
class NonVegFood implements Food2{
	int totalPrice=0;
	@Override
	public void Shawarma() {
		// TODO Auto-generated method stub
		int price=30;
		System.out.println("Price of Shawarma= "+price);
		totalPrice+=price;
	}

	@Override
	public void ChickenBiriyani() {
		// TODO Auto-generated method stub
		int price=10;
		System.out.println("Price of Chicken Biriyani= "+price);
		totalPrice+=price;
	}
	public void total() {
		System.out.println("Total Price for food= "+totalPrice);
	}
}