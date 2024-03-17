package com.hrms.testscripts;

import com.hrms.lib.General;
import com.hrms.lib.Global;

public class TC0002 {

//Add Employee TC	
	
	public static void main(String args[]) throws InterruptedException
	{
		
	General gn=new General();
	
	gn.openApplication();
	gn.login();
	gn.PIM();
	gn.AddEmployee();
	gn.logout();
	gn.closeApplication();
	System.out.println("Test Case Completed");
}
}