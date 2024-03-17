package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC004 {

	public static void main(String args[])
	{
		General gn=new General();
		gn.openApplication();
		gn.login();
		gn.deleteEmployee();
		gn.logout();
		gn.closeApplication();
		System.out.println("TestCase Completed");
	}
	
}
