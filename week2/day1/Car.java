package week2.day1;

public class Car {
	
	public void driveCar()
	{
		System.out.println("drive a Car");
	}
	public void applyBrake(boolean brake) {
		System.out.println("no Brake");
	}
	
	public void sounHorn()
	{
		System.out.println("press horn");
	}
	public void isPuncture() {
		System.out.println("no puncture");
	}

	public static void main(String[] args) {
	
		Car status = new Car();
		status.driveCar();
		status.applyBrake(false);
		status.sounHorn();
		status.isPuncture();
		
		
		
}

}
