package com.training.prog;

public interface RunSoundMakers {
	public void sound();

}
class Dog implements RunSoundMakers{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks!!!");
	}
	
}
class Cat implements RunSoundMakers{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Cat Meows!!");
	}
	
}
class Sheep implements RunSoundMakers{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Sheeps bleet!!!");
	}
}
class SoundMakers{
public static void main(String[] args) {
	Dog d=new Dog();
	Cat c=new Cat();
	Sheep s=new Sheep();
	d.sound();
	c.sound();
	s.sound();
}
}
