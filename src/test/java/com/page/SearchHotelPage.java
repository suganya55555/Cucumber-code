package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotelPage extends LibGlobal{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//select[@id=\"location\"]")
	 private WebElement txtLocation;
	 
	 @FindBy(xpath="//select[@id=\"hotels\"]")
	 private WebElement txtHotel;
	 
	 @FindBy(xpath="//select[@id=\"room_type\"]")
	 private WebElement txtRoomType;
	 
	 @FindBy(id="room_nos")
	 private WebElement txtRoomNos;
	 
	 @FindBy(xpath="//input[@id=\"datepick_in\"]")
	 private WebElement inDate;
	 
	 @FindBy(xpath="//input[@id=\"datepick_out\"]")
	 private WebElement outDate;
	 
	 @FindBy(id="adult_room")
	 private WebElement adults;
	 
	 @FindBy(id="child_room")
	 private WebElement child;
	 
	 @FindBy(id="Submit")
	 private WebElement searchHotel;
	 
	 public WebElement getTxtLocation() {
			return txtLocation;
		}

		public WebElement getTxtHotel() {
			return txtHotel;
		}
		public WebElement getTxtRoomType() {
			return txtRoomType;
		}

		public WebElement getTxtRoomNos() {
			return txtRoomNos;
		}

		public WebElement getInDate() {
			return inDate;
		}

		public WebElement getOutDate() {
			return outDate;
		}

		public WebElement getAdults() {
			return adults;
		}

		public WebElement getChild() {
			return child;
		}

		public WebElement getSearchHotel() {
			return searchHotel;
		}
	

		public void searchHotel(String location, String hotel, String roomType, String noOfRooms, String adults, String child) {
			selectByVisibleText(getTxtLocation(), location);
			selectByVisibleText(getTxtHotel(), hotel);
			selectByVisibleText(getTxtRoomType(), roomType);
			selectByVisibleText(getTxtRoomNos(), noOfRooms);
			selectByVisibleText(getAdults(), adults);
			selectByVisibleText(getChild(), child);
		}
		public void searchBtn() {
			btnClick(getSearchHotel());

		}
		public void search(String roomType) {
			selectByIndex(getTxtLocation(), 1);
			selectByIndex(getTxtHotel(), 1);
			selectByVisibleText(getTxtRoomType(), roomType);
}
}
