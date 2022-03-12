package com.mystore.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actionDriver.action;
import com.mystore.base.baseClass;

public class orderPage extends baseClass{

	action act = new action();

	@FindBy(xpath = "//span[contains(text(),'$16.51')]")
	WebElement unitPrice ;

	@FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")
	WebElement proceedToCheckoutBtn;

	@FindBy(id = "total_price")
	WebElement totalPrice;

	public orderPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public double getUnitPrice() {
		String unitPrice1 = unitPrice.getText();
		String unit = unitPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalUnitPrice = Double.parseDouble(unit);
		return finalUnitPrice/100;
	}
	 

	public double getTotalPrice() {
		String totalPrice1 = totalPrice.getText();
		String total = totalPrice1.replaceAll("[^a-zA-Z0-9]", "");
		double finalPrice = Double.parseDouble(total);
		return finalPrice/100;
	}
	 
	public loginPage clickOnCheckoutwithoutLogin() {
		act.click(driver, proceedToCheckoutBtn);
		return new loginPage();
	}
	
	public addressPage clickOnCheckoutafterLogin() {
		act.click(driver, proceedToCheckoutBtn);
		return new addressPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}



 



