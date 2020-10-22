package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotel extends LibGlobal {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id="radiobutton_0")
	 private WebElement btnRadio; 
	 
	 @FindBy(id="continue")
	 private WebElement btnSubmit;

	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}




public void selectHotel() {
	btnClick(getBtnRadio());
}

public void selectButton() {
	btnClick(getBtnSubmit());

}
}
