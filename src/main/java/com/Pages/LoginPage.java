package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Class.Launch_Browser;

public class LoginPage extends Launch_Browser 
{
	
	@FindBy(id="nav-link-accountList")
	WebElement Account_and_Lists;
	
	
//	@FindBy(xpath="//*[@id=\'nav-signin-tooltip\']/a/span")
//	WebElement Sign_In;
	
	@FindBy(id="ap_email")
	WebElement Email;
	
	@FindBy(id="continue")
	WebElement Continue_Button;
	
	@FindBy(id = "ap_password")
	WebElement password;
	
	@FindBy(id = "signInSubmit")
	WebElement SignInSubmit;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		System.out.println("=====");
		return driver.getTitle();
		
	}
	
	public void click_sign_In_Button()
	{
		System.out.println("Before sign in");
		Account_and_Lists.click();
		System.out.println("After sign in");
//		Sign_In.click();
	}
	public void enter_email_id()
	{
		Email.sendKeys("kavanakeerthi1@gmail.com");
		Continue_Button.click();
	}
	public void enter_password()
	{
		password.sendKeys("keerthim");
		SignInSubmit.click();
	}

}

 



