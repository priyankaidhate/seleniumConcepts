package com.cyient.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By .id("txtUsername")) .sendKeys("admin");
		driver.findElement(By .id("txtPassword")) .sendKeys("admin123");
		driver.findElement(By .id("btnLogin")) .click();
		driver .findElement(By .id("menu_pim_viewMyDetails")) .click();
		driver .findElement(By .id("btnSave")) .click();
		driver.findElement(By .id("personal_txtOtherID")) .sendKeys("test123");
		driver .findElement(By .id("btnSave")) .click();
		driver .findElement(By .linkText("emergency contact")) .sendKeys("8446739678");
	}

}
