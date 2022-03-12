package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class accountCreationPage extends baseClass {

	action act = new action();

	@FindBy(xpath = "//h1[contains(text(),'Create an account')]")
	WebElement formTitle;

	public accountCreationPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateFormTitle() {
		return act.isDisplayed(driver, formTitle);
	}

}
