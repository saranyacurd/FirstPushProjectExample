package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPOM extends TaskBase {
	public TaskPOM() {
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//input[@name=\"email\"]")
	public WebElement FbUsername;
	
	@FindBy(id="pass")
	public WebElement FbPassword;
	
	@FindBy(name="login")
	public WebElement Fblogin;
	
	public WebElement getFbUsername() {
		return FbUsername;
	}

	public WebElement getFbPassword() {
		return FbPassword;
	}

	public WebElement getFblogin() {
		return Fblogin;
	}
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassWord;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement datepick_in;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}
	@FindBy(id="datepick_out")
	private WebElement datepick_out;
	
	@FindBy(id="adult_room")
	private WebElement adult_room;
	
	@FindBy(id="child_room")
	private WebElement child_room;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(id="radiobutton_0")
	private WebElement Radio;

	public WebElement getRadio() {
		return Radio;
	}
	@FindBy(id="continue")
	private WebElement Continue;
	
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardnumber;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(id="order_no")
	private  WebElement orderno;
	
	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getContinue() {
		return Continue;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
