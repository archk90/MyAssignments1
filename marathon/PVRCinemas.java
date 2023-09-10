package week3.marathon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		Thread.sleep(2000);	    
		driver.get("https://www.pvrcinemas.com/");
	    driver.findElement(By.xpath("(//a[@class='thumnail clearfix']/span)[4]")).click(); //city chennai 
	    driver.findElement(By.xpath("//div[@class='nav-icon']")).click();    //right button
	    driver.findElement(By.xpath("//a[text()='Movie Library']")).click();   //movie library
	    Thread.sleep(3000);
	    WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select location = new Select(city);
		location.selectByVisibleText("Bengaluru");	
		 
		 WebElement genre = driver.findElement(By.xpath("//select[@name='genre']"));
			Select type = new Select(genre);
			type.selectByVisibleText("ANIMATION");	
			 
		
			WebElement language = driver.findElement(By.xpath("//select[@name='lang']"));
			Select lang = new Select(language);
			lang.selectByVisibleText("ENGLISH");	
			driver.findElement(By.xpath("//button[text()='Apply']")).click();   //apply
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Paw Patrol']")).click();   //first animation movie
		
			Thread.sleep(7000);
			driver.findElement(By.xpath("//div[@class='header-info-fixed']/button")).click();
				//driver.findElement(By.linkText("proceed to book")).click();
			
			//driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();   //Proceed To Book
			Thread.sleep(7000);
			
			
			WebElement cinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));  //select cinema
			Select locate = new Select(cinema);
			locate.selectByValue("PVR Vaishnavi Sapphire Bengaluru");	
			
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Archana");
			
			driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9025145516");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("archanak290@gmail.com");
			driver.findElement(By.name("noOfTickets")).sendKeys("4");
			
			WebElement selectDate = driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']"));
			selectDate.click();
			WebElement date = driver.findElement(By.xpath("//span[@class='day-unit ng-star-inserted']"));
			date.click();
				
			
		//	WebElement date = driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']"));  //select cinema
		//	date.click();
			
		//	WebElement date1 = driver.findElement(By.xpath("//span[@class='day-unit is-disabled ng-star-inserted']"));	
		//	date1.click();
		//	Thread.sleep(7000);
		
			WebElement showTime = driver.findElement(By.xpath("//select[@name='timings']"));  //select cinema
			Select time1 = new Select(showTime);
			time1.selectByIndex(3);	
			
			WebElement food = driver.findElement(By.xpath("//select[@name='food']"));  //select cinema
			Select showfood = new Select(food);
			showfood.selectByIndex(1);	
			
			driver.findElement(By.name("comment")).sendKeys("not required");
			
			driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary rightFloat']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='btn already-member'])[4]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
			
			String title = driver.getTitle(); //title
			System.out.println(title);	
			
			
	}

}
