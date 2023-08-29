package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[1]")).click();
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());
		
		System.out.println("Brand ");
		List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']"));
		for(int i=0; i<brandName.size(); i++)
		{
			System.out.println(brandName.get(i).getText());
			System.out.println(brandName.size());
		}
		
		
		System.out.println("Bag Name ");
		List<WebElement> bagsName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for(int i=0; i<bagsName.size(); i++)
		{
			System.out.println(bagsName.get(i).getText());
			System.out.println(bagsName.size());
			
		}
		
		
		
		
		
	}

}
