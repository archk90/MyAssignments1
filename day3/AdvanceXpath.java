package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
	
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//crm/sfa
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		
		//leads
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("archanak290@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("+19196375860");
		
		driver.findElement(By.name("submitButton")).click();
		
		

	}


}
