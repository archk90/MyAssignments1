package week3.day2Override;

public class AxisBank extends Bankinfo {
	
public void deposit() {
		
		System.out.println("Recurring Deposit :10000");
		
		System.out.println("overrride deposit method");
		
		
	}

	
	

	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		obj.savings();
		obj.fixed();
		obj.deposit();
		
	}

}
