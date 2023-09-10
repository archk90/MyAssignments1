package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");  //search bags
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();  // bags for boys dropdown without select class
		
		
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();  //print results
		System.out.println(result);
		driver.findElement(By.xpath("//li[@id='p_89/FUR JADEN']//a")).click();  // select  2 brands 
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']")).click();  // select  2 brands 
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();  // press sort
		
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();  // dropdown New arrivals no select class
		
		
		String firstresultname= driver.findElement(By.xpath("(//h2[@class='a-size-mini s-line-clamp-1']/span)[1]")).getText(); // 
		System.out.println(firstresultname);
		

		
		String firstresult= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]")).getText(); 
		System.out.println(firstresult);
		
		
		driver.close();
		
	}

}
