package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPageStep extends LibGlobal {
	
	public LoginPageStep() {
		PageFactory.initElements(driver, this);
	}
		 	
	 @FindBy(id="username")
	 private WebElement txtUserName;

	@FindBy(id="password")
	 private WebElement txtPassword;
	 
	 @FindBy(id="login")
	 private WebElement btnLogin;
	 public WebElement getTxtUserName() {
			return txtUserName;
		}

		public WebElement getTxtPassword() {
			return txtPassword;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}
		public void login(String username, String password) {
			type(getTxtUserName(),username);
			type(getTxtPassword(),password);
			}
		public void loginbtnClick() {
			btnClick(getBtnLogin());

		}
}