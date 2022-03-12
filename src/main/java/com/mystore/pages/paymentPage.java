package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class paymentPage extends baseClass {

	action act = new action();

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]")
	WebElement payByBank;

	@FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")
	WebElement payByCheck;

	public paymentPage() {
		PageFactory.initElements(driver, this);
	}

	public orderSummaryPage clickOnPaymentMethod() {
		act.click(driver, payByBank);
		return new orderSummaryPage();
	}

}
