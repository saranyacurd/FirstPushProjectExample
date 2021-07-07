package com.task;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGexample extends TaskPOM{
	
	@BeforeClass
	public void url() {
		getDriver();
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	@Parameters({"username","password"})
	@Test
	public void login(String s1,String s2) {
		System.out.println(s1+""+s2);
		insertType(new TaskPOM().getFbUsername(),s1);
		//insertType(getFbUsername(),s1);
		insertType(new TaskPOM().getFbPassword(),s2);
	}

	@Test
	public void click() {
		btnClick(new TaskPOM().getFblogin());
	}
	public void click1() {
		btnClick(new TaskPOM().getFblogin());
	}
}
