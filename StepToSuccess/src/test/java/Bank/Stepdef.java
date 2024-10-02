package Bank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Stepdef {
	 WebDriver driver;
	
    @Given("^Open Application$")
	public void openApplication() {
		
		driver=new ChromeDriver();
		
	}
	
  
    
    @And("^Enter URL$")
    public void EnterURL() {
    	
    
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Application Opened");
    	
    }
    
    @When("^Login to Applocation using (.*) and (.*)$")  // i have provide the regular expression (.*) to match with <username> , <password>
	public void loginApplication(String username,String password) {
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	if(driver.getPageSource().contains("Admin"))
    	{
    		System.out.println("Success login");
    	}
    	
    	else {
		System.out.println("Incorrect Username and Password");
    	}
	}
	
    @When("^Logout Application$")
	public void LogoutApplication() {
		
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.className("oxd-userdropdown-tab")).click();
    	driver.findElement(By.linkText("Logout")).click();
		System.out.println("Application Logout");
	}
	
    @Then("^Closed Application$")
	public void closedApplication() {
		
        driver.quit();
		System.out.println("Application closed");
	}
}
