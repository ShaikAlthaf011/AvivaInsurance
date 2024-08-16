package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import AvivaBrowser.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyGuarantedpage extends BussinessComponents {
@Test
public void VerifyGuarantedpage() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	gurantedplan();
	Signatureplan(); 
	GETTEXT();
	Narishing();
}
}
