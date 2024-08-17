package ORpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReusableComponents.TechnicalComponents;

public class GuarantedSavingplan extends TechnicalComponents {
    @FindBy(xpath="//ul[@class='navbar-nav m-hidden']/li[2]")
    public WebElement Guaranteeplan;
    
    @FindBy(xpath="//li[@class='nav-item dropdown position-static']//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']//li//div[@class='row']//a[contains(text(),'Aviva Signature Guaranteed Income Plan')]")
    public WebElement Signature;
    
    @FindBy(xpath="//*[@id='whyBuy']/div/div/div[2]/div/ul[2]/li[1]/div/p")
    public WebElement Keyfeature;
    
    @FindBy(xpath="//div[@class='container readMoreContent']//div[@class='row']//h2[@class='heading__1']")
    public WebElement Text;
    
    @FindBy(xpath="//*[@id='whyBuy']/div/div/div[2]/div/p")
    public WebElement Pagraphtext;
    
    @FindBy(xpath="//*[@id='whyBuy']/div/div/div[1]/div[2]/p")
    public WebElement Incomeplan;
    
    
	public GuarantedSavingplan(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void planguaranttee(WebElement element) {
		TechnicalComponents.MouseHover(element, driver);;
	}
   public void signature(WebElement element) {
	   TechnicalComponents.Clickable(element);
   }
   public static String gettext(WebElement element,String Text) {
	   String str=TechnicalComponents.Method_text(element, Text);
	   return str;
   }
   public static String ParagrpahText(WebElement element,String Text) {
	   String str=TechnicalComponents.Method_text(element, Text);
	   return str;
   }
   public static String PlanIncome(WebElement element,String Text) {
	   String str=TechnicalComponents.Method_text(element, Text);
	   return str;
	   
   }
}
