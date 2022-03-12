package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class orderConfirmationPage extends baseClass {

	action act = new action();

	@FindBy(xpath = "//strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement confirmMsg;

	public orderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateConfirmMsg() {
		String confirmMessage = confirmMsg.getText();
		return confirmMessage;
	}

}
