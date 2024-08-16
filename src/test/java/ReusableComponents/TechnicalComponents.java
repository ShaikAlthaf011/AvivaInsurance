package ReusableComponents;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import AvivaBrowser.Browser;

public class TechnicalComponents extends Browser {
	
public static void Navigateurl(String url) {
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
public static void MouseHover(WebElement element,WebDriver driver) {
	Actions ac=new Actions(driver);
	ac.moveToElement(element).build().perform();
	
}
public static void Clickable(WebElement element) {
	element.click();
}
public static void Select(WebElement element,String Text) {
	Select sc=new Select(element);
	sc.selectByVisibleText(Text);
}
public static String Method_text(WebElement element,String Text ) {
	element.getText();
	return Text;
}
public static String takescreenshot() {
String filepath="";
try {
	ts=(TakesScreenshot) driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	Date d= new Date();
	String screenshotName=(d.getDate() < 10 ? "0" + d.getDate() : d.getDate()) + " " + 
            (d.getMonth() + 1 < 10 ? "0" + (d.getMonth() + 1) : (d.getMonth() + 1)) + "_" + 
            (1900 + d.getYear()) + "_" + 
            (d.getHours() < 10 ? "0" + d.getHours() : d.getHours()) + "_" + 
            (d.getSeconds() < 10 ? "0" + d.getSeconds() : d.getSeconds());
	filepath=System.getProperty("user.dir")+"/reports/screenshot/"+screenshotName+".jpg";
    Files.copy(f,  new File(filepath));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return filepath;
}
public static void sendingkeys(WebElement element,String Text) {
	element.sendKeys(Text);
}
}
