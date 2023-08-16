package week2.day1;

public class Mobile {
	
	public void sendSMS()
	{
	
		System.out.println("Access is public");
		
	}
   protected void allowvoiceCall() {
	   
	   System.out.println("Access is protected");
	   
     }
   private void takeVideo() {
	   System.out.println("Access is private");
	   
   }
   public static void main(String[] args) {
		
	   Mobile mob = new Mobile();

	 mob.takeVideo();
   } 
   
}
