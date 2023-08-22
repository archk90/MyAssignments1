package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditAfterFindLeads {

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
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Archana");
		
		//driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[contains(@class, 'x-grid3-cell-inner x')]/a[1]")).click();
		
		
		
				String title = driver.getTitle();
				//print the title
				System.out.println(title);
				
		driver.findElement(By.xpath("//div[@class=\"frameSectionExtra\"]/a[3]")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Accenture");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String udatedCompanyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(udatedCompanyName);
		
		
		
	
		
		
		
	}

}
