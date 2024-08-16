package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import AvivaBrowser.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyPremium extends BussinessComponents{
@Test
public void  VerifyPremium() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	PayPremium();
	sendRegister();
	R();
}
}
