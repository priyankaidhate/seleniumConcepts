package com.cyient.seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenEMR {
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		driver.findElement(By .id("authUser")) .sendKeys("admin");
		driver.findElement(By .id("clearPass")) .sendKeys("pass");
		
		Select selectLanguage =new Select(driver.findElement(By.name("languageChoice")));
		selectLanguage.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@class='btn btn-login btn-lg']")).click();
		
		System.out.println(driver.getTitle());
		
		Actions action=new Actions(driver);
		
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
	}
		
		
	}


/*driver.findElement(By.id("btnAddContact")).click();
driver.findElement(By.id("emgcontacts_name")).sendKeys("Bhavana");
driver.findElement(By.id("emgcontacts_name")).sendKeys("Bhavana");   
driver.findElement(By.id("emgcontacts_relationship")).sendKeys("Sister");
driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("010789022");
driver.findElement(By.id("emgcontacts_mobilePhone")).sendKeys("7986302002");
driver.findElement(By.id("emgcontacts_workPhone")).sendKeys("01042233677");
driver.findElement(By.id("btnSaveEContact")).click();*/