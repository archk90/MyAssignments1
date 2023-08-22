package week2.day3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//using attribute based path
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	//firstname
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Archana");
	//Lastname 
		driver.findElement(By.xpath("//input[@name='lastname\']")).sendKeys("Kaialsam");
	//mobilenumber	
		
		driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]" )).sendKeys("+19196375860");
	//password	
		driver.findElement(By.xpath("//input[@autocomplete=\"new-password\"]")).sendKeys("Selenium@123");
	//date Dropdown using index method
      
		
		WebElement date = driver.findElement(By.xpath("//select[@name='birthday_day']  " ));// ctrl+2+l
		
		Select day = new Select(date);
			
		day.selectByValue("17");
		
		//month using selectbyvisibleText
		
		WebElement month = driver.findElement(By.xpath( " //select[@name='birthday_month']"));
		
		Select birthMonth = new Select(month);
		
		birthMonth.selectByVisibleText("Jun");
		
		//year using xpath 
		
		WebElement year = driver.findElement(By.xpath( " //select[@name='birthday_year']"));
		
		Select birthYear = new Select(year);
		
		birthYear.selectByValue("1990")	;
		
	    //Radio button
		driver.findElement(By.xpath("//input[@value= '1']")).click();
		
		
		
					
	}

}
