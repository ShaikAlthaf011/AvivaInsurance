package Testscript;

import java.io.IOException;

import org.testng.annotations.Test;

import AvivaBrowser.Browser;
import ReusableComponents.BussinessComponents;

public class VerifyLoginpage extends BussinessComponents{
@Test(priority=1)
public void VerifyLoginpage() throws IOException, InterruptedException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	InsranceTerm();
	Term3dinsurance();
	Thread.sleep(1000);
	text();
	Text2();
	
}
@Test(priority=2)
public void VerifyLoginpage1() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	InsranceTerm();
	planprotection();
}
@Test(priority=3)
public void VerifyLoginpage2() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	InsranceTerm();
	Suraksha();
	
}
@Test(priority=4)
public void VerifyLoginpage3() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	InsranceTerm();
	Bhimaplan();
}
@Test(priority=5)
public void VerifyLoginpage4() throws IOException {
	String url=Browser.Given_Browser("url");
	Verifyongurl(url);
	ButtonSearch();
	Textsearch();
}
}
