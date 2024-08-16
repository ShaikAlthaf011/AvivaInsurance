package ReusableComponents;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import AvivaBrowser.ExtentFactory;
import ORpage.GuarantedSavingplan;
import ORpage.Loginpage;

public class BussinessComponents extends TechnicalComponents{
public static Loginpage lg;
public static GuarantedSavingplan gp;

public static void Verifyongurl(String url) {
	TechnicalComponents.Navigateurl(url);
	lg=new Loginpage(driver);
	if(driver.getTitle().equals("Aviva Life Insurance Plans Online | Best Life Insurance Plans & Policies in India")) {
		System.out.println("Test case is passed");
	}else {
		System.out.println("Test case is Failed");
	}
	String str="Sameera";
	if(str=="Sameera") {
		System.out.println("Sameera is a patnethi");
	}else {
		System.out.println("Sameera is a not patnethi");
	}
	System.out.println(driver.getCurrentUrl());
	
	
}
public void InsranceTerm() {
	lg=new Loginpage(driver);
	lg.terminsurance(lg.TermInsurance, driver);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify login page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Term3dinsurance() {
	lg=new Loginpage(driver);
	lg.threeclickable(lg.threeDTermpaln);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click Insurance button");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromBase64String(TechnicalComponents.takescreenshot()).build());
}
public void text() {
	lg=new Loginpage(driver);
	String str=lg.Text_method(lg.Text,"We try to keep uncertainties at bay by adopting healthy habits like following a fitness regime, taking a balanced diet, doing yoga etc. however it's not possible for us to avoid the inevitable. While we take care of our physical and mental health, our comprehensive well-being is incomplete without a cover for our financial health. As we embrace a holistic lifestyle, that covers all bases, we become better prepared to take on the challenges that await us.");
    if(str.equals("We try to keep uncertainties at bay by adopting healthy habits like following a fitness regime, taking a balanced diet, doing yoga etc. however it's not possible for us to avoid the inevitable. While we take care of our physical and mental health, our comprehensive well-being is incomplete without a cover for our financial health. As we embrace a holistic lifestyle, that covers all bases, we become better prepared to take on the challenges that await us.")) {
    	System.out.println("Test case is passed");
    }else {
    	System.out.println("Test case is Failed");
    }
}
public void Text2() {
	lg=new Loginpage(driver);
	String str=lg.Paragraph(lg.Text,"By choosing the right life insurance plan that provides us with three dimensions of security, we would get peace of mind knowing we are taking active steps to be fully covered.");
    System.out.println(str);
}
public void planprotection() {
	lg=new Loginpage(driver);
	lg.Clickable(lg.Protectionplus);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify login page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Suraksha() {
	lg=new Loginpage(driver);
	lg.Clickable(lg.janaSuraksha);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify login page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Bhimaplan() {
	lg=new Loginpage(driver);
	lg.AvivaSerialBhimaplan(lg.JeevanBhimaplan);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Verify login page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void ButtonSearch() {
	lg=new Loginpage(driver);
	lg.Clickable(lg.Searchbutton);
	
}
public void Textsearch() {
	lg=new Loginpage(driver);
	lg.Searchtext(lg.SearchingText,"Child");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Search on the Text");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void PlanningGuaranted() {
	gp=new GuarantedSavingplan(driver);
}
public void gurantedplan() {
	gp=new GuarantedSavingplan(driver);
	gp.planguaranttee(gp.Guaranteeplan);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Guarantee plain succesfully");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Signatureplan() {
	gp=new GuarantedSavingplan(driver);
	gp.signature(gp.Signature);
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Click on the button signature sucessfully page");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void GETTEXT() {
	gp=new GuarantedSavingplan(driver);
	String str=gp.gettext(gp.Text,"Aviva Signature Guaranteed Income Plan");
	if(str.equals("Aviva Signature Guaranteed Income Plan")) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}
}
}
