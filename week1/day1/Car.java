package week1.day1;

public class Car {

	// Global variables
	public int noOfWheels = 4;
	public long carPrice = 2000000000L;
	public int kmsRan = 50000;
	public float fuelCapacity = 60.50f;
	public boolean isPuncture = true;
	public char fuelType = '%';
	public String brandName = "Maruthi800";
	
	

	double carCurrentPrice = 400000.65;
	

	public void driveCar() {
		// code to print a text
		int noOfDrivers = 2;
		
		System.out.println("I am driving a car");
		System.out.println(noOfWheels);
		System.out.println(noOfDrivers);
	}

	public void applyBrake() {
		System.out.println("Applied Brake");
		System.out.println(isPuncture);

	}

	public static void main(String[] args) {
		//ClassName objectName = new ClassName();
		Car myCar = new Car();
		
		//to call methods
		myCar.driveCar();
		myCar.applyBrake();

	}

}
