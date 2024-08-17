package ReusableComponents;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import AvivaBrowser.ExtentFactory;
import ORpage.GuarantedSavingplan;
import ORpage.Loginpage;
import ORpage.Premium;

public class BussinessComponents extends TechnicalComponents{
public static Loginpage lg;
public static GuarantedSavingplan gp;
public static Premium p;

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
public void Narishing() {
	gp=new GuarantedSavingplan(driver);
String str=gp.ParagrpahText(gp.Pagraphtext,"Take a step towards smart financial planning with one of the most reliable and appealing savings options the Aviva signature guaranteed income plan connect with our executives to find out more details now ");
	if(str.equals("Take a step towards smart financial planning with one of the most reliable and appealing savings options the Aviva signature guaranteed income plan connect with our executives to find out more details now")) {
		System.out.println("Test case is passed");
	}else {
		System.out.println("Test case is Failed");
	}
}
public void INCOME() {
	gp=new GuarantedSavingplan(driver);
	String b=gp.PlanIncome(gp.Incomeplan,"Aviva Signature Guaranteed Income Plan is that one plan which offers you both, wealth creation and financial security, with added convenience.");
    String str="Aviva Signature Guaranteed Income Plan is that one plan which offers you both, wealth creation and financial security, with added convenience.";
	if(b.equals(str)) {
		System.out.println("Test case is Passed");
	}else {
		System.out.println("Test case is Failed");
	}
}
public void PREMIUM() {
	p=new Premium(driver);
}
public void PayPremium() {
	p=new Premium(driver);
	p.PayPremium(p.Pay);
}
public void sendRegister() {
	p=new Premium(driver);
	p.PayRegister(p.Register);
	
}
public void R() {
	p=new Premium(driver);
	p.Complaint(p.REGISTER,"12245657");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Guarantee plain succesfully");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Namelast() {
	p=new Premium(driver);
	p.namelast(p.lastName,"shaik");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Guarantee plain succesfully");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void numbermobile() {
	p=new Premium(driver);
	p.namelast(p.Mobilenumber,"7032618224");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Guarantee plain succesfully");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
public void Area() {
	p=new Premium(driver);
	p.areatext(p.textarea,"Hi How are you");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,"Guarantee plain succesfully");
	ExtentFactory.getInstance().getExtent().log(Status.PASS,MediaEntityBuilder.createScreenCaptureFromPath(TechnicalComponents.takescreenshot())
			.build());
}
}
