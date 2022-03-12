package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class orderSummaryPage extends baseClass{

	action act = new action();

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")
	WebElement confirmBtn;

	public orderSummaryPage() {
		PageFactory.initElements(driver, this);
	}

	public orderConfirmationPage clickOnConfirmBtn () {
		act.click(driver, confirmBtn);
		return new orderConfirmationPage();
	}

}
