package demo;

public class Bat implements Animal, Bird{

	@Override
	public void fly() {
		System.out.println("Flies fast");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats Insects");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runs slow");
		
	}
public static void main(String[] args) {
	Bat b=new Bat();
	b.eat();
	b.run();
	b.fly();
	
}
}
