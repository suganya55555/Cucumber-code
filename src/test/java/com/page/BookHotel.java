package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotel extends LibGlobal {
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id="first_name")
	 private WebElement firstName;
	 
	 @FindBy(id="last_name")
	 private WebElement LastName;
	 
	 @FindBy(id="address")
	 private WebElement address;
	 
	 @FindBy(id="cc_num")
	 private WebElement cardNo;
	
	 @FindBy(xpath="//select[@id='cc_type']")
	 private WebElement cardTypes;
	 
	 @FindBy(xpath="//select[@id='cc_exp_month']")
	 private WebElement Date;
	 
	 @FindBy(xpath="//select[@id='cc_exp_month']")
	 private WebElement ExpDate;
	 
	 @FindBy(xpath="//select[@id='cc_exp_year']")
	 private WebElement ExpYear;
	 
	 @FindBy(id="cc_cvv")
	 private WebElement CVV;
	 
	 @FindBy(id="book_now")
	 private WebElement bookNow;
	 
	 
	 @FindBy(id="order_no")
	 private WebElement orderNo;
	 
	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardTypes() {
		return cardTypes;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getExpDate() {
		return ExpDate;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	 public WebElement getBookNow() {
			return bookNow;
		}	
	 
	 public void bookHotel(String firstName, String lastName, String address, String cardNo, String cardType, String month, String year, String cvvNo) {
			type(getFirstName(), firstName);
			type(getLastName(),lastName);
			type(getAddress(),address);
			type(getCardNo(), cardNo);
			selectByVisibleText(getCardTypes(), cardType);
			selectByVisibleText(getExpDate(), month);
			selectByVisibleText(getExpYear(), year);
			type(getCVV(), cvvNo);	
		}
	 
	 public void bookBtn() {
		btnClick(getBookNow());

	}
	 
	 public void book(String firstName, String lastName, String address, String cardNo,String month, String year, String cvvNo) {
		 type(getFirstName(), firstName);
		 type(getLastName(), lastName);
		 type(getAddress(), address);
		 type(getCardNo(), cardNo);
		 selectByVisibleText(getExpDate(), month);
			selectByVisibleText(getExpYear(), year);
			type(getCVV(), cvvNo);
		  
		 }
}
