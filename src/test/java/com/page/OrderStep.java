package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class OrderStep  extends LibGlobal{
	public OrderStep() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_no")
	 private WebElement orderNo;
	
	@FindBy(id="my_itinerary")
	private WebElement btnItinerary;
	
	public WebElement getOrderNo() {
		return orderNo;
		}
	
	public WebElement getBtnItinerary() {
		return btnItinerary;
	}

	public void order() throws InterruptedException  {
		Thread.sleep(5000);
		String id = getAttribute(getOrderNo(), "value");
        System.out.println("The Order id is: " + id);
	}
	
	
}
