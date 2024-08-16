package ORpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import AvivaBrowser.ExtentFactory;
import ReusableComponents.TechnicalComponents;

public class GuarantedSavingplan extends TechnicalComponents {
    @FindBy(xpath="//ul[@class='navbar-nav m-hidden']/li[2]")
    public WebElement Guaranteeplan;
    
    @FindBy(xpath="//li[@class='nav-item dropdown position-static']//ul[@class='dropdown-menu megamenu-content fade-down mega-menu pe-3 ps-3 m-0']//li//div[@class='row']//a[contains(text(),'Aviva Signature Guaranteed Income Plan')]")
    public WebElement Signature;
    
  
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
}
