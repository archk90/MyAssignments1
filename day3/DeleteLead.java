package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//find leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		
		driver.findElement(By.name("phoneCountryCode")).clear();
		
	
		//driver.findElement(By.name("phoneCountryCode")).sendKeys("+1");
		
		//driver.findElement(By.name("phoneAreaCode")).sendKeys("503");
			
		driver.findElement(By.name("phoneNumber")).sendKeys("+19196375860");
		
		//click find lead button
	
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		WebElement captureLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		String leadID =captureLead.getText();
		System.out.println("First resulting Lead"+leadID);
		captureLead.click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String display="No records to display";
		String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		if (message.equals(display)) {
		    System.out.println("Lead deleted");
		}

		//driver.quit();
		
		
		
		
		
		
		
		
	}

}
