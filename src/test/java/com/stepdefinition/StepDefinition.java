package com.stepdefinition;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.manager.PageOjectManager;
import com.page.LoginPageStep;
import com.page.OrderStep;
import com.page.BookHotel;
import com.page.SearchHotelPage;
import com.page.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends LibGlobal 
{
	WebDriver driver;
	PageOjectManager manager;
	LoginPageStep loginPageStep;
	SearchHotelPage searchHotelPage;
	SelectHotel selectHotel;
	BookHotel bookHotel;
	OrderStep orderStep;
	
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() throws MalformedURLException {
//		getDriverCloud();
//		loadUrl("http://adactinhotelapp.com/");	
//		
	}

	@When("User should enter {string},{string}")
	public void user_should_enter(String username, String password) {
		manager = PageOjectManager.getInstance();
		 
		 loginPageStep = manager.getLoginPageStep();
		 loginPageStep.login(username, password);
	}

	@When("User should click Login button")
	public void user_should_click_Login_button() {
		loginPageStep.loginbtnClick();
 
	}

	@Then("User should verify the login page")
	public void user_should_verify_the_login_page() {
//		System.out.println("User is Verified");
	//	Assert.assertTrue("login Verified", driver.getCurrentUrl().contains("SearchHotel"));
	}

	@When("User should enter {string},{string},{string},{string},{string},{string}")
	public void user_should_enter(String location, String hotel, String roomType, String noOfRooms, String adults, String child) {
		manager = PageOjectManager.getInstance();

		 searchHotelPage = manager.getSearchHotelPage();
		  searchHotelPage.searchHotel(location, hotel, roomType, noOfRooms, adults, child);
		  }

	@When("User should click on search button")
	public void user_should_click_on_search_button() {
		manager = PageOjectManager.getInstance();
		searchHotelPage.searchBtn();
	}

	@Then("User should verify the search hotel page")
	public void user_should_verify_the_search_hotel_page() {
//		System.out.println("Search page verified");
 //    Assert.assertTrue("search page Verified", driver.getCurrentUrl().contains("Search Hotel"));
	}

	@When("User should click radio button")
	public void user_should_click_radio_button() {
		manager = PageOjectManager.getInstance();
		selectHotel = manager.getSelectHotel();
		selectHotel.selectHotel();
	}

	@Then("User should click the continue button")
	public void user_should_click_the_continue_button() {
		manager = PageOjectManager.getInstance();
		selectHotel = manager.getSelectHotel();
		selectHotel.selectButton();

	}

	@When("User should enter {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_and(String firstName, String lastName, String address, String cardNo, String cardType, String month, String year, String cvvNo) {
		manager = PageOjectManager.getInstance();
		bookHotel = manager.getBookHotel();
		bookHotel.bookHotel(firstName, lastName, address, cardNo, cardType, month, year, cvvNo);
	}
	

	@When("User should click the book now button")
	public void user_should_click_the_book_now_button() {
		bookHotel = manager.getBookHotel();
		bookHotel.bookBtn(); 
	}

	@Then("User should verify the book hotel page")
	public void user_should_verify_the_book_hotel_page() {
		//System.out.println("Select hotel page verified");
		//Assert.assertTrue("Search page verified", driver.getCurrentUrl().contains("Book A Hotel"));
	}

	@Then("User can check the booking confirmation order in the page")
	public void user_can_check_the_booking_confirmation_order_in_the_page() throws InterruptedException {
		manager = PageOjectManager.getInstance();
		orderStep = manager.getOrderStep();
		orderStep.order();
		
	}
}





/////////////////datatable
//WebDriver driver;
//PageOjectManager manager;
//LoginPageStep loginPageStep;
//SearchHotelPage searchHotelPage;
//SelectHotel selectHotel;
//BookHotel bookHotel;
//OrderStep orderStep;
//
//@Given("User is on the adactin page")
//public void user_is_on_the_adactin_page() {
//	getChromeDriver();
//	loadUrl("http://adactinhotelapp.com/");	
//
//}
//
//@When("User should enter {string},{string}")
//public void user_should_enter(String username, String password) {
//	manager = PageOjectManager.getInstance();
//	 
//	 loginPageStep = manager.getLoginPageStep();
//	 loginPageStep.login(username, password);
//
//}
//
//@When("User should click Login button")
//public void user_should_click_Login_button() {
//	loginPageStep.loginbtnClick();
//}
//
//@When("User should enter {string},{string},{string}")
//public void user_should_enter(String location, String hotel, String roomType, io.cucumber.datatable.DataTable dataTable) {
//	List<Map<String,String>> emp=dataTable.asMaps();
//	Map<String,String> m=emp.get(1);
//	String s = m.get("noOfRooms");
//	String s1 = m.get("adultroom");
//	String s2 = m.get("childroom");
//	
//	manager = PageOjectManager.getInstance();
//    searchHotelPage = manager.getSearchHotelPage();
//    searchHotelPage.search(roomType);
//    selectByVisibleText(searchHotelPage.getTxtRoomNos(), s);
//    selectByVisibleText(searchHotelPage.getAdults(), s1);
//    selectByVisibleText(searchHotelPage.getChild(), s2);
//    //searchHotelPage.searchBtn();
//
//}
//
//@When("User should click on search button")
//public void user_should_click_on_search_button() {
//	manager = PageOjectManager.getInstance();
//	searchHotelPage.searchBtn();
//
//}
//
//@When("User should click radio button")
//public void user_should_click_radio_button() {
//	manager = PageOjectManager.getInstance();
//	selectHotel = manager.getSelectHotel();
//	selectHotel.selectHotel();
//
//}
//
//@Then("User should click the continue button")
//public void user_should_click_the_continue_button() {
//	manager = PageOjectManager.getInstance();
//	selectHotel = manager.getSelectHotel();
//	selectHotel.selectButton();
//
//}
//
//@When("User should enter {string},{string},{string},{string},{string},{string} and {string}")
//public void user_should_enter_and(String firstName, String lastName, String address, String cardNo, String month, String year, String cvvNo, io.cucumber.datatable.DataTable dataTable) {
//	 List<Map<String,String >> lm= dataTable.asMaps();
//	  Map<String, String> m=lm.get(0);
//	  String str=m.get("cardTypes");
//	  
//	  
//	  manager = PageOjectManager.getInstance();
//	  bookHotel=manager.getBookHotel();
//	  bookHotel.book(firstName, lastName, address, cardNo, month, year, cvvNo);
//	  selectByVisibleText(bookHotel.getCardTypes(), str);
//	
//}
//
//@When("User should click the book now button")
//public void user_should_click_the_book_now_button() {
//	bookHotel = manager.getBookHotel();
//	bookHotel.bookBtn(); 
//
//}
//
//@When("User can check the booking confirmation order in the page")
//public void user_can_check_the_booking_confirmation_order_in_the_page() throws InterruptedException {
//	manager = PageOjectManager.getInstance();
//	orderStep = manager.getOrderStep();
//	orderStep.order();
//
//}
//}

	
