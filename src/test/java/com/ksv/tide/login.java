package com.ksv.tide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

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
	//click on login
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		String parenWindow=driver.getWindowHandle();
		for(String child:driver.getWindowHandles()) {
			driver.switchTo().window(child);
			}
		driver.findElement(By.xpath("//div/div/div[2]/div/div[2]/div/div/div/div/div[2]/form/div[7]/div/button")).click();
	//enter email
		driver.findElement(By.xpath("//div/div/div/main/div/div[2]/div/div[3]/div[2]/div/form/div[2]/div/input")).click();
		driver.findElement(By.xpath("//div/div/div/main/div/div[2]/div/div[3]/div[2]/div/form/div[2]/div/input")).sendKeys("vangapandulavanya27@gmail.com");
	//password
		driver.findElement(By.xpath("//div/div/div/main/div/div[2]/div/div[3]/div[2]/div/form/div[3]/div/input")).click();
		driver.findElement(By.xpath("//div/div/div/main/div/div[2]/div/div[3]/div[2]/div/form/div[3]/div/input")).sendKeys("Lavanya@27");
		//click on login
		driver.findElement(By.xpath("//input[@value='LOG IN']")).click();
////		//zip code
//	driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
//	for(String child1:driver.getWindowHandles()) {
//		driver.switchTo().window(child1);
//		}
////		driver.findElement(By.xpath("//input[@value='12345']")).click();
////		driver.findElement(By.xpath("//input[@value='12345']")).sendKeys("12345");
		//driver.findElement(By.xpath("//div/div/div[3]/div/div/div/div/button/span/svg[@class='focus:outline-none closeIcon']")).click();
	}

}
