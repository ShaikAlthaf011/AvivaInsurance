package ORpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Premium extends TechnicalComponents {

	@FindBy(xpath="//ul[@class='navbar-nav m-hidden']/li[5]")
	public WebElement Pay;
	
	@FindBy(xpath="//div[@class='login_right']/div/div[6]")
	public WebElement Register;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPolicy']")
	public WebElement REGISTER;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtLName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtMobile']")
	public WebElement Mobilenumber;
	
	@FindBy(xpath="//textarea")
	public WebElement textarea;
	
	public Premium(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
  public void PayPremium(WebElement element) {
	  TechnicalComponents.Clickable(element);
  }
  public void PayRegister(WebElement element) {
	  TechnicalComponents.Clickable(element);
  }
  public void Complaint(WebElement element,String Text) {
	  TechnicalComponents.sendingkeys(element, Text);
  }
  public void namelast(WebElement element,String Text) {
	  TechnicalComponents.sendingkeys(element, Text);;
  }
  public void Numbermobile(WebElement element,String Text) {
	  TechnicalComponents.sendingkeys(element, Text);
  }
  public void areatext(WebElement element,String Text) {
	  TechnicalComponents.sendingkeys(element, Text);
  }
}
