package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class addToCartPage extends baseClass {

	action act = new action();

	@FindBy(id = "quantity_wanted")
	WebElement quantity;

	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	WebElement addToCartBtn;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
	WebElement addToCartBtnMessage;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")
	WebElement checkoutBtn;

	@FindBy(name = "group_1")
	WebElement size;

	public addToCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterQuantity(String quant) {
		act.sendValue(quantity, quant);
	}

	public void selectSize(String size1) {
		act.selectByVisibleText(size1, size);
	}

	public void clickOnAddToCart() {
		act.click(driver, addToCartBtn);
	}

	public boolean validateAddToCart() {
		return act.isDisplayed(driver, addToCartBtnMessage);
	}

	public orderPage clickOnCheckoutBtn() throws Exception {
		act.JSClick(driver, checkoutBtn);
		return new orderPage();
	}

}
