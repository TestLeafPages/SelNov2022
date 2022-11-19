package week3.day1;

public class Audi extends Car{

	public void applyBrake() {
		System.out.println("Apply Brake from Audi");
	}
	
	public static void main(String[] args) {
		Audi audi = new Audi();
		audi.applyBrake();
//		audi.openSunRoof();
		
		Car car = new Car();
		car.applyBrake();
//		car.soundHorn();
//		car.openSunRoof();
	}
}
