package com.task;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class TaskJunit extends TaskPOM {
	//TaskBase b=new TaskBase();
	@Test
	public void url() {
		getDriver();
		launchUrl("https://adactinhotelapp.com/");
		maximizeWindow();
		Assert.assertTrue("Url is not matched",getUrl().contains("adactin"));
	}

	@Test
	public void login() throws IOException, InterruptedException {
		insertType(getTxtUserName(), getData(0, 0));
		insertType(getTxtPassWord(), getData(0, 1));
		btnClick(getBtnLogin());
		//Assert.assertTrue("login failed", false);
		selectbyValue(getLocation(), "Sydney");
		selectbyIndex(getHotels(), 1);
		selectbyIndex(getRoom_type(), 1);
		selectbyIndex(getRoom_nos(), 1);
		selectbyIndex(getAdult_room(), 1);
		selectbyIndex(getChild_room(), 1);
		insertType(getDatepick_in(), getData(1,0));
		insertType(getDatepick_out(), getData(1,1));
		btnClick(getSubmit());
		btnClick(getRadio());
		btnClick(getContinue());
		insertType(getFirst_name(),getData(2, 1));
		insertType(getLast_name(), getData(3, 1));
		insertType(getAddress(), getData(4, 1));
		insertType(getCardnumber(), getData(5, 1));
		selectbyIndex(getCardType(), 2);
		selectbyIndex(getExpiryMonth(), 4);
		selectbyIndex(getExpiryYear(), 10);
		insertType(getCvv(), getData(6,1));
		btnClick(getBook_now());
		Thread.sleep(10000);	
		ExcelWrite((getValues(getOrderno(),"value" )));
	}
	

	@AfterClass
	public  static void orderNo() throws IOException, InterruptedException
	{
	driver.close();
		
	}


}
