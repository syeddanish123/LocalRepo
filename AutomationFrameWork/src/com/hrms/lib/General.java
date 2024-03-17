package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

import java.time.Duration;
import org.openqa.selenium.By;

public class General extends Global
{
	//std rule: To provide all re-usable fun:/methods related to whole application
	public void openApplication() 
	{
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	Log.info("Application Opened");
	}
	
	
	public void closeApplication() 
	{
	driver.quit();
	System.out.println("Application closed");
	Log.info("Application Closed");
	}
	
	
	public void login() 
	{
	driver.findElement(By.name(txt_loginame)).sendKeys(un);
	driver.findElement(By.name(txt_password)).sendKeys(pw);
	driver.findElement(By.name(btn_login)).click();
	System.out.println("Login completed");
	Log.info("Login Completed");
	}
	
	
	public void logout() {
	driver.findElement(By.linkText(link_logout)).click();
	System.out.println("Logout completed");
	Log.info("Logout completed");
	}
	
	public void PIM()
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		System.out.println("PIM Opened");
		Log.info("PIM Opened");
		
	}
	
	public void AddEmployee()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("Add Employee")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Syed");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Husain");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Danish");
		driver.findElement(By.name("photofile")).sendKeys("C:\\Users\\sdani\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-01-18 113704.png");
		driver.findElement(By.id("btnEdit")).click();
		System.out.println("Add Emplyee Done");
		Log.info("Add employee done");
		driver.switchTo().defaultContent();
	}
	
	public void EditEmployee()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		Select sc=new Select(driver.findElement(By.name("loc_code")));
		sc.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys(Emp_id);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		driver.findElement(By.name("EditMain")).click();
		driver.findElement(By.name("txtOtherID")).sendKeys(orderid);
		driver.findElement(By.name("EditMain")).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee Added");
	}
	
	public void deleteEmployee()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().frame(0);
		Select sc=new Select(driver.findElement(By.name("loc_code")));
		sc.selectByVisibleText("Emp. ID");
		driver.findElement(By.name("loc_name")).sendKeys(Emp_id);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.switchTo().defaultContent();
		System.out.println("Employee Deleted");
		Log.info("Employee Deleted");
		
	}
	
	public void enterFrame()
	{
		driver.switchTo().frame(0);
	}
	
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
	}
}

