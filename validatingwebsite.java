package Talentship;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validatingwebsite {

	public ChromeDriver driver;
	@ Test
	public void  Websitepage() {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.talentship.io/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("Talentship – The Top 5% Talent", Title);
		
		
		
		driver.findElement(By.xpath("//a[text()=\"Accept all\"]")).click();
		String Accept=driver.getPageSource();
		System.out.println(Accept);
		Assert.assertEquals("//a[text()=\"Accept all\"]", Accept );
		
		
		
		
		driver.findElement(By.xpath("//a[text()=\"Get Pricing\"]")).click();
		String Getpricing=driver.getPageSource();
		System.out.println(Getpricing);
		Assert.assertEquals("//a[text()=\"Get Pricing\"]",Getpricing );
		
		
		driver.findElement(By.xpath("//div[@id=\"page\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"content\"]")).click();
		 driver.findElement(By.xpath("//span[@class=\"fa fa-bars\"]")).click();
		
		
		
}
		
		
}
		