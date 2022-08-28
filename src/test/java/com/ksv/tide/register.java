package com.ksv.tide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lavanya\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Accessing Link
		driver.get("https://tide.com/en-us");
		//maximum window
		driver.manage().window().maximize();
		//getting title
		System.out.println("title is: "+driver.getTitle());
		//closing pop up
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
	//click on register
		driver.findElement(By.xpath("//span[@class='login-register']/a")).click();
	//clicking on sign up
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/div/main/div/div/div/div/div/div/div/div/div[2]/div/p[6]/a")).click();
	//clicking on first name
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		String parenWindow=driver.getWindowHandle();
		for(String child:driver.getWindowHandles()) {
			driver.switchTo().window(child);
			}
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div/input")).click();
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div/input")).sendKeys("Lavanya");
	//clicking on email
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div[2]/input")).click();
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("vangapandulavanya27@gmail.com");
		//clicking on password
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div[3]/input")).click();
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div[3]/input")).sendKeys("Lavanya@27");
		//clicking on create account
		driver.findElement(By.xpath("//input[@value='CREATE ACCOUNT']")).click();
		System.out.println(driver.getTitle());
	}

}
