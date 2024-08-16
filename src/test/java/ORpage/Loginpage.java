package ORpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class Loginpage extends TechnicalComponents{

	@FindBy(xpath="//div[@class='clearfix text-formatted field field--name-body field--type-text-with-summary field--label-hidden field__item']/ul/li[1]")
	public WebElement TermInsurance;
	
	@FindBy(xpath="//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']/li/div/div/div/div/h6/a[contains(text(),'Aviva Signature 3D Term Plan')]")
	public WebElement threeDTermpaln;
	
	@FindBy(xpath="//div[@class='col-md-6  col-12 new_product_page_read_more ']/p[4]")
	public WebElement Text;
	
	@FindBy(xpath="//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']/li/div/div[2]/div/div/h6/a[contains(text(),'Aviva Protection Plus')]")
	public WebElement Protectionplus;
	
	@FindBy(xpath="//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']/li/div/div[3]/div[@class='blocks']/div/h6/a[contains(text(),'Aviva Jana Suraksha')]")
	public WebElement janaSuraksha;
	
	@FindBy(xpath="//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']/li/div/div[4]/div[@class='blocks']/div/h6/a[contains(text(),'Aviva Saral Jeevan Bima Plan')]")
	public WebElement JeevanBhimaplan;
	
	@FindBy(xpath="//button[@class='search-icon']")
	public WebElement Searchbutton;
	
	@FindBy(xpath="//div[@class='input-holder']/form/input[@class='search-input']")
	public WebElement SearchingText;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
   public void terminsurance(WebElement element,WebDriver driver) {
	   TechnicalComponents.MouseHover(element, driver);
   }
   public void threeclickable(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public static String Text_method(WebElement element,String Text) {
	   String str=TechnicalComponents.Method_text(element, Text);
	   return str;
   }
   public static  String Paragraph(WebElement element,String Text) {
	   String str=TechnicalComponents.Method_text(element, Text);
	   return str;
   }
   public void AvivaProtectionplan(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public void JanaSuraksha(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public void AvivaSerialBhimaplan(WebElement element) {
	   TechnicalComponents.Clickable(element);
	   
   }
   public void Searchtext(WebElement element,String Text) {
	   TechnicalComponents.sendingkeys(element, Text);
   }
   public void Search(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
}
