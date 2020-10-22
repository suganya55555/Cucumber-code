package com.manager;
import com.page.LoginPageStep;
import com.base.LibGlobal;
import com.page.BookHotel;
import com.page.OrderStep;
import com.page.SearchHotelPage;
import com.page.SelectHotel;

public class PageOjectManager extends LibGlobal {

	private static PageOjectManager pageOjectManager;
	private LoginPageStep loginPageStep;
	private SearchHotelPage searchHotelPage;
	private SelectHotel selectHotel;
	private BookHotel bookHotel;
	private OrderStep orderStep;
	
	
	private PageOjectManager() {
		
	}
	
	public static PageOjectManager getInstance() {
		return (pageOjectManager == null) ? pageOjectManager=new PageOjectManager() : pageOjectManager;
	}

	
	public LoginPageStep getLoginPageStep() {
//		if(loginPageStep == null) {
//			loginPageStep = new LoginPageStep();
//		}
	System.out.println(loginPageStep);
//		return loginPageStep;
		return (loginPageStep == null)? loginPageStep = new LoginPageStep() : loginPageStep;
	}
	
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage=new SearchHotelPage() : searchHotelPage;
	}
	
	public SelectHotel getSelectHotel() {
		return (selectHotel == null) ? selectHotel = new SelectHotel() : selectHotel;
	}

	public BookHotel getBookHotel() {
		return (bookHotel ==null) ? bookHotel=new BookHotel() : bookHotel;
	}
	
	public OrderStep getOrderStep() {
		return (orderStep == null) ? orderStep = new OrderStep() : orderStep;
	}
	
	}

