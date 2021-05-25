package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.lang.String;
import com.Pages.HomePage;
import com.Pages.LoginPage;

import Generic.Class.Launch_Browser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends Launch_Browser {
	
	Launch_Browser browser=new Launch_Browser();
	LoginPage loginPage=new LoginPage(driver);
	HomePage homePage=new HomePage();
	  
	
	 @Given("^user is in Shopping page$")
	 public void user_already_on_login_page()
	 {
		 browser.openBrowser();
	 }
	
	
	 @When("^title of Amazon login page$")
	 public void title_of_login_page_is_free_CRM(){
	 String title =loginPage.validateLoginPageTitle();
	 System.out.println(title);
	 Assert.assertEquals("Online Shopping site in India: Shop Online for "
	 		+ "Mobiles, Books, Watches, Shoes and More - Amazon.in", title);
	// Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
	 }
	
	 //Reg Exp:
	 //1. \"([^\"]*)\"
	 //2. \"(.*)\"
	
	 @Then("^user clicks on Sign-In Button$")
	 public void user_click_on_SignIn_Button(){
//		 driver.findElement(By.xpath("//*[@id=\'nav-signin-tooltip\']/a/span")).click();
		 loginPage.click_sign_In_Button();
		 }
////	 
//	 @Then("^user enters username and Click on Continue$")
//	 public void user_enter_username_and_click_on_Continue() {
////		 driver.findElement(By.id("ap_email")).sendKeys("kavanakeerthi1@gmail.com");
////		 driver.findElement(By.id("continue")).click();
//		 loginPage.enter_email_id();
//	 }
////	 
//	 @Then("^user enter password and click on Sign-In$")
//	 public void user_enters_password_and_click_on_SignIn(){
////	 driver.findElement(By.id("ap_password")).sendKeys("keerthim");
////	 driver.findElement(By.id("signInSubmit")).click();
//		 loginPage.enter_password();
//		 
//	 }
//	
//	 @Then("^user is on home page$")
//	 public void user_is_on_hopme_page(){
//	String homeTitle=homePage.validateHomePageTitle();
//	 System.out.println("Home Page title ::"+ homeTitle);
//	 Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", homeTitle);
//	 }
////	 
//////	 @Then("^user moves to new contact page$")
//////	 public void user_moves_to_new_contact_page() {
//////		driver.switchTo().frame("mainpanel");
//////		Actions action = new Actions(driver);
//////		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
//////		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//////		
//////		}
//////	 
//////	 
//////	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//////	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//////		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//////		 driver.findElement(By.id("surname")).sendKeys(lastname);
//////		 driver.findElement(By.id("company_position")).sendKeys(position);
//////		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//////	 }
//////	 
////
//	 @Then("^sign-out from the Amazon$")
//	 public void close_the_browser(){
//		 browser.closeApplication();
//	 }
////	
////	
//	

}
