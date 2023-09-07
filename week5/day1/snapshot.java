package week5.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapshot {

public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click(); //contact button
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();//merge contact
			//Handle second Window		from Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click(); // moved to second web
		
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> lstWindow = new ArrayList<String>(windowHandles);		
				driver.switchTo().window(lstWindow.get(1));
				
		
				File Source1 = driver.getScreenshotAs(OutputType.FILE);
				File Dest1= new File("./snap/Widget1.png");
				//Merger dest and source
				FileUtils.copyFile(Source1, Dest1);
				
				driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click(); //second resulting contact
	    driver.switchTo().window(lstWindow.get(0)); //switch back from second window after from widget
	            
	          //Handle second Window		to Contact
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click(); // moved to second web through to contact widget
	  
	            Set<String> windowHandles2 = driver.getWindowHandles();
	            List<String> lstWindow1 = new ArrayList<String>(windowHandles2);		
	            driver.switchTo().window(lstWindow1.get(1));
	            
	            //snapshot
	            File Source = driver.getScreenshotAs(OutputType.FILE);
				File Dest= new File("./snap/Widget2.png");
				//Merger dest and source
				FileUtils.copyFile(Source, Dest);
			
		
	    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click(); //second resulting contact
	    driver.switchTo().window(lstWindow1.get(0));
		
			driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();  //merge
			//handle Alert
			Alert alert = driver.switchTo().alert();
			alert.accept();

			String str= driver.getTitle();
			System.out.println(str); //title
			
			
}
}