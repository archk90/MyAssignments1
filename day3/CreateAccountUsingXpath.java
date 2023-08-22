package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingXpath {

	public static void main(String[] args) {
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		//Accounts Button
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Archana");
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Dharmapuri");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Harur");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("100000");
		
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));// ctrl+2+l
		
		Select field = new Select(industry);
	
		field.selectByVisibleText("Computer Software");
		
        WebElement owner = driver.findElement(By.name("ownershipEnumId"));// ctrl+2+l
		
		Select corp = new Select(owner);
	
		corp.selectByVisibleText("S-Corporation");
		
       WebElement source = driver.findElement(By.id("dataSourceId"));// ctrl+2+l
		
		Select work = new Select(source);
	
		work.selectByValue("LEAD_EMPLOYEE");
		
        WebElement market = driver.findElement(By.id("marketingCampaignId"));// ctrl+2+l
		
		Select ecommerce = new Select(market);
	
		ecommerce.selectByIndex(5);
		
		 WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));// ctrl+2+l
			
			Select stateinput = new Select(state);
		
			stateinput.selectByValue("TX");
			
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			
			
		
		
		
		
		
	}

}
