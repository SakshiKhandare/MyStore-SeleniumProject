package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class indexPage extends baseClass {
	action act = new action();

	@FindBy(xpath = "//a[@class='login']")
	WebElement signInBtn;

	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement mystoreLogo;

	@FindBy(id = "search_query_top")
	WebElement searchBox;

	@FindBy(name = "submit_search")
	WebElement searchButton;

	public indexPage() {
		PageFactory.initElements(driver, this);
	}

	public loginPage clickOnSignIn() {
		act.click(driver, signInBtn);
		return new loginPage();
	}

	public boolean validateLogo() {
		return act.isDisplayed(driver, mystoreLogo);
	}

	public String getMyStoreTitle() {
		String myStoreTitle = driver.getTitle();
		return myStoreTitle;
	}

	public searchResultPage searchProduct(String productName) {
		act.sendValue(searchBox, productName);
		act.click(driver, searchButton);
		return new searchResultPage();
	}

}
