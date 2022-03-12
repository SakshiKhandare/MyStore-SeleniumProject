package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class searchResultPage extends baseClass {

	action act = new action();

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[2]")
	WebElement productResult;

	public searchResultPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean isProductAvailable() {
		return act.isDisplayed(driver, productResult);
	}

	public addToCartPage clickOnProduct() {
		act.click(driver, productResult);
		return new addToCartPage();
	}

}
