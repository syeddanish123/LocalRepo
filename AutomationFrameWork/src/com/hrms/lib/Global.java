package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Global 
{
	public    WebDriver driver;
	//std:rule: To provide TestData & objects related to whole application
	//***********TestData
	// DT VAR VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	//***********objects/elements
	public String txt_loginame = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String Emp_id="8802";
	public String orderid="7854555";
	
}
