package com.workflow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TimeCard2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\seleniumjar\\chromedriver\\Chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        //navigate the application
	        driver.get("https://talent.capgemini.com/in");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        //click on close popup
	        driver.findElement(By.xpath("//button[@class='close_popin_btn']")).click();
	        //click on close button
	        driver.findElement(By.xpath("//div[@class='cookie_button']//a")).click();
	        //click on time Card application
	        driver.findElement(By.xpath("//a[@title='Time Card Application']")).click();
	        
	        Set<String> windows =driver.getWindowHandles();
	        java.util.Iterator<String> it=windows.iterator();
	        String parentid=it.next();
	        String childid=it.next();
	        driver.switchTo().window(childid);
	        //go to Overdue TimeCard
	        driver.findElement(By.linkText("Overdue Timecard")).click();
	        //go to Timecardsummary
	        driver.findElement(By.linkText("Timecard Summary")).click();
	        //close the browser
	        driver.close();
	    

	}

}