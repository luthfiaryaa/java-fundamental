package oop.interfaces;

public class Car extends Vehicle implements CarInterface {
	public String name;
	public int price;
	public int velocity;
	
	Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		return this.getPrice();
	}
	
	@Override
	public String getNameInterface() {
		return this.name;
	}
	
	@Override
	public void insertToDatabase() {
	}

	@Override
	public void speedUp(int velocity) {
		this.velocity = velocity;
		System.out.println(getNameInterface() + " : " + velocity);
	}
	
	
}
