package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddNewInvoicePage;
import pages.InvoicesPage;
import pages.LoginPage;
import pages.Util;

public class LoginTest extends InitTest {

//	 @Test(priority = 0)
//	 public void blank() {
//	 LoginPage login = new LoginPage(driver);
//	
//	 driver.get(Util.URL);
//	
//	
//	
//	 login.fillInputs("", "");
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgEmail());
//	 }
//	
//	 @Test(priority = 1)
//	 public void noPass() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.email, "");
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgPass());
//	 }
//	
//	 @Test(priority = 2)
//	 public void noEmail() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("", Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgEmail());
//	 }
//	
//	 @Test(priority = 3)
//	 public void wrongEmailCorrectPass() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("nesto@nesto.com", Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgLoginPass());
//	 }
//	
//	 @Test(priority = 4)
//	 public void correctEmailWrongPass() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.email, "123456789");
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgLoginPass());
//	 }
//	
//	 @Test(priority = 5)
//	 public void emailWith2Monkeys() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("nenad.b.krstic@@gmail.com", Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgInvalidEmail());
//	 }
//	
//	 @Test(priority = 6)
//	 public void emailWithComma() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("nenad.b.krstic@gmail,com", Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgInvalidEmail());
//	 }
//	
//	 @Test(priority = 7)
//	 public void emailWith2Stops() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("nenad.b.krstic@gmail..com", Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgInvalidEmail());
//	 }
//	
//	 @Test(priority = 8)
//	 public void emailPasswordPasswordEmail() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.password, Util.email);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgInvalidEmail());
//	 Assert.assertTrue(login.msgTooMuchChar());
//	 }
//	
//	 @Test(priority = 9)
//	 public void correctEmailPasswordEmail() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.email, Util.email);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgTooMuchChar());
//	 }
//	
//	 @Test(priority = 10)
//	 public void emailPasswordCorrectPassword() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.password, Util.password);
//	 login.sbumit();
//	 Assert.assertTrue(login.msgInvalidEmail());
//	 }
//	
//	// @Test(priority = 11)
//	// public void uppercaseEmailLowercasePassword() {
//	// LoginPage login = new LoginPage(driver);
//	// driver.get(Util.URL);
//	//
//	//
//	// login.fillInputs("NENAD.B.KRSTIC@GMAIL.COM", Util.password);
//	// login.sbumit();
//	// //Assert.assertTrue(login.tooMuchChar());
//	// }
//	
//	 @Test(priority = 11)
//	 public void lowercaseEmailUppercasePassword() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.email, "QWE123");
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgLoginPass());
//	 }
//	
//	 @Test(priority = 12)
//	 public void uppercaseEmailUppercasePassword() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs("NENAD.B.KRSTIC@GMAIL.COM", "QWE123");
//	 login.sbumit();
//	 Assert.assertTrue(login.errorMsgLoginPass());
//	 }
//	
//	 @Test(priority = 13)
//	 public void correctEmailPasswordWith5Character() {
//	 LoginPage login = new LoginPage(driver);
//	 driver.get(Util.URL);
//	
//	
//	 login.fillInputs(Util.email, "qwe12");
//	 login.sbumit();
//	 Assert.assertTrue(login.msgLessThanSixCharInPass());
//	 }

	@Test(priority = 14)
	public void correctEmailCorrectPassword() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		driver.get(Util.URL);

		login.fillInputs(Util.email, Util.password);
		login.visiblePass();
		login.sbumit();
		Thread.sleep(1000);
	}

}
