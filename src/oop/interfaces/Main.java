package oop.interfaces;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("merc", 900000);
		
		car.speedUp(12);
		
		System.out.println("Name car: " + car.getNameInterface());
		
		//BlockDemo blockDemo = new BlockDemo();
	}
}
