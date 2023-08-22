package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) {
		
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//driver.findElement(By.className("Login")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kailasam");
		
	
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("archanak290@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+19196375860");
		
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));// ctrl+2+l
		
		Select source = new Select(drop1);
	
		source.selectByIndex(4);
		
		
		

		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));// ctrl+2+l
		// Step:2 Instantiate Select class
		Select market = new Select(drop2);
	
		market.selectByVisibleText("Automobile");
		
		
		

		WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));// ctrl+2+l
		
		Select ownership = new Select(drop3);
	
		ownership.selectByValue("OWN_CCORP");

		
		
		
		
		//driver.findElement(By.name("submitButton")).click();
		
		
	}

}


