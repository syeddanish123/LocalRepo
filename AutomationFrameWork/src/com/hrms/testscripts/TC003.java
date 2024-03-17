package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003 {
 //Edit Employee TC
	
	public static void main(String args[])
	{
	General gn=new General();
	gn.openApplication();
	gn.login();
	gn.EditEmployee();
	gn.logout();
	gn.closeApplication();
	System.out.println("Test case Completed");
}
}
