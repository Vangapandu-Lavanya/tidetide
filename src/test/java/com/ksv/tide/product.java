package com.ksv.tide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class product {

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
		//clicking on product
		driver.findElement(By.xpath("//div/div/footer/div[2]/div/div/div/div[2]/div/div[2]/div[3]/a/span")).click();
	}

}
