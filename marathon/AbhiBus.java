package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[1]")).sendKeys("chennai");  //from
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[2]")).sendKeys("Bangalore"); //to
		driver.findElement(By.xpath("//li[@class='ui-menu-item ui-state-focus']")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 hasDatepicker'])[1]")).click();  //date
		driver.findElement(By.xpath("(//a[text()='26'])[1]")).click();
		
		driver.findElement(By.xpath("//a[@class='btn btn-main px-5 py-2 border-right-radius']")).click();  //search
		
		String firstlead = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText(); // first result bus
		System.out.println(firstlead);
		
		driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();  //sleeper
		
		String busSeatCount = driver.findElement(By.xpath("//p[text()='15 Seats Available']")).getText(); //available seat count
		System.out.println(busSeatCount);
		
		
		driver.findElement(By.xpath("(//span[text()='Select Seat'])[1]")).click(); //  press select seat
		
		driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[12]")).click(); //available seat
		
		String bookedSeat=driver.findElement(By.xpath("//span[@id='seatnos']")).getText(); // seat selected
		System.out.println(bookedSeat);
		
		String seatFare=driver.findElement(By.xpath("//span[@id='ticketfare']")).getText(); //fare
		System.out.println(seatFare);
		
        WebElement boardPoint = driver.findElement(By.xpath("//select[@name='boardingpoint_id']"));// boarding 
		Select location = new Select(boardPoint);
		location.selectByVisibleText("Thuraipakkam-22:09");	
		 
		WebElement dropPoint = driver.findElement(By.xpath("//select[@name='droppingpoint_id']"));// dropping
			Select droplocation = new Select(dropPoint);
			droplocation.selectByVisibleText("Bellandur-06:06");
			String title = driver.getTitle(); //title
			System.out.println(title);	
			driver.close();
	}

}
