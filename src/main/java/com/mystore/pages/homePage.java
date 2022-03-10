package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class homePage extends baseClass {

	action act = new action();

	@FindBy(xpath = "//span[contains(text(),'Order history and details')]")
	WebElement orderHistory;

	@FindBy(xpath = "//span[contains(text(),'My wishlists')]")
	WebElement myWishlist;

	public homePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validatemyWishlist() {
		return act.isDisplayed(driver, myWishlist);
	}

	public boolean validateOrderHistory() {
		return act.isDisplayed(driver, orderHistory);
	}

}
