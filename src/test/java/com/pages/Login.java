package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reusable.Utility;

public class Login extends Utility {

	public Login() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPass;

	@FindBy(id="login")
	private WebElement btnLogin;
	
	
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}


	public WebElement getTxtPass() {
		return txtPass;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	public void in(String name, String pass) {
    typeInput(getTxtUsername(), name);
    typeInput(getTxtPass(), pass);
    btnClick(getBtnLogin());

	}
	
	
	
}
