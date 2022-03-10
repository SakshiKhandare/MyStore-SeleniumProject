package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class loginPage extends baseClass {
	action act = new action();

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;

	@FindBy(xpath = "//button[@id='SubmitLogin']")
	WebElement signInBtn;

	@FindBy(name = "email_create")
	WebElement emailForNewAccount;

	@FindBy(name = "SubmitCreate")
	WebElement createNewAccount;

	public loginPage() {
		PageFactory.initElements(driver, this);
	}

	public homePage login(String email, String pswd) {
		act.sendValue(emailField, email);
		act.sendValue(password, pswd);
		act.click(driver, signInBtn);
		return new homePage();
	}

	public accountCreationPage createNewAccount(String newEmail) {
		act.sendValue(emailForNewAccount, newEmail);
		act.click(driver, createNewAccount);
		return new accountCreationPage();
	}

}
