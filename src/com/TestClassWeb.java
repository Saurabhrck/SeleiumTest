package com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassWeb {

	public static String user="data", pass="data";
	public static void main(String []args) throws InterruptedException{
		login();
	}
	public static WebDriver initial(){
		System.setProperty("webdriver.chrome.driver", "C://Users//saumo//Downloads//Compressed//chromedriver_win32//chromedriver.exe");
		WebDriver driverr=new ChromeDriver();
		return driverr;
	}
	public static void login(){
		WebDriver driver=initial();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		driver.findElement(By.id("ap_email")).clear();
		driver.findElement(By.id("ap_email")).sendKeys(user);
		driver.findElement(By.id("ap_password")).clear();
		driver.findElement(By.id("ap_password")).sendKeys(pass);
		driver.findElement(By.id("ap_password")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='a-page']/div[1]/div/div[4]/div/div/div[2]/div/div[2]/ul[1]/li[2]/span/a")).click();
		System.out.println(driver.getTitle());	
	}
}
